package org.nerv.problemsolver;

/**
 * Created by tenjutsu25 on 3/14/14.
 */
public class Ship {

    private Orientation orientation;
    private int length;
    private int width;

    public Ship(int length, int width) {
        this.length = length;
        this.width = width;
        this.orientation = Orientation.HORIZONTAL;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void changeOrientation(Orientation orientation) {
        this.orientation = orientation;
        int originalLength = this.length;
        this.length = this.width;
        this.width = originalLength;
    }
}
