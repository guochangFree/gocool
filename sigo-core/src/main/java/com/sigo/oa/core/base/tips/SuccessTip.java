package com.sigo.oa.core.base.tips;

/**
 * 返回给前台的成功提示
 *
 * @author guochang
 * @date 2016年11月12日 下午5:05:22
 */
public class SuccessTip extends Tip {
	
	public SuccessTip(){
		super.code = 200;
		super.message = "操作成功";
	}
}
