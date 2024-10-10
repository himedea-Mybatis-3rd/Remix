package com.ohgiraffers.team.project.view;

import com.ohgiraffers.team.project.view.teamView.GN.GNView;
import com.ohgiraffers.team.project.view.teamView.JM.JMView;
import com.ohgiraffers.team.project.view.teamView.KH.KHView;
import com.ohgiraffers.team.project.view.teamView.SC.SCView;
import com.ohgiraffers.team.project.view.teamView.SH.SHView;

import java.util.Scanner;

public class MainView {

    public void mainView() {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("★★★★★★★★원하시는 조원을 선택해주세요★★★★★★★★★★");
            System.out.println("★                [메뉴 1번] 승현님                ★");
            System.out.println("★                [메뉴 2번] 재민님                ★");
            System.out.println("★                [메뉴 3번] 근희님                ★");
            System.out.println("★                [메뉴 4번] 승찬님                ★");
            System.out.println("★                [메뉴 5번] 규남님                ★");
            System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★\n");
            System.out.println("원하시는 조원 번호를 입력해주세요 : ");
            int no = sc.nextInt();

            switch (no){
                // 승현님 메인화면으로 가는 메소드
                case 1:
                    SHView.mainView();
                    break;

                // 재민님 메인화면으로 가는 메소드
                case 2:
                    JMView.mainView();
                    break;

                // 근희님 메인화면으로 가는 메소드
                case 3:
                    KHView.mainView();
                break;

                // 승찬님 메인화면으로 가는 메소드
                case 4:
                    SCView.mainView();
                    break;

                // 규남님 메인화면으로 가는 메소드
                case 5:
                    GNView.mainView();
                    break;
                default:
                    System.out.println("메뉴에 맞는 번호를 입력해주세요...");
                    break;
            }

        }while (true);

    }
}
