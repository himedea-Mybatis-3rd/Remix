package com.ohgiraffers.team.project.controller.JM;

import com.ohgiraffers.team.project.model.service.JM.MenuServiceJM;
import com.ohgiraffers.team.project.view.teamView.JM.PrintResultJM;

public class MenuControllerJM {

    private final MenuServiceJM menuService;
    private final PrintResultJM printResult;


    public MenuControllerJM() {
        this.menuService = new MenuServiceJM();
        this.printResult = new PrintResultJM();
    }

}
