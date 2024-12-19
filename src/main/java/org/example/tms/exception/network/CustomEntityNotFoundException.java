package org.example.tms.exception.network;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CustomEntityNotFoundException extends RuntimeException {
    public <T> CustomEntityNotFoundException(Class<T> entityClass, Object id) {
        super(entityClass.getSimpleName() + " with ID " + id + " not found");
    }
}
