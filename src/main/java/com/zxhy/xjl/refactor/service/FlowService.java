package com.zxhy.xjl.refactor.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxhy.xjl.refactor.domain.Flow;
import com.zxhy.xjl.refactor.mapper.FlowMapper;

@Service
public class FlowService {
	@Autowired
	private FlowMapper flowMapper;
	public String addFlow(String flowName){
		Flow flow = new Flow();
		flow.setFlowId(UUID.randomUUID().toString());
		return this.addFlow(flow);
	}
	public String addFlow(Flow flow){
		flow.setFlowId(UUID.randomUUID().toString());
		this.flowMapper.insert(flow);
		return flow.getFlowId();
	}
	public List<Flow> query(){
		return this.flowMapper.selectAll();
	}
}
