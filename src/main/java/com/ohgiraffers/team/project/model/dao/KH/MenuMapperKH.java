package com.ohgiraffers.team.project.model.dao.KH;

import com.ohgiraffers.team.project.model.dto.MenuDTO;

import java.util.List;

public interface MenuMapperKH {

    List<MenuDTO> selectAllMenu();

    List<MenuDTO> selectCategory(int categoryCode);

    int insertNewMenu(MenuDTO newMenu);

    int updateMenu(MenuDTO updateMenu);

    int deleteMenu(int menuCode);
}
