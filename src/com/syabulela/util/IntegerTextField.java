/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.viresh.util;

import com.viresh.presentation.CashRegister;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Viresh
 */
public class IntegerTextField extends JTextField{
    private boolean updating = false;
	
    public IntegerTextField() {
            init();
    }

    public IntegerTextField(int columns) {
    super(columns);
    init();
}

    private void init() {
             // Add a document listener to track changes in the text
        getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if (!updating) {
                    validateText();
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if (!updating) {
                    validateText();
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Not used for plain text fields
            }
        });
        }

        private void validateText() {
            SwingUtilities.invokeLater(() -> {
                String text = getText();
                StringBuilder validText = new StringBuilder();
                updating = true;
                
                for (char c : text.toCharArray()) {
                    if (Character.isDigit(c) || (c == '-' && validText.length() == 0)) {
                        validText.append(c);
                    }
                }
                
                setText(validText.toString());
                CashRegister.calculateTotalCost();
                updating = false;
            });
    }
}
