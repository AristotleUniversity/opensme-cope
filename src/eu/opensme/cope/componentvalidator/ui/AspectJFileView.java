/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AspectJFileView.java
 *
 * Created on Oct 19, 2011, 3:24:54 PM
 */
package eu.opensme.cope.componentvalidator.ui;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author thanasis
 */
public class AspectJFileView extends javax.swing.JPanel {
    private String saveLocation;
    private ComponentValidatorView parent;
    
    /** Creates new form AspectJFileView */
    public AspectJFileView(ComponentValidatorView parent, String aspectJFile, String saveLocation) {
        initComponents();
        this.saveLocation = saveLocation;
        this.parent = parent;
        aspectJFileTextArea.setText(aspectJFile);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        aspectJFileSaveChanges = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        aspectJFileTextArea = new javax.swing.JTextArea();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "AspectJ File", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        aspectJFileSaveChanges.setText("Save Changes");
        aspectJFileSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aspectJFileSaveChangesActionPerformed(evt);
            }
        });

        aspectJFileTextArea.setColumns(20);
        aspectJFileTextArea.setRows(5);
        jScrollPane1.setViewportView(aspectJFileTextArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                    .addComponent(aspectJFileSaveChanges))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(aspectJFileSaveChanges)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

private void aspectJFileSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aspectJFileSaveChangesActionPerformed
    try {
        FileWriter outFile = new FileWriter(saveLocation);
        parent.setAspectJFile(aspectJFileTextArea.getText());
        outFile.write(aspectJFileTextArea.getText());
        outFile.flush();
        outFile.close();
        JOptionPane.showMessageDialog(null, "Changes Successfully Saved","Successfully Saved",JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException ex) {
        Logger.getLogger(ComponentValidatorView.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_aspectJFileSaveChangesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aspectJFileSaveChanges;
    private javax.swing.JTextArea aspectJFileTextArea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
