package org.lanqiao.entity;

import java.util.Date;

public class Role {
    private Integer id;

    private String rname;

    private String by001;

    private String by002;

    private Integer by003;

    private Date by004;

    private String createuser;

    private Date createtime;

    private String updateuser;

    private Date updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

    public String getBy001() {
        return by001;
    }

    public void setBy001(String by001) {
        this.by001 = by001 == null ? null : by001.trim();
    }

    public String getBy002() {
        return by002;
    }

    public void setBy002(String by002) {
        this.by002 = by002 == null ? null : by002.trim();
    }

    public Integer getBy003() {
        return by003;
    }

    public void setBy003(Integer by003) {
        this.by003 = by003;
    }

    public Date getBy004() {
        return by004;
    }

    public void setBy004(Date by004) {
        this.by004 = by004;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser == null ? null : updateuser.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}