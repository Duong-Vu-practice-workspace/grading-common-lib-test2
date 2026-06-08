package com.ptit.grading.common.client;

import feign.Feign;
import feign.Logger;
import feign.codec.Decoder;
import feign.codec.Encoder;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.slf4j.Slf4jLogger;

public class FeignClientFactory {

    public static <T> T createClient(Class<T> clazz, String baseUrl) {
        return Feign.builder()
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .logger(new Slf4jLogger(clazz))
                .logLevel(Logger.Level.FULL)
                .retryer(new feign.Retryer.Default(1000, 2000, 3))
                .target(clazz, baseUrl);
    }
}
