package br.com.senai.infoa.backend.projeto_empreendedor.models;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "Boolean",
        version = "1.0",
        description = "variável lógica de verdadeiro ou falso"
    )
)
public class Swagger {

}