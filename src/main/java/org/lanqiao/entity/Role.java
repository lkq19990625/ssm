package org.lanqiao.entity;

import java.sql.Date;
import java.util.List;

/**
 * @author:李克强
 * @description:
 * @date:Created in 16:28 2020/12/30
 * @modified by:
 */
public class Role {
    private Integer id;
    private String rname;
    private String by001;
    private String by002;
    private Integer by003;
    private Date by004;
    private String createUser;
    private Date createTime;
    private String updateUser;
    private Date updateTime;
    private List<Permissions> lp;
    private String list;
    private String pid = "";

    public String getPid() {
        for (int i = 0; i < lp.size(); i++) {
            pid += (lp.get(i).getPid() + ",");
        }
        return pid;
    }
    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", rname='" + rname + '\'' +
                ", by001='" + by001 + '\'' +
                '}';
    }

    public Role() {
    }

    public Role(Integer id, String rname, String by001) {
        this.id = id;
        this.rname = rname;
        this.by001 = by001;
    }

    public Role(Integer id, String rname, String by001, String by002, Integer by003, Date by004, String createUser, Date createTime, String updateUser, Date updateTime) {
        this.id = id;
        this.rname = rname;
        this.by001 = by001;
        this.by002 = by002;
        this.by003 = by003;
        this.by004 = by004;
        this.createUser = createUser;
        this.createTime = createTime;
        this.updateUser = updateUser;
        this.updateTime = updateTime;
    }

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
        this.rname = rname;
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

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public List<Permissions> getLp() {
        return lp;
    }

    public void setLp(List<Permissions> lp) {
        this.lp = lp;
    }

    public String getList() {
        StringBuilder list1 = new StringBuilder();
        List<Permissions> pri = this.getLp();
        if (pri!=null){
            for(Permissions permissions : pri){
                list1.append(permissions.getName()).append(" ");
            }
        }
        return list1.toString();
    }

    public void setList(String list) {
        this.list = list;
    }
}
