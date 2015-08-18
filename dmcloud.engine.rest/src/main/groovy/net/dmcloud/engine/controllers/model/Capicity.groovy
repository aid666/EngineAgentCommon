package net.dmcloud.engine.controllers.model;

class Capicity{
  private String key;
  private String status;

  private int currentTasks;
  private int maxTasks;

  public Capicity(String key, String status, int currentTasks, int maxTasks)
  {
    this.key = key;
    this.status = status;
    this.currentTasks = currentTasks;
    this.maxTasks = maxTasks;
  }

  public String getKey()
  {
    return this.key;
  }

  public String getStatus()
  {
    return this.status;
  }

  public int getCurrentTasks()
  {
    return this.currentTasks;
  }

  public int getMaxTasks()
  {
    return this.maxTasks;
  }
}
