package com.example.multimodulesexample.admin.controller;

import com.example.multimodulesexample.admin.dto.DummyDto;
import com.example.multimodulesexample.admin.service.DummyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class TestController {

    private final DummyService dummyService;

    @GetMapping("/")
    public String renderIndexPage(Model model) {
        List<DummyDto> dummyList = dummyService.findDummyAll();
        model.addAttribute("dummyList", dummyList);
        return "index";
    }
}
