package org.example.ex3;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

public class DefaultConverter extends AbstractConvertor{
    private ObjectMapper objectMapper;

    public DefaultConverter(ObjectMapper objectMapper) {
        super(objectMapper);
    }

    public void setObjectMapper() throws JsonProcessingException {
        objectMapper.readValue("sdsd", ArrayList.class);
    }
}
