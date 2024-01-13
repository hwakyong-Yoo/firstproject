package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
//URL 연결 요청(@GetMapping())과 동시에 자동으로 임포트
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //컨트롤러 선언
public class FirstController {

    @GetMapping("/hi") //URL 요청 접수
    public String niceToMeetYou(Model model) { //model 객체 받아 오기
        model.addAttribute("username", "홍팍");
        return "greetings"; // greetings.mustache 파일 반환
    }

    @GetMapping("/bye") //URL 요청 접수
    public String seeYouNext(Model model) { //model 객체 받아 오기
        model.addAttribute("nickname", "홍길동");
        return "goodbye"; // goodbye.mustache 파일 반환
    }
}
