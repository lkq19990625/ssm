package org.lanqiao.entity;

import java.util.Date;

public class Admin {
    private Integer id;

    private String aname;

    private String apwd;

    private String acname;

    private String atel;

    private String aemail;

    private String by001;

    private String by002;

    private Integer by003;

    private Date by004;

    private Date createtime;

    private String createuser;

    private Date updatetime;

    private String updateuser;

    private byte[] aimg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public String getApwd() {
        return apwd;
    }

    public void setApwd(String apwd) {
        this.apwd = apwd == null ? null : apwd.trim();
    }

    public String getAcname() {
        return acname;
    }

    public void setAcname(String acname) {
        this.acname = acname == null ? null : acname.trim();
    }

    public String getAtel() {
        return atel;
    }

    public void setAtel(String atel) {
        this.atel = atel == null ? null : atel.trim();
    }

    public String getAemail() {
        return aemail;
    }

    public void setAemail(String aemail) {
        this.aemail = aemail == null ? null : aemail.trim();
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

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser == null ? null : updateuser.trim();
    }

    public byte[] getAimg() {
        return aimg;
    }

    public void setAimg(byte[] aimg) {
        this.aimg = aimg;
    }
}