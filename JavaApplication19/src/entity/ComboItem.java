/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author FPTSHOP
 */
public class ComboItem {
      private int value;
    private String text;

    // Constructor
    public ComboItem(int value, String text) {
        this.value = value;
        this.text = text;
    }

    // Getter for value
    public int getValue() {
        return value;
    }

    // Getter for text
    public String getText() {
        return text;
    }

    // Override toString() method to return the text
    @Override
    public String toString() {
        return text;
    }
}
