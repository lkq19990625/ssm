package org.lanqiao.entity;

/**
 * @author:李克强
 * @description:
 * @date:Created in 16:26 2020/12/30
 * @modified by:
 */
public class Permissions {
    private Integer pid;
    private String pclass;
    private String purl;
    private String name;
    private Integer state;

    public Permissions() {
    }

    public Permissions(Integer pid, String pclass, String purl, String name, Integer state) {
        this.pid = pid;
        this.pclass = pclass;
        this.purl = purl;
        this.name = name;
        this.state = state;
    }

    public Permissions(Integer pid) {
        this.pid = pid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setId(Integer pid) {
        this.pid = pid;
    }

    public String getPclass() {
        return pclass;
    }

    public void setPclass(String pclass) {
        this.pclass = pclass;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
