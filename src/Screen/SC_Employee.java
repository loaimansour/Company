/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Screen;

import Company.Tools;
import DataBase.conn;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import structure.Department;
import structure.Employee;
import structure.Employee_phones;

/**
 *
 * @author loai
 */
public class SC_Employee extends javax.swing.JFrame {

    /**
     * Creates new form CS_Employee
     */
    public SC_Employee() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroub = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNumber = new Rule.JTextBox();
        txtName = new Rule.JTextBox();
        txtAddress = new Rule.JTextBox();
        txtHiring = new com.toedter.calendar.JDateChooser();
        txtBirth = new com.toedter.calendar.JDateChooser();
        compDept = new Rule.JMyCompo();
        btnUpdate = new Rule.JButtonBox();
        btnAdd = new Rule.JButtonBox();
        btnAll = new Rule.JButtonBox();
        btnClear = new Rule.JButtonBox();
        btnDelete = new Rule.JButtonBox();
        btnFind = new Rule.JButtonBox();
        btnBack = new Rule.JButtonBox();
        jLabel9 = new javax.swing.JLabel();
        rdoNumber = new javax.swing.JRadioButton();
        rdoName = new javax.swing.JRadioButton();
        rdoAddress = new javax.swing.JRadioButton();
        rdoSalary = new javax.swing.JRadioButton();
        rdoHiring = new javax.swing.JRadioButton();
        rdoBirth = new javax.swing.JRadioButton();
        rdoDept = new javax.swing.JRadioButton();
        txtSearch = new Rule.JTextBox();
        btnSearch = new Rule.JButtonBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl3 = new javax.swing.JTable();
        btnAddDept = new Rule.JButtonBox();
        btnRemove = new Rule.JButtonBox();
        txtSalary = new Rule.JTextBox();
        btnAddPhone = new Rule.JButtonBox();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPhones = new javax.swing.JTable();
        txtPhones = new Rule.JTextBox();
        rdoPhone = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Employee");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 25, -1, 49));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Number:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 76, 24));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Address:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 76, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Name:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 40, 24));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Hiring Date:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 76, 24));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Salary:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 50, 24));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Birth Date:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 76, 24));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Phone:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 50, 40));

        txtNumber.setEditable(false);
        getContentPane().add(txtNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 140, -1));
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 140, -1));
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 140, -1));
        getContentPane().add(txtHiring, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 150, -1));
        getContentPane().add(txtBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 150, -1));

        compDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compDeptActionPerformed(evt);
            }
        });
        getContentPane().add(compDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 150, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 590, 70, -1));

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 60, -1));

        btnAll.setText("All");
        btnAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllActionPerformed(evt);
            }
        });
        getContentPane().add(btnAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 590, 60, -1));

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 590, 66, -1));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 590, -1, -1));

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        getContentPane().add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 590, -1, -1));

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 670, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("SearchBy:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 64, 22));

        rdoNumber.setBackground(new java.awt.Color(255, 255, 255));
        rdoNumber.setSelected(true);
        rdoNumber.setText("Number");
        getContentPane().add(rdoNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, -1, -1));

        rdoName.setBackground(new java.awt.Color(255, 255, 255));
        rdoName.setText("Name");
        getContentPane().add(rdoName, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, -1, -1));

        rdoAddress.setBackground(new java.awt.Color(255, 255, 255));
        rdoAddress.setText("Address");
        getContentPane().add(rdoAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, -1, -1));

        rdoSalary.setBackground(new java.awt.Color(255, 255, 255));
        rdoSalary.setText("Salary");
        getContentPane().add(rdoSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 100, -1, -1));

        rdoHiring.setBackground(new java.awt.Color(255, 255, 255));
        rdoHiring.setText("Hiring Date");
        getContentPane().add(rdoHiring, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, -1, -1));

        rdoBirth.setBackground(new java.awt.Color(255, 255, 255));
        rdoBirth.setText("BirthDate");
        getContentPane().add(rdoBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 100, -1, -1));

        rdoDept.setBackground(new java.awt.Color(255, 255, 255));
        rdoDept.setText("Department");
        getContentPane().add(rdoDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 100, -1, -1));
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 150, 249, -1));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 150, -1, -1));

        tbl3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Number", "Name", "Address", "Salary", "Hiring", "Birth", "NO", "Department"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl3MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl3);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 650, 337));

        btnAddDept.setText("+");
        btnAddDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDeptActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 50, -1));

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 80, -1));
        getContentPane().add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 140, -1));

        btnAddPhone.setText("Add");
        btnAddPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPhoneActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 70, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Department:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 24));

        tblPhones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Phone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblPhones);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 340, 120));

        txtPhones.setText("jTextBox1");
        getContentPane().add(txtPhones, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 150, -1));

        rdoPhone.setBackground(new java.awt.Color(255, 255, 255));
        rdoPhone.setText("Phone");
        getContentPane().add(rdoPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
  Employee emp = new Employee();
    private void btnAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllActionPerformed
        emp.getAllRows(tbl3);
        
    }//GEN-LAST:event_btnAllActionPerformed

    private void setValue(){
        /*
        emp.setEmpNo(Integer.parseInt(emp.AutoNum()));
        emp.setEmpName(txtNa.getText());
        emp.setAddress(txtAd.getText());
        emp.setHDate(txtHi.gett);
    */
    }
    private void set(){
       emp.setEmpNo(Integer.parseInt(emp.AutoNum()));
       emp.setEmpName(txtName.getText());
       emp.setAddress(txtAddress.getText());
       emp.setSalary(Double.parseDouble(txtSalary.getText()));
       
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        String HDate = String.valueOf(f.format(txtHiring.getDate())  );  
        String BDate = String.valueOf(f.format(txtBirth.getDate()));
        
         emp.setHDate(HDate);
         emp.setBDate(BDate);
         
         String dName = compDept.getSelectedItem().toString();
         String dNO = dept.getValueByName(dName);
         
         emp.setDeptNo(Integer.parseInt(dNO));
         
       
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
         set();
         emp.add();
         //Add Phone
         ph.setEmpNo(Integer.parseInt(txtNumber.getText()));
         for(int x = 0 ;x<tblPhones.getRowCount() ; x++){
             ph.setPhone(tblPhones.getValueAt(x, 0).toString());
             ph.add();
         }
         
         //ph.getAllRows(tblPhones);
         clearDara();
         emp.getAllRows(tbl3);
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        String EmpNo = (String)Tools.InputBox("Input Number of Row");
        String s = "select * from employee_dataa "
                + " where NUMBER= "+EmpNo;
        emp.getCustomRows(s, tbl3);
    }//GEN-LAST:event_btnFindActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       btnGroub.add(rdoNumber);
       btnGroub.add(rdoName);
       btnGroub.add(rdoAddress);
        btnGroub.add(rdoSalary);
       btnGroub.add(rdoHiring);
       btnGroub.add(rdoBirth);
       btnGroub.add(rdoDept);
       btnGroub.add(rdoPhone);
       
       emp.getAllRows(tbl3);
       conn.fillCom("DEPARTMENT","DEPTNAME" , compDept);
       clearDara();
       tbl3.getTableHeader().setReorderingAllowed(false);
       tblPhones.getTableHeader().setReorderingAllowed(false);
       
    }//GEN-LAST:event_formWindowOpened

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       this.dispose();
        Tools.openForm(new MainScreen());
    }//GEN-LAST:event_btnBackActionPerformed

    private void compDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compDeptActionPerformed
        
        
    }//GEN-LAST:event_compDeptActionPerformed
  Department dept = new Department();
    private void btnAddDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDeptActionPerformed
     int auto  = Integer.parseInt(dept.AutoNum());
        String strName = (String)Tools.InputBox("Enter Department Name");
     String strLocation = (String)Tools.InputBox("Enter Loacation");
     dept.setDeptNo(auto);
     dept.setDeptName(strName);
     dept.setLocation(strLocation);
     dept.add();
     conn.fillCom("DEPARTMENT", "DEPTNAME", compDept);
     
     
    }//GEN-LAST:event_btnAddDeptActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       String s= "select * from employee_dataa where ";
       
          if(rdoNumber.isSelected()){
              s+="NUMBER ";
             s+=" like'%"+ txtSearch.getText()  +"%'";
              dept.getCustomRows(s, tbl3);
          }
          else if(rdoName.isSelected()){
              s+="NAME ";
               s+=" like'%"+ txtSearch.getText()  +"%'";
              dept.getCustomRows(s, tbl3);
          }
          else if(rdoAddress.isSelected()){
              s+="ADDRESS ";
               s+=" like'%"+ txtSearch.getText()  +"%'";
              dept.getCustomRows(s, tbl3);
          }
          else if(rdoSalary.isSelected()){
              s+="SALARY ";
               s+=" like'%"+ txtSearch.getText()  +"%'";
              dept.getCustomRows(s, tbl3);
          }
          else if (rdoHiring.isSelected()){
          s+="HIRING_DATE ";
           s+=" like'%"+ txtSearch.getText()  +"%'";
              dept.getCustomRows(s, tbl3);
    }
         else if (rdoBirth.isSelected()){
              s+="DATE_OF_BIRTH ";
               s+=" like'%"+ txtSearch.getText()  +"%'";
              dept.getCustomRows(s, tbl3);
          }
         else if(rdoDept.isSelected()){
             s+="DEPARTMENT ";
              s+=" like'%"+ txtSearch.getText()  +"%'";
              dept.getCustomRows(s, tbl3);
         }
         else {
             
             s+="NUMBER= "+ ph.getNumberOfPhone(txtSearch.getText());
                           dept.getCustomRows(s, tbl3);

         }
     
    }//GEN-LAST:event_btnSearchActionPerformed
 private void clearDara(){
      Tools.clearText(this);
      txtNumber.setText(emp.AutoNum());
      btnAdd.setEnabled(true);
      btnDelete.setEnabled(false);
      btnUpdate.setEnabled(false);
      btnRemoveActionPerformed(null);
      txtName.requestFocus();
 }
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
      clearDara();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        set();
        emp.update();
        
        ph.setEmpNo(Integer.parseInt(txtNumber.getText()));
        
        ph.deleteByEmp();
        
         for(int x = 0 ;x<tblPhones.getRowCount() ; x++){
             ph.setPhone(tblPhones.getValueAt(x, 0).toString());
             ph.add();
         }
        clearDara();
        emp.getAllRows(tbl3);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       
       ph.setEmpNo(Integer.parseInt(txtNumber.getText()));
       ph.deleteByEmp();
        
        set();
        emp.delete();
        clearDara();
        emp.getAllRows(tbl3);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tbl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl3MouseClicked
        try{
          int row =  tbl3.getSelectedRow();
          
        String Num = tbl3.getValueAt(row, 0).toString();
        String name = tbl3.getValueAt(row, 1).toString();
        String Address = tbl3.getValueAt(row, 2).toString();
        String Salary = tbl3.getValueAt(row, 3).toString();
        String HDate = tbl3.getValueAt(row,4).toString();
        String BDate = tbl3.getValueAt(row, 5).toString();
        String Compo = tbl3.getValueAt(row, 7).toString();
        
        
        ph.setEmpNo(Integer.parseInt(txtNumber.getText()));
        ph.getAllRows(tblPhones);
        
       txtNumber.setText(Num);
       txtName.setText(name);       
       txtAddress.setText(Address);
       txtSalary.setText(Salary);
      
       SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Date date = f.parse(HDate);
       txtHiring.setDate(date);
        Date Birth = f.parse(BDate);
        txtBirth.setDate(Birth);
        
        compDept.setSelectedItem(Compo);
        
        btnAdd.setEnabled(false);
        btnDelete.setEnabled(true);
        btnUpdate.setEnabled(true);
       
        
       
        }
        catch(Exception ex){
            Tools.msgBox(ex.getMessage());
        }
        
     
       
       
       
    }//GEN-LAST:event_tbl3MouseClicked
     Employee_phones ph = new Employee_phones();
    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
              DefaultTableModel model = (DefaultTableModel)tblPhones.getModel();
              model.setNumRows(0);
             
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnAddPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPhoneActionPerformed
       DefaultTableModel model = (DefaultTableModel)tblPhones.getModel();
       model.addRow(new Object[] {txtPhones.getText()}  );
       txtPhones.setText("");
       txtPhones.requestFocus();
    }//GEN-LAST:event_btnAddPhoneActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SC_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SC_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SC_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SC_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SC_Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Rule.JButtonBox btnAdd;
    private Rule.JButtonBox btnAddDept;
    private Rule.JButtonBox btnAddPhone;
    private Rule.JButtonBox btnAll;
    private Rule.JButtonBox btnBack;
    private Rule.JButtonBox btnClear;
    private Rule.JButtonBox btnDelete;
    private Rule.JButtonBox btnFind;
    private javax.swing.ButtonGroup btnGroub;
    private Rule.JButtonBox btnRemove;
    private Rule.JButtonBox btnSearch;
    private Rule.JButtonBox btnUpdate;
    private Rule.JMyCompo compDept;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rdoAddress;
    private javax.swing.JRadioButton rdoBirth;
    private javax.swing.JRadioButton rdoDept;
    private javax.swing.JRadioButton rdoHiring;
    private javax.swing.JRadioButton rdoName;
    private javax.swing.JRadioButton rdoNumber;
    private javax.swing.JRadioButton rdoPhone;
    private javax.swing.JRadioButton rdoSalary;
    private javax.swing.JTable tbl3;
    private javax.swing.JTable tblPhones;
    private javax.swing.JTextField txtAddress;
    private com.toedter.calendar.JDateChooser txtBirth;
    private com.toedter.calendar.JDateChooser txtHiring;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    private Rule.JTextBox txtPhones;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}