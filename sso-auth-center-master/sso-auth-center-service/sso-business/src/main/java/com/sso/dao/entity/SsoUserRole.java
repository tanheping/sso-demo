/**
 * Copyright ( @AI ） All Rights Reserved.
 * AI
 */
package com.sso.dao.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 用户和角色关联实体类
 *
 * @author AI
 * @date 2021-01-08 15:41:48
 */
@Data
public class SsoUserRole implements Serializable {

	private static final long serialVersionUID = -3171194295603566556L;

	/**
	 * 系统编码
	 */
	private String sysCode;

	/**
	 * 用户ID
	 */
	private Long userId;

	/**
	 * 角色ID
	 */
	private Long roleId;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 修改时间
	 */
	private Date updateTime;

}
