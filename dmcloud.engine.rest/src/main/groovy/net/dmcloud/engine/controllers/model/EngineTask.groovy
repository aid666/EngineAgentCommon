package net.dmcloud.engine.controllers.model;

class EngineTask{
  private String key;
  private String status;

  public EngineTask(String key, String status)
  {
    this.key = key;
    this.status = status;
  }

  public String getKey()
  {
    return this.key;
  }

  public String getStatus()
  {
    return this.status;
  }
}
