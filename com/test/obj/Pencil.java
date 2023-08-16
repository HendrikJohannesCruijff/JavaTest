package com.test.obj;

public class Pencil {

    private String hardness;
    private String color;

    public void setHardness(String hardness) {
        this.hardness = hardness;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHardness() {
        return hardness;
    }

    public String getColor() {
        return color;
    }
    public String info(){
        return String.format("Pencil[%s,%s]", hardness, color);
    }

}
