package com.jk.model;




import java.io.Serializable;


public class Vip implements Serializable {

    private static final long serialVersionUID =2L;
    private Integer vip_id;  //序号
    private String vip_cdnumber;//卡号
    private String vip_name;//名字
    private String vip_sex;//性别
    private Integer vip_lv;//等级 1青铜 2黄金 3白金
    private String vip_phone;//电话
    private Integer jifen;// 积分
    private Integer xiaofeiNumber;// 消费金额
    private Integer cdNumber;//余额


    private String cdDate;//开卡时间


    private String startDate;//开卡时间
    private String endDate;//开卡时间


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getVip_id() {
        return vip_id;
    }

    public void setVip_id(Integer vip_id) {
        this.vip_id = vip_id;
    }

    public String getVip_cdnumber() {
        return vip_cdnumber;
    }

    public void setVip_cdnumber(String vip_cdnumber) {
        this.vip_cdnumber = vip_cdnumber;
    }

    public String getVip_name() {
        return vip_name;
    }

    public void setVip_name(String vip_name) {
        this.vip_name = vip_name;
    }

    public String getVip_sex() {
        return vip_sex;
    }

    public void setVip_sex(String vip_sex) {
        this.vip_sex = vip_sex;
    }

    public Integer getVip_lv() {
        return vip_lv;
    }

    public void setVip_lv(Integer vip_lv) {
        this.vip_lv = vip_lv;
    }

    public String getVip_phone() {
        return vip_phone;
    }

    public void setVip_phone(String vip_phone) {
        this.vip_phone = vip_phone;
    }

    public Integer getJifen() {
        return jifen;
    }

    public void setJifen(Integer jifen) {
        this.jifen = jifen;
    }

    public Integer getXiaofeiNumber() {
        return xiaofeiNumber;
    }

    public void setXiaofeiNumber(Integer xiaofeiNumber) {
        this.xiaofeiNumber = xiaofeiNumber;
    }

    public Integer getCdNumber() {
        return cdNumber;
    }

    public void setCdNumber(Integer cdNumber) {
        this.cdNumber = cdNumber;
    }

    public String getCdDate() {
        return cdDate;
    }

    public void setCdDate(String cdDate) {
        this.cdDate = cdDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Vip{" +
                "vip_id=" + vip_id +
                ", vip_cdnumber='" + vip_cdnumber + '\'' +
                ", vip_name='" + vip_name + '\'' +
                ", vip_sex='" + vip_sex + '\'' +
                ", vip_lv=" + vip_lv +
                ", vip_phone='" + vip_phone + '\'' +
                ", jifen=" + jifen +
                ", xiaofeiNumber=" + xiaofeiNumber +
                ", cdNumber=" + cdNumber +
                ", cdDate='" + cdDate + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
