
package structure;

import Company.Tools;
import javax.swing.JTable;


public class Department implements Basis{
    private int DeptNo;
    private String DeptName;
    private String Location;

    public int getDeptNo() {
        return DeptNo;
    }

    public void setDeptNo(int DeptNo) {
        this.DeptNo = DeptNo;
    }

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String DeptName) {
        this.DeptName = DeptName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    @Override
    public void add() {
      String insert = "insert into department values("
              + DeptNo + ","
              +"'"+DeptName + "' ,"
              +"'"+Location +"')";
      boolean isAdd = DataBase.conn.NotQuery(insert);
              if(isAdd){
              Tools.msgBox("Department Is Added");
              }

    }

   

    @Override
    public void update() {
        String Update = "update department set "
               +"DeptName ='" +DeptName +"',"
                +"LOCATION = '"+Location+"' "
               + " WHERE DEPTNO="+DeptNo;
        boolean isUpdate = DataBase.conn.NotQuery(Update);
         if(isUpdate){
              Tools.msgBox("Department Is Updated");
              }
    }

    @Override
    public void delete() {
     String Delete = "delete from department"
             + " where DEPTNO= "+DeptNo;
               
               boolean delete =  DataBase.conn.NotQuery(Delete);
               if(delete){
                   Tools.msgBox("Department Is Deleted");
               }
           
    }

    @Override
    public  String AutoNum() {
     String strAuto = DataBase.conn.getNum("department", "DEPTNO");
     return strAuto;
    }

    @Override
    public void getAllRows(JTable table) {
      DataBase.conn.FillTable("department", table);
    }

    @Override
    public void getOneRow(JTable table) {
      String strSelect = "select * from department "
              + " where DeptNo =" + DeptNo;
      DataBase.conn.FillTable(strSelect, table);
    }

    @Override
    public void getCustomRows(String s, JTable table) {
       
       
        DataBase.conn.FillTable(s, table);
    }

    @Override
    public String getValueByName(String name) {
          String str = "SELECT DEPTNO FROM DEPARTMENT"
               +" where DEPTNAME='"+name+"'";
          String strVal = (String)DataBase.conn.getTable(str).Items[0][0];
          return strVal;
    }

    @Override
    public String getNameByvalue(String val) {
        String str = "select deptname from department"
               +" where deptno="+val;
          String strName = (String)DataBase.conn.getTable(str).Items[0][0];
          return strName;
       
    }
    
}
