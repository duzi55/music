package com.duzi55.music;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.duzi55.music.dao")

public class MusicApplication {

    public static void main(String[] args) {
        SpringApplication.run(MusicApplication.class, args);
    }

}
