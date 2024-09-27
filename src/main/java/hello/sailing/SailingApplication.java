package hello.sailing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("hello.sailing.v1.dao")
public class SailingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SailingApplication.class, args);
    }

}
