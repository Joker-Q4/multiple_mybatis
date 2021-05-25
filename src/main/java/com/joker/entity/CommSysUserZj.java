package com.joker.entity;

import java.util.Date;

public class CommSysUserZj {
    private String zjid;

    private String userid;

    private String zjxm;

    private String zjxb;

    private String zjsjh;

    private String zjzc;

    private String zjjs;

    private Date createTime;

    private Date updateTime;

    private String creater;

    private String updater;

    public String getZjid() {
        return zjid;
    }

    public void setZjid(String zjid) {
        this.zjid = zjid == null ? null : zjid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getZjxm() {
        return zjxm;
    }

    public void setZjxm(String zjxm) {
        this.zjxm = zjxm == null ? null : zjxm.trim();
    }

    public String getZjxb() {
        return zjxb;
    }

    public void setZjxb(String zjxb) {
        this.zjxb = zjxb == null ? null : zjxb.trim();
    }

    public String getZjsjh() {
        return zjsjh;
    }

    public void setZjsjh(String zjsjh) {
        this.zjsjh = zjsjh == null ? null : zjsjh.trim();
    }

    public String getZjzc() {
        return zjzc;
    }

    public void setZjzc(String zjzc) {
        this.zjzc = zjzc == null ? null : zjzc.trim();
    }

    public String getZjjs() {
        return zjjs;
    }

    public void setZjjs(String zjjs) {
        this.zjjs = zjjs == null ? null : zjjs.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater == null ? null : updater.trim();
    }
}