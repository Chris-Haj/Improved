import javax.swing.*;
import java.awt.*;

public class InterfaceClickables extends JPanel {

    JButton[] buttons =  new JButton[9];
    JButton reset = new JButton("Reset Game");

    public Font getDefault() {
        return font;
    }

    Font font =  new Font("Serif",Font.PLAIN,30);


    public InterfaceClickables(){
        for(int i = 0 ; i < 9 ;i++ ){
            buttons[i] = new JButton("");
            buttons[i].setPreferredSize(new Dimension(100,100));
            buttons[i].setFont(font);
        }
    }

    public JButton getButtons(int i) {
        return buttons[i];
    }

    public JButton[] getList(){
        return buttons;
    }

    public void setButton(int i) {
        this.buttons[i] = buttons[i];
    }

    public JButton getReset() {
        return reset;
    }

    public void setReset(JButton reset) {
        this.reset = reset;
    }
}
