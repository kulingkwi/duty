package org.kulingkwi.duty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@RestController
public class DutyApplication {

    public static void main(String[] args) {
        SpringApplication.run(DutyApplication.class, args);
    }

    @RequestMapping("/")
    public String index(){
       return "This is the Duty application";
    }

}
