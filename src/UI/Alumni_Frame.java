/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import TestData.TestData;
import info5100.university.example.Info5001UniversityExample;
import info5100.university.example.Persona.Faculty.Alumni.Alumni;
import info5100.university.example.Persona.Faculty.Alumni.CompanyEmployers.Employers;
import java.util.HashMap;

/**
 *
 * @author Tharoon
 */
public class Alumni_Frame extends javax.swing.JFrame {

    /**
     * Creates new form Alumni_Frame
     */
    String id;
    public Alumni_Frame() {
        initComponents();
        AlumDetail.setVisible(false);
        String id= null;
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AlumLogin = new javax.swing.JPanel();
        Alumniuserlabel = new javax.swing.JLabel();
        AlumniPasslabel = new javax.swing.JLabel();
        Alumniusertext = new javax.swing.JTextField();
        Alumnipasstext = new javax.swing.JTextField();
        Alumniloginlabel = new javax.swing.JLabel();
        Alumniloginbtn = new javax.swing.JButton();
        AlumDetail = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AlumNamelbl = new javax.swing.JLabel();
        AlumIdlbl = new javax.swing.JLabel();
        AlumEmplbl = new javax.swing.JLabel();
        AlumPromlbl = new javax.swing.JLabel();
        AlumSallbl = new javax.swing.JLabel();
        AlumNametxt = new javax.swing.JTextField();
        AlumIdtxt = new javax.swing.JTextField();
        AlumEmptxt = new javax.swing.JTextField();
        Alumpromtxt = new javax.swing.JTextField();
        AlumSalTxt = new javax.swing.JTextField();
        AlumupdBtn = new javax.swing.JButton();
        Alumbackbtn = new javax.swing.JButton();
        AlumgradLbl = new javax.swing.JLabel();
        AlumgradyearTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Alumniuserlabel.setText("User ID:");

        AlumniPasslabel.setText("Password:");

        Alumniusertext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumniusertextActionPerformed(evt);
            }
        });

        Alumniloginlabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Alumniloginlabel.setText("Alumni Login");

        Alumniloginbtn.setText("Login");
        Alumniloginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumniloginbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AlumLoginLayout = new javax.swing.GroupLayout(AlumLogin);
        AlumLogin.setLayout(AlumLoginLayout);
        AlumLoginLayout.setHorizontalGroup(
            AlumLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AlumLoginLayout.createSequentialGroup()
                .addGap(0, 132, Short.MAX_VALUE)
                .addComponent(Alumniloginlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
            .addGroup(AlumLoginLayout.createSequentialGroup()
                .addGroup(AlumLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AlumLoginLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(AlumLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Alumniuserlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AlumniPasslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(AlumLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Alumniusertext)
                            .addComponent(Alumnipasstext, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)))
                    .addGroup(AlumLoginLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(Alumniloginbtn)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        AlumLoginLayout.setVerticalGroup(
            AlumLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlumLoginLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(Alumniloginlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(AlumLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Alumniuserlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AlumLoginLayout.createSequentialGroup()
                        .addComponent(Alumniusertext)
                        .addGap(4, 4, 4)))
                .addGap(38, 38, 38)
                .addGroup(AlumLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AlumniPasslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AlumLoginLayout.createSequentialGroup()
                        .addComponent(Alumnipasstext)
                        .addGap(8, 8, 8)))
                .addGap(23, 23, 23)
                .addComponent(Alumniloginbtn)
                .addGap(43, 43, 43))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Alumni Details");

        AlumNamelbl.setText("Student Name:");

        AlumIdlbl.setText("Student ID:");

        AlumEmplbl.setText("Employer:");

        AlumPromlbl.setText("Promotions:");

        AlumSallbl.setText("Salary:");

        AlumIdtxt.setEditable(false);
        AlumIdtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumIdtxtActionPerformed(evt);
            }
        });

        AlumEmptxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumEmptxtActionPerformed(evt);
            }
        });

        AlumupdBtn.setText("Update");
        AlumupdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumupdBtnActionPerformed(evt);
            }
        });

        Alumbackbtn.setText("Back");
        Alumbackbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumbackbtnActionPerformed(evt);
            }
        });

        AlumgradLbl.setText("Graduation Year:");

        javax.swing.GroupLayout AlumDetailLayout = new javax.swing.GroupLayout(AlumDetail);
        AlumDetail.setLayout(AlumDetailLayout);
        AlumDetailLayout.setHorizontalGroup(
            AlumDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AlumDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AlumDetailLayout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(AlumupdBtn)
                    .addGap(91, 91, 91)
                    .addComponent(Alumbackbtn)
                    .addContainerGap(130, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AlumDetailLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(AlumDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(AlumEmplbl)
                        .addComponent(AlumPromlbl)
                        .addComponent(AlumSallbl))
                    .addGap(121, 121, 121)
                    .addGroup(AlumDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(AlumSalTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                        .addGroup(AlumDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Alumpromtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(AlumEmptxt)
                            .addComponent(AlumIdtxt)
                            .addComponent(AlumNametxt)
                            .addComponent(AlumgradyearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 75, Short.MAX_VALUE)))
            .addGroup(AlumDetailLayout.createSequentialGroup()
                .addGroup(AlumDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AlumDetailLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel1))
                    .addGroup(AlumDetailLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AlumNamelbl))
                    .addGroup(AlumDetailLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AlumIdlbl))
                    .addGroup(AlumDetailLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AlumgradLbl)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AlumDetailLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AlumEmptxt, AlumIdtxt, AlumNametxt, AlumSalTxt, AlumgradyearTxt, Alumpromtxt});

        AlumDetailLayout.setVerticalGroup(
            AlumDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AlumDetailLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(AlumDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlumNamelbl)
                    .addComponent(AlumNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AlumDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlumIdlbl)
                    .addComponent(AlumIdtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(AlumDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlumgradLbl)
                    .addComponent(AlumgradyearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AlumDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AlumEmplbl)
                    .addComponent(AlumEmptxt, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AlumDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlumPromlbl)
                    .addComponent(Alumpromtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AlumDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlumSallbl)
                    .addComponent(AlumSalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AlumDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlumupdBtn)
                    .addComponent(Alumbackbtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AlumLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(AlumDetail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(AlumLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(AlumDetail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AlumniusertextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumniusertextActionPerformed
        
        // TODO add your handling code here:


    }//GEN-LAST:event_AlumniusertextActionPerformed

    private void AlumniloginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumniloginbtnActionPerformed
        // TODO add your handling code here:
        AlumLogin.setVisible(false);
        AlumDetail.setVisible(true);
              //  new Info5001UniversityExample().test1();
        
        //System.out.println("Map "+ m.size());
//        Alumni al1 = m.get("0112303");
        //al = m.get("0112303");
        
        //System.out.println(al.getGradutationYear());
        id = Alumniusertext.getText();
        Alumni al = new Alumni();
        HashMap<String, Alumni> m = new TestData().getInstance().getMap();
        System.out.println("Map "+ m.size());
        Alumni al1 = m.get(id);
        al1.calculateAMG();
        al1.careerSuccessMetric();
        AlumIdtxt.setText(al1.getStudentProfile().getPerson().getPersonId());
        AlumgradyearTxt.setText(String.valueOf(al1.getGradutationYear()));
        AlumSalTxt.setText(String.valueOf(al1.getSalaryRange()));
        AlumEmptxt.setText(al1.getEmp().getEmployerName());
        Alumpromtxt.setText(String.valueOf(al1.getPromotions()));
//        al.setId(Alumniusertext.getText());
//        Alumni_Details Alumdet = new Alumni_Details();
 //       Alumdet.setVisible(true);
        System.out.println("CSM "+ al1.getCareerSuccess());
        
        
    }//GEN-LAST:event_AlumniloginbtnActionPerformed

    private void AlumIdtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumIdtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlumIdtxtActionPerformed

    private void AlumEmptxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumEmptxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlumEmptxtActionPerformed

    private void AlumbackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumbackbtnActionPerformed
        // TODO add your handling code here:
        AlumDetail.setVisible(false);
        AlumLogin.setVisible(true);
         
        
        
    }//GEN-LAST:event_AlumbackbtnActionPerformed

    private void AlumupdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumupdBtnActionPerformed
        // TODO add your handling code here:
        Alumni al = new Alumni();
        HashMap<String, Alumni> m = al.getAlumniDir();
        System.out.println("Map "+ m.size());
        Alumni al1 = m.get(id);
        al1.setGradutationYear(Integer.parseInt(AlumgradyearTxt.getText()));
        al1.setSalaryRange(Integer.parseInt(AlumSalTxt.getText()));
        Employers emp = al1.getEmp();
        emp.setEmployerName(AlumEmptxt.getText());
        al1.setPromotions(Integer.parseInt(Alumpromtxt.getText()));
     
        
        
    }//GEN-LAST:event_AlumupdBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Alumni_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alumni_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alumni_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alumni_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alumni_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AlumDetail;
    private javax.swing.JLabel AlumEmplbl;
    private javax.swing.JTextField AlumEmptxt;
    private javax.swing.JLabel AlumIdlbl;
    private javax.swing.JTextField AlumIdtxt;
    private javax.swing.JPanel AlumLogin;
    private javax.swing.JLabel AlumNamelbl;
    private javax.swing.JTextField AlumNametxt;
    private javax.swing.JLabel AlumPromlbl;
    private javax.swing.JTextField AlumSalTxt;
    private javax.swing.JLabel AlumSallbl;
    private javax.swing.JButton Alumbackbtn;
    private javax.swing.JLabel AlumgradLbl;
    private javax.swing.JTextField AlumgradyearTxt;
    private javax.swing.JLabel AlumniPasslabel;
    private javax.swing.JButton Alumniloginbtn;
    private javax.swing.JLabel Alumniloginlabel;
    private javax.swing.JTextField Alumnipasstext;
    private javax.swing.JLabel Alumniuserlabel;
    private javax.swing.JTextField Alumniusertext;
    private javax.swing.JTextField Alumpromtxt;
    private javax.swing.JButton AlumupdBtn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
