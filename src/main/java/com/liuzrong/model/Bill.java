package com.liuzrong.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="t_account")
public class Bill{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull(message="请选择消费类型")
	private Long typeid;
	@NotEmpty(message="请选择消费日期")
	private String credate;
	@NotNull(message="请输入消费金额")
	private Double val;
	
	private Long userid;
	
	private String remark;

	@Override
	public String toString() {
		return "Book [id=" + id + ", typeid=" + typeid + ", credate=" + credate + ", val=" + val + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Double getVal() {
		return val;
	}

	public void setVal(Double val) {
		this.val = val;
	}

	public Long getTypeid() {
		return typeid;
	}

	public void setTypeid(Long typeid) {
		this.typeid = typeid;
	}

	public String getCredate() {
		return credate;
	}

	public void setCredate(String credate) {
		this.credate = credate;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	

}
