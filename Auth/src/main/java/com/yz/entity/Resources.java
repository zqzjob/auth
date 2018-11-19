package com.yz.entity;


public class Resources
{
  private String RES_ID;
  //资源名称
  private String RES_NAME;
  //资源编号
  private String RES_CODE;
  //父级资源id
  private String PARENT_ID;
  //资源类型
  private Integer RES_TYPE;
  //资源访问url
  private String RES_URL;
  //资源状态
  private String RES_STATE;
  //资源描述
  private String DESCRIPTION;
  //创建时间
  private String CREATE_TIME;
  
  public String getRES_ID()
  {
    return this.RES_ID;
  }
  
  public void setRES_ID(String rES_ID)
  {
    this.RES_ID = rES_ID;
  }
  
  public String getRES_NAME()
  {
    return this.RES_NAME;
  }
  
  public void setRES_NAME(String rES_NAME)
  {
    this.RES_NAME = rES_NAME;
  }
  
  public String getPARENT_ID()
  {
    return this.PARENT_ID;
  }
  
  public void setPARENT_ID(String pARENT_ID)
  {
    this.PARENT_ID = pARENT_ID;
  }
  
  public Integer getRES_TYPE()
  {
    return this.RES_TYPE;
  }
  
  public void setRES_TYPE(Integer rES_TYPE)
  {
    this.RES_TYPE = rES_TYPE;
  }
  
  public String getRES_URL()
  {
    return this.RES_URL;
  }
  
  public void setRES_URL(String rES_URL)
  {
    this.RES_URL = rES_URL;
  }
  
  
  public String getRES_STATE()
  {
    return this.RES_STATE;
  }
  
  public void setRES_STATE(String rES_STATE)
  {
    this.RES_STATE = rES_STATE;
  }
  
  public String getDESCRIPTION()
  {
    return this.DESCRIPTION;
  }
  
  public void setDESCRIPTION(String dESCRIPTION)
  {
    this.DESCRIPTION = dESCRIPTION;
  }
  
  public String getCREATE_TIME()
  {
    return this.CREATE_TIME;
  }
  
  public void setCREATE_TIME(String cREATE_TIME)
  {
    this.CREATE_TIME = cREATE_TIME;
  }
  
  public String getRES_CODE()
  {
    return this.RES_CODE;
  }
  
  public void setRES_CODE(String rES_CODE)
  {
    this.RES_CODE = rES_CODE;
  }
}
