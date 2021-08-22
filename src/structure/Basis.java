
package structure;

import javax.swing.JTabbedPane;
import javax.swing.JTable;


public interface Basis {
    
   public void add();
   
   
   public void update();
   
   public void delete();
   
   public String  AutoNum();
   
   public void getAllRows(JTable table);
   
   public void getOneRow(JTable table);
   
   public void getCustomRows(String statment , JTable table);
   
   public String getValueByName(String name);
   
   public String getNameByvalue(String val);
   
}
