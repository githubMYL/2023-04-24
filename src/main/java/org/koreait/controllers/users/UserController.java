package org.koreait.controllers.users;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public String join() {

        return "user/join";
    }

    @PostMapping
    public String joinPs() {

        return "redirect:/user/login";  // 회원 가입 완료 후 -> 로그인 이동
    }
}
