
package Rule;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class JMyCompo extends JComboBox {
    public JMyCompo(){
    
    setOpaque(false);
        setForeground(Color.BLUE);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
}   
    @Override
 protected void paintComponent(Graphics g){
     g.setColor(getBackground());
     g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 20, 20);
   super.paintComponent(g);
     
 }  
    @Override
    protected void paintBorder(Graphics g){
       g.setColor(Color.red);
       g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 20, 20);
       
    }
}
