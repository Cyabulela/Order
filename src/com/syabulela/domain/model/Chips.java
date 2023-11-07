/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.viresh.domain.model;

/**
 *
 * @author Viresh
 */
public enum Chips {
    LARGE(25), MEDIUM(20), SMALL(15);
	
    private final double price;

    private Chips(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
