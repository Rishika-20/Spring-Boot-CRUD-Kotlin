package com.knoldus.SpringCrudKotlin.swaggerTesting

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Contact
import io.swagger.v3.oas.annotations.info.Info
import io.swagger.v3.oas.annotations.info.License
import org.springframework.context.annotation.Configuration

@Configuration
@OpenAPIDefinition(info =
Info(
    title = "Spring Boot Using Kotlin",
    version = "2.1.0",
    termsOfService = "CRUD operations",
    license = License(url = "https://www.google.com/search?channel=fs&client=ubuntu&q=knoldus+inc", name = "KnoldusInc"),
    contact = Contact(name = "Rishika Kumari", email = "rishika.kumari@knoldus.com")
)
)
class SwaggerConfig
