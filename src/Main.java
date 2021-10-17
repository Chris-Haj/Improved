import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        game.frame.setVisible(true);
        game.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

}
