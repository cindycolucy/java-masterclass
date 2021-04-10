package com.colucy;

public class Main {

    public static void main(String[] args) {
    Printer printer = new Printer(50, 10, true);

    printer.fillToner(60);
    printer.printPage(5);

    }
}
