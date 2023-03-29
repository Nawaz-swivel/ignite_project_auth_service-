package com.swivel.ignite.auth.enums;

import lombok.Getter;

/**
 * Enum values for Success Response
 */
@Getter
public enum SuccessResponseStatusType {

    CREATE_USER(2000, "Successfully created the user"),
    CREATE_ROLE(2001, "Successfully created the role"),
    LOGIN_USER(2002, "Successfully logged in the user"),
    DELETE_USER(2003, "Successfully deleted the user");

    private final int code;
    private final String message;

    SuccessResponseStatusType(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
