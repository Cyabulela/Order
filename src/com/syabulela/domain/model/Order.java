/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package com.viresh.domain.model;

/**
 *
 * @author Viresh
 */
public record Order(
    Fish fishType,
    Chips chipsSize,
    int fishQuantity,
    int chipsQuantity,
    int coldDrinkQuantity,
    int rollsQuantity
){
    
    public Order setColdDrinkQuantity(int quantity) {
        return new Order(fishType , chipsSize , fishQuantity , chipsQuantity , quantity , rollsQuantity);
    }
    
    public Order setRollsQuantity(int quantity) {
        return new Order(fishType , chipsSize , fishQuantity , chipsQuantity , coldDrinkQuantity , quantity);
    }
}
