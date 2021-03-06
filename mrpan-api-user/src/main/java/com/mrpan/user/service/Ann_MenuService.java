package com.mrpan.user.service;

import com.mrpan.user.bean.AnnMenuTree;
import com.mrpan.user.bean.Ann_Menu;

import java.util.List;

/**
 * Created by mrpan on 2016/11/14.
 */
public interface Ann_MenuService {
    public List<Ann_Menu> lazyLoadUserMenu(Integer parentId);

    public AnnMenuTree getMenuTree(Integer userId);
}

