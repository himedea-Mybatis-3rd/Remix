package com.ohgiraffers.team.project.model.service.GN;
import com.ohgiraffers.team.project.model.dao.GN.MenuMapperGN;
import com.ohgiraffers.team.project.model.dto.MenuDTOgyunamCategory;
import com.ohgiraffers.team.project.model.dto.MenuDTOgyunamMenu;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.team.project.common.TemplateGyunam.getSqlSession;

public class MenuServiceGN {

    private MenuMapperGN menuMapperGN;

    public List<MenuDTOgyunamMenu> selectAllMenu() {

        SqlSession sqlSession = getSqlSession();
        menuMapperGN = sqlSession.getMapper(MenuMapperGN.class);

        List<MenuDTOgyunamMenu> menuList = menuMapperGN.selectAllMenu();

        sqlSession.close();
        return menuList;
    }

    public List<MenuDTOgyunamCategory> selectAllCategory() {
        SqlSession sqlSession = getSqlSession();

        menuMapperGN = sqlSession.getMapper(MenuMapperGN.class);

        List<MenuDTOgyunamCategory> categoryList = menuMapperGN.selectAllCategory();

        return categoryList;
    }

    public MenuDTOgyunamMenu selectCodeMenu(MenuDTOgyunamMenu menuCode) {
        SqlSession sqlSession = getSqlSession();

        menuMapperGN = sqlSession.getMapper(MenuMapperGN.class);

        MenuDTOgyunamMenu selectAll = menuMapperGN.selectCodeMenu(menuCode);

        sqlSession.close();
        return selectAll;
    }

    public MenuDTOgyunamCategory selectCodeCategory(MenuDTOgyunamCategory categoryCode) {
        SqlSession sqlSession = getSqlSession();
        menuMapperGN = sqlSession.getMapper(MenuMapperGN.class);

        MenuDTOgyunamCategory category = menuMapperGN.selectCodeCategory(categoryCode);
        sqlSession.close();
        return category;
    }

    public boolean insertNewMenu(MenuDTOgyunamMenu menuDTOgyunamMenu) {
        SqlSession sqlSession = getSqlSession();

        menuMapperGN = sqlSession.getMapper(MenuMapperGN.class);
        int result = menuMapperGN.insertNewMenu(menuDTOgyunamMenu);
        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return (result > 0 ? true : false);
    }

    public boolean updateCategoryCode(MenuDTOgyunamCategory menuDTOgyunamCategory) {
        SqlSession sqlSession = getSqlSession();

        menuMapperGN = sqlSession.getMapper(MenuMapperGN.class);

        int result = menuMapperGN.updateCategoryCode(menuDTOgyunamCategory);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        return (result > 0 ? true : false);
    }
}












