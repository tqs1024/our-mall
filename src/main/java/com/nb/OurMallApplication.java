package com.nb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author TanQingshan
 */
@SpringBootApplication
@MapperScan("com.nb.mapper")
public class OurMallApplication {

    public static void main(String[] args) {
        SpringApplication.run(OurMallApplication.class, args);
    }

}
