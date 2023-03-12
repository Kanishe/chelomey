package org.example.ex1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.example.ex1.objectMapperSetting.ObjectMapperConfig;

public class Solution {

    public static void main(String[] args) {
        try {
//            Serialization
            Book book = new Book();
            ObjectMapperConfig mapperConfig = new ObjectMapperConfig();
            String jsonBook = mapperConfig.objectMapper.writeValueAsString(book);
            System.out.println(jsonBook);
            desialozation(jsonBook);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void desialozation(String string){
        try {
            String sr = string;
            Book book= new ObjectMapperConfig().objectMapper.readValue(sr, Book.class);
            System.out.println(book);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
