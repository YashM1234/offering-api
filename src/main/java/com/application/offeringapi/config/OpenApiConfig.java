package com.application.offeringapi.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "Location Management API",
                description = "Location Management System API Documentation",
                summary = "Location Management System",
                termsOfService = "T&C",
                contact = @Contact(
                        name = "Yash",
                        email = "yash@gmail.com"
                ),
                version = "v1.0"

        ),
        servers = {
                @Server(
                        description = "local",
                        url = "http://localhost:8081"
                ),
                @Server(
                        description = "dev",
                        url = "http://localhost:8081"
                ),
                @Server(
                        description = "test",
                        url = "http://localhost:8081"
                ),
                @Server(
                        description = "acc",
                        url = "http://localhost:8081"
                ),
                @Server(
                        description = "dev",
                        url = "http://localhost:8081"
                ),
                @Server(
                        description = "prod",
                        url = "http://localhost:8081"
                )
        }

)
@SecurityScheme(
        name= "auth",
        in = SecuritySchemeIn.HEADER,
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        scheme = "bearer",
        description = "security description"
)
public class OpenApiConfig {
}
