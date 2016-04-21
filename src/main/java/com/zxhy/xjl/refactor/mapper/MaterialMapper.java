package com.zxhy.xjl.refactor.mapper;

import java.util.List;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.zxhy.xjl.refactor.domain.Material;

@Repository
public interface MaterialMapper {
	@Insert("insert into xjl_refactor_material(material_id,material_name,sample_picUrl,templet_url) values(#{id},#{name}, #{samplePicUrl},#{templetUrl})")
	public int insert(Material material);
	@Select("select material_id as id,material_name as name,sample_picUrl as samplePicUrl,templet_url as templetUrl from xjl_refactor_material")
	public List<Material> select();
	@Select("select xjl_refactor_material.material_id as id,xjl_refactor_material.material_name as name,xjl_refactor_material.sample_picUrl as samplePicUrl,xjl_refactor_material.templet_url as templetUrl from xjl_refactor_material,xjl_refactor_flow_material where xjl_refactor_flow_material.flow_id=#{flowId} and xjl_refactor_material.material_id = xjl_refactor_flow_material.material_id")
	public List<Material> selectByFlowId(@Param("flowId") String flowId);
}
