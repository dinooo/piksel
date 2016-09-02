package com.discount.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;

/**
 * Created by dino on 9/2/16.
 */
public class ObjectMapperFactory {

    private static ObjectMapper objectMapper;

    static{
        objectMapper = new ObjectMapper().registerModule(new Hibernate4Module());
    }

    public static ObjectMapper create(){
        return objectMapper;
    }

}
