package com.zxhy.xjl.refactor.service;

import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zxhy.xjl.refactor.domain.Material;
import com.zxhy.xjl.refactor.mapper.FlowMaterialMapper;
import com.zxhy.xjl.refactor.mapper.MaterialMapper;

@Service
public class MaterialService {
	private static Logger log = LoggerFactory.getLogger(MaterialService.class);
	@Autowired
	private MaterialMapper materialMapper;
	@Autowired
	private FlowMaterialMapper flowMaterialMapper;
	public int add(Material material){
		material.setId(UUID.randomUUID().toString());
		return this.materialMapper.insert(material);
	}
	public List<Material> find(){
		return this.materialMapper.select();
	}
	public List<Material> findByFlowId(String flowId){
		return this.materialMapper.selectByFlowId(flowId);
	}
	/**
	 * 把已有的材料关联到流程下面
	 * @param flowId
	 * @param materialId
	 * @return
	 */
	public int relatedToFlow(String flowId, String materialId){
		return this.flowMaterialMapper.insert(flowId, materialId);
	}
	/**
	 * 增加新的材料，并把该材料关联到流程下面
	 * @param flowId
	 * @param material
	 * @return
	 */
	@Transactional(propagation=Propagation.REQUIRES_NEW,
            isolation=Isolation.READ_COMMITTED)
	public int add(String flowId, Material material){
		log.debug("name:" + material.getName());
		log.debug("sample:" + material.getSamplePicUrl());
		log.debug("TempletUrl" + material.getTempletUrl());
		this.add(material);
		log.debug("flowId:" + flowId);
		return this.relatedToFlow(flowId, material.getId());
	}
	/**
	 * 取消材料和流程的关联
	 * @param flowId
	 * @param materialId
	 * @return
	 */
	public int removeFromFlow(String flowId, String materialId){
		return this.flowMaterialMapper.delete(flowId, materialId);
	}

}
