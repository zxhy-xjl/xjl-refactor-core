package com.zxhy.xjl.refactor.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zxhy.xjl.refactor.service.FlowService;
/**
 * 
 * @author leasonlive
 *
 */
@Component
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
}
