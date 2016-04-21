package com.zxhy.xjl.refactor.domain;
/**
 * 流程需要的材料
 * @author leasonlive
 *
 */
public class Material {
	//材料id
	private String id;
	//材料名称，如身份证
	private String name;
	//材料样例图片，供填写参考用
	private String samplePicUrl;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSamplePicUrl() {
		return samplePicUrl;
	}
	public void setSamplePicUrl(String samplePicUrl) {
		this.samplePicUrl = samplePicUrl;
	}
	
	
}
