package com.lee.study.easyui.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lee.study.easyui.dao.TreeDao;
import com.lee.study.easyui.domain.Tree;
import com.lee.study.easyui.service.NodeService;
import com.lee.study.easyui.web.vo.TreeNode;

@Service("nodeService")
public class NodeServiceImpl implements NodeService{

	@Autowired
	private TreeDao treeDao;
	
	
	@Override
	public List<TreeNode> findNodeByParentId(int parentId) {
		
		List<TreeNode> nodes = new ArrayList<TreeNode>();
		List<Tree> childNodes = treeDao.findChildNodeByParentId(parentId);
		for (Tree tree : childNodes) {
			TreeNode node = new TreeNode();
			node.setId(tree.getId());
			node.setText(tree.getText());
			if(tree.getIsParent()>0){
				node.setState("closed");
			}else{
				node.setState("open");
			}
			
			nodes.add(node);
		}
		return nodes;
	}
	
	@Override
	public boolean saveTree() {
	
		Tree tree = new Tree();
		tree.setText("菜单");
		tree.setIsParent(1);
		tree.setParentId(0);
		treeDao.add(tree);
		return true;
	}
	

}
