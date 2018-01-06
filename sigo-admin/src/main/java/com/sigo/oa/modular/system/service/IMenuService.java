package com.sigo.oa.modular.system.service;

/**
 * 菜单服务
 *
 * @author guochang
 * @date 2017-05-05 22:19
 */
public interface IMenuService {

    /**
     * 删除菜单
     *
     * @author guochang
     * @Date 2017/5/5 22:20
     */
    void delMenu(Integer menuId);

    /**
     * 删除菜单包含所有子菜单
     *
     * @author guochang
     * @Date 2017/6/13 22:02
     */
    void delMenuContainSubMenus(Integer menuId);
}
