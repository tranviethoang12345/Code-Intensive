package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by huynq on 7/4/17.
 */
public class Program {
    public static void main(String[] args) {

        JFrame window = new JFrame();
        GamePanel panel = new GamePanel();
        panel.setBackground(Color.CYAN);
        panel.setPreferredSize(new Dimension(800,600));

        window.add(panel);
        window.pack();
        window.setTitle("Master");
        window.setResizable(false);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        KeyAdapter keyHandler = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_UP){
                    KeyEventPress.isUpPress = true;
                }
                else if (e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode() == KeyEvent.VK_LEFT)
                {
                    KeyEventPress.isLeftPress = true;
                }
                else if (e.getKeyCode() == KeyEvent.VK_D || e.getKeyCode() == KeyEvent.VK_RIGHT)
                {
                    KeyEventPress.isRightPress = true;
                }
                else if (e.getKeyCode() == KeyEvent.VK_S || e.getKeyCode() == KeyEvent.VK_DOWN)
                {
                    KeyEventPress.isDownPress = true;
                }
                else if (e.getKeyCode() == KeyEvent.VK_SPACE || e.getKeyCode() == KeyEvent.VK_X)
                {
                    KeyEventPress.isFirePress = true;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_UP){
                    KeyEventPress.isUpPress = false;
                }
                else if (e.getKeyCode() == KeyEvent.VK_A || e.getKeyCode() == KeyEvent.VK_LEFT)
                {
                    KeyEventPress.isLeftPress = false;
                }
                else if (e.getKeyCode() == KeyEvent.VK_D || e.getKeyCode() == KeyEvent.VK_RIGHT)
                {
                    KeyEventPress.isRightPress = false;
                }
                else if (e.getKeyCode() == KeyEvent.VK_S || e.getKeyCode() == KeyEvent.VK_DOWN)
                {
                    KeyEventPress.isDownPress = false;
                }
                else if (e.getKeyCode() == KeyEvent.VK_SPACE || e.getKeyCode() == KeyEvent.VK_X)
                {
                    KeyEventPress.isFirePress = false;
                }
            }
        };
        window.addKeyListener(keyHandler);

        window.setVisible(true);

        panel.gameLoop();

        //ctrl + ?: comment/uncomment
        // alt + enter: sua loi~ trong code
        // (fn +) shift + f6: doi ten
        // alt + ctrl + l: formal code
        // shift + f6: doi ten file
        // ctrl + D: dòng có chữ đánh thì x2 dòng
    }
}
