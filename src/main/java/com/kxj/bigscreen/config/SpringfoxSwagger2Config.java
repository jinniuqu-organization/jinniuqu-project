package com.kxj.bigscreen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description Swagger配置文件
 * @Author pengyang
 * @Date 2020-03-27
 **/
//该类依赖了google的guava组件和springfox.documentation组件
@Configuration
@EnableSwagger2
//包扫描，在此包下的Controler都会被纳入swagger接口文档生成的范围，这里也可以配置类扫描，同时也可以在这个配置类里面细化过滤规则
@ComponentScan(basePackages = "com.kxj.bigscreen.controller")
public class SpringfoxSwagger2Config {

    //组织Docket对象，翻译过来就是摘要的意思，它是生成API文档的核心对象，里面配置一些必要的信息
    @Bean
    public Docket swaggerSpringMvcPlugin(){
                        //指定规范，这里是SWAGGER_2
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.kxj.bigscreen.controller"))
                .build();

    }
}
