package org.lanqiao.entity;

/**
 * @author:李克强
 * @description:
 * @date:Created in 11:12 2021/3/5
 * @modified by:
 */
public class Fee {
    private Integer id; // 资费id
    private String fname; // 资费名称
    private String ftime; // 基本时长
    private Double fcout; // 基本费用
    private Double fcounts; // 单位费用
    private String createtime; // 创建时间
    private String updatetime; // 开通时间
    private int state; // 状态
    private String by001; // 备用字段
    private String by002; // 备用字段2
    private String by003; // 备用字段3
    private String descr;

    public Fee(String fname, String ftime, Double fcout, Double fcounts, String by001) {
        this.fname = fname;
        this.ftime = ftime;
        this.fcout = fcout;
        this.fcounts = fcounts;
        this.by001 = by001;
    }

    public Integer getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getFtime() {
        return ftime;
    }

    public Double getFcout() {
        return fcout;
    }

    public Double getFcounts() {
        return fcounts;
    }

    public String getCreatetime() {
        return createtime;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public int getState() {
        return state;
    }

    public String getBy001() {
        return by001;
    }

    public String getBy002() {
        return by002;
    }

    public String getBy003() {
        return by003;
    }

    public String getDescr() {
        return descr;
    }

    public Fee(Integer id, String fname, String ftime, Double fcout, Double fcounts, String createtime, String updatetime, int state, String by001, String by002, String by003, String descr) {
        this.id = id;
        this.fname = fname;
        this.ftime = ftime;
        this.fcout = fcout;
        this.fcounts = fcounts;
        this.createtime = createtime;
        this.updatetime = updatetime;
        this.state = state;
        this.by001 = by001;
        this.by002 = by002;
        this.by003 = by003;
        this.descr = descr;
    }

    public Fee() {

    }
}
