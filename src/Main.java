import javax.swing.*;
import java.awt.*;

public class Main {

    private static void Initialize(){
        TicTacToe game = new TicTacToe();
        game.frame.setSize(500,500);
        game.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        game.frame.setVisible(true);
        game.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        Initialize();
    }

}
