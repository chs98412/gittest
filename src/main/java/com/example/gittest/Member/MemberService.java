package com.example.gittest.Member;

import org.springframework.stereotype.Service;

@Service
public class MemberService {
    public Member getMember(){
        return new Member(1l, "member1");
    }
}