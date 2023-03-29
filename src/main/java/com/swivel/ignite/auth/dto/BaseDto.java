package com.swivel.ignite.auth.dto;

import com.swivel.ignite.auth.exception.AuthException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Base DTO (Data Transfer Object)
 */
public interface BaseDto {

    /**
     * This method converts the object data to a Json string
     *
     * @return Json
     */
    default String toJson() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new AuthException("Object to Json conversion was failed", e);
        }
    }

    /**
     * This method converts object to json string for logging purpose.
     * PII data should be obfuscated.
     *
     * @return json string
     */
    String toLogJson();
}
