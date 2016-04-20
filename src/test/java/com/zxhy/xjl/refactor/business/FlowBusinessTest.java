package com.zxhy.xjl.refactor.business;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:ApplicationContext-*.xml"})
public class FlowBusinessTest {
	@Autowired
	private FlowBusiness flowBusiness;
	@Test
	public void add(){
		String abc = this.flowBusiness.addFlow("abc");
		Assert.assertNotNull(abc);
	}
}
