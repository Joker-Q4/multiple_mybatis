package com.joker.entity;

import java.util.Date;

public class CgfhzhZjpsxx {
    private String id;

    private String psyj;

    private String pf;

    private String psxmid;

    private String zjid;

    private Date pssj;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPsyj() {
        return psyj;
    }

    public void setPsyj(String psyj) {
        this.psyj = psyj == null ? null : psyj.trim();
    }

    public String getPf() {
        return pf;
    }

    public void setPf(String pf) {
        this.pf = pf == null ? null : pf.trim();
    }

    public String getPsxmid() {
        return psxmid;
    }

    public void setPsxmid(String psxmid) {
        this.psxmid = psxmid == null ? null : psxmid.trim();
    }

    public String getZjid() {
        return zjid;
    }

    public void setZjid(String zjid) {
        this.zjid = zjid == null ? null : zjid.trim();
    }

    public Date getPssj() {
        return pssj;
    }

    public void setPssj(Date pssj) {
        this.pssj = pssj;
    }
}