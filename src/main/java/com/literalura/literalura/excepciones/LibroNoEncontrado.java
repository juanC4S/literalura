package com.literalura.literalura.excepciones;

public class LibroNoEncontrado extends RuntimeException {
    public LibroNoEncontrado(String message) {
        super(message);
    }
}
