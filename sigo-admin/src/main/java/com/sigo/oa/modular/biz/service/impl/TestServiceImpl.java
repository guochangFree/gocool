package com.sigo.oa.modular.biz.service.impl;

import com.sigo.oa.common.constant.DSEnum;
import com.sigo.oa.common.persistence.dao.TestMapper;
import com.sigo.oa.modular.biz.service.ITestService;
import com.sigo.oa.common.persistence.model.Test;
import com.sigo.oa.core.mutidatasource.annotion.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 测试服务
 *
 * @author guochang
 * @date 2017-06-23 23:02
 */
@Service
public class TestServiceImpl implements ITestService {


    @Autowired
    TestMapper testMapper;

    @Override
    @DataSource(name = DSEnum.DATA_SOURCE_BIZ)
    public void testBiz() {
        Test test = testMapper.selectById(1);
        test.setId(22);
        test.insert();
    }


    @Override
    @DataSource(name = DSEnum.DATA_SOURCE_GUNS)
    public void testGuns() {
        Test test = testMapper.selectById(1);
        test.setId(33);
        test.insert();
    }

    @Override
    @Transactional
    public void testAll() {
        testBiz();
        testGuns();
        //int i = 1 / 0;
    }

}
