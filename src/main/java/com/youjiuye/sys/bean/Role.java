package com.youjiuye.sys.bean;

public class Role {
    private Integer roleid;

    private String rolename;

    private String roledis;

    private Integer status;

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRoledis() {
        return roledis;
    }

    public void setRoledis(String roledis) {
        this.roledis = roledis == null ? null : roledis.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}