package com.ohgiraffers.team.project.model.dao.GN;

import com.ohgiraffers.team.project.model.dto.MenuDTOgyunamCategory;
import com.ohgiraffers.team.project.model.dto.MenuDTOgyunamMenu;

import java.util.List;

public interface MenuMapperGN {

    List<MenuDTOgyunamMenu> selectAllMenu();

    List<MenuDTOgyunamCategory> selectAllCategory();

    MenuDTOgyunamMenu selectCodeMenu(MenuDTOgyunamMenu menuCode);

    MenuDTOgyunamCategory selectCodeCategory(MenuDTOgyunamCategory categoryCode);

    int insertNewMenu(MenuDTOgyunamMenu menuDTOgyunamMenu);

    int updateCategoryCode(MenuDTOgyunamCategory menuDTOgyunamCategory);

    int deleteMenuCode(MenuDTOgyunamMenu menuDTOgyunamMenu);
}
