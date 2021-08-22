
package structure;

import Company.Tools;
import DataBase.conn;
import javax.swing.JTable;


public class Project implements Basis {
   private int ProjectNo;
   private String ProjectName;
   private String Location;
   private int DeptNo;

    public int getProjectNo() {
        return ProjectNo;
    }

    public void setProjectNo(int ProjectNo) {
        this.ProjectNo = ProjectNo;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public int getDeptNo() {
        return DeptNo;
    }

    public void setDeptNo(int DeptNo) {
        this.DeptNo = DeptNo;
    }

    @Override
    public void add() {
     String Add = "insert into project values("
                 +ProjectNo+","
                 +"'"+ProjectName+"',"
                 +"'"+Location+"',"
                 + DeptNo+")";  
       boolean IsAdd = conn.NotQuery(Add);
        if(IsAdd){
            Tools.msgBox("Project Is Added");
        }
             
    }

    @Override
    public void update() {
      String Up = "update project set "
                
                  +"PROJECTNAME= "+"'"+ProjectName+"',"
                  +"LOCATION= "+"'"+Location+"',"
                  +"DEPTNO= "+DeptNo
                  +" WHERE PROJECTNO= "+ProjectNo;
      boolean IsUP = conn.NotQuery(Up);
        if(IsUP){
            Tools.msgBox("Project Is UPDATED");
        }
    }

    @Override
    public void delete() {
    String Deleted = "delete from PROJECT "
                     +" WHERE PROJECTNO= "+ProjectNo;
    boolean IsDELTED = conn.NotQuery(Deleted);
        if(IsDELTED){
            Tools.msgBox("Project Is Deleted");
        }
    }

    @Override
    public String AutoNum() {
            String out = conn.getNum("PROJECT", "PROJECTNO");
             return out;
    }

    @Override
    public void getAllRows(JTable table) {
     conn.FillTable("PROJECT_data", table);
    }

    @Override
    public void getOneRow(JTable table) {
        String strOne = "select * from PROJECT_DATA "
                      +" WHERE PROJECT_NO= "+  ProjectNo;
        conn.FillTable(strOne, table);
    }

    @Override
    public void getCustomRows(String statment, JTable table) {
        conn.FillTable(statment, table);
    }

    @Override
    public String getValueByName(String name) {
       String strval = "select PROJECTNO FROM PROJECT "
                    +" WHERE PROJECTNAME= "+"'"+name+"'";
       String val = conn.getTable(strval).Items[0][0].toString();
       return val;
    }

    @Override
    public String getNameByvalue(String val) {
      String strname = "select PROJECTNAME FROM PROJECT "
                    +" WHERE PROJECTNO= "+val;
       String Name = conn.getTable(strname).Items[0][0].toString();
       return Name;
    }
}
