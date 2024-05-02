package lt.viko.eif.siroochenko.rest.restdemo.payroll.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

import java.util.Locale;

@OpenAPIDefinition(
        info = @Info(
             contact =  @Contact(
                     name = "Yana",
                     email =  "yana.kostenko@gmail.com",
                     url = "eif.viko.lt"
             ),
                description = "OpenAPI documentation for application",
                title = "Title",
                version = "2.0.5",
                license = @License(
                        name = "viko",
                        url = "eif.viko.lt"
                )
        )

)


public class OpenApiConfig {

}
