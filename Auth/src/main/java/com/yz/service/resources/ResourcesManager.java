package com.yz.service.resources;

import java.util.List;

import com.yz.entity.Resources;

public abstract interface ResourcesManager
{
  public abstract List<Resources> ListResByUserId(String userId);
}
