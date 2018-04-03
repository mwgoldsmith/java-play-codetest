package com.qudini.codetest.models;

import org.joda.time.DateTime;

public class Customer {
  private int id;
  private String name;
  private DateTime dueTime;
  private DateTime joinTime;

  public Customer() {
  }

  public Customer(int id, String name, DateTime dueTime, DateTime joinTime) {
    this.id = id;
    this.name = name;
    this.dueTime = dueTime;
    this.joinTime = joinTime;
  }

  public final int getId() {
    return id;
  }

  public final String getName() {
    return name;
  }

  public final DateTime getDueTime() {
    return dueTime;
  }

  public final DateTime getJoinTime() {
    return joinTime;
  }

  public final void setId(int id) {
    this.id = id;
  }

  public final void setName(String name) {
    this.name = name;
  }

  public final void setDueTime(DateTime dueTime) {
    this.dueTime = dueTime;
  }

  public final void setJoinTime(DateTime joinTime) {
    this.joinTime = joinTime;
  }
}
