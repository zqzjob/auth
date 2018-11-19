package com.yz.entity;

import java.util.Date;

public class Role
{
  private String ROLE_ID;
  //角色编号
  private String ROLE_CODE;
  //角色名称
  private String ROLE_NAME;
  private Date CREATE_DATE;
  
  public String getROLE_ID()
  {
    return this.ROLE_ID;
  }
  
  public void setROLE_ID(String rOLE_ID)
  {
    this.ROLE_ID = rOLE_ID;
  }
  
  public String getROLE_CODE()
  {
    return this.ROLE_CODE;
  }
  
  public void setROLE_CODE(String rOLE_CODE)
  {
    this.ROLE_CODE = rOLE_CODE;
  }
  
  public String getROLE_NAME()
  {
    return this.ROLE_NAME;
  }
  
  public void setROLE_NAME(String rOLE_NAME)
  {
    this.ROLE_NAME = rOLE_NAME;
  }
  
  public Date getCREATE_DATE()
  {
    return this.CREATE_DATE;
  }
  
  public void setCREATE_DATE(Date cREATE_DATE)
  {
    this.CREATE_DATE = cREATE_DATE;
  }
}
