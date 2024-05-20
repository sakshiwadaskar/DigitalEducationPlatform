/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * WorkAreaJPanel.java
 *
 * Created on May 17, 2020, 8:35:29 AM
 */
package UserInterface.WorkAreas.AdminRole;

import Business.Business;
import Business.Profiles.EmployeeProfile;
import UserInterface.WorkAreas.AdminRole.AdministerUserAccountsWorkResp.ManageUserAccountsJPanel;
import UserInterface.WorkAreas.AdminRole.ManagePersonnelWorkResp.ApproveGradRequestJPanel;

import javax.swing.JPanel;

/**
 *
 * @author kal
 */
public class AdminRoleWorkAreaJPanel extends javax.swing.JPanel {

    javax.swing.JPanel CardSequencePanel;
    Business business;
    EmployeeProfile employeeProfile;
    /**
     * Creates new form UnitRiskWorkArea
     */

    public AdminRoleWorkAreaJPanel(Business b, EmployeeProfile epp, JPanel clp) {
        this.employeeProfile = epp;
        business = b;
        this.CardSequencePanel = clp;
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

        btnManageAcc = new javax.swing.JButton();
        btnApproveGraduation = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(51, 51, 51));

        btnManageAcc.setBackground(new java.awt.Color(0, 153, 255));
        btnManageAcc.setFont(getFont());
        btnManageAcc.setForeground(new java.awt.Color(255, 255, 255));
        btnManageAcc.setText("Administer User Accounts");
        btnManageAcc.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageAcc.setMaximumSize(new java.awt.Dimension(200, 40));
        btnManageAcc.setMinimumSize(new java.awt.Dimension(20, 23));
        btnManageAcc.setPreferredSize(new java.awt.Dimension(240, 30));
        btnManageAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAccIdentifyResourceAssetsActionPerformed(evt);
            }
        });

        btnApproveGraduation.setBackground(new java.awt.Color(0, 153, 255));
        btnApproveGraduation.setFont(getFont());
        btnApproveGraduation.setForeground(new java.awt.Color(255, 255, 255));
        btnApproveGraduation.setText("Approve Graduation Request");
        btnApproveGraduation.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnApproveGraduation.setMaximumSize(new java.awt.Dimension(200, 40));
        btnApproveGraduation.setMinimumSize(new java.awt.Dimension(20, 20));
        btnApproveGraduation.setPreferredSize(new java.awt.Dimension(240, 25));
        btnApproveGraduation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveGraduationActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage System");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(btnManageAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209)
                        .addComponent(btnApproveGraduation, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(518, 518, 518)
                        .addComponent(jLabel1)))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApproveGraduation, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(240, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageAccIdentifyResourceAssetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAccIdentifyResourceAssetsActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.removeAll();
        ManageUserAccountsJPanel aos = new ManageUserAccountsJPanel(business, employeeProfile, CardSequencePanel);
        CardSequencePanel.add("ManageVulns", aos);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_btnManageAccIdentifyResourceAssetsActionPerformed

    private void btnApproveGraduationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveGraduationActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.removeAll();
        ApproveGradRequestJPanel approveGradRequestPanel = new ApproveGradRequestJPanel(business, employeeProfile, CardSequencePanel);
        CardSequencePanel.add("approveGradRequestPanel", approveGradRequestPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
    }//GEN-LAST:event_btnApproveGraduationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApproveGraduation;
    private javax.swing.JButton btnManageAcc;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
