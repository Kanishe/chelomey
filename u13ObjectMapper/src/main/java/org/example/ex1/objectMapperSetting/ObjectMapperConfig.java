package org.example.ex1.objectMapperSetting;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class ObjectMapperConfig {
    public  ObjectMapper objectMapper;

    public ObjectMapperConfig() {
        this.objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
    }
}
