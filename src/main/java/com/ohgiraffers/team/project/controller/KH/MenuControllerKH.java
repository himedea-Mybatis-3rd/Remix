package com.ohgiraffers.team.project.controller.KH;

import com.ohgiraffers.team.project.model.service.KH.MenuServiceKH;
import com.ohgiraffers.team.project.view.teamView.KH.PrintResultKH;

public class MenuControllerKH {

    private final MenuServiceKH menuService;
    private final PrintResultKH printResult;


    public MenuControllerKH() {
        this.menuService = new MenuServiceKH();
        this.printResult = new PrintResultKH();
    }

}
