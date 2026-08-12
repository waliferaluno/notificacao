package com.javanauta.notificacao.infraestructure.exceptions;

import com.javanauta.notificacao.bussines.EmailService;

public class EmailException extends RuntimeException{

    public EmailException(String mensagem){
        super(mensagem);
    }
    public EmailException(String mensagem, Throwable throwable){
        super(mensagem, throwable);
    }
}
