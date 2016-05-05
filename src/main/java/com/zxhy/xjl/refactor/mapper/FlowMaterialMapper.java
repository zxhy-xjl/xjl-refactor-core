package com.zxhy.xjl.refactor.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface FlowMaterialMapper {
	@Insert("insert into xjl_refactor_flow_material(flow_id, material_id) values(#{flowId},#{materialId})")
	public int insert(@Param("flowId") String flowId, @Param("materialId") String materialId);
	@Delete("delete xjl_refactor_flow_material where flow_id=#{flowId} and material_id=#{materialId}")
	public int delete(@Param("flowId") String flowId, @Param("materialId") String materialId);
}
