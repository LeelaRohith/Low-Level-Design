package boards;

import game.Board;
import game.Cell;

import java.util.Arrays;

public class TicTacToe extends Board {
    String cells[][] = new String[3][3];
    public String getCell(int row,int col)
    {
        return cells[row][col];
    }

    @Override
    public String toString() {
        String result = "";
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                result+=cells[i][j];
            }
            result+="\n";
        }
        return result;
    }

    public void setCell(Cell cell, String symbol)
    {
        cells[cell.getRow()][cell.getCol()]=symbol;
    }
}
