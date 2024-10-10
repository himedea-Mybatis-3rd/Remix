package com.ohgiraffers.team.project.model.service.KH;

import com.ohgiraffers.team.project.model.dao.KH.MenuMapperKH;
import com.ohgiraffers.team.project.model.dto.MenuDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.team.project.common.Template.getSqlSession;

public class MenuServiceKH {

    private MenuMapperKH menuMapperKH;

    public List<MenuDTO> selectAllMenu() {

        SqlSession sqlSession = getSqlSession();

        menuMapperKH = sqlSession.getMapper(MenuMapperKH.class);

        List<MenuDTO> menuList = menuMapperKH.selectAllMenu();

        sqlSession.close();

        return menuList;
    }

    public List<MenuDTO> selectCategory(int categoryCode) {

        SqlSession sqlSession = getSqlSession();

        menuMapperKH = sqlSession.getMapper(MenuMapperKH.class);

        List<MenuDTO> menuList = menuMapperKH.selectCategory(categoryCode);

        sqlSession.close();

        return menuList;
    }

    public boolean insertNewMenu(MenuDTO newMenu) {

        SqlSession sqlSession = getSqlSession();

        menuMapperKH = sqlSession.getMapper(MenuMapperKH.class);

        int result = menuMapperKH.insertNewMenu(newMenu);

        if (result > 0){
            sqlSession.commit();
        } else  {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean updateMenu(MenuDTO updateMenu) {

        SqlSession sqlSession = getSqlSession();

        menuMapperKH = sqlSession.getMapper(MenuMapperKH.class);

        int result = menuMapperKH.updateMenu(updateMenu);

        if (result > 0){
            sqlSession.commit();
        } else  {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;

    }

    public boolean deleteMenu(int menuCode) {

        SqlSession sqlSession = getSqlSession();

        menuMapperKH = sqlSession.getMapper(MenuMapperKH.class);

        int result = menuMapperKH.deleteMenu(menuCode);

        if (result > 0 ){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }
}
