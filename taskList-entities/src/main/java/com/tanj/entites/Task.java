package com.tanj.entites;

/**
 * 任务实体  pojo
 */
public class Task {

  private int id;
  private String title;
  private String status;


  public long getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

}
