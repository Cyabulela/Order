/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.viresh.domain.model;

/**
 *
 * @author Viresh
 */
public enum Fish {
    HAKE(45), SNOEK(45);
	
    private final double price;

    private Fish(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
