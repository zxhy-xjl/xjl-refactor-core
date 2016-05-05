package com.zxhy.xjl.refactor.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.github.pagehelper.PageHelper;
import com.zxhy.xjl.refactor.domain.Review;
import com.zxhy.xjl.refactor.mapper.ReviewMapper;

@Service
public class ReviewService {
	@Autowired
	private ReviewMapper reviewMapper;
	/**
	 * 增加一个审查项
	 * @param review
	 * @return
	 */
	public int add(Review review){
		Assert.notNull(review.getMaterialId());
		review.setReviewId(UUID.randomUUID().toString());
		return this.reviewMapper.insert(review);
	}
	/**
	 * 获取所有审查项
	 * @return
	 */
	public List<Review> find(){
		return this.reviewMapper.select();
	}
	/**
	 * 根据材料id获取审查项
	 * @param materialId
	 * @return
	 */
	public List<Review> findByMaterialId(String materialId, int page, int pageSize){
		PageHelper.startPage(page, pageSize);
		return this.reviewMapper.selectByMaterialId(materialId);
	}
	/**
	 * 根据审查id获取审查项
	 * @param reviewId
	 * @return
	 */
	public List<Review> findByReviewId(String reviewId){
		return this.reviewMapper.selectByReviewId(reviewId);
	}
}
