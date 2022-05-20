import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe implements ActionListener {

    JFrame frame = new JFrame("TicTacToe");
    JPanel Menu = new JPanel();
    JPanel xo = new JPanel();
    InterfaceClickables game = new InterfaceClickables();
    String turn = "X";
    char[] positions = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};

    TicTacToe() {

//        frame.setLayout(new GridLayout(3,1));
        frame.setLayout(new BorderLayout());

        Menu.add(game.getLabel());
        Menu.add(game.getReset());
        Menu.setBackground(Color.cyan);

        xo.setLayout(new GridLayout(3, 3,5,5));
        frame.add(Menu,BorderLayout.NORTH);
        frame.add(xo);

        for (int i = 0; i < game.getList().length; i++) {
            xo.add(game.getButtons(i));
            game.getButtons(i).addActionListener(this);
        }

        game.getReset().addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == game.getButtons(i) && game.getButtons(i).getText().equals("")) {
                game.getButtons(i).setText(turn);

                if (turn.equals("X")) {
                    game.getLabel().setText("Player 2's turn");
                    positions[i] = 'X';
                    if(checkW())
                        game.getLabel().setText(turn + " Won!");
                    turn = "O";
                }
                else {
                    game.getLabel().setText("Player 1's turn");
                    positions[i] = 'O';
                    if(checkW())
                        game.getLabel().setText(turn + " Won!");
                    turn = "X";
                }


            }
        }
        if(e.getSource()==game.getReset()){
            turn = "X";
            for(int i=0 ;i < 9;i++) {
                game.getButtons(i).setText("");
                positions[i]=(char)('a'+i);
            }

            game.getLabel().setText("Player 1's turn");



        }

    }

    public boolean checkW() {
        if (positions[0] == positions[1] && positions[0] == positions[2])
            return true;
        else if (positions[0] == positions[3] && positions[0] == positions[6])
            return true;
        else if (positions[0] == positions[5] && positions[0] == positions[8])
            return true;
        else if (positions[4] == positions[2] && positions[4] == positions[6])
            return true;
        else if (positions[4] == positions[3] && positions[4] == positions[5])
            return true;
        else if (positions[4] == positions[1] && positions[4] == positions[7])
            return true;
        else if (positions[2] == positions[5] && positions[2] == positions[8])
            return true;
        else if (positions[6] == positions[7] && positions[6] == positions[8])
            return true;
        else if(positions[0]==positions[4]&&positions[4]==positions[8])
            return true;
        else
            return false;
    }
}

