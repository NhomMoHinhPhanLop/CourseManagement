/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package moirottoiec.GUI;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.Timer;
import moirottoiec.DTO.User;

/**
 *
 * @author Admin
 */
public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainGUI
     */
    ArrayList<String> ListTab = new ArrayList<String>();
    public MainGUI() {

        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setTitle("Course Management");
        showtime();
        //tab.add( your panel )
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
        void showtime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                java.util.Date d = new java.util.Date();
                SimpleDateFormat s = new SimpleDateFormat("HH:mm:ss");
//                SimpleDateFormat D = new SimpleDateFormat("dd/MM/yyyy");
                lbTime.setText(s.format(d) 
                /*+ "-" + D.format(d)*/
                );
            }
        }).start();
    }
         private JPanel getTitlePanel(final JTabbedPane tabbedPane, final JPanel panel, String title)
        {
         JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
         titlePanel.setOpaque(false);
         JLabel titleLbl = new JLabel(title);
         titleLbl.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
         titlePanel.add(titleLbl);
         JButton closeButton = new JButton("x");

         closeButton.addMouseListener(new MouseAdapter()
         {
          @Override
          public void mouseClicked(MouseEvent e)
          {
           tabbedPane.remove(panel);
           ListTab.remove(title);
          }
         });
         titlePanel.add(closeButton);

         return titlePanel;
        }
        void AddTab(String title,JPanel panel){
            if(!ListTab.contains(title)){
            tab.add(title,panel);
            tab.setTabComponentAt(tab.indexOfComponent(panel),getTitlePanel(tab, panel, title));
            ListTab.add(title);
            }
            int index=tab.indexOfTab(title);
            tab.setSelectedIndex(index);
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn_student = new javax.swing.JButton();
        btn_teacher = new javax.swing.JButton();
        btn_Intructor = new javax.swing.JButton();
        btn_course_onl = new javax.swing.JButton();
        btn_StudentGrade = new javax.swing.JButton();
        btn_course_off = new javax.swing.JButton();
        tab = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moirottoiec/GUI/img/user.png"))); // NOI18N

        jLabel3.setText("Xin chào bạn !");

        lbTime.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbTime.setForeground(new java.awt.Color(153, 51, 0));
        lbTime.setText("Time");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lbTime)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lbTime)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("COURSE MANAGEMENT");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moirottoiec/GUI/img/stack-of-books.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 27, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 204, 255));

        btn_student.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_student.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moirottoiec/GUI/img/group.png"))); // NOI18N
        btn_student.setText("Student Management");
        btn_student.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_student.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_student.setFocusable(false);
        btn_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_studentActionPerformed(evt);
            }
        });

        btn_teacher.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_teacher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moirottoiec/GUI/img/teacher.png"))); // NOI18N
        btn_teacher.setText("Teacher Management");
        btn_teacher.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_teacher.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_teacher.setFocusable(false);
        btn_teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_teacherActionPerformed(evt);
            }
        });

        btn_Intructor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Intructor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moirottoiec/GUI/img/education (1).png"))); // NOI18N
        btn_Intructor.setText("Course Intructor");
        btn_Intructor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_Intructor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Intructor.setFocusable(false);
        btn_Intructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IntructorActionPerformed(evt);
            }
        });

        btn_course_onl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_course_onl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moirottoiec/GUI/img/online-learning.png"))); // NOI18N
        btn_course_onl.setText("Course Online");
        btn_course_onl.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_course_onl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_course_onl.setFocusable(false);
        btn_course_onl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_course_onlActionPerformed(evt);
            }
        });

        btn_StudentGrade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_StudentGrade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moirottoiec/GUI/img/score.png"))); // NOI18N
        btn_StudentGrade.setText("Student Grade");
        btn_StudentGrade.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_StudentGrade.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_StudentGrade.setFocusable(false);
        btn_StudentGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_StudentGradeActionPerformed(evt);
            }
        });

        btn_course_off.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_course_off.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moirottoiec/GUI/img/education.png"))); // NOI18N
        btn_course_off.setText("Course Offline");
        btn_course_off.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_course_off.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_course_off.setFocusable(false);
        btn_course_off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_course_offActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Intructor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_course_onl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_StudentGrade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_course_off, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_student, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_teacher, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btn_student, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_teacher, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btn_course_onl, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_course_off, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btn_Intructor, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btn_StudentGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(87, 87, 87))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(tab)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tab))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_studentActionPerformed
        // TODO add your handling code here:
        AddTab("Student ManagementGUI", new StudentManagementGUI());
    }//GEN-LAST:event_btn_studentActionPerformed

    private void btn_teacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_teacherActionPerformed
        // TODO add your handling code here:
        AddTab("Lecturer Management", new LecturerManagementGUI());
    }//GEN-LAST:event_btn_teacherActionPerformed

    private void btn_IntructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IntructorActionPerformed
               AddTab("OfficeAssignment", new OfficeLecturerGUI());

//        AddTab("Lecturer Management", new LecturerManagementGUI());
        
    }//GEN-LAST:event_btn_IntructorActionPerformed

    private void btn_course_onlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_course_onlActionPerformed
        // TODO add your handling code here:
//        AddTab("Lecturer Management", new LecturerManagementGUI());

    }//GEN-LAST:event_btn_course_onlActionPerformed

    private void btn_StudentGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_StudentGradeActionPerformed
        // TODO add your handling code here:
        AddTab("Student Grade", new StudentGradeGUI());
    }//GEN-LAST:event_btn_StudentGradeActionPerformed

    private void btn_course_offActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_course_offActionPerformed
        // TODO add your handling code here:
//        AddTab("Lecturer Management", new LecturerManagementGUI());

    }//GEN-LAST:event_btn_course_offActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Intructor;
    private javax.swing.JButton btn_StudentGrade;
    private javax.swing.JButton btn_course_off;
    private javax.swing.JButton btn_course_onl;
    private javax.swing.JButton btn_student;
    private javax.swing.JButton btn_teacher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbTime;
    private javax.swing.JTabbedPane tab;
    // End of variables declaration//GEN-END:variables

    private JLabel Date() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}