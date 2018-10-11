package com.capgemini.bank.bean;

public class DemandDraft {
	String cname;
	String ifo;
	String pnum;
	String dd_desc;
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	Double ddamt;
	Double ddcomm;
	Integer tid;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getIfo() {
		return ifo;
	}
	public void setIfo(String ifo) {
		this.ifo = ifo;
	}
	public String getPnum() {
		return pnum;
	}
	public void setPnum(String pnum) {
		this.pnum = pnum;
	}
	public String getDd_desc() {
		return dd_desc;
	}
	public void setDd_desc(String dd_desc) {
		this.dd_desc = dd_desc;
	}
	public Double getDdamt() {
		return ddamt;
	}
	public void setDdamt(Double ddamt) {
		this.ddamt = ddamt;
	}
	public Double getDdcomm() {
		return ddcomm;
	}
	public void setDdcomm(Double ddcomm) {
		this.ddcomm = ddcomm;
	}

	
}
