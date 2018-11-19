package com.yz.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User
{
  private String USER_ID;
  //登录名
  private String USERNAME;
  //密码
  private String PASSWORD;
  //姓名
  private String NAME;
  //状态
  private String STATUS;
  //电话
  private String PHONE;
  //邮箱
  private String EMAIL;
  
  
  public String getUSER_ID()
  {
    return this.USER_ID;
  }
  
  public void setUSER_ID(String uSER_ID)
  {
    this.USER_ID = uSER_ID;
  }
  
  public String getUSERNAME()
  {
    return this.USERNAME;
  }
  
  public void setUSERNAME(String uSERNAME)
  {
    this.USERNAME = uSERNAME;
  }
  
  public String getPASSWORD()
  {
    return this.PASSWORD;
  }
  
  public void setPASSWORD(String pASSWORD)
  {
    this.PASSWORD = pASSWORD;
  }
  
  public String getNAME()
  {
    return this.NAME;
  }
  
  public void setNAME(String nAME)
  {
    this.NAME = nAME;
  }
  
  
  public String getSTATUS()
  {
    return this.STATUS;
  }
  
  public void setSTATUS(String sTATUS)
  {
    this.STATUS = sTATUS;
  }
  
  public String getPHONE()
  {
    return this.PHONE;
  }
  
  public void setPHONE(String pHONE)
  {
    this.PHONE = pHONE;
  }
  
  public String getEMAIL()
  {
    return this.EMAIL;
  }
}
