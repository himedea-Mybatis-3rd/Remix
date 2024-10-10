package com.ohgiraffers.team.project.controller.SC;

import com.ohgiraffers.team.project.model.service.SC.MenuServiceSC;
import com.ohgiraffers.team.project.view.teamView.SC.PrintResultSC;

public class MenuControllerSC {

    private final MenuServiceSC menuService;
    private final PrintResultSC printResult;


    public MenuControllerSC() {
        this.menuService = new MenuServiceSC();
        this.printResult = new PrintResultSC();
    }

}
