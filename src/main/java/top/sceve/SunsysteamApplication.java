package top.sceve;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("top.sceve.mapper")
public class SunsysteamApplication {

    public static void main(String[] args) {
        SpringApplication.run(SunsysteamApplication.class, args);
    }

}
