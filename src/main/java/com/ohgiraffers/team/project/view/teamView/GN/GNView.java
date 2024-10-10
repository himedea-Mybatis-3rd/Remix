package com.ohgiraffers.team.project.view.teamView.GN;

import com.ohgiraffers.team.project.controller.GN.MenuControllerGN;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GNView {

    private MenuControllerGN menuControllerGN;

    public static void mainView() {
        MenuControllerGN menuControllerGN = new MenuControllerGN();
        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("=================== HiMedia 메뉴 관리 시스템 ===================");
            System.out.println("1. select 전체 메뉴 조회 - 메뉴 전체 조회하기");
            System.out.println("2. select 전체 카테고리 조회 - 카테고리 전체 조회하기");
            System.out.println("3. select - menu_code로 메뉴 테이블 조회하기");
            System.out.println("4. select - category_code로 카테고리 테이블 조회하기");
            System.out.println("5. insert - 신규 메뉴 등록 (menu_name , menu_price, category_code)");
            System.out.println("6. update - category_code로 수정 (category_name 입력 , ref_category_code)");
            System.out.println("7. delete - category_code로 삭제하기");
            System.out.println("==============================================================");
            System.out.print("실행할 메뉴를 선택해 주세요 : ");
            int result = sc.nextInt();

            switch (result) {
                case 1 : menuControllerGN.selectAllMenu();
                break;
                case 2 : menuControllerGN.selectAllCategory();
                break;
                case 3 : menuControllerGN.selectCodeMenu(menuCode());
                break;
                case 4 : menuControllerGN.selectCodeCategory(categoryCode());
                break;
                case 5 : menuControllerGN.insertNewMenu(newMenu());
                break;
                case 6 : menuControllerGN.updateCategory(updateCategory());
            }

        } while (true);

    }

    private static Map<String, String> menuCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴 코드를 입력해 주세요 : ");
        String menuCode = sc.nextLine();
        Map<String, String> parameter = new HashMap<>();
        parameter.put("menuCode",  menuCode);
        return parameter;
    }

    private static Map<String, String> categoryCode() {
        Scanner sc = new Scanner(System.in);
        System.out.print("카테고리 코드를 입력해 주세요 : ");
        String categoryCode = sc.nextLine();
        Map<String, String> parameter = new HashMap<>();

        parameter.put("categoryCode", categoryCode);
        return parameter;
    }

    private static Map<String,String> newMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("신규 메뉴 이름을 입력해 주세요 : ");
        String menuName = sc.nextLine();
        System.out.print("신규 메뉴 가격을 입력해 주세요 : ");
        String menuPrice = sc.nextLine();
        System.out.print("신규 메뉴 카테고리를 입력해 주세요 : ");
        String categoryCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("menuName", menuName);
        parameter.put("menuPrice", menuPrice);
        parameter.put("categoryCode", categoryCode);
        return parameter;
    }

    private static Map<String, String> updateCategory () {
        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 카테고리 코드를 입력해 주세요 : ");
        String categoryCode = sc.nextLine();
        System.out.print("수정할 카테고리 이름을 입력해 주세요 : ");
        String categoryName = sc.nextLine();
        System.out.print("수정할 REF 카테고리 코드를 입력해 주세요 : ");
        String refCategoryCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();

        parameter.put("categoryCode" , categoryCode);
        parameter.put("categoryName" , categoryName);
        parameter.put("refCategoryCode" , refCategoryCode);

        return parameter;
    }
}















