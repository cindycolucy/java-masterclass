package com.colucy;

public class Mini extends Car{

    private String style;
    private int size;

    public Mini(String color, int doors, String style, int size) {
        super(color, doors);
        this.style = style;
        this.size = size;
    }
}
