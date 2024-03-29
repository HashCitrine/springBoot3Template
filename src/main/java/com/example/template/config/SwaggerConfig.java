package com.example.template.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(info = @Info(title = "Template API", description = "템플릿 API", version = "1.0"))
@Configuration
public class SwaggerConfig {

}
