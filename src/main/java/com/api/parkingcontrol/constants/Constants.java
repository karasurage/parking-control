package com.api.parkingcontrol.constants;


import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Constants {

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class SwaggerApi {

        public static final String SWAGGER_TITLE = "API REST Parking Spot";
        public static final String SWAGGER_DESCRIPTION = "API REST Parking Spot";
        public static final String SWAGGER_VERSION = "1.0";
        public static final String SWAGGER_TERMS_OF_SERVICE = "Terms of Service";

    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class SwaggerApiContact {

        public static final String SWAGGER_CONTACT_NAME = "Nicholas Mateus";
        public static final String SWAGGER_CONTACT_URL = "https://github.com/karasurage";
        public static final String SWAGGER_CONTACT_EMAIL = "nicholas.mateus@gmail.com";

    }

    @NoArgsConstructor(access = AccessLevel.PRIVATE)
    public static class SwaggerApiMetaInfo {

        public static final String SWAGGER_META_INFO_LICENSE = "Apache License Version 2.0";
        public static final String SWAGGER_META_INFO_LICENSE_URL = "https://www.apache.org/licesen.html";


    }


}
