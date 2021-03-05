package org.lanqiao.entity;

import java.util.Date;

/**
 * @author:李克强
 * @description:
 * @date:Created in 11:12 2021/3/5
 * @modified by:
 */
public class Fee {
   private Integer fid;
   private String fname;
   private Double base_time;
   private Double base_fee;
   private Double unit_fee;
   private String status;
   private String descr;
   private Date create_time;
   private Date starttime;
   private String cost_type;

   public Fee() {
   }

   public Fee(Integer fid, String fname, Double base_time, Double base_fee, Double unit_fee, String status, String descr, Date create_time, Date starttime, String cost_type) {
      this.fid = fid;
      this.fname = fname;
      this.base_time = base_time;
      this.base_fee = base_fee;
      this.unit_fee = unit_fee;
      this.status = status;
      this.descr = descr;
      this.create_time = create_time;
      this.starttime = starttime;
      this.cost_type = cost_type;
   }

   public Fee(String fname, Double base_time, Double base_fee, Double unit_fee, String descr,String status) {
      this.fname = fname;
      this.base_time = base_time;
      this.base_fee = base_fee;
      this.unit_fee = unit_fee;
      this.descr = descr;
      this.status = status;
   }

   public Fee(String fname) {
      this.fname = fname;
   }

   public Integer getFid() {
      return fid;
   }

   public void setFid(Integer fid) {
      this.fid = fid;
   }

   public String getFname() {
      return fname;
   }

   public void setFname(String fname) {
      this.fname = fname;
   }

   public Double getBase_time() {
      return base_time;
   }

   public void setBase_time(Double base_time) {
      this.base_time = base_time;
   }

   public Double getBase_fee() {
      return base_fee;
   }

   public void setBase_fee(Double base_fee) {
      this.base_fee = base_fee;
   }

   public Double getUnit_fee() {
      return unit_fee;
   }

   public void setUnit_fee(Double unit_fee) {
      this.unit_fee = unit_fee;
   }

   public String getStatus() {
      return status;
   }

   public void setStatus(String status) {
      this.status = status;
   }

   public String getDescr() {
      return descr;
   }

   public void setDescr(String descr) {
      this.descr = descr;
   }

   public Date getCreate_time() {
      return create_time;
   }

   public void setCreate_time(Date create_time) {
      this.create_time = create_time;
   }

   public Date getStarttime() {
      return starttime;
   }

   public void setStarttime(Date starttime) {
      this.starttime = starttime;
   }

   public String getCost_type() {
      return cost_type;
   }

   public void setCost_type(String cost_type) {
      this.cost_type = cost_type;
   }
}
