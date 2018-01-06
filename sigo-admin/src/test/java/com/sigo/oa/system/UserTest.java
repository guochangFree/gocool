package com.sigo.oa.system;

import com.sigo.oa.base.BaseJunit;
import com.sigo.oa.common.persistence.dao.UserMapper;
import com.sigo.oa.modular.system.dao.UserMgrDao;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * 用户测试
 *
 * @author guochang
 * @date 2017-04-27 17:05
 */
public class UserTest extends BaseJunit {

    @Resource
    UserMgrDao userMgrDao;

    @Resource
    UserMapper userMapper;

    @Test
    public void userTest() throws Exception {

    }

}
