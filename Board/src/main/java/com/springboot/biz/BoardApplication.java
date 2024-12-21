package com.springboot.biz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication    // 스프링 부트 애플리케이션의 시작점을 나타내는 어노테이션
public class BoardApplication {

    // 애플리케이션의 메인 메소드
    // 스프링 부트 애플리케이션을 실행하는 진입점
    public static void main(String[] args) {
        SpringApplication.run(BoardApplication.class, args);
    }
}