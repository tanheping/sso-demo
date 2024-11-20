/**
 * Copyright ( @AI ） All Rights Reserved.
 * AI
 */
package com.sso.dao.entity;

import lombok.Data;

import java.io.Serializable;


/**
 * 部门祖先/后代关系实体类
 *
 * @author AI
 * @date 2020-12-27 18:07:20
 */
@Data
public class SsoDeptTreePath implements Serializable {

	private static final long serialVersionUID = -8794488706755626248L;

	/**
	 * 祖先
	 */
	private Long ancestor;

	/**
	 * 后代
	 */
	private Long descendant;


}
