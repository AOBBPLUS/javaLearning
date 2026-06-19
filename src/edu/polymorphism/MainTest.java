package edu.polymorphism;

public class MainTest {
    public static void main(String[] args) {
        Printer  colorfulPrinter =  new ColorfulPrinter();
       Printer blackPrinter =  new BlackPrinter();
        System.out.println(colorfulPrinter.getPrinter());
        System.out.println(blackPrinter.getPrinter());
        Computer computer = new Computer();
        computer.doPrint(blackPrinter);
        computer.doPrint(colorfulPrinter);
    }
}
