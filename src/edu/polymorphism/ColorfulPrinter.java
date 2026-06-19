package edu.polymorphism;

public class ColorfulPrinter extends Printer {

    private String colorfulPrinter = "colorfulPrinter";
    @Override
    public String getPrinter() {
        return colorfulPrinter;
    }
    @Override
    public void print() {
        System.out.println("ColorfulPrinter");
    }
}
