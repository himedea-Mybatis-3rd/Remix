package com.ohgiraffers.team.project.controller.KH;

import com.ohgiraffers.team.project.model.dto.MenuDTO;
import com.ohgiraffers.team.project.model.service.KH.MenuServiceKH;
import com.ohgiraffers.team.project.view.teamView.KH.PrintResultKH;

import java.util.List;
import java.util.Map;

public class MenuControllerKH {

    private final MenuServiceKH menuService;
    private final PrintResultKH printResult;


    public MenuControllerKH() {
        this.menuService = new MenuServiceKH();
        this.printResult = new PrintResultKH();
    }

    public void selectAllMenu() {

        List<MenuDTO> menuList = menuService.selectAllMenu();

        if (menuList != null){
            printResult.selectAllMenu(menuList);
        } else {
            printResult.printError("selectAllError");
        }
    }

    public void selectCategory(Map<String, String> parameter) {

        int categoryCode = Integer.parseInt(parameter.get("categoryCode"));

        List<MenuDTO> menuList = menuService.selectCategory(categoryCode);

        if (menuList != null){
            printResult.selectCategory(menuList);
        } else {
            printResult.printError("categoryError");
        }
    }

    public void insertNewMenu(Map<String, String> parameter) {

        String menuName = parameter.get("menuName");
        int menuPrice = Integer.parseInt(parameter.get("menuPrice"));
        int categoryCode = Integer.parseInt(parameter.get("categoryCode"));

        MenuDTO newMenu = new MenuDTO();

        newMenu.setMenuName(menuName);
        newMenu.setMenuPrice(menuPrice);
        newMenu.setCategoryCode(categoryCode);

        if(menuService.insertNewMenu(newMenu)){
            printResult.printSuccess("successNewMenu");
        }else {
            printResult.printError("insertError");
        }

    }

    public void updateMenu(Map<String, String> parameter) {

        int menuCode = Integer.parseInt(parameter.get("menuCode"));
        String menuName = parameter.get("menuName");
        int menuPrice = Integer.parseInt(parameter.get("menuPrice"));
        int categoryCode = Integer.parseInt(parameter.get("categoryCode"));
        String orderableStatus = parameter.get("orderableStatus");

        MenuDTO updateMenu = new MenuDTO();

        updateMenu.setMenuCode(menuCode);
        updateMenu.setMenuName(menuName);
        updateMenu.setMenuPrice(menuPrice);
        updateMenu.setCategoryCode(categoryCode);
        updateMenu.setOrderableStatus(orderableStatus);

        if(menuService.updateMenu(updateMenu)){
            printResult.printSuccess("successUpdateMenu");
        } else {
            printResult.printError("updateError");
        }

    }

    public void deleteMenu(Map<String, String> parameter) {

        int menuCode = Integer.parseInt(parameter.get("menuCode"));

        if(menuService.deleteMenu(menuCode)){
            printResult.printSuccess("successDelete");
        } else  {
            printResult.printError("deleteError");
        }

    }
}
