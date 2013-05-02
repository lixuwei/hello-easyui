package com.lee.study.easyui.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lee.study.easyui.basedao.impl.BaseDaoImpl;
import com.lee.study.easyui.dao.TreeDao;
import com.lee.study.easyui.domain.Tree;
@Repository("treeDao")
public class TreeDaoImpl extends BaseDaoImpl<Tree> implements TreeDao{

	@Override
	public List<Tree> findChildNodeByParentId(int parentId) {
		List<Tree> childNodes =sessionTemplate.selectList(clazz.getName()+".findChildNodeByParentId",parentId);
		return childNodes;
	}

}
