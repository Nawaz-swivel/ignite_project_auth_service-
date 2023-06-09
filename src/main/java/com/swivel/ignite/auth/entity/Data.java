package com.swivel.ignite.auth.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * This class is used to serialize User for data transfer
 */
@Getter
@Setter
public class Data implements Serializable {

    private String userId;
    private String username;
    private String role;
}
