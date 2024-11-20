/**
 * Copyright ( @AI ） All Rights Reserved.
 * AI
 */
package com.sso.model.bo;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;


/**
 * 系统编码参数类
 *
 * @author AI
 * @date 2020-12-27 10:59:43
 */
@Data
public class SysCodeBO implements Serializable {

	private static final long serialVersionUID = -878095644963838466L;

	/**
	 * 系统编码
	 */
	@NotBlank(message = "系统编码不能为空")
	private String sysCode;

}
