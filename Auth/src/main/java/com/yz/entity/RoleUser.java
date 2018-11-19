package com.yz.entity;

public class RoleUser
{
  private String ID;
  private String ROLE_ID;
  private String USER_ID;
  private Integer STATE;
  
  public String getID()
  {
    return this.ID;
  }
  
  public void setID(String iD)
  {
    this.ID = iD;
  }
  
  public String getROLE_ID()
  {
    return this.ROLE_ID;
  }
  
  public void setROLE_ID(String rOLE_ID)
  {
    this.ROLE_ID = rOLE_ID;
  }
  
  public String getUSER_ID()
  {
    return this.USER_ID;
  }
  
  public void setUSER_ID(String uSER_ID)
  {
    this.USER_ID = uSER_ID;
  }
  
  public Integer getSTATE()
  {
    return this.STATE;
  }
  
  public void setSTATE(Integer sTATE)
  {
    this.STATE = sTATE;
  }
}
