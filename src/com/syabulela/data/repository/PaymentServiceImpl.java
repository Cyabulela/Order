/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.viresh.data.repository;

import com.viresh.domain.model.Order;
import com.viresh.domain.repository.PaymentService;
import com.viresh.util.InsufficientAmountException;

/**
 *
 * @author Viresh
 */
public class PaymentServiceImpl implements PaymentService{
    private final double ROLL_PRICE = 2.5, COOL_DRINK_PRICE = 10;

    @Override
    public double processPayment(double totalCost, double amtPaid) throws InsufficientAmountException{
            if (amtPaid < totalCost) throw new InsufficientAmountException();
            return amtPaid - totalCost;
    }

    @Override
    public double getTotalCost(Order order) {
        // TODO Auto-generated method stub
        return (order.fishType().getPrice() * order.fishQuantity())
            + (order.chipsSize().getPrice() * order.chipsQuantity())
            + (order.coldDrinkQuantity() * COOL_DRINK_PRICE)
            + (order.rollsQuantity() * ROLL_PRICE);
    }
}
