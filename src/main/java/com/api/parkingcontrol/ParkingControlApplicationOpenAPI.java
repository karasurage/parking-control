package com.api.parkingcontrol;

import com.api.parkingcontrol.constants.Constants;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@OpenAPIDefinition(
        info = @Info(
                title = Constants.SwaggerApi.SWAGGER_TITLE,
                version = Constants.SwaggerApi.SWAGGER_VERSION,
                description = Constants.SwaggerApi.SWAGGER_DESCRIPTION,
                termsOfService = Constants.SwaggerApi.SWAGGER_TERMS_OF_SERVICE,
                license = @License(
                        name = Constants.SwaggerApiMetaInfo.SWAGGER_META_INFO_LICENSE,
                        url = Constants.SwaggerApiMetaInfo.SWAGGER_META_INFO_LICENSE_URL),
                contact = @Contact(
                        name = Constants.SwaggerApiContact.SWAGGER_CONTACT_NAME,
                        url = Constants.SwaggerApiContact.SWAGGER_CONTACT_URL,
                        email = Constants.SwaggerApiContact.SWAGGER_CONTACT_EMAIL
                )))
public interface ParkingControlApplicationOpenAPI {
}
