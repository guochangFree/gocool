package com.sigo.oa.biz;

import com.sigo.oa.base.BaseJunit;
import com.sigo.oa.modular.biz.service.ITestService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 业务测试
 *
 * @author guochang
 * @date 2017-06-23 23:12
 */
public class BizTest extends BaseJunit {

    @Autowired
    ITestService testService;

    @Test
    public void test() {
        //testService.testGuns();

        testService.testBiz();

        //testService.testAll();
    }
}
