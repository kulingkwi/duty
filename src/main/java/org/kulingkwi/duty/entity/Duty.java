package org.kulingkwi.duty.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_duty")
public class Duty {
    private int id;
    private String fullDate;
    private int year;
    private int month;
    private int day;
    private int userId;
    private String workStatus;
    private Date createTime;
    private Date updateTime;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "full_date", nullable = false, length = 8)
    public String getFullDate() {
        return fullDate;
    }

    public void setFullDate(String fullDate) {
        this.fullDate = fullDate;
    }

    @Basic
    @Column(name = "year", nullable = false)
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Basic
    @Column(name = "month", nullable = false)
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @Basic
    @Column(name = "day", nullable = false)
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Basic
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "work_status", nullable = false, length = 1)
    public String getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(String workStatus) {
        this.workStatus = workStatus;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_time", nullable = true)
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_time", nullable = true)
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Duty tDuty = (Duty) o;

        if (id != tDuty.id) return false;
        if (userId != tDuty.userId) return false;
        if (fullDate != null ? !fullDate.equals(tDuty.fullDate) : tDuty.fullDate != null) return false;
        if (year != tDuty.year) return false;
        if (month != tDuty.month) return false;
        if (day != tDuty.day) return false;
        if (workStatus != null ? !workStatus.equals(tDuty.workStatus) : tDuty.workStatus != null) return false;
        if (createTime != null ? !createTime.equals(tDuty.createTime) : tDuty.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(tDuty.updateTime) : tDuty.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (fullDate != null ? fullDate.hashCode() : 0);
        result = 31 * result + year;
        result = 31 * result + month;
        result = 31 * result + day;
        result = 31 * result + userId;
        result = 31 * result + (workStatus != null ? workStatus.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
