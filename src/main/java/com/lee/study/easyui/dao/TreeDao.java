package com.lee.study.easyui.dao;

import java.util.List;

import com.lee.study.easyui.basedao.BaseDao;
import com.lee.study.easyui.domain.Tree;

/**
 * @description t_tree表操作接口
 *
 * @author AlexLee
 * @createTime 2013-4-24 上午10:17:42
 * 
 * @Type com.lee.study.easyui.dao.TreeDao
 */
public interface TreeDao extends BaseDao<Tree>{

	List<Tree> findChildNodeByParentId(int parentId);
	
	
}
