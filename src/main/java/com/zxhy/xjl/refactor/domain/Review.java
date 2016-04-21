package com.zxhy.xjl.refactor.domain;
/**
 * 审查项
 * @author leasonlive
 *
 */
public class Review {
	//材料id
	private String materialId;
	//审查项id
	private String reviewId;
	//审查项名称
	private String reviewName;
	//审查项规则
	private String reviewRule;
	//审查项实现
	private String reviewImpl;
	
	public String getMaterialId() {
		return materialId;
	}
	public void setMaterialId(String materialId) {
		this.materialId = materialId;
	}
	public String getReviewId() {
		return reviewId;
	}
	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}
	public String getReviewName() {
		return reviewName;
	}
	public void setReviewName(String reviewName) {
		this.reviewName = reviewName;
	}
	public String getReviewRule() {
		return reviewRule;
	}
	public void setReviewRule(String reviewRule) {
		this.reviewRule = reviewRule;
	}
	public String getReviewImpl() {
		return reviewImpl;
	}
	public void setReviewImpl(String reviewImpl) {
		this.reviewImpl = reviewImpl;
	}
	
	
}
