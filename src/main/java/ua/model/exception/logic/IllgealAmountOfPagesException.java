package ua.model.exception.logic;

import ua.model.exception.MainProjectException;

public class IllgealAmountOfPagesException extends MainProjectException {
    public IllgealAmountOfPagesException() {
    }

    public IllgealAmountOfPagesException(String message) {
        super(message);
    }
}
