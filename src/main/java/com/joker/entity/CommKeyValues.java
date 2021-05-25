package com.joker.entity;

import java.util.Date;

public class CommKeyValues {
    private String mykey;

    private String myvalue;

    private String keytype;

    private String remark;

    private Date createTime;

    private String createUser;

    private String isDel;

    private String seq;

    public String getMykey() {
        return mykey;
    }

    public void setMykey(String mykey) {
        this.mykey = mykey == null ? null : mykey.trim();
    }

    public String getMyvalue() {
        return myvalue;
    }

    public void setMyvalue(String myvalue) {
        this.myvalue = myvalue == null ? null : myvalue.trim();
    }

    public String getKeytype() {
        return keytype;
    }

    public void setKeytype(String keytype) {
        this.keytype = keytype == null ? null : keytype.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel == null ? null : isDel.trim();
    }

    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq == null ? null : seq.trim();
    }
}