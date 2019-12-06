package com.lukasz.mybatisspringbootdemo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class MybatisSpringBootDemoApplication {

    public static void main(String[] args) {
        var springApplication = new SpringApplication(MybatisSpringBootDemoApplication.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);
    }
}
