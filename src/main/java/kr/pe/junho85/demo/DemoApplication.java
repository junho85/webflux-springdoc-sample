package kr.pe.junho85.demo;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public OpenAPI api() {
        return new OpenAPI()
                .info(new Info().title("SpringDoc 테스트")
                        .description("SpringDoc 테스트입니다.")
                        .version("1.0")
                );
    }
}
