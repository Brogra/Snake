import javax.swing.*;
import java.util.ArrayList;

public class Snake {
    private int NumBlocks;
    private boolean Alive;
    private int xLocation;
    private int yLocation;
    private ArrayList<JPanel> boxes;

    public Snake(int xLoc, int yLoc, int size, boolean living) {
        NumBlocks = size;
        Alive = living;
        yLocation = yLoc;
        xLocation = xLoc;
    }
    public void updatLoc(int XChange, int YChange){
        xLocation += XChange;
        yLocation += YChange;
    }
    public ArrayList<JPanel> getList(){
        return boxes;
    }
    public void updateList(ArrayList<JPanel> newB){
        boxes = newB;
    }


    public void increaseSize(){
        NumBlocks++;
    }

    public void dead(){
        Alive = false;
    }
    public int getSize(){
        return NumBlocks;
    }
    public boolean isAlive(){
        return Alive;

    }
    public int getY(){
        return yLocation;
    }
    public int getX(){
        return xLocation;
    }
}
