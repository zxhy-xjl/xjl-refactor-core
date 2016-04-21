package com.zxhy.xjl.refactor.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.zxhy.xjl.refactor.domain.Review;

@Repository
public interface ReviewMapper {
	@Insert("insert into xjl_refactor_material_review("
			+ "material_id,review_id,review_name,review_rule,review_impl"
			+ ") values("
			+ "#{materialId},#{reviewId},#{reviewName},#{reviewRule},#{reviewImpl}"
			+ ")")
	public int insert(Review review);
	@Select("select material_id as materialId, review_id as reviewId, review_name as reviewName,"
			+ "review_rule as reviewRule, review_impl as reviewImpl from xjl_refactor_material_review")
	public List<Review> select();
	@Select("select material_id as materialId, review_id as reviewId, review_name as reviewName,"
			+ "review_rule as reviewRule, review_impl as reviewImpl from xjl_refactor_material_review"
			+ " where material_id=#{materialId}")
	public List<Review> selectByMaterialId(@Param("materialId") String materialId);
	@Select("select material_id as materialId, review_id as reviewId, review_name as reviewName,"
			+ "review_rule as reviewRule, review_impl as reviewImpl from xjl_refactor_material_review"
			+ " where review_id=#{reviewId}")
	public List<Review> selectByReviewId(@Param("reviewId") String reviewId);
}
