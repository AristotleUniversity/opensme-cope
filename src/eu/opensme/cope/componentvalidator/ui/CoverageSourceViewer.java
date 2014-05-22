/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CoverageSourceViewer.java
 *
 * Created on Oct 27, 2011, 3:18:52 PM
 */
package eu.opensme.cope.componentvalidator.ui;

import eu.opensme.cope.componentvalidator.coverage.cfg.CfgMethod;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.text.Document;

/**
 *
 * @author thanasis
 */
public class CoverageSourceViewer extends javax.swing.JPanel {

    private CfgMethod method;
    
    /** Creates new form CoverageSourceViewer */
    public CoverageSourceViewer(CfgMethod method) {
        initComponents();
        this.method = method;
        coverageSourceCode.setEditable(false);
        setJEditorPaneContent(method.createExecutionScenarioHTML());
        initUncoveredCoveredLists();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        coveredPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        coveredPathsList = new javax.swing.JList();
        coveredLabel = new javax.swing.JLabel();
        unCoveredPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        uncoveredPathsList = new javax.swing.JList();
        unCoveredLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        coverageSourceCode = new javax.swing.JEditorPane();
        methodSignature = new javax.swing.JLabel();
        exScenarioCoveredPath = new javax.swing.JCheckBox();
        lcsajCoveragePanel = new javax.swing.JPanel();
        lcsajCoverageLabel = new javax.swing.JLabel();
        lcsajLabel = new javax.swing.JLabel();
        statementLabel = new javax.swing.JLabel();
        stmtCoverageLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(591, 547));

        coveredPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Covered Paths", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        coveredPathsList.setModel(new DefaultListModel());
        coveredPathsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        coveredPathsList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                coveredPathsListValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(coveredPathsList);

        coveredLabel.setFont(new java.awt.Font("Ubuntu", 1, 12));
        coveredLabel.setForeground(new java.awt.Color(0, 255, 12));
        coveredLabel.setText("Covered: ");

        javax.swing.GroupLayout coveredPanelLayout = new javax.swing.GroupLayout(coveredPanel);
        coveredPanel.setLayout(coveredPanelLayout);
        coveredPanelLayout.setHorizontalGroup(
            coveredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coveredPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(coveredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(coveredLabel))
                .addContainerGap())
        );
        coveredPanelLayout.setVerticalGroup(
            coveredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, coveredPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(coveredLabel)
                .addGap(12, 12, 12))
        );

        unCoveredPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Uncovered Paths", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        uncoveredPathsList.setModel(new DefaultListModel());
        uncoveredPathsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        uncoveredPathsList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                uncoveredPathsListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(uncoveredPathsList);

        unCoveredLabel.setFont(new java.awt.Font("Ubuntu", 1, 12));
        unCoveredLabel.setForeground(new java.awt.Color(229, 2, 2));
        unCoveredLabel.setText("Uncovered: ");

        javax.swing.GroupLayout unCoveredPanelLayout = new javax.swing.GroupLayout(unCoveredPanel);
        unCoveredPanel.setLayout(unCoveredPanelLayout);
        unCoveredPanelLayout.setHorizontalGroup(
            unCoveredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(unCoveredPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(unCoveredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(unCoveredLabel))
                .addContainerGap())
        );
        unCoveredPanelLayout.setVerticalGroup(
            unCoveredPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, unCoveredPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(unCoveredLabel)
                .addGap(24, 24, 24))
        );

        jScrollPane1.setMinimumSize(new java.awt.Dimension(550, 520));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(550, 520));

        coverageSourceCode.setBackground(new java.awt.Color(254, 254, 254));
        jScrollPane1.setViewportView(coverageSourceCode);

        methodSignature.setFont(new java.awt.Font("Ubuntu", 1, 15));
        methodSignature.setForeground(new java.awt.Color(1, 1, 1));
        methodSignature.setText("Method's code:");

        exScenarioCoveredPath.setSelected(true);
        exScenarioCoveredPath.setText("Show Execution Scenario Covered Lines");
        exScenarioCoveredPath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exScenarioCoveredPathActionPerformed(evt);
            }
        });

        lcsajCoveragePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Coverage", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        lcsajCoverageLabel.setFont(new java.awt.Font("Ubuntu", 1, 18));
        lcsajCoverageLabel.setForeground(new java.awt.Color(1, 1, 1));
        lcsajCoverageLabel.setText("100 %");

        lcsajLabel.setFont(new java.awt.Font("Ubuntu", 1, 18));
        lcsajLabel.setForeground(new java.awt.Color(1, 1, 1));
        lcsajLabel.setText("Lcsaj:");

        statementLabel.setFont(new java.awt.Font("Ubuntu", 1, 18));
        statementLabel.setForeground(new java.awt.Color(1, 1, 1));
        statementLabel.setText("Stmt:");

        stmtCoverageLabel.setFont(new java.awt.Font("Ubuntu", 1, 18));
        stmtCoverageLabel.setForeground(new java.awt.Color(1, 1, 1));
        stmtCoverageLabel.setText("100 %");

        javax.swing.GroupLayout lcsajCoveragePanelLayout = new javax.swing.GroupLayout(lcsajCoveragePanel);
        lcsajCoveragePanel.setLayout(lcsajCoveragePanelLayout);
        lcsajCoveragePanelLayout.setHorizontalGroup(
            lcsajCoveragePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lcsajCoveragePanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(lcsajCoveragePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(lcsajCoveragePanelLayout.createSequentialGroup()
                        .addComponent(statementLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stmtCoverageLabel))
                    .addGroup(lcsajCoveragePanelLayout.createSequentialGroup()
                        .addComponent(lcsajLabel)
                        .addGap(18, 18, 18)
                        .addComponent(lcsajCoverageLabel)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        lcsajCoveragePanelLayout.setVerticalGroup(
            lcsajCoveragePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lcsajCoveragePanelLayout.createSequentialGroup()
                .addGroup(lcsajCoveragePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lcsajLabel)
                    .addComponent(lcsajCoverageLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lcsajCoveragePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statementLabel)
                    .addComponent(stmtCoverageLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Display Control Flow Graph");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(methodSignature)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                .addComponent(exScenarioCoveredPath))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lcsajCoveragePanel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(unCoveredPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(coveredPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(methodSignature)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exScenarioCoveredPath)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(unCoveredPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(coveredPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lcsajCoveragePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

private void uncoveredPathsListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_uncoveredPathsListValueChanged
   if (!evt.getValueIsAdjusting() && !uncoveredPathsList.isSelectionEmpty()) {
       if(!coveredPathsList.isSelectionEmpty()){
            coveredPathsList.clearSelection();
       }
       if(exScenarioCoveredPath.isSelected()){
            exScenarioCoveredPath.setSelected(false);
       }
       setJEditorPaneContent(method.createHTMLforPath(Integer.parseInt(uncoveredPathsList.getSelectedValue().toString().split("_")[1])));
   }
}//GEN-LAST:event_uncoveredPathsListValueChanged

private void coveredPathsListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_coveredPathsListValueChanged
    if (!evt.getValueIsAdjusting() && !coveredPathsList.isSelectionEmpty()) {
        if(!uncoveredPathsList.isSelectionEmpty()){
            uncoveredPathsList.clearSelection();
        }
        if(exScenarioCoveredPath.isSelected()){
            exScenarioCoveredPath.setSelected(false);
        }
        setJEditorPaneContent(method.createHTMLforPath(Integer.parseInt(coveredPathsList.getSelectedValue().toString().split("_")[1])));
            
    }
}//GEN-LAST:event_coveredPathsListValueChanged

private void exScenarioCoveredPathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exScenarioCoveredPathActionPerformed
    if(exScenarioCoveredPath.isSelected()){
        coveredPathsList.clearSelection();
        uncoveredPathsList.clearSelection();
        setJEditorPaneContent(method.createExecutionScenarioHTML());
    } else if(coveredPathsList.isSelectionEmpty() && uncoveredPathsList.isSelectionEmpty()){
        setJEditorPaneContent(method.createHTML());
    }
}//GEN-LAST:event_exScenarioCoveredPathActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     CfgViewerFrame cfg = new CfgViewerFrame(method);
}//GEN-LAST:event_jButton1ActionPerformed

private void setJEditorPaneContent(String htmlFilePath){
    try {
            File htmlFile = new File(htmlFilePath);
            URL helpURL = new URL("file://" + htmlFile.getAbsolutePath());
            if (helpURL != null) {
                try {
                    Document doc = coverageSourceCode.getDocument(); 
                    doc.putProperty(Document.StreamDescriptionProperty, null);
                    coverageSourceCode.setPage(helpURL);
                    coverageSourceCode.repaint();
                } catch (IOException e) {
                    System.err.println("Attempted to read a bad URL: " + helpURL);
                }
            } else {
                System.err.println("Couldn't find file: TextSamplerDemoHelp.html");
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(CoverageSourceViewer.class.getName()).log(Level.SEVERE, null, ex);
        }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane coverageSourceCode;
    private javax.swing.JLabel coveredLabel;
    private javax.swing.JPanel coveredPanel;
    private javax.swing.JList coveredPathsList;
    private javax.swing.JCheckBox exScenarioCoveredPath;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lcsajCoverageLabel;
    private javax.swing.JPanel lcsajCoveragePanel;
    private javax.swing.JLabel lcsajLabel;
    private javax.swing.JLabel methodSignature;
    private javax.swing.JLabel statementLabel;
    private javax.swing.JLabel stmtCoverageLabel;
    private javax.swing.JLabel unCoveredLabel;
    private javax.swing.JPanel unCoveredPanel;
    private javax.swing.JList uncoveredPathsList;
    // End of variables declaration//GEN-END:variables

    private void initUncoveredCoveredLists() {
        DefaultListModel unCoveredModel = (DefaultListModel) uncoveredPathsList.getModel();
        for(int path : method.getJJPathsIndexes(false, true)){
                unCoveredModel.addElement("JJpath_" + path);
        }
        unCoveredLabel.setText("Uncovered Total: " +  method.getJJPathsIndexes(false, true).size());
        
        DefaultListModel coveredModel = (DefaultListModel) coveredPathsList.getModel();
        for(int path : method.getJJPathsIndexes(true, false)){
                coveredModel.addElement("JJpath_" + path);
        }
        coveredLabel.setText("Covered Total: " +  method.getJJPathsIndexes(true, false).size());
        lcsajCoverageLabel.setText(method.getCoverage() + " %");
        stmtCoverageLabel.setText(method.getStmtCoverage() + " %");
        
        methodSignature.setText(method.toString());
    }
}
