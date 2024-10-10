package com.ohgiraffers.team.project.controller.GN;

import com.ohgiraffers.team.project.model.service.GN.MenuServiceGN;
import com.ohgiraffers.team.project.view.teamView.GN.PrintResultGN;

public class MenuControllerGN {

    private final MenuServiceGN menuService;
    private final PrintResultGN printResult;


    public MenuControllerGN() {
        this.menuService = new MenuServiceGN();
        this.printResult = new PrintResultGN();
    }
    
}
