package com.sigo.oa.rest.common.exception;

import com.sigo.oa.core.exception.GunsException;

/**
 * @author guochang
 * @Description 业务异常的封装
 * @date 2016年11月12日 下午5:05:10
 */
public class BussinessException extends GunsException {

	public BussinessException(BizExceptionEnum bizExceptionEnum) {
		super(bizExceptionEnum.getCode(), bizExceptionEnum.getMessage(),"");
	}
}
