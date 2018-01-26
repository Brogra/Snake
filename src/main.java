import javafx.scene.shape.DrawMode;
import java.awt.Graphics;
import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import javax.swing.*;
public class main {
    static final int SIZE = 500;
    static JFrame gameScreen = new JFrame("Snake");
    static JPanel board = new JPanel();
    static Snake player = new Snake(0,0,1,true);

    private static int xDir = 0;
    private static int yDir = 1;

    public static void initFrame(){
        gameScreen.setSize(SIZE,SIZE);
        gameScreen.setVisible(true);
        gameScreen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


        JPanel view = new JPanel();
        view.setLayout(null);
        view.setVisible(true);
        view.setBackground(Color.BLACK);
        gameScreen.add(view);
        gameScreen.revalidate();

        JPanel firstBox = new JPanel();
        firstBox.setBackground(Color.WHITE);
        firstBox.setLocation(10,10);
        firstBox.setSize(10,10);

        view.add(firstBox);


        ArrayList<JPanel> box = player.getList();
        box.add(firstBox);
        player.updateList(box);

        view.revalidate();
    }
    public static void isDead(){
        if(player.getX() > SIZE || player.getX() < 0 || player.getY() > 500 || player.getY() < 0){
            player.dead();
        }
    }

    public static void initSnke(){
        for (int i = 0; i < player.getSize(); i++) {

        }


    }
    private static void update(){
        for (int i = 0; i < player.getList().size(); i++){
            JPanel x = player.getList().get(i);
            player.getList().get(i).setLocation(x.getLocation().x + xDir,x.getLocation().y);
        }
    }
    public static void main(String[] args){
        initFrame();
        boolean on = true;
        while(player.isAlive() || on){


            isDead();
            update();
            try {

            }
            except
            TimeUnit.SECONDS.sleep(1);
            on = false;
        }


    }

}
