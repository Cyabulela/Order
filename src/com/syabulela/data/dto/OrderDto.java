/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package com.viresh.data.dto;

import com.viresh.domain.model.Chips;
import com.viresh.domain.model.Fish;
import com.viresh.domain.model.Order;

/**
 *
 * @author Viresh
 */
public record OrderDto(
    Fish fishType,
    Chips chipsSize,
    int fishQuantity,
    int chipsQuantity,
    int coldDrinkQuantity,
    int rollsQuantity,
    boolean hasColdDrink,
    boolean hasRolls
) {
    
   public Order toOrder() {
        Order order = new Order(
            fishType,
            chipsSize,
            fishQuantity,
            chipsQuantity,
            0,
            0
        );

        order = order.setColdDrinkQuantity((hasColdDrink) ? coldDrinkQuantity : 0);

        return order.setRollsQuantity((hasRolls) ? rollsQuantity : 0);
   } 

}
