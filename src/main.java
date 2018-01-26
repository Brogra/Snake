import java.awt.*;
import javax.swing.*;
public class main {
    static JFrame gameScreen = new JFrame("Snake");
    static JPanel board = new JPanel();

    public static void initFrame(){
        gameScreen.setSize(500,500);
        gameScreen.setVisible(true);
        gameScreen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args){
        initFrame();

    }

}
