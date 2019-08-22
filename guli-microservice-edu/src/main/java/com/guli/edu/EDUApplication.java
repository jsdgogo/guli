package com.guli.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ={"com.guli.edu","com.guli.common"} )
public class EDUApplication {

    public static void main(String[] args) {
        SpringApplication.run(EDUApplication.class,args);
    }

}
