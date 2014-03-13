package org.nerv.problemsolver;

/**
 * Created by tenjutsu25 on 3/13/14.
 */
public class Cell {

    private boolean numbered;
    private int number;

    private boolean marked = false;

    public boolean isNumbered() {
        return numbered;
    }

    public void setNumbered(boolean numbered) {
        this.numbered = numbered;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number < 0 || number > 8) {
            System.err.println("Number of cells cannot exceed 8 or be less than 0.");
            System.exit(0);
        }
        if(number > 0){
            setNumbered(true);
        } else {
            setNumbered(false);
        }
        this.number = number;

    }

    public boolean isMarked() {
        return marked;
    }

    public void setMarked(boolean marked) {
        this.marked = marked;
    }

    @Override
    public String toString() {
        return String.valueOf(number);//.concat("-").concat(String.valueOf(marked));
    }
}
