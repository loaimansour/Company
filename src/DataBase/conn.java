
package DataBase;

import Company.Tools;
import Company.Tools.Table;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class conn {
   private static Connection con; 
 
 
 private static String url = "jdbc:mysql://localhost:3306/company"+
         "?useUnicode=true&characterUncoding=UTF-8";
            
  private static void  setConnection(){
       try {
           
           con = DriverManager.getConnection(url, "root","");
       } catch (SQLException ex) {
           Logger.getLogger(conn.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
       }
  }
  
  public static boolean checkPass(String Us , String Pa){
      try{
          setConnection();
          Statement st = con.createStatement();
          String strCheck="select * from LOGIN where "
                  +"userName= '"+ Us+ "' and "
                  +"passWord= '"+ Pa+ "'";
          st.executeQuery(strCheck);
          while(st.getResultSet().next()){
          con.close();

              return true; 
          }
           con.close();
           
      }
      catch(SQLException ex){
          JOptionPane.showMessageDialog(null, ex);
         
      }
 
  return false; 
}
 public static boolean NotQuery(String stmSql){

       try {
            setConnection();
           Statement stm = con.createStatement();
           stm.execute(stmSql);
           con.close();
           return true;
           
       } catch (SQLException ex) {
      Tools.msgBox(ex.getMessage());
      return false;
       }
     
 }

 public static String  getNum(String tableName , String ColName){
     try{
       setConnection();
       Statement stm = con.createStatement();
       String s = "select max(" + ColName + ")+1 as autonum"
               + " from " + tableName;
         stm.executeQuery(s);
         String Num = "";
         while(stm.getResultSet().next()){
             Num = stm.getResultSet().getString("autonum");            
         }
         con.close();
         if(Num==null || "".equals(Num) ){
           return "1";
         }
         
         else{
            return Num; 
         }
        
     }
     catch(SQLException ex){
         Tools.msgBox(ex.getMessage());
         return "0";
     }
 }  
 
  public static Table getTable(String statement){
      Tools t = new Tools();
      try{
      setConnection();
      Statement stmt = con.createStatement();
      ResultSet rs;
      rs = stmt.executeQuery(statement);
      
       ResultSetMetaData rsmd =rs.getMetaData();
       int c = rsmd.getColumnCount();
       Table table = t.new Table(c);
       while(rs.next()){
           Object row [] = new Object[c];
           for(int i = 0 ; i<c ; i++){
               
               row[i]=rs.getString(i+1);
           }
           table.addNewRow(row);
       }
        con.close();
       return table;
       
      }
      catch(SQLException ex){
          Tools.msgBox(ex.getMessage());
         return  t.new Table(0);
      }
}
  
         
 public static void fillCom(String tableName , String colName ,JComboBox compo){
     try{
        setConnection();
        Statement stmt = con.createStatement();
        ResultSet rs ; 
        String strSelect = "select "+ colName +"  from "+tableName;
        rs = stmt.executeQuery(strSelect);
        rs.last();
        int c= rs.getRow();
       rs.beforeFirst();
       
       String val[] = new String[c];
        int i = 0;
        while(rs.next()){
            val[i] = rs.getString(1);
            i++;
        }
        con.close();
        
        compo.setModel(new DefaultComboBoxModel(val));
     }
     catch(SQLException ex){
         Tools.msgBox(ex.getMessage());
     }
 }
 
       
         
         
         
   public static void FillTable(String TbNameOrStatement ,JTable table){
       try{
       setConnection();
       Statement stmt = con.createStatement();
       String strSelect;
       if("select ".equals(TbNameOrStatement.substring(0, 7).toLowerCase())){
         strSelect =TbNameOrStatement;
        
       }
       else{
           strSelect = "select * from "+TbNameOrStatement;
       }
       
       ResultSet rs;
       rs = stmt.executeQuery(strSelect);
       
        ResultSetMetaData rsmd = rs.getMetaData();
        int c = rsmd.getColumnCount();
        
           DefaultTableModel model = (DefaultTableModel)table.getModel();
           
           Vector row = new  Vector();
           model.setRowCount(0);
           
           while(rs.next()){
               row = new Vector(c);
               for(int i =1 ; i<= c ;i++){
                   row.add(rs.getString(i));
               }
               model.addRow(row);
       }
           if(table.getColumnCount()!=c){
               Tools.msgBox("JTable Columns problem");
           }
           con.close();
           
       }
   catch(SQLException ex ){
       Tools.msgBox(ex.getMessage());
       
   }
   }

}   