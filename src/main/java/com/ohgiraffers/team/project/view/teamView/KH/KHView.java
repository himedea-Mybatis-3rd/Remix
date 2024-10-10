package com.ohgiraffers.team.project.view.teamView.KH;

import com.ohgiraffers.team.project.controller.KH.MenuControllerKH;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class KHView {
    public static void mainView() {

        Scanner sc = new Scanner(System.in);
        MenuControllerKH menuControllerKH = new MenuControllerKH();

        do {
            System.out.println("[메뉴 1번] : 메뉴 전체 조회하기");
            System.out.println("[메뉴 2번] : 카테고리 번호로 조회하기");
            System.out.println("[메뉴 3번] : 신규 메뉴 추가하기");
            System.out.println("[메뉴 4번] : 메뉴 수정하기");
            System.out.println("[메뉴 5번] : 메뉴 삭제하기");
            System.out.println("[메뉴 0번] : 프로그램 종료");
            System.out.print("메뉴 번호를 선택 해주세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    menuControllerKH.selectAllMenu();
                    break;
                case 2:
                    menuControllerKH.selectCategory(inputCategory());
                    break;
                case 3:
                    menuControllerKH.insertNewMenu(inputMenuInfo());
                    break;
                case 4:
                    menuControllerKH.updateMenu(inputUpdate());
                    break;
                case 5:
                    menuControllerKH.deleteMenu(inputDelete());
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다...");
                    System.exit(0);
                default:
                    System.out.println("메뉴에 맞는 번호를 입력해주세요...");
            }

        }while(true);

    }

    private static Map<String, String> inputCategory() {

        Scanner sc = new Scanner(System.in);
        System.out.print("[1 ~ 9] 조회할 카테고리 번호 입력 : ");
        String categoryCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();

        parameter.put("categoryCode", categoryCode);

        return parameter;
    }

    private static Map<String, String> inputMenuInfo() {

        Scanner sc = new Scanner(System.in);
        System.out.print("신규 메뉴 이름을 입력해주세요 : ");
        String menuName = sc.nextLine();

        System.out.print("신규 메뉴의 가격을 입력해주세요 : ");
        String menuPrice = sc.nextLine();

        System.out.print("신규 메뉴의 카테고리 번호를 입력해주세요 : ");
        String categoryCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();

        parameter.put("menuName", menuName);
        parameter.put("menuPrice", menuPrice);
        parameter.put("categoryCode", categoryCode);

        return parameter;
    }

    private static Map<String, String> inputUpdate(){

        Scanner sc = new Scanner(System.in);
        MenuControllerKH menuControllerKH = new MenuControllerKH();

        menuControllerKH.selectAllMenu();

        System.out.println();

        System.out.print("위 메뉴코드 확인 후 수정하실 메뉴 코드를 입력해주세요 : ");
        String menuCode = sc.nextLine();

        System.out.print("수정하실 메뉴 이름을 입력해주세요 : ");
        String menuName = sc.nextLine();

        System.out.print("수정하실 메뉴 가격을 입력해주세요 : ");
        String menuPrice = sc.nextLine();

        System.out.print("수정하실 카테고리 번호를 입력해주세요 : ");
        String categoryCode = sc.nextLine();

        System.out.print("수정하실 판매상태를 입력해주세요(Y/N) : ");
        String orderableStatus = sc.nextLine().toUpperCase();

        Map<String, String> parameter = new HashMap<>();

        parameter.put("menuCode", menuCode);
        parameter.put("menuName", menuName);
        parameter.put("menuPrice", menuPrice);
        parameter.put("categoryCode", categoryCode);
        parameter.put("orderableStatus", orderableStatus);

        return parameter;
    }

    private static Map<String, String> inputDelete(){

        Scanner sc = new Scanner(System.in);

        MenuControllerKH menuControllerKH = new MenuControllerKH();

        menuControllerKH.selectAllMenu();

        System.out.println();
        System.out.print("위에 메뉴 번호중 삭제를 원하는 번호를 입력 해주세요 : ");
        String menuCode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();

        parameter.put("menuCode", menuCode);

        return parameter;
    }
}
