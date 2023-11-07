/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.viresh.domain.repository;

import com.viresh.domain.model.Order;
import com.viresh.util.InsufficientAmountException;

/**
 *
 * @author Viresh
 */
public interface PaymentService {
    public double processPayment(double totalAmt , double amtPaid) throws InsufficientAmountException;
	
    public double getTotalCost(Order order);
}
