/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.viresh.util;

/**
 *
 * @author Viresh
 */
public class InsufficientAmountException extends Exception{
    private String message;
	
    public InsufficientAmountException() {}

    public InsufficientAmountException(String message) {
            this.message = message;
    }

    @Override
    public String getLocalizedMessage() {
            // TODO Auto-generated method stub
            return (message != null) ? message : "Insufficient fund!!!";
    }
}
