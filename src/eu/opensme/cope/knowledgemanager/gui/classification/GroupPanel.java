/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GroupPanel.java
 *
 * Created on Sep 1, 2011, 12:36:48 AM
 */
package eu.opensme.cope.knowledgemanager.gui.classification;

import eu.opensme.cope.knowledgemanager.api.dto.KeyValue;
import eu.opensme.cope.knowledgemanager.gui.classification.tree.CustomDomainTree;
import eu.opensme.cope.knowledgemanager.gui.classification.tree.CustomDomainTreeModel;
import eu.opensme.cope.knowledgemanager.gui.classification.tree.CustomMetaModelTree;
import eu.opensme.cope.knowledgemanager.gui.classification.tree.SelectDomainPanel;
import eu.opensme.cope.knowledgemanager.gui.classification.tree.TreeDomainNodeData;
import eu.opensme.cope.knowledgemanager.gui.classification.tree.TreeMetaModelNodeData;
import eu.opensme.cope.knowledgemanager.gui.management.list.SortedListKeyValueModel;
import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author George
 */
public class GroupPanel extends javax.swing.JPanel {

    SelectDomainPanel selectDomainPanel;
    private CustomDomainTree jTreeDomain;
    private CustomMetaModelTree jTreeMetaModel;
    private Classification classification;

    /** Creates new form GroupPanel */
    public GroupPanel(Classification classification, CustomMetaModelTree metaModelTree, CustomDomainTree jTreeDomain) {
        this.classification = classification;
        this.jTreeMetaModel = metaModelTree;
        this.jTreeDomain = jTreeDomain;
        initComponents();
        initMyComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel22 = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        jListGroupDomain = new javax.swing.JList();
        jButtonSelectDomain = new javax.swing.JButton();
        jButtonRemoveDomain = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel22.setBackground(new java.awt.Color(245, 245, 245));
        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(61, 128, 185), 2, true), "Has Domain", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(238, 52, 0))); // NOI18N

        jListGroupDomain.setVisibleRowCount(1);
        jScrollPane19.setViewportView(jListGroupDomain);

        jButtonSelectDomain.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSelectDomain.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButtonSelectDomain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add16x16.png"))); // NOI18N
        jButtonSelectDomain.setText("Select");
        jButtonSelectDomain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSelectDomain.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jButtonSelectDomain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelectDomainActionPerformed(evt);
            }
        });

        jButtonRemoveDomain.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRemoveDomain.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButtonRemoveDomain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete16x16.png"))); // NOI18N
        jButtonRemoveDomain.setText("Remove");
        jButtonRemoveDomain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRemoveDomain.setEnabled(false);
        jButtonRemoveDomain.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jButtonRemoveDomain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveDomainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jButtonSelectDomain)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRemoveDomain)))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSelectDomain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRemoveDomain))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

private void jButtonSelectDomainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelectDomainActionPerformed
    selectDomainPanel = new SelectDomainPanel((TreeDomainNodeData) ((CustomDomainTreeModel) jTreeDomain.getModel()).getRoot());

    int answer = JOptionPane.showConfirmDialog(this.getParent(), selectDomainPanel, "Select Domain", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null);

    while (answer == JOptionPane.OK_OPTION
            && (selectDomainPanel.jTree1.getSelectionCount() == 0
            || ((TreeDomainNodeData) selectDomainPanel.jTree1.getSelectionPath().getLastPathComponent()).getName().equals("Domains"))) {
        answer = JOptionPane.showConfirmDialog(this.getParent(), selectDomainPanel, "Select Domain", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null);
    }
    if (answer != JOptionPane.CANCEL_OPTION && answer != JOptionPane.CLOSED_OPTION) {
        jButtonSelectDomain.setEnabled(false);
        classification.addSelectedDomainToGroup(((TreeMetaModelNodeData) jTreeMetaModel.getSelectionPath().getLastPathComponent()).getId(),
                ((TreeDomainNodeData) selectDomainPanel.jTree1.getSelectionPath().getLastPathComponent()).getId(), true);
    }
}//GEN-LAST:event_jButtonSelectDomainActionPerformed

private void jButtonRemoveDomainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveDomainActionPerformed
    int n = JOptionPane.showConfirmDialog(classification, "Are you sure?", "Confirmation Dialog", JOptionPane.YES_NO_OPTION);
    //yes -> 0, no -> 1
    if (n == 0) {
        Object[] selectedValues = jListGroupDomain.getSelectedValues();
        if (selectedValues.length != 0) {
            String groupClassID = ((TreeMetaModelNodeData) jTreeMetaModel.getSelectionPath().getLastPathComponent()).getId();
            classification.removeDomainsFromGroup(groupClassID, selectedValues, true);
        }
    }
}//GEN-LAST:event_jButtonRemoveDomainActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonRemoveDomain;
    public javax.swing.JButton jButtonSelectDomain;
    public javax.swing.JList jListGroupDomain;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JScrollPane jScrollPane19;
    // End of variables declaration//GEN-END:variables

    void clearGUI() {
        jListGroupDomain.clearSelection();
        ((SortedListKeyValueModel) jListGroupDomain.getModel()).clear();
        jButtonSelectDomain.setEnabled(false);
        jButtonRemoveDomain.setEnabled(false);

    }

    private void initMyComponents() {
        SortedListKeyValueModel model = new SortedListKeyValueModel();
        jListGroupDomain.setModel(model);
        jListGroupDomain.setCellRenderer(new MyListCellThing());
        jListGroupDomain.getSelectionModel().addListSelectionListener(
                new ListSelectionListener() {

                    @Override
                    public void valueChanged(ListSelectionEvent event) {
                        if (!event.getValueIsAdjusting()) {
                            if (jListGroupDomain.getSelectedIndex() == -1) {
                                jButtonRemoveDomain.setEnabled(false);
                            } else {
                                jButtonRemoveDomain.setEnabled(true);
                            }

                        }
                    }
                });
    }

    public class MyListCellThing extends DefaultListCellRenderer {

        public MyListCellThing() {
            setOpaque(true);
        }

        @Override
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            Component cell = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            setText(value.toString());

            KeyValue elementAt = (KeyValue) ((SortedListKeyValueModel) jListGroupDomain.getModel()).getElementAt(index);
            if (!elementAt.isExplicit()) {
                setForeground(Color.BLUE);
                setToolTipText("<html><body><h3>This is an inferred relationship</h3></body></html>");

            } else {
                setForeground(Color.BLACK);
                setToolTipText(null);
            }

            return cell;
        }
    }
}
