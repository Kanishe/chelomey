package org.example.ex3;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public abstract class AbstractConvertor {
    protected ObjectMapper objectMapper;

    public AbstractConvertor(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }
}
