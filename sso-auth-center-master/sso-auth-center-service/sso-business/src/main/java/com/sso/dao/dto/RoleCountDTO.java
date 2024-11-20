/**
 * Copyright ( @AI ） All Rights Reserved.
 * AI
 */
package com.sso.dao.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 角色统计
 *
 * @author AI
 */
@Data
public class RoleCountDTO implements Serializable {
	private static final long serialVersionUID = -9112752803214125220L;

	private Long roleId;

	private Integer count;

}
