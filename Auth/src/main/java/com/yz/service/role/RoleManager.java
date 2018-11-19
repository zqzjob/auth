package com.yz.service.role;

import java.util.List;

import com.yz.entity.Role;

public abstract interface RoleManager
{
	public abstract List<Role> listRoleByUserId(String user_ID);
}
