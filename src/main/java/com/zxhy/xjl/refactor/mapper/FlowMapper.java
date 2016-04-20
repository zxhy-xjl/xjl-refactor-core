package com.zxhy.xjl.refactor.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowMapper {
	@Insert("insert into xjl_refactor_flow(flow_name) values(#{flowName})")
	public int insertFlow(@Param("flowName") String flowName);

}
