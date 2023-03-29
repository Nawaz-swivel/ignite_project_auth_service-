package com.swivel.ignite.auth.enums;

/**
 * Enum values for user type
 */
public enum UserType {

    ADMIN("ADMIN"),
    STUDENT("STUDENT");

    private final String type;

    UserType(String type) {
        this.type = type;
    }
}
