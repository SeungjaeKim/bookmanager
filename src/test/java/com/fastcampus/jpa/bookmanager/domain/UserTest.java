package com.fastcampus.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void userTest(){
        User user = new User();
        user.setName("ksj");
        user.setEmail("ksj@mail.com");
        User user3 = User.builder()
                .name("js")
                .email("qwe@naver.com")
                .build();

        System.out.println(">>>>>" + user);
    }

}