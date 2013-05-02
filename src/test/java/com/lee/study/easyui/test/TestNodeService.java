package com.lee.study.easyui.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.lee.study.easyui.service.NodeService;
import com.lee.study.easyui.web.vo.TreeNode;


/**
 * @description 测试NodeService
 * 
 * @author lee
 * @createTime 2013-4-24 下午4:18:18 
 *
 * @Type com.lee.study.easyui.test.TestNodeService
 */
public class TestNodeService extends TestDB{
	
	@Autowired
	private NodeService nodeService;

	@Test
	public void testSave(){
		nodeService.saveTree();
	}
	
	@Test
	public void testSelect(){
		List<TreeNode> list = nodeService.findNodeByParentId(0);
		for (TreeNode treeNode : list) {
			System.err.println(treeNode.getState());
		}
	}
	
}
