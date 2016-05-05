package com.zxhy.xjl.refactor.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageInfo;
import com.zxhy.xjl.refactor.domain.Flow;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:ApplicationContext-*.xml"})
public class FlowServiceTest {
	@Autowired
	private FlowService flowService;
	@Test
	public void find(){
		List<Flow> list = this.flowService.find(1, 10);
		PageInfo<Flow> pageInfo = new PageInfo<Flow>(list);
		for (Flow flow : list) {
			System.out.println(flow.getFlowName());
		}
		System.out.println(pageInfo.getTotal());
		System.out.println(list.size());
	}
	@Test
	public void insert(){
		this.flowService.addFlow("测试分页");
	}
}
