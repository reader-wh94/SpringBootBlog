package com.bootblog.springbootblog.controller;

import com.bootblog.springbootblog.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board/**")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService service;

    @GetMapping("/hello")
    public String Hello() {
        return "/boards/hello";
    }

    @GetMapping("/test")
    public String test(Model model) {
        model.getAttribute("cnt", service.boardCount());
        model.getAttribute("test", service.boardList());

        return "/boards/hello";
    }
}
