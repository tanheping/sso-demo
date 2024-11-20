/**
 * Copyright ( @AI ） All Rights Reserved.
 * AI
 */
package com.sso.service.admin;

import com.sso.model.bo.dept.DeptDeleteBO;
import com.sso.model.bo.dept.DeptMgmtTreeBO;
import com.sso.model.bo.dept.DeptSaveBO;
import com.sso.model.bo.dept.DeptUpdateBO;
import com.sso.model.vo.dept.DeptDetailVO;
import com.sso.model.vo.dept.DeptMgmtTreeNodeVO;
import com.sso.model.vo.dept.DeptOptionTreeNodeVO;

import java.util.List;

/**
 * 部门管理接口
 *
 * @author AI
 */
public interface DeptService {

	/**
	 * 获取系统下的-部门树
	 *
	 * @param treeBO 查询参数
	 * @return 部门树
	 * @author AI
	 */
	List<DeptMgmtTreeNodeVO> listDeptMgmtTree(DeptMgmtTreeBO treeBO);

	/**
	 * 部门下拉选项树
	 * 状态：仅正常+未删除
	 *
	 * @param sysCode 系统编码
	 * @return 部门树
	 * @author AI
	 */
	List<DeptOptionTreeNodeVO> listDeptOptionTree(String sysCode);

	/**
	 * 部门详情
	 *
	 * @param deptId 部门ID
	 * @return 部门详情
	 * @author AI
	 */
	DeptDetailVO getDeptDetail(Long deptId);

	/**
	 * 新增部门
	 *
	 * @param saveBO
	 * @author AI
	 */
	void addDept(DeptSaveBO saveBO);

	/**
	 * 修改部门
	 *
	 * @param updateBO
	 * @author AI
	 */
	void updateDept(DeptUpdateBO updateBO);

	/**
	 * 删除部门（部门逻辑删-用户部门关系物理删）
	 *
	 * @param deleteBO
	 * @author AI
	 */
	void deleteDept(DeptDeleteBO deleteBO);


}
