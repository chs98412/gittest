package com.example.gittest.Admin;
import com.example.gittest.Member.Member;
import com.example.gittest.Member.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin")
public class AdminController {
    @Autowired
    private MemberService memberService;
    @GetMapping
    public Member findAdmin(){
        return memberService.getMember();
    }
}
