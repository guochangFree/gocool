package generator.config;

import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * 默认的代码生成的配置
 *
 * @author guochang
 * @date 2017-10-28-下午8:27
 */
public class GunsGeneratorConfig extends AbstractGeneratorConfig {

    @Override
    protected void globalConfig() {
        globalConfig.setOutputDir("D:\\ideaSpace\\guns\\guns-admin\\src\\main\\java");
        globalConfig.setFileOverride(true);
        globalConfig.setEnableCache(false);
        globalConfig.setBaseResultMap(true);
        globalConfig.setBaseColumnList(true);
        globalConfig.setOpen(false);
        globalConfig.setAuthor("guochang");
    }

    @Override
    protected void dataSourceConfig() {
        dataSourceConfig.setDbType(DbType.MYSQL);
        dataSourceConfig.setDriverName("com.mysql.jdbc.Driver");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("root");
        dataSourceConfig.setUrl("jdbc:mysql://127.0.0.1:3306/guns?characterEncoding=utf8");
    }

    @Override
    protected void strategyConfig() {
        //strategy.setTablePrefix(new String[]{"_"});// 此处可以修改为您的表前缀
        strategyConfig.setInclude(new String[]{"my_order"});
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
    }

    @Override
    protected void packageConfig() {
        packageConfig.setParent(null);
        packageConfig.setEntity("com.sigo.oa.common.persistence.model");
        packageConfig.setMapper("com.sigo.oa.common.persistence.dao");
        packageConfig.setXml("com.sigo.oa.common.persistence.dao.mapping");
    }

    @Override
    protected void contextConfig() {
        contextConfig.setBizChName("记账管理");
        contextConfig.setBizEnName("order");
        contextConfig.setModuleName("system");
        contextConfig.setProjectPath("D:\\ideaSpace\\guns\\guns-admin");
        contextConfig.setEntityName("MyOrder");
        sqlConfig.setParentMenuName("系统管理");

        /**
         * mybatis-plus 生成器开关
         */
        contextConfig.setEntitySwitch(true);
        contextConfig.setDaoSwitch(true);
        contextConfig.setServiceSwitch(true);

        /**
         * guns 生成器开关
         */
        contextConfig.setControllerSwitch(true);
        contextConfig.setIndexPageSwitch(true);
        contextConfig.setAddPageSwitch(true);
        contextConfig.setEditPageSwitch(true);
        contextConfig.setJsSwitch(true);
        contextConfig.setInfoJsSwitch(true);
        contextConfig.setSqlSwitch(true);
    }
}
