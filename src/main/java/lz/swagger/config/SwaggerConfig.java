package lz.swagger.config;

import org.springframework.boot.SpringBootConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * create by liu_zhang on 2019/11/14 10:15.
 */
@SpringBootConfiguration
@EnableSwagger2
public class SwaggerConfig {

    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("lz.swagger.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("swagger_demo")
                .description("study of swagger")
                .version("1.0")
                .termsOfServiceUrl("localhost:9002")
                .build();
    }
}
