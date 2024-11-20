package com.sso.common.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 操作基础BO
 *
 * @author AI
 */
@Data
public class BaseOperateBO implements Serializable {

	private static final long serialVersionUID = 4316038518168512167L;

	private String operateBy;

}
