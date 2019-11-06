package com.youjiuye.sys.bean;

public class RoleSource {

	private Integer rid;
	private Integer sid;

	public RoleSource() {
		super();
	}
	public RoleSource(Integer rid, Integer sid) {
		this.rid = rid;
		this.sid = sid;
	}

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}
}
