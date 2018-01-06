package com.sigo.oa.common.constant.dictmap.factory;

import com.sigo.oa.common.constant.factory.IConstantFactory;
import com.sigo.oa.common.exception.BussinessException;
import com.sigo.oa.common.constant.factory.ConstantFactory;
import com.sigo.oa.common.exception.BizExceptionEnum;

import java.lang.reflect.Method;

/**
 * 字段的包装创建工厂
 *
 * @author guochang
 * @date 2017-05-06 15:12
 */
public class DictFieldWarpperFactory {

    public static Object createFieldWarpper(Object field, String methodName) {
        IConstantFactory me = ConstantFactory.me();
        try {
            Method method = IConstantFactory.class.getMethod(methodName, field.getClass());
            Object result = method.invoke(me, field);
            return result;
        } catch (Exception e) {
            try {
                Method method = IConstantFactory.class.getMethod(methodName, Integer.class);
                Object result = method.invoke(me, Integer.parseInt(field.toString()));
                return result;
            } catch (Exception e1) {
                throw new BussinessException(BizExceptionEnum.ERROR_WRAPPER_FIELD);
            }
        }
    }

}
