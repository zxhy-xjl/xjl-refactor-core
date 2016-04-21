package com.zxhy.xjl.refactor.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.zxhy.xjl.refactor.domain.Flow;

@Repository
public interface FlowMapper {
	@Insert("insert into xjl_refactor_flow(flow_id, flow_name) values(#{flowId},#{flowName})")
	public int insert(Flow flow);
	@Select("select flow_id as flowId, flow_name as flowName from xjl_refactor_flow")
	public List<Flow> selectAll();
}
