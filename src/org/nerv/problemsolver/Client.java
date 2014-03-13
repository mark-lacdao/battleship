package org.nerv.problemsolver;

/**
 * Created by tenjutsu25 on 3/13/14.
 */
public class Client {

    public static void main(String[] args) {
        Battleground battleground = new Battleground(6, 6);
        battleground.setNumberedCell(1, 1, 1);
        battleground.setNumberedCell(1, 2, 1);
        battleground.setNumberedCell(2, 4, 1);
        battleground.setNumberedCell(2, 5, 4);
        battleground.setNumberedCell(4, 3, 3);
        battleground.setNumberedCell(4, 5, 2);
        battleground.setNumberedCell(5, 3, 2);
        battleground.setNumberedCell(5, 6, 2);
        battleground.printPlot();
        CellNavigator cellNavigator = new CellNavigator(battleground);
        System.out.println(cellNavigator.getNorthCell(1, 1));

        Ship threeCellShip = new Ship(3, 1);
        Ship twoCellShipA = new Ship(2, 1);
        Ship twoCellShipB = new Ship(2, 1);
        Ship oneCellShipA = new Ship(1, 1);
        Ship oneCellShipB = new Ship(1, 1);
        Ship oneCellShipC = new Ship(1, 1);

    }

}
