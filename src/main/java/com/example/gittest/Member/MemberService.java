package com.example.gittest.Member;

import org.springframework.stereotype.Service;

@Service
public class MemberService {
    public Member getMember(){
        return new Member(1l, "member1","email");
    }
    public Member getMember2(){
        return new Member(1l, "member1","email");

    }
    public Member getMember3(){
        return new Member(1l, "member1","email");

    }

    public Member getMember4(){
        return new Member(1l, "member1","email");

    }

    public Member getMember5(){
        return new Member(1l, "member1","email");

    }
}
