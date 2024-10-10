package com.ohgiraffers.team.project.controller.SH;

import com.ohgiraffers.team.project.model.service.SH.MenuServiceSH;
import com.ohgiraffers.team.project.view.teamView.SH.PrintResultSH;

public class MenuControllerSH {

    private final MenuServiceSH menuService;
    private final PrintResultSH printResult;


    public MenuControllerSH() {
        this.menuService = new MenuServiceSH();
        this.printResult = new PrintResultSH();
    }

}
