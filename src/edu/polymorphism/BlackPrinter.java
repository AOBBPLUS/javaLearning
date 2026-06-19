package edu.polymorphism;

public class BlackPrinter extends Printer {
    private  String blackPrinter="blackPrinter";
    @Override
    public void print() {
        System.out.println("BlackPrinter");
    }
@Override
    public String getPrinter() {
        return blackPrinter;
    }
}
