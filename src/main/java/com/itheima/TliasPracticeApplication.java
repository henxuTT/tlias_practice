package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication
@ServletComponentScan
//@EnableConfigurationProperties
public class TliasPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(TliasPracticeApplication.class, args);
    }

}
