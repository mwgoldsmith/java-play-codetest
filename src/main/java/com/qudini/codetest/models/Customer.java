package com.qudini.codetest.models;

import org.joda.time.DateTime;

public class Customer {
  private int id;
  private String name;
  private DateTime duetime;
  private DateTime jointime;

  public Customer() {
  }

  public Customer(int id, String name, DateTime duetime, DateTime jointime) {
    this.id = id;
    this.name = name;
    this.duetime = duetime;
    this.jointime = jointime;
  }

  public final int getId() {
    return id;
  }

  public final String getName() {
    return name;
  }

  public final DateTime getDuetime() {
    return duetime;
  }

  public final DateTime getJointime() {
    return jointime;
  }

  public final void setId(int id) {
    this.id = id;
  }

  public final void setName(String name) {
    this.name = name;
  }

  public final void setDuetime(DateTime duetime) {
    this.duetime = duetime;
  }

  public final void setJoinTime(DateTime jointime) {
    this.jointime = jointime;
  }

  @Override
  public String toString() {
    return "Customer{" +
            "id=" + id +
            ", name='" + name + "'" +
            ", duetime=" + duetime +
            ", jointime=" + jointime +
            '}';
  }
}
