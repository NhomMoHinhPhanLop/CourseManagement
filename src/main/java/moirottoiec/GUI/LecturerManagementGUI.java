/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moirottoiec.GUI;

import static java.lang.Integer.parseInt;
import java.sql.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import moirottoiec.BLL.LecturerBLL;
import moirottoiec.DAL.LecturerDAL;
import moirottoiec.DTO.Lecturer;

/**
 *
 * @author anhph
 */
public class LecturerManagementGUI extends javax.swing.JPanel {
    DefaultTableModel dtm;
    String tuKhoa = "";
    
    /**
     * Creates new form LecturerManagementGUI
     */
    public LecturerManagementGUI() {
        initComponents();
        loadLecturerList();
        refresh();
        refreshAdd();
        //loadFindLecturerList();
    }
    
    public void refresh(){
        dtm.setRowCount(0);
        LecturerBLL lecturerBLL = new LecturerBLL();
        Vector<Lecturer> arr = new Vector<Lecturer>();
        arr = lecturerBLL.findLecturer(tuKhoa);
        System.out.println(arr);
        for(int i = 0; i < arr.size(); i++){
            Lecturer em = arr.get(i);
            int PersonID = em.getPersonID();
            String LastName = em.getLastName();
            String FirstName = em.getFirstName();
            Date HireDate = em.getHireDate();
            Object[] row = {PersonID, LastName, FirstName , HireDate};
            dtm.addRow(row);
        }
    
    }
    
    public int refreshAdd(){
        int numRow = lecturerTable.getRowCount();
        int temp = numRow;
        while(numRow > temp){
            this.loadLecturerList();
        }
        return numRow;
    }
    
    public void loadLecturerList(){
        dtm = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        dtm.addColumn("PersonID");
        dtm.addColumn("Last Name");
        dtm.addColumn("First Name");
        dtm.addColumn("Hire Date");
        lecturerTable.setModel(dtm);
        LecturerBLL lec = new LecturerBLL();
        Vector<Lecturer> arr = new Vector<Lecturer>();
        //arr = lec.getAllLecturer();
        arr = lec.getAllLecturer();
        for(int i = 0; i < arr.size(); i++){
            Lecturer em = arr.get(i);
            int PersonID = em.getPersonID();
            String LastName = em.getLastName();
            String FirstName = em.getFirstName();
            Date HireDate = em.getHireDate();
            Object[] row = {PersonID, LastName, FirstName , HireDate};
            dtm.addRow(row);
        } 
    }
    
//    public void loadFindLecturerList(){
//        LecturerDAL lecDAL = new LecturerDAL();
//        dtm =(DefaultTableModel) lecturerTable.getModel();
//        dtm.setRowCount(0);
//        for(Lecturer lec : lecDAL.findLecturer(tuKhoa)){
//            Object dataRow[] = new Object[4];
//            dataRow[1] = lec.getPersonID();
//            dataRow[2] = lec.getLastName();
//            dataRow[3] = lec.getFirstName();
//            dataRow[4] = lec.getHireDate();
//            dtm.addRow(dataRow);
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        findTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lecturerTable = new javax.swing.JTable();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moirottoiec/GUI/img/teacher.png"))); // NOI18N
        jLabel1.setText("LECTURER MANAGEMENT");

        findTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findTextFieldActionPerformed(evt);
            }
        });
        findTextField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                findTextFieldPropertyChange(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 0, 0));
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moirottoiec/GUI/img/plus.png"))); // NOI18N
        addButton.setText("Add new");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLecActionPerformed(evt);
            }
        });

        lecturerTable.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lecturerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "PersonID", "Last Name", "First Name", "Hire Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        lecturerTable.setRowHeight(18);
        lecturerTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lecturerTable);
        if (lecturerTable.getColumnModel().getColumnCount() > 0) {
            lecturerTable.getColumnModel().getColumn(0).setMaxWidth(80);
            lecturerTable.getColumnModel().getColumn(1).setResizable(false);
            lecturerTable.getColumnModel().getColumn(2).setResizable(false);
            lecturerTable.getColumnModel().getColumn(3).setResizable(false);
        }

        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 0, 0));
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moirottoiec/GUI/img/delete.png"))); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonaddLecActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 0, 0));
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moirottoiec/GUI/img/refresh.png"))); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonaddLecActionPerformed(evt);
            }
        });

        refreshButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        refreshButton.setForeground(new java.awt.Color(255, 0, 0));
        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moirottoiec/GUI/img/refresh.png"))); // NOI18N
        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton)
                        .addGap(88, 88, 88)
                        .addComponent(updateButton)
                        .addGap(86, 86, 86)
                        .addComponent(deleteButton)
                        .addGap(97, 97, 97)
                        .addComponent(refreshButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(findTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1098, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(findTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(updateButton)
                    .addComponent(addButton)
                    .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void findTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_findTextFieldActionPerformed

    private void addLecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLecActionPerformed
        // TODO add your handling code here:
        new addLecturer().setVisible(true);
    }//GEN-LAST:event_addLecActionPerformed

    private void deleteButtonaddLecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonaddLecActionPerformed
        // TODO add your handling code here:
        LecturerBLL lecBLL = new LecturerBLL();
        int row = lecturerTable.getSelectedRow();
        if (row == -1){
            JOptionPane.showMessageDialog(LecturerManagementGUI.this, "Vui long chon giang vien can xoa!", "Loi", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int confirm = JOptionPane.showConfirmDialog(LecturerManagementGUI.this, "Ban chac chan muon xoa chu?");
            if(confirm == JOptionPane.YES_OPTION){
                int personID = (int) lecturerTable.getValueAt(row, 0);
                lecBLL.deleteLecturer(personID);
                this.refresh();
            }
        }
    }//GEN-LAST:event_deleteButtonaddLecActionPerformed

    private void updateButtonaddLecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonaddLecActionPerformed
        // TODO add your handling code here:
        LecturerBLL lecBLL = new LecturerBLL();
        Lecturer lecturer = new Lecturer();
        int row = lecturerTable.getSelectedRow();
        if (row == -1){
            JOptionPane.showMessageDialog(LecturerManagementGUI.this, "Vui long chon giang vien can xoa!", "Loi", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int personID = (int) lecturerTable.getValueAt(row, 0);
            new updateLecturerGUI(personID).setVisible(true);
        }
    }//GEN-LAST:event_updateButtonaddLecActionPerformed

    private void findTextFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_findTextFieldPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_findTextFieldPropertyChange

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        // TODO add your handling code here:
        this.refresh();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        tuKhoa = findTextField.getText();
        loadLecturerList();
        refresh();
    }//GEN-LAST:event_searchButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField findTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable lecturerTable;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
