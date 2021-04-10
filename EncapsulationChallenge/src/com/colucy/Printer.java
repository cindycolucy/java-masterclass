package com.colucy;

public class Printer {

    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.duplex = duplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void fillToner(int toner) {
        tonerLevel = tonerLevel + toner;
        System.out.println("Toner level is " + tonerLevel);
        if (tonerLevel >= 100) {
            System.out.println("Toner is full.");

        }

    }

    public void printPage(int pages){
        numberOfPagesPrinted = numberOfPagesPrinted + pages;
        if(duplex){
            numberOfPagesPrinted = (numberOfPagesPrinted / 2) + (numberOfPagesPrinted % 2);
        }
        System.out.println("Number of pages printed is " + numberOfPagesPrinted);

    }
}
