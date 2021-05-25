package com.joker.entity;

import java.util.Date;

public class CommOrganization {
    private String organizationId;

    private String organizationCode;

    private String fullName;

    private String principal;

    private String officeTel;

    private String address;

    private String parentId;

    private String ownerProvince;

    private String ownerCity;

    private String createUser;

    private Date createTime;

    private String updateUser;

    private Date updateTime;

    private String lcztId;

    private String cyhdw;

    private String zzdjId;

    private String fjdz;

    private String fjmc;

    private String shjg;

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode == null ? null : organizationCode.trim();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal == null ? null : principal.trim();
    }

    public String getOfficeTel() {
        return officeTel;
    }

    public void setOfficeTel(String officeTel) {
        this.officeTel = officeTel == null ? null : officeTel.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getOwnerProvince() {
        return ownerProvince;
    }

    public void setOwnerProvince(String ownerProvince) {
        this.ownerProvince = ownerProvince == null ? null : ownerProvince.trim();
    }

    public String getOwnerCity() {
        return ownerCity;
    }

    public void setOwnerCity(String ownerCity) {
        this.ownerCity = ownerCity == null ? null : ownerCity.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
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
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getLcztId() {
        return lcztId;
    }

    public void setLcztId(String lcztId) {
        this.lcztId = lcztId == null ? null : lcztId.trim();
    }

    public String getCyhdw() {
        return cyhdw;
    }

    public void setCyhdw(String cyhdw) {
        this.cyhdw = cyhdw == null ? null : cyhdw.trim();
    }

    public String getZzdjId() {
        return zzdjId;
    }

    public void setZzdjId(String zzdjId) {
        this.zzdjId = zzdjId == null ? null : zzdjId.trim();
    }

    public String getFjdz() {
        return fjdz;
    }

    public void setFjdz(String fjdz) {
        this.fjdz = fjdz == null ? null : fjdz.trim();
    }

    public String getFjmc() {
        return fjmc;
    }

    public void setFjmc(String fjmc) {
        this.fjmc = fjmc == null ? null : fjmc.trim();
    }

    public String getShjg() {
        return shjg;
    }

    public void setShjg(String shjg) {
        this.shjg = shjg == null ? null : shjg.trim();
    }
}