package com.example.taskmanage.config;

import com.example.taskmanage.model.MxxModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SjbcConfiguration {

    @Value("${org.example.prop:Mxx}")
    String Mxx;

    @Bean
    public MxxModel MxxModel() {
        MxxModel model = new MxxModel();
        model.setValue(Mxx);
        return model;
    }
}