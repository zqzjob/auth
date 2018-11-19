package com.yz.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.cache.CacheManager;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;

import com.yz.entity.Resources;
import com.yz.entity.Role;
import com.yz.entity.User;
import com.yz.service.resources.ResourcesManager;
import com.yz.service.role.RoleManager;
import com.yz.service.user.UserManager;

import javax.annotation.Resource;
import java.util.*;

public class ShiroRealm
  extends AuthorizingRealm
{
  @Resource(name="userService")
  private UserManager userService;
  @Resource(name="resourcesService")
  private ResourcesManager resourcesService;
  @Resource(name="roleService")
  private RoleManager roleService;

  public ShiroRealm(CacheManager cacheManager)
  {
    super(cacheManager);
  }
  //登录验证
  protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)
    throws AuthenticationException
  {
    String username = (String)token.getPrincipal();
    User user = null;
    try {
      user = userService.findByUsername(username);
    } catch (Exception e) {
      e.printStackTrace();
    }
    if(user == null) {
        throw new UnknownAccountException();//没找到帐号
    }
    String password = user.getPASSWORD();
    return new SimpleAuthenticationInfo(user, password, getName());
  }
  
  //初始化权限
  protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection pc)
  {
    SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
    User user = (User) SecurityUtils.getSubject().getPrincipal();
	List<Resources> resources = resourcesService.ListResByUserId(user.getUSER_ID());
	Set<String> permissions = getPermissions(resources);
	List<Role> roles = roleService.listRoleByUserId(user.getUSER_ID());
	Set<String> roles2 = getRoles(roles);
    authorizationInfo.setStringPermissions(permissions);
    authorizationInfo.setRoles(roles2);
    return authorizationInfo;
  }
  private Set<String> getPermissions(List<Resources> resources){
	  Set<String> set = new HashSet<>();
	  for (Resources res : resources) {
		set.add(res.getRES_CODE());
	}
	  return set;
  }
  private Set<String> getRoles(List<Role> roles){
	  Set<String> set = new HashSet<>();
	  for (Role role : roles) {
		  set.add(role.getROLE_CODE());
	  }
	  return set;
  }

  @Override
  public void onLogout(PrincipalCollection principals) {
    super.clearCachedAuthorizationInfo(principals);
    User shiroUser = (User) principals.getPrimaryPrincipal();
    removeUserCache(shiroUser);
  }

  /**
   * 清除用户缓存
   * @param shiroUser
   */
  public void removeUserCache(User shiroUser){
    removeUserCache(shiroUser.getUSERNAME());
  }

  /**
   * 清除用户缓存
   * @param loginName
   */
  public void removeUserCache(String loginName){
    SimplePrincipalCollection principals = new SimplePrincipalCollection();
    principals.add(loginName, super.getName());
    super.clearCachedAuthenticationInfo(principals);
  }
}
