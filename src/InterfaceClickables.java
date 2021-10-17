import javax.swing.*;
import java.awt.*;

public class InterfaceClickables extends JPanel {

   private JButton[] buttons =  new JButton[9];
   private JButton reset = new JButton("Reset Game");
   private JLabel label = new JLabel("Player 1's turn");
   private  Font font =  new Font(Font.MONOSPACED,Font.BOLD,140);

    public InterfaceClickables(){
        for(int i = 0 ; i < 9 ;i++ ){
            buttons[i] = new JButton("");
            buttons[i].setPreferredSize(new Dimension(100,100));
            buttons[i].setFont(font);
            buttons[i].setBackground(Color.BLACK);
            buttons[i].setForeground(Color.WHITE);
        }
        label.setFont(new Font(Font.SANS_SERIF,Font.BOLD,40));

    }

    public JButton getButtons(int i) {
        return buttons[i];
    }

    public JButton[] getList(){
        return buttons;
    }

    public JButton getReset() {
        return reset;
    }

    public JLabel getLabel(){ return label;}


}
