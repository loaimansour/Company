
package structure;

import Company.Tools;
import DataBase.conn;
import javax.swing.JTable;


public class WorkOn implements Basis  {
   private int EMPNO ;
   private int PROJECTNO;

    public int getEMPNO() {
        return EMPNO;
    }

    public void setEMPNO(int EMPNO) {
        this.EMPNO = EMPNO;
    }

    public int getPROJECTNO() {
        return PROJECTNO;
    }

    public void setPROJECTNO(int PROJECTNO) {
        this.PROJECTNO = PROJECTNO;
    }

    @Override
    public void add() {
     String stm = "insert into WORKON values ("
              +EMPNO+","
              +PROJECTNO+")";
     boolean isadd = conn.NotQuery(stm);
     if(isadd){
         Tools.msgBox("Work On Is Added");
     }
    }

    @Override
    public void update() {
       Tools.msgBox("Update Method Not Working");
    }

    @Override
    public void delete() {
    String Delete  ="delete from WORKON "
                   +" WHERE EMPNO="+EMPNO
                   +" AND "+"PROJECTNO="+PROJECTNO;
    boolean isDEL = conn.NotQuery(Delete);
     if(isDEL){
         Tools.msgBox("Work On Is DELETED");
     }
    }

    @Override
    public String AutoNum() {
       Tools.msgBox("AUTO Method Not Working");
      return "";
    }

    @Override
    public void getAllRows(JTable table) {
             conn.FillTable("WORKON_DATA", table);
    }

    @Override
    public void getOneRow(JTable table) {
        String oneRow = "select * from WORKON_DATA"
                  +" WHERE "+"EMPLOYEE_NO="+EMPNO+" AND "+"PROJECT_NO="+PROJECTNO;
        conn.FillTable(oneRow, table);
    }

    @Override
    public void getCustomRows(String statment, JTable table) {
     conn.FillTable(statment, table);
    }

    @Override
    public String getValueByName(String name) {
       Tools.msgBox("getValueByName Method Not Working");
       return "";

    }

    @Override
    public String getNameByvalue(String val) {
              Tools.msgBox("getNameByvalue Method Not Working");
    return "";
    }
}