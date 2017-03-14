package com.example.entity;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/3/7.
 */
@Entity
@Table(name = "work", schema = "hr", catalog = "")
@IdClass(WorkEntityPK.class)
public class WorkEntity {
    private String dno;
    private String eno;
    private Integer waday;
    private Integer wtday;
    private Integer wsday;
    private Integer wkday;
    private Integer wsalary;

    @Id
    @Column(name = "dno")
    public String getDno() {
        return dno;
    }

    public void setDno(String dno) {
        this.dno = dno;
    }

    @Id
    @Column(name = "eno")
    public String getEno() {
        return eno;
    }

    public void setEno(String eno) {
        this.eno = eno;
    }

    @Basic
    @Column(name = "waday")
    public Integer getWaday() {
        return waday;
    }

    public void setWaday(Integer waday) {
        this.waday = waday;
    }

    @Basic
    @Column(name = "wtday")
    public Integer getWtday() {
        return wtday;
    }

    public void setWtday(Integer wtday) {
        this.wtday = wtday;
    }

    @Basic
    @Column(name = "wsday")
    public Integer getWsday() {
        return wsday;
    }

    public void setWsday(Integer wsday) {
        this.wsday = wsday;
    }

    @Basic
    @Column(name = "wkday")
    public Integer getWkday() {
        return wkday;
    }

    public void setWkday(Integer wkday) {
        this.wkday = wkday;
    }

    @Basic
    @Column(name = "wsalary")
    public Integer getWsalary() {
        return wsalary;
    }

    public void setWsalary(Integer wsalary) {
        this.wsalary = wsalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkEntity that = (WorkEntity) o;

        if (dno != null ? !dno.equals(that.dno) : that.dno != null) return false;
        if (eno != null ? !eno.equals(that.eno) : that.eno != null) return false;
        if (waday != null ? !waday.equals(that.waday) : that.waday != null) return false;
        if (wtday != null ? !wtday.equals(that.wtday) : that.wtday != null) return false;
        if (wsday != null ? !wsday.equals(that.wsday) : that.wsday != null) return false;
        if (wkday != null ? !wkday.equals(that.wkday) : that.wkday != null) return false;
        if (wsalary != null ? !wsalary.equals(that.wsalary) : that.wsalary != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dno != null ? dno.hashCode() : 0;
        result = 31 * result + (eno != null ? eno.hashCode() : 0);
        result = 31 * result + (waday != null ? waday.hashCode() : 0);
        result = 31 * result + (wtday != null ? wtday.hashCode() : 0);
        result = 31 * result + (wsday != null ? wsday.hashCode() : 0);
        result = 31 * result + (wkday != null ? wkday.hashCode() : 0);
        result = 31 * result + (wsalary != null ? wsalary.hashCode() : 0);
        return result;
    }
}
