package com.headcrest.exceptions;

import java.io.IOException;

public class IgnorantUserException extends IOException {

    public IgnorantUserException(String message) {
        super(message);
    }
}
