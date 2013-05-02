package com.lee.study.easyui.web.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;

import com.lee.study.easyui.service.NodeService;
import com.lee.study.easyui.web.vo.TreeNode;

/**
 * 树节点操作
 * @author AlexLee
 */
@ParentPackage("basePackage")
@Namespace("/study/node")
public class TreeAction extends BaseAction{

	private int id;
	
	@Autowired
	private NodeService nodeService;
	
	@Action("findNode")
	public void findNodeByParentId(){
		List<TreeNode> treeNodes = new ArrayList<TreeNode>();
		if(id <= 0){
			treeNodes = nodeService.findNodeByParentId(0);
		}else{
			treeNodes = nodeService.findNodeByParentId(id);
		}
		writeJson(treeNodes);
		System.err.println("ok");
	}
	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}



	
}
