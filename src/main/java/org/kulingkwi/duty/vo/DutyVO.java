package org.kulingkwi.duty.vo;

public class DutyVO {
  private Integer id;
  private Integer year;
  private Integer month;
  private Integer day;
  private Integer userId;
  private String workStatus;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public Integer getMonth() {
    return month;
  }

  public void setMonth(Integer month) {
    this.month = month;
  }

  public Integer getDay() {
    return day;
  }

  public void setDay(Integer day) {
    this.day = day;
  }

    public String getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }
}
