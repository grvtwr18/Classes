package com.composition;

public class Dimension {

    private int length;
    private int width;
    private int height;

    public Dimension()
    {
        this(0, 0, 0);
    }
    public Dimension(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void areaOfTheRoom()
    {
        int area = length*width;
        System.out.println("Area of the room is ------"+area);
    }
}
