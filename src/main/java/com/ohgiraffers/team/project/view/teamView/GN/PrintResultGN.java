package com.ohgiraffers.team.project.view.teamView.GN;

import com.ohgiraffers.team.project.model.dto.MenuDTOgyunamCategory;
import com.ohgiraffers.team.project.model.dto.MenuDTOgyunamMenu;

import java.util.List;

public class PrintResultGN {


    public void successMessage(String selectAllMenu) {

        String successMessage = "";
        switch (selectAllMenu) {
            case "successInsert" :
                successMessage = "신규 메뉴 추가가 완료되었습니다.";
                break;
            case "successUpdate" :
                successMessage = "업데이트가 완료되었습니다.";
                break;
            case "successDelete" :
                successMessage = "메뉴 코드 삭제가 완료되었습니다.";
                break;
        }
        System.out.println(successMessage);
    }

    public void errorMessage(String errorCode) {

        String errorMessage = "";
        switch (errorCode) {
            case "errorSelectAllMenu" :
                errorMessage = "메뉴 전체 조회에 실패하였습니다.";
                break;
            case "errorSelectAllCategory" :
                errorMessage = "카테고리 전체 조회에 실패하였습니다.";
                break;
            case "errorCodeMenu" :
                errorMessage = "해당 메뉴 코드로 조회를 실패하였습니다.";
                break;
            case "errorCodeCategory" :
                errorMessage = "해당 카테고리 코드로 조회를 실패하였습니다.";
                break;
            case "errorInsert" :
                errorMessage = "신규 메뉴 추가에 실패하였습니다.";
                break;
            case "errorUpdate" :
                errorMessage = "업데이트에 실패하였습니다.";
                break;
            case "errorDelete" :
                errorMessage = "메뉴 코드 삭제에 실패하였습니다.";
                break;
        }
        System.out.println(errorMessage);
    }

    public void selectAllMenu(List<MenuDTOgyunamMenu> menuList) {
        System.out.println("조회하신 메뉴 전체 조회 결과입니다.");
        for (MenuDTOgyunamMenu asd : menuList) {
            System.out.println(asd);
        }
    }

    public void selectAllCategory(List<MenuDTOgyunamCategory> categoryList) {
        System.out.println("조회하신 카테고리 전체 조회 결과입니다.");
        for (MenuDTOgyunamCategory menuList : categoryList) {
            System.out.println(menuList);
        }
    }

    public void selectCodeAllMenu(MenuDTOgyunamMenu selectAll) {
        System.out.println("메뉴 코드로 조회한 결과입니다.");
        System.out.println(selectAll);
    }

    public void selectCodeAllCategory(MenuDTOgyunamCategory result) {
        System.out.println("카테고리 코드로 조회한 결과입니다.");
        System.out.println(result);

    }
}











