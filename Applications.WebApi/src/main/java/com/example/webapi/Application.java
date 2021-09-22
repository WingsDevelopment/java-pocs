package com.example.webapi;

import applicationServices.PongService;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ImportResource(value = "classpath:applicationContext.xml")
public class Application {

    public static void main(String[] args) {
        /*ApplicationContext c = new ClassPathXmlApplicationContext("applicationContext.xml");

        PongService a = c.getBean("pongService", PongService.class);

        System.out.println("ts");
        System.out.println(a.GetById(1L).getId());*/
        SpringApplication.run(Application.class, args);
    }

}
