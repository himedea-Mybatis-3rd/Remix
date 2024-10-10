package com.ohgiraffers.team.project.view.teamView.KH;

import com.ohgiraffers.team.project.controller.KH.MenuControllerKH;
import com.ohgiraffers.team.project.model.dto.MenuDTO;

import java.util.List;

public class PrintResultKH {

    public void selectAllMenu(List<MenuDTO> menuList) {

        System.out.println("현재까지 등록된 메뉴 목록입니다...");

        for(MenuDTO selectAllMenu : menuList){
            System.out.println(selectAllMenu);
        }

    }

    public void selectCategory(List<MenuDTO> menuList){

        System.out.println("요청하신 카테고리 결과입니다...");

        for(MenuDTO selectCategory : menuList){
            System.out.println(selectCategory);
        }

    }

    public void printError(String selectAllError) {


        switch (selectAllError){
            case "selectAllError":
                System.out.println("메뉴 전체 조회에 실패하였습니다...");
                break;
            case "categoryError":
                System.out.println("카테고리 조회에 실패하였습니다...");
                break;
            case "updateError":
                System.out.println("메뉴 수정이 실패하였습니다...");
                break;
            case "deleteError":
                System.out.println("메뉴 삭제에 실패하였습니다...");
                break;
        }
    }

    public void printSuccess(String successMessage) {

        MenuControllerKH controllerKH = new MenuControllerKH();

        switch (successMessage){
            case "successNewMenu":
                controllerKH.selectAllMenu();
                System.out.println("신규 메뉴가 추가되었습니다!!!");
                break;
            case "successUpdateMenu":
                controllerKH.selectAllMenu();
                System.out.println("요청하신 메뉴로 수정되었습니다!!!");
                break;
            case "successDelete":
                controllerKH.selectAllMenu();
                System.out.println("요청하신 메뉴로 삭제되었습니다!!!");
                break;
        }

    }
}
