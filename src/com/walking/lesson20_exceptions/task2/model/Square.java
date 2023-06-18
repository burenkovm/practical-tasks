package com.walking.lesson20_exceptions.task2.model;

public class Square extends EquilateralShape {
    public Square(int length)
    {
        super(length);
    }
    @Override
    public String getStringShape() {
        String stringShape = "";
        for (int i = 0; i < length; i++) {
            stringShape += "-";
        }
        for (int j = 2; j < length; j++) {
            stringShape+="\n";
            stringShape+="|";
            for (int i = 2; i < length; i++) {
                stringShape+=" ";
            }
            stringShape+="|";
        }
        stringShape+="\n";
        for (int i = 0; i < length; i++) {
            stringShape+="-";
        }
        stringShape+="\n";
        return stringShape;
    }

}
