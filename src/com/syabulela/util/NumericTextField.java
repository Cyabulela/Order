/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.viresh.util;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Viresh
 */
public class NumericTextField extends JTextField{
    private boolean dotAdded = false;
    public NumericTextField() {
            init();
    }

    public NumericTextField(int columns) {
        super(columns);
        init();
    }
    
    private void init() {
    	 // Add a document listener to track changes in the text
    	// Use a PlainDocument to handle text changes
        setDocument(new NumericDocument());

        // Add a key listener to handle key events
        addKeyListener(new NumericKeyListener());
    }
    
    private class NumericDocument extends PlainDocument {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Override
        public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
            if (str == null) {
                return;
            }

            String currentText = getText(0, getLength());

            StringBuilder validTextBuilder = new StringBuilder(currentText);
            validTextBuilder.insert(offs, str);

            String validText = validateText(validTextBuilder.toString());

            super.remove(0, getLength());
            super.insertString(0, validText, a);
        }
        
        @Override
        public void remove(int offs, int len) throws BadLocationException {
            String currentText = getText(0, getLength());
            String newText = currentText.substring(0, offs) + currentText.substring(offs + len);

            String validText = validateText(newText);

            super.remove(0, getLength());
            super.insertString(0, validText, null);
        }
    }
    
    private class NumericKeyListener extends KeyAdapter {
        @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();

            if (!Character.isDigit(c) && c != '.' && c != KeyEvent.VK_BACK_SPACE) {
                e.consume();
            }
        }
    }
    
    private String validateText(String text) {
        StringBuilder validTextBuilder = new StringBuilder();
        dotAdded = false;

        for (char c : text.toCharArray()) {
            if (Character.isDigit(c)) {
                validTextBuilder.append(c);
            } else if (c == '.' && !dotAdded) {
                validTextBuilder.append(c);
                dotAdded = true;
            }
        }

        return validTextBuilder.toString();
    }
}
