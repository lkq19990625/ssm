package org.lanqiao.entity;

import java.sql.Date;
import java.util.List;

/**
 * @author:李克强
 * @description:
 * @date:Created in 16:09 2020/12/30
 * @modified by:
 */
public class Admin {
    private Integer id;
    private String aname;
    private String apwd;
    private String acname;
    private String atel;
    private String aemail;
    private String aimg;
    private String by001;
    private String by002;
    private Integer by003;
    private Date by004;
    private Date createTime;
    private String createUser;
    private Date updateTime;
    private String updateUser;
    private List<Permissions> lp;
    private List<Role> lr;
    private String roleList;

    public Admin() {
    }

    public Admin(Integer id, String aname, String apwd, String acname, String atel, String aemail, String aimg, String by001, String by002, Integer by003, Date by004, Date createTime, String createUser, Date updateTime, String updateUser, List<Permissions> lp, List<Role> lr) {
        this.id = id;
        this.aname = aname;
        this.apwd = apwd;
        this.acname = acname;
        this.atel = atel;
        this.aemail = aemail;
        this.aimg = aimg;
        this.by001 = by001;
        this.by002 = by002;
        this.by003 = by003;
        this.by004 = by004;
        this.createTime = createTime;
        this.createUser = createUser;
        this.updateTime = updateTime;
        this.updateUser = updateUser;
        this.lp = lp;
        this.lr = lr;
    }

    public Admin(Integer id, String aname, String atel, String aemail) {
        this.id = id;
        this.aname = aname;
        this.atel = atel;
        this.aemail = aemail;
    }

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
        this.aname = aname;
    }

    public String getApwd() {
        return apwd;
    }

    public void setApwd(String apwd) {
        this.apwd = apwd;
    }

    public String getAcname() {
        return acname;
    }

    public void setAcname(String acname) {
        this.acname = acname;
    }

    public String getAtel() {
        return atel;
    }

    public void setAtel(String atel) {
        this.atel = atel;
    }

    public String getAemail() {
        return aemail;
    }

    public void setAemail(String aemail) {
        this.aemail = aemail;
    }

    public String getAimg() {
        return aimg;
    }

    public void setAimg(String aimg) {
        this.aimg = aimg;
    }

    public String getBy001() {
        return by001;
    }

    public void setBy001(String by001) {
        this.by001 = by001;
    }

    public String getBy002() {
        return by002;
    }

    public void setBy002(String by002) {
        this.by002 = by002;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public List<Permissions> getLp() {
        return lp;
    }

    public void setLp(List<Permissions> lp) {
        this.lp = lp;
    }

    public List<Role> getLr() {
        return lr;
    }

    public void setLr(List<Role> lr) {
        this.lr = lr;
    }

    public String getRoleList() {
        String roleList = "";
        List<Role> lr = this.getLr();
        if(lr != null) {
            for(Role role : lr) {
                roleList+=role.getRname()+",";
            }
        }
        return roleList;
    }

    public void setRoleList(String roleList) {
        this.roleList = roleList;
    }
}
