package com.zxhy.xjl.refactor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxhy.xjl.refactor.mapper.FlowMapper;

@Service
public class FlowService {
	@Autowired
	private FlowMapper flowMapper;
	public String addFlow(String flowName){
		this.flowMapper.insertFlow(flowName);
		return "flow_id_1";
	}
}
