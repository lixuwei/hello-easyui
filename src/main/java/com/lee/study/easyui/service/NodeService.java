package com.lee.study.easyui.service;

import java.util.List;

import com.lee.study.easyui.web.vo.TreeNode;

/**
 * 获取页面需要的Node
 * @author AlexLee
 *
 */
public interface NodeService {
	/**
	 * 通过页面传入的id得到childNode
	 * @param parentId
	 * @return
	 */
	List<TreeNode> findNodeByParentId(int parentId);
	
	boolean saveTree();

}
