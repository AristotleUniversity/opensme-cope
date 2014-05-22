/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * QualityAttributeSelectPanel.java
 *
 * Created on Aug 27, 2011, 5:12:02 AM
 */
package eu.opensme.cope.knowledgemanager.gui.management;

import java.util.Iterator;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import eu.opensme.cope.knowledgemanager.api.dto.KeyValue;
import eu.opensme.cope.knowledgemanager.gui.management.list.SortedListKeyValueModel;

/**
 *
 * @author George
 */
public class QualityAttributeSelectPanel extends javax.swing.JPanel {

    public String qualityAttributeType;
    public SortedListKeyValueModel qualitiesList;

    /** Creates new form QualityAttributeSelectPanel */
    public QualityAttributeSelectPanel() {
        initComponents();
        initMyComponents();
    }

//    QualityAttributeSelectPanel(SortedListKeyValueModel qualityAttributesList) {
//        this.qualitiesList = qualityAttributesList;
//        initComponents();
//        initMyComponents();
//    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListQualityAttributeList = new javax.swing.JList();

        jScrollPane1.setViewportView(jListQualityAttributeList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JList jListQualityAttributeList;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void initMyComponents() {

        jListQualityAttributeList.getSelectionModel().addListSelectionListener(
                new ListSelectionListener() {

                    @Override
                    public void valueChanged(ListSelectionEvent event) {
                        if (!event.getValueIsAdjusting()) {
                        }
                    }
                });
        qualitiesList = new SortedListKeyValueModel();
        jListQualityAttributeList.setModel(qualitiesList);
    }

    void setModel(SortedListKeyValueModel qualityAttributesList, SortedListKeyValueModel highQualityList, SortedListKeyValueModel mediumQualityList, SortedListKeyValueModel lowQualityList) {
        jListQualityAttributeList.clearSelection();
        qualitiesList.clear();
        for (Iterator it = qualityAttributesList.iterator(); it.hasNext();) {
            KeyValue v = (KeyValue) it.next();
            if (!highQualityList.contains(v) && !mediumQualityList.contains(v) && !mediumQualityList.contains(v) && !lowQualityList.contains(v)) {
                qualitiesList.add(v);
            }
        }
    }
}