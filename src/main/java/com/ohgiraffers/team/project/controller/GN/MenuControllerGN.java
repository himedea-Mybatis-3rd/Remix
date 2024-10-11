package com.ohgiraffers.team.project.controller.GN;

import com.ohgiraffers.team.project.model.dto.MenuDTOgyunamCategory;
import com.ohgiraffers.team.project.model.dto.MenuDTOgyunamMenu;
import com.ohgiraffers.team.project.model.service.GN.MenuServiceGN;
import com.ohgiraffers.team.project.view.teamView.GN.PrintResultGN;

import java.util.List;
import java.util.Map;

public class MenuControllerGN {

    private final MenuServiceGN menuServiceGN;
    private final PrintResultGN printResultGN;

    public MenuControllerGN() {
        this.menuServiceGN = new MenuServiceGN();
        this.printResultGN = new PrintResultGN();
    }

    public void selectAllMenu() {

        List<MenuDTOgyunamMenu> menuList = menuServiceGN.selectAllMenu();

        if (menuList != null) {
            printResultGN.selectAllMenu(menuList);
        } else {
            printResultGN.errorMessage("errorSelectAllMenu");
        }
    }

    public void selectAllCategory() {
        List<MenuDTOgyunamCategory> categoryList = menuServiceGN.selectAllCategory();

        if (categoryList != null) {
            printResultGN.selectAllCategory(categoryList);
        } else {
            printResultGN.errorMessage("errorSelectAllCategory");
        }
    }

    public void selectCodeMenu(Map<String, String> parameter) {
        int menuCode = Integer.parseInt(parameter.get("menuCode"));

        MenuDTOgyunamMenu menuDTOgyunamMenu = new MenuDTOgyunamMenu();

        menuDTOgyunamMenu.setMenuCode(menuCode);

        MenuDTOgyunamMenu selectAll = menuServiceGN.selectCodeMenu(menuDTOgyunamMenu);
        if (selectAll != null) {
            printResultGN.selectCodeAllMenu(selectAll);
        } else {
            printResultGN.errorMessage("errorCodeMenu");
        }
    }

    public void selectCodeCategory(Map<String, String> parameter) {
        int categoryCode = Integer.parseInt(parameter.get("categoryCode"));

        MenuDTOgyunamCategory menuDTOgyunamCategory = new MenuDTOgyunamCategory();

        menuDTOgyunamCategory.setCategoryCode(categoryCode);

        MenuDTOgyunamCategory result = menuServiceGN.selectCodeCategory(menuDTOgyunamCategory);

        if (result != null) {
            printResultGN.selectCodeAllCategory(result);
        } else {
            printResultGN.errorMessage("errorCodeCategory");
        }
    }

    public void insertNewMenu(Map<String, String> parameter) {
        String menuName = parameter.get("menuName");
        int menuPrice = Integer.parseInt(parameter.get("menuPrice"));
        int categoryCode = Integer.parseInt(parameter.get("categoryCode"));

        MenuDTOgyunamMenu menuDTOgyunamMenu = new MenuDTOgyunamMenu();
        menuDTOgyunamMenu.setMenuName(menuName);
        menuDTOgyunamMenu.setMenuPrice(menuPrice);
        menuDTOgyunamMenu.setCategoryCode(categoryCode);

        if (menuServiceGN.insertNewMenu(menuDTOgyunamMenu)) {
            printResultGN.successMessage("successInsert");
        } else {
            printResultGN.errorMessage("errorInsert");
        }
    }

    public void updateCategory(Map<String, String> parameter) {
        int categoryCode = Integer.parseInt(parameter.get("categoryCode"));
        String categoryName =parameter.get("categoryName");
        int refCategoryCode = Integer.parseInt(parameter.get("refCategoryCode"));

        MenuDTOgyunamCategory menuDTOgyunamCategory = new MenuDTOgyunamCategory();
        menuDTOgyunamCategory.setCategoryCode(categoryCode);
        menuDTOgyunamCategory.setCategoryName(categoryName);
        menuDTOgyunamCategory.setRefCategoryCode(refCategoryCode);

        if (menuServiceGN.updateCategoryCode(menuDTOgyunamCategory)) {
            printResultGN.successMessage("successUpdate");
        } else {
            printResultGN.errorMessage("errorUpdate");
        }
    }

    public void deleteMenuCode(Map<String, String> parameter) {
        int result = Integer.parseInt(parameter.get("menuCode"));

        MenuDTOgyunamMenu menuDTOgyunamMenu = new MenuDTOgyunamMenu();
        menuDTOgyunamMenu.setMenuCode(result);

        if (menuServiceGN.deleteMenuCode(menuDTOgyunamMenu)) {
            printResultGN.successMessage("successDelete");
        } else {
            printResultGN.errorMessage("errorDelete");
        }
    }
}











