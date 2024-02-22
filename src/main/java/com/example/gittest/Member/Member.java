package com.example.gittest.Member;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Member {
    private Long id;
    private String name;

    private String email;
}
