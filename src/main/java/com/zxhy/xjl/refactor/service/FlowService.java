package com.zxhy.xjl.refactor.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.zxhy.xjl.refactor.domain.Flow;
import com.zxhy.xjl.refactor.mapper.FlowMapper;

@Service
public class FlowService {
	@Autowired
	private FlowMapper flowMapper;
	public String addFlow(String flowName){
		Flow flow = new Flow();
		flow.setFlowName(flowName);
		return this.addFlow(flow);
	}
	public String addFlow(Flow flow){
		flow.setFlowId(UUID.randomUUID().toString());
		this.flowMapper.insert(flow);
		return flow.getFlowId();
	}
	public List<Flow> find(int page, int pageSize){
		PageHelper.startPage(page, pageSize);
		return this.flowMapper.selectAll();
	}
}
