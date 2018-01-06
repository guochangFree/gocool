package com.sigo.oa.modular.system.warpper;

import com.sigo.oa.common.constant.factory.ConstantFactory;
import com.sigo.oa.core.base.warpper.BaseControllerWarpper;

import java.util.Map;

/**
 * 部门列表的包装
 *
 * @author guochang
 * @date 2017年4月25日 18:10:31
 */
public class NoticeWrapper extends BaseControllerWarpper {

    public NoticeWrapper(Object list) {
        super(list);
    }

    @Override
    public void warpTheMap(Map<String, Object> map) {
        Integer creater = (Integer) map.get("creater");
        map.put("createrName", ConstantFactory.me().getUserNameById(creater));
    }

}
