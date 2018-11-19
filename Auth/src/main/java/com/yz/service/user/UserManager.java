package com.yz.service.user;

import com.yz.entity.User;

public abstract interface UserManager
{
  public abstract User findByUsername(String username)
    throws Exception;
}
