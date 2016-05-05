package com.zxhy.xjl.refactor.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zxhy.xjl.refactor.domain.Flow;
import com.zxhy.xjl.refactor.service.FlowService;
/**
 * 流程业务类，和service的功能重复，后续不再支持
 * @author leasonlive
 *
 */
@Component
@Deprecated
public class FlowBusiness {
	@Autowired
	private FlowService flowService;
	/**
	 * 添加一个实现该流程
	 * @param flowName
	 * @return
	 */
	public String addFlow(String flowName){
		return this.flowService.addFlow(flowName);
	}
	public String addFlow(Flow flow){
		return this.flowService.addFlow(flow);
	}
	public List<Flow> getAll(int page, int pageSize){
		return this.flowService.find(page, pageSize);
	}
}
