
package Rule;

import java.awt.Color;
import static java.awt.Color.white;
import java.awt.Cursor;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JTextField;


public class JButtonBox extends JButton {
    public JButtonBox(){
    setOpaque(false);
        setContentAreaFilled(false);
        setForeground(Color.black);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
   
}
    @Override
 protected void paintComponent(Graphics g){
     g.setColor(new Color(90,150,200));
     g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 20, 20);
   super.paintComponent(g);
     
 }  
    @Override
    protected void paintBorder(Graphics g){
       g.setColor(Color.black);
       g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 20, 20);
       
    }
}
