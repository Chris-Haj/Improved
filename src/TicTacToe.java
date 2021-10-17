import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe implements ActionListener {

    JFrame frame =  new JFrame("TicTacToe");
    JPanel Menu = new JPanel();
    JPanel xo =  new JPanel();
    InterfaceClickables game = new InterfaceClickables();




    TicTacToe(){
        Menu.setLayout(new BorderLayout(100,100));

        xo.setLayout(new GridLayout(3,3));
        xo.setPreferredSize(new Dimension(JFrame.MAXIMIZED_HORIZ,200));
        frame.add(xo,BorderLayout.NORTH);
        frame.add(Menu,BorderLayout.SOUTH);

        for(int i =0 ; i < game.getList().length ;i++) {
            xo.add(game.getButtons(i));
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
