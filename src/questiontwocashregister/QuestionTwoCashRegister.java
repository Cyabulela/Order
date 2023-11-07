/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questiontwocashregister;

import com.viresh.data.repository.PaymentServiceImpl;
import com.viresh.presentation.CashRegister;
import java.awt.EventQueue;

/**
 *
 * @author Viresh
 */
public class QuestionTwoCashRegister {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EventQueue.invokeLater(() -> {
            try {
                CashRegister cashRegisterUI = new CashRegister(new  PaymentServiceImpl());
                cashRegisterUI.setVisible(true);
            } catch (Exception e) {
                System.out.println("Something went wrong\n" + e.getLocalizedMessage());
            }
        });
    }
    
}
