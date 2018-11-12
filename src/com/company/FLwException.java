package com.company;

/**
 * выдаст ошибку в случае суммы букета равной 0
 */
public class FLwException extends Exception  {

    public FLwException(String message) {
        super(message);
    }
}
