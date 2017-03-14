package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/3/7.
 */
public class WorkEntityPK implements Serializable {
    private String dno;
    private String eno;

    @Column(name = "dno")
    @Id
    public String getDno() {
        return dno;
    }

    public void setDno(String dno) {
        this.dno = dno;
    }

    @Column(name = "eno")
    @Id
    public String getEno() {
        return eno;
    }

    public void setEno(String eno) {
        this.eno = eno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkEntityPK that = (WorkEntityPK) o;

        if (dno != null ? !dno.equals(that.dno) : that.dno != null) return false;
        if (eno != null ? !eno.equals(that.eno) : that.eno != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dno != null ? dno.hashCode() : 0;
        result = 31 * result + (eno != null ? eno.hashCode() : 0);
        return result;
    }
}
