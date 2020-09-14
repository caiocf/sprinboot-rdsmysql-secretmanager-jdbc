package br.com.mkcf.apiweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class ApiwebApplication {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(ApiwebApplication.class, args);
    }

    @Scheduled(fixedDelay = 1000l)
    public void foo(){
        System.out.println(jdbcTemplate.queryForObject("select 1", String.class));
    }
}
