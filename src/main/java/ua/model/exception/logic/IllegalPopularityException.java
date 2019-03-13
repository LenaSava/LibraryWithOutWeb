package ua.model.exception.logic;

import ua.model.exception.MainProjectException;

public class IllegalPopularityException extends MainProjectException {

    public IllegalPopularityException() {
    }

    public IllegalPopularityException(String message) {
        super(message);
    }
}
