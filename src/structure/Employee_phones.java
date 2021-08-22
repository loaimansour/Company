
package structure;

import Company.Tools;
import DataBase.conn;
import javax.swing.JTable;


public class Employee_phones implements Basis {
   private int EmpNo ; 
   private String phone ; 

    public int getEmpNo() {
        return EmpNo;
    }

    public void setEmpNo(int EmpNo) {
        this.EmpNo = EmpNo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    

    @Override
    public void add() {
     String add = "insert into employee_phone values("
                  +EmpNo+","+"'"+phone+"')";
     boolean b = conn.NotQuery(add);
     if(b){
         //Tools.msgBox("Phone Is Added");
     }
                  
    }

    @Override
    public void update() {
    
         Tools.msgBox("Phone Is updated Not Work");
     }
          

    @Override
    public void delete() {
    String D = "delete from employee_phone where "
             +"EMPNO= "+EmpNo
               +" end phone='"+phone+ "'";
    boolean IsDeleted = conn.NotQuery(D);
     if(IsDeleted){
        // Tools.msgBox("phone Is Deleted");
     }
    }
   
    public void deleteByEmp(){
        String strdelete = " delete from employee_phone"
                +" where EMPNO="+EmpNo;
        boolean isDel = conn.NotQuery(strdelete);
        if(isDel){
            // Tools.msgBox("phone Is Deleted");
        }
    }

    @Override
    public String AutoNum() {
              Tools.msgBox("getAuto not Worked ");

        return "";
    }

    @Override
    public void getAllRows(JTable table) {
     
String strSelect = "select phone from employee_phone"
              +" where empno= "+EmpNo;
         conn.FillTable(strSelect, table);
        
    }

    @Override
    public void getOneRow(JTable table) {
      Tools.msgBox("OneRow not Worked ");
    }

    @Override
    public void getCustomRows(String statment, JTable table) {
      Tools.msgBox("Custon Row not Worked ");

    }

    @Override
    public String getValueByName(String name) {
      Tools.msgBox("getValueByName not Worked ");

        return "";
    }

    @Override
    public String getNameByvalue(String val) {
      Tools.msgBox("getNameByvalue not Worked ");

    return "";
    }
    public String getNumberOfPhone(String getphone){
        
        String str = "select EMPNO FROM EMPLOYEE_PHONE "
                     +" WHERE PHONE= "+"'"+ getphone+"'";
         String strEmpNo = conn.getTable(str).Items[0][0].toString();
        return strEmpNo;
    }
}
