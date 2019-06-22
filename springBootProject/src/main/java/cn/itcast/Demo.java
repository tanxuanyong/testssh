package cn.itcast;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 这是一个测试实体类.
 * @author Angel -- 守护天使
 * @version v.0.1
 * @date 2016年12月10日
 */
public class Demo {
	private int id;
	private String name;
	
	//com.alibaba.fastjson.annotation.JSONField
	@JSONField(format="yyyy-MM-dd HH:mm")
	private Date createTime;//创建时间.
	
	/*
	 * 我们不想返回remarks?
	 * serialize:是否需要序列化属性.
	 */
	@JSONField(serialize=false)
	private String remarks;//备注信息.
	
	
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}	
