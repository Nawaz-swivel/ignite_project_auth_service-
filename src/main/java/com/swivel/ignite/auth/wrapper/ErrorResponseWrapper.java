package com.swivel.ignite.auth.wrapper;

import com.swivel.ignite.auth.dto.response.ResponseDto;
import com.swivel.ignite.auth.enums.ResponseStatusType;
import lombok.Getter;

/**
 * Error response wrapper
 */
@Getter
public class ErrorResponseWrapper extends ResponseWrapper {
    private final int errorCode;

    /**
     * @param status         status
     * @param message        dev message
     * @param data           data
     * @param displayMessage display message
     * @param errorCode      error code
     */
    public ErrorResponseWrapper(ResponseStatusType status, String message, ResponseDto data, String displayMessage,
                                int errorCode) {
        super(status, message, data, displayMessage);
        this.errorCode = errorCode;
    }
}
