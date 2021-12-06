package com.toystory.andy.controller;

import com.toystory.andy.domain.system.program.menu.MenuDto.*;
import com.toystory.andy.domain.system.program.menu.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/menu")
@RequiredArgsConstructor
public class MenuController {

    private final MenuService menuService;

    @RequestMapping(value = "navbar", method = RequestMethod.GET)
    public List<Response> navbar(Model model) {
        List<Response> menus = menuService.findAll();
        return menus;
    }
}
