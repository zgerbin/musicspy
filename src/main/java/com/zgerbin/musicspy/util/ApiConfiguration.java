package com.zgerbin.musicspy.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application-api.properties")
public class ApiConfiguration {
    @Value("${kugou}")
    private String kugou;

    public String getKugou() {
        return kugou;
    }

    public void setKugou(String kugou) {
        this.kugou = kugou;
    }
}
