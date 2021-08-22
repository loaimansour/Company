package structure;

import Company.Tools;
import DataBase.conn;
import javax.swing.JTable;
import structure.Basis;


public class Employee implements Basis {
   
 private int EmpNo;
 private String EmpName;
 private String Address;
 private double Salary;
 private String HDate;
 private String BDate;
 private int DeptNo;
   
    
    public int getEmpNo() {
        return EmpNo;
       
    }

    public void setEmpNo(int EmpNo) {
        this.EmpNo = EmpNo;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public String getHDate() {
        return HDate;
    }

    public void setHDate(String HDate) {
        this.HDate = HDate;
    }

    public String getBDate() {
        return BDate;
    }

    public void setBDate(String BDate) {
        this.BDate = BDate;
    }

    public int getDeptNo() {
        return DeptNo;
    }

    public void setDeptNo(int DeptNo) {
        this.DeptNo = DeptNo;
    }

    @Override
    public void add() {
    String AddEmp="insert into employee values("
                + EmpNo+","
                +"'"+EmpName+"',"
                +"'"+Address+"',"
                + Salary+","
                +"'"+HDate+"',"
                +"'"+BDate+"',"
                +DeptNo+")";
            boolean IsInsert= conn.NotQuery(AddEmp);
            if(IsInsert){
                Tools.msgBox("Employee Is Added");
            }
            
            }
   

    @Override
    public void update() {
       String Update= "update employee set "                
                 +"EMPNAME= "+"'"+EmpName+"',"
                 +"ADDRESS= "+"'"+Address+"',"
                 +"SALARY= " +Salary+","
                 +"HIRINGDATE= "+"'"+HDate+"',"
                 +"BIRTHDATE= " +"'"+BDate+"',"
                 +"DEPTNO= " +DeptNo
                 +" WHERE EMPNO= "+EmpNo;
       boolean IsUpdate = conn.NotQuery(Update);
       if(IsUpdate){
           Tools.msgBox("Employee Is Updated");
       }
    }

    @Override
    public void delete() {
     String Delete = "delete  from employee "
             +  " where EMPNO= "+ EmpNo;
     boolean IsDeleted = conn.NotQuery(Delete);
     if(IsDeleted){
         Tools.msgBox("Employee Is Deleted");
     }
    }

    @Override
    public String AutoNum() {
     return conn.getNum("employee", "EMPNO");
     
     
    }

    @Override
    public void getAllRows(JTable table) {
     
      conn.FillTable("employee_dataa", table);
    }
    @Override
    public void getOneRow(JTable table) {
      String oneR = "select * from employee_dataa "
               + " where EMPNO= "+ EmpNo;
      conn.FillTable(oneR, table);
    }

    @Override
    public void getCustomRows(String statment, JTable table) {
        conn.FillTable(statment, table);
    }

    @Override
    public String getValueByName(String name) {
     String str = "select EMPNO FROM EMPLOYEE"
             + " WHERE EMPNAME='"+name+"'";
         String strval = conn.getTable(str).Items[0][0].toString();
         return strval;
    }

    @Override
    public String getNameByvalue(String val) {
      String str1 = "select EMPNAME FROM EMPLOYEE"
             + " WHERE EMPNO= "+val;
         String strval1 = conn.getTable(str1).Items[0][0].toString();
         return strval1;
    }
 
}

