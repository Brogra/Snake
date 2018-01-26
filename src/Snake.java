public class Snake {
    private int NumBlocks;
    private boolean Alive;

    public Snake(int size, boolean living) {
        NumBlocks = size;

    }
    public void increaseSize(){
        NumBlocks++;
    }
    public void dead(){
        Alive = false;
    }
    public void isAlive(){

    }
}
