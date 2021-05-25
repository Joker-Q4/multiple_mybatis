package com.joker.entity;

import java.util.Date;

public class CommSysModule {
    private String moduleId;

    private String moduleName;

    private String moduleUrlKey;

    private String moduleUrl;

    private String moduleParent;

    private String moduleLevel;

    private Integer moduleSort;

    private String isDisplay;

    private String createUser;

    private Date createTime;

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId == null ? null : moduleId.trim();
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    public String getModuleUrlKey() {
        return moduleUrlKey;
    }

    public void setModuleUrlKey(String moduleUrlKey) {
        this.moduleUrlKey = moduleUrlKey == null ? null : moduleUrlKey.trim();
    }

    public String getModuleUrl() {
        return moduleUrl;
    }

    public void setModuleUrl(String moduleUrl) {
        this.moduleUrl = moduleUrl == null ? null : moduleUrl.trim();
    }

    public String getModuleParent() {
        return moduleParent;
    }

    public void setModuleParent(String moduleParent) {
        this.moduleParent = moduleParent == null ? null : moduleParent.trim();
    }

    public String getModuleLevel() {
        return moduleLevel;
    }

    public void setModuleLevel(String moduleLevel) {
        this.moduleLevel = moduleLevel == null ? null : moduleLevel.trim();
    }

    public Integer getModuleSort() {
        return moduleSort;
    }

    public void setModuleSort(Integer moduleSort) {
        this.moduleSort = moduleSort;
    }

    public String getIsDisplay() {
        return isDisplay;
    }

    public void setIsDisplay(String isDisplay) {
        this.isDisplay = isDisplay == null ? null : isDisplay.trim();
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
}