package eu.opensme.cope.knowledgemanager.gui.management;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import org.openrdf.query.MalformedQueryException;
import org.openrdf.query.QueryEvaluationException;
import org.openrdf.repository.RepositoryException;
import org.openrdf.repository.config.RepositoryConfigException;
import eu.opensme.cope.knowledgemanager.api.ReuseApi;
import eu.opensme.cope.knowledgemanager.api.actions.Concept;
import eu.opensme.cope.knowledgemanager.api.actions.Domain;
import eu.opensme.cope.knowledgemanager.api.actions.OpenSMEComponent;
import eu.opensme.cope.knowledgemanager.api.dto.KeyValue;
import eu.opensme.cope.knowledgemanager.utils.ProgressBarFrame;
import eu.opensme.cope.knowledgemanager.gui.management.list.SortedListKeyValueModel;
import eu.opensme.cope.knowledgemanager.gui.management.table.ComponentListDataModel;
import eu.opensme.cope.knowledgemanager.gui.management.table.SearchComponentDataModel;
import eu.opensme.cope.knowledgemanager.gui.management.table.SearchComponentTableModel;
import eu.opensme.cope.knowledgemanager.gui.management.tree.CustomTreeModel;

/**
 *
 * @author George
 */
public class SearchComponent extends javax.swing.JFrame {

    private SortedListKeyValueModel languageList, technologyList, domainList, conceptList;
    private boolean fromLoading;
    private SearchComponentTableModel tableModel = new SearchComponentTableModel(new ArrayList<SearchComponentDataModel>());
    public static ProgressBarFrame progressBar = new ProgressBarFrame("Please wait...");
    //private SortedListNameVersionTierModel selectedList;
    //private ArrayList<String> alreadySelectedComponentsFromConsole;
    private Management management;
    //private String dialogFor;

    /** Creates new form SelectComponent */
    public SearchComponent(Management management, SortedListKeyValueModel languageList, SortedListKeyValueModel technologyList) {
        this.management = management;
        this.languageList = languageList;
        this.technologyList = technologyList;
        //this.alreadySelectedComponentsFromConsole = alreadSelectedComponentsFromConsole;
        initComponents();
        initMyComponents();
    }

    public SearchComponent() {
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

        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        componentsTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldKeywords = new javax.swing.JTextField();
        jButtonFind = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxTier = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxLanguage = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxTechnology = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxDomain = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxConcept = new javax.swing.JComboBox();
        jButtonRefresh = new javax.swing.JButton();
        jButtonViewInConsole = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Search Components");
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/components.png")).getImage());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane3.setAutoscrolls(true);

        componentsTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(componentsTable);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(61, 128, 185), 2, true), "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(238, 52, 0))); // NOI18N

        jLabel1.setText("Keywords:");

        jButtonFind.setBackground(new java.awt.Color(255, 255, 255));
        jButtonFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search16x16.png"))); // NOI18N
        jButtonFind.setText("Find");
        jButtonFind.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonFind.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jButtonFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldKeywords, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                    .addComponent(jButtonFind, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldKeywords, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonFind)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(245, 245, 245));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(61, 128, 185), 2, true), "Refine by", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(238, 52, 0))); // NOI18N

        jLabel3.setText("Tier:");

        jComboBoxTier.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Enterprise", "Resource", "User", "Workspace" }));
        jComboBoxTier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTierActionPerformed(evt);
            }
        });

        jLabel4.setText("Language:");

        jComboBoxLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLanguageActionPerformed(evt);
            }
        });

        jLabel5.setText("Technology:");

        jComboBoxTechnology.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTechnologyActionPerformed(evt);
            }
        });

        jLabel6.setText("Domain:");

        jComboBoxDomain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDomainActionPerformed(evt);
            }
        });

        jLabel7.setText("Concept:");

        jComboBoxConcept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxConceptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxTier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTechnology, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxDomain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxConcept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxTier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxTechnology, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxDomain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxConcept, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        jButtonRefresh.setText("Refresh Table");
        jButtonRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRefresh.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });

        jButtonViewInConsole.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/preview16x16.png"))); // NOI18N
        jButtonViewInConsole.setText("View in Console");
        jButtonViewInConsole.setToolTipText("");
        jButtonViewInConsole.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonViewInConsole.setEnabled(false);
        jButtonViewInConsole.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jButtonViewInConsole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewInConsoleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonViewInConsole))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(130, 130, 130)
                        .addComponent(jButtonRefresh)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonRefresh))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jButtonViewInConsole)
                        .addGap(382, 382, 382))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-830)/2, (screenSize.height-607)/2, 830, 607);
    }// </editor-fold>//GEN-END:initComponents

private void jComboBoxTierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTierActionPerformed
    displayComponentsList();
}//GEN-LAST:event_jComboBoxTierActionPerformed

private void jComboBoxLanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLanguageActionPerformed
        if (!fromLoading) {
            displayComponentsList();
        }
}//GEN-LAST:event_jComboBoxLanguageActionPerformed

private void jComboBoxTechnologyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTechnologyActionPerformed
    if (!fromLoading) {
        displayComponentsList();
    }
}//GEN-LAST:event_jComboBoxTechnologyActionPerformed

private void jButtonFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFindActionPerformed
    displayComponentsList();
}//GEN-LAST:event_jButtonFindActionPerformed

private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
    displayComponentsList();}//GEN-LAST:event_jButtonRefreshActionPerformed

    private void jComboBoxDomainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDomainActionPerformed
        if (!fromLoading) {
            displayComponentsList();
        }
    }//GEN-LAST:event_jComboBoxDomainActionPerformed

    private void jComboBoxConceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxConceptActionPerformed
        if (!fromLoading) {
            displayComponentsList();
        }
    }//GEN-LAST:event_jComboBoxConceptActionPerformed

    private void jButtonViewInConsoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewInConsoleActionPerformed
        int row = componentsTable.getSelectedRow();
        if (row != -1) {
            int modelRow = componentsTable.convertRowIndexToModel(row);
            String clickedID = ((SearchComponentTableModel) componentsTable.getModel()).getDataAtRow(modelRow).getId();
            
            CustomTreeModel treeModel = (CustomTreeModel) management.jTree1.getModel();
            management.jTree1.setSelectionPath(treeModel.getComponentPathWithID(clickedID));
            management.toFront();
        }
    }//GEN-LAST:event_jButtonViewInConsoleActionPerformed

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
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SearchComponent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchComponent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchComponent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchComponent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new SearchComponent().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable componentsTable;
    private javax.swing.JButton jButtonFind;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JButton jButtonViewInConsole;
    private javax.swing.JComboBox jComboBoxConcept;
    private javax.swing.JComboBox jComboBoxDomain;
    private javax.swing.JComboBox jComboBoxLanguage;
    private javax.swing.JComboBox jComboBoxTechnology;
    private javax.swing.JComboBox jComboBoxTier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextFieldKeywords;
    // End of variables declaration//GEN-END:variables

    private void initMyComponents() {
        initComboBoxes();
        initComponentsTable();
        initSelectedList();


    }

    private void initComponentsTable() {
        componentsTable.setAutoCreateRowSorter(true);
        componentsTable.setModel(tableModel);

        TableColumnModel columnModel = componentsTable.getColumnModel();
        TextAreaRenderer textAreaRenderer = new TextAreaRenderer();
        columnModel.getColumn(0).setCellRenderer(textAreaRenderer);
        columnModel.getColumn(1).setCellRenderer(textAreaRenderer);
        columnModel.getColumn(2).setCellRenderer(textAreaRenderer);
        columnModel.getColumn(3).setCellRenderer(textAreaRenderer);
        columnModel.getColumn(4).setCellRenderer(textAreaRenderer);
        columnModel.getColumn(5).setCellRenderer(textAreaRenderer);
        columnModel.getColumn(6).setCellRenderer(textAreaRenderer);



        componentsTable.setSelectionModel(new MySelectionModel());
        componentsTable.getSelectionModel().addListSelectionListener(
                new ListSelectionListener() {

                    @Override
                    public void valueChanged(ListSelectionEvent event) {
                        if (!event.getValueIsAdjusting()) {
                            int viewRow = componentsTable.getSelectedRow();
                            if (viewRow < 0) {
                                jButtonViewInConsole.setEnabled(false);
                            } else {
                                //int modelRow = componentsTable.convertRowIndexToModel(viewRow);
                                //System.out.println(String.format("Selected Row in view: %d. " + "Selected Row in model: %d.", viewRow, modelRow));
                                jButtonViewInConsole.setEnabled(true);
                                //componentsTable.clearSelection();
                            }
                        }
                    }
                });

        componentsTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        componentsTable.clearSelection();
        //jButtonAddSelected.setEnabled(false);

        jScrollPane3.getViewport().setBackground(Color.WHITE);

        displayComponentsList();



    }

    private void initComboBoxes() {
        fromLoading = true;
        jComboBoxLanguage.addItem(new KeyValue("-1", ""));
        int size = languageList.getSize();
        for (int i = 0; i < size; i++) {
            KeyValue item = (KeyValue) languageList.getElementAt(i);
            jComboBoxLanguage.addItem(item);
        }
        jComboBoxLanguage.setSelectedIndex(0);

        jComboBoxTechnology.addItem(new KeyValue("-1", ""));
        size = technologyList.getSize();
        for (int i = 0; i < size; i++) {
            KeyValue item = (KeyValue) technologyList.getElementAt(i);
            jComboBoxTechnology.addItem(item);
        }
        jComboBoxTechnology.setSelectedIndex(0);

        ReuseApi api = null;
        try {
            api = new ReuseApi();
        } catch (RepositoryException ex) {
            progressBar.setVisible(false);
            JOptionPane.showMessageDialog(SearchComponent.this, "Cannot find the repository", "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Management.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RepositoryConfigException ex) {
            progressBar.setVisible(false);
            JOptionPane.showMessageDialog(SearchComponent.this, "Cannot find the repository", "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Management.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Management.class.getName()).log(Level.SEVERE, null, ex);
        }

        Domain dom = new Domain(api);
        try {
            ArrayList<KeyValue> domains = dom.getDomainsAsInstances();
            jComboBoxDomain.addItem(new KeyValue("-1", ""));
            for (KeyValue d : domains) {
                jComboBoxDomain.addItem(d);
            }
            jComboBoxDomain.setSelectedIndex(0);
        } catch (RepositoryException ex) {
            JOptionPane.showMessageDialog(SearchComponent.this, "Error", "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(SearchComponent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedQueryException ex) {
            JOptionPane.showMessageDialog(SearchComponent.this, "Error", "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(SearchComponent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (QueryEvaluationException ex) {
            JOptionPane.showMessageDialog(SearchComponent.this, "Error", "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(SearchComponent.class.getName()).log(Level.SEVERE, null, ex);
        }

        Concept con = new Concept(api);
        try {
            ArrayList<KeyValue> concepts = con.getConceptsAsInstances();
            jComboBoxConcept.addItem(new KeyValue("-1", ""));
            for (KeyValue d : concepts) {
                jComboBoxConcept.addItem(d);
            }
            jComboBoxConcept.setSelectedIndex(0);
        } catch (RepositoryException ex) {
            JOptionPane.showMessageDialog(SearchComponent.this, "Error", "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(SearchComponent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedQueryException ex) {
            JOptionPane.showMessageDialog(SearchComponent.this, "Error", "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(SearchComponent.class.getName()).log(Level.SEVERE, null, ex);
        } catch (QueryEvaluationException ex) {
            JOptionPane.showMessageDialog(SearchComponent.this, "Error", "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(SearchComponent.class.getName()).log(Level.SEVERE, null, ex);
        }

        fromLoading = false;
    }

    private void displayComponentsList() {
        componentsTable.clearSelection();
        progressBar.setVisible(true);
        new Thread() {

            @Override
            public void run() {
                ReuseApi api = null;
                try {
                    api = new ReuseApi();
                } catch (RepositoryException ex) {
                    progressBar.setVisible(false);
                    JOptionPane.showMessageDialog(SearchComponent.this, "Cannot find the repository", "Error", JOptionPane.ERROR_MESSAGE);
                    Logger.getLogger(Management.class.getName()).log(Level.SEVERE, null, ex);
                } catch (RepositoryConfigException ex) {
                    progressBar.setVisible(false);
                    JOptionPane.showMessageDialog(SearchComponent.this, "Cannot find the repository", "Error", JOptionPane.ERROR_MESSAGE);
                    Logger.getLogger(Management.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(Management.class.getName()).log(Level.SEVERE, null, ex);
                }
                OpenSMEComponent comp = new OpenSMEComponent(api);
                ArrayList<SearchComponentDataModel> result = null;

                HashSet<String> keywords = new HashSet<String>();

                if (jTextFieldKeywords.getText().trim().length() != 0) {
                    String a[] = jTextFieldKeywords.getText().trim().split(" ");
                    keywords.addAll(Arrays.asList(a));
                }

                ArrayList<String> in = new ArrayList<String>();
                String tier = jComboBoxTier.getSelectedItem().toString().trim();
                String language = ((KeyValue) jComboBoxLanguage.getSelectedItem()).getKey();
                String technology = ((KeyValue) jComboBoxTechnology.getSelectedItem()).getKey();
                String domain = ((KeyValue) jComboBoxDomain.getSelectedItem()).getKey();
                String concept = ((KeyValue) jComboBoxConcept.getSelectedItem()).getKey();

                try {
                    result = comp.getComponentsInSearchList(
                            keywords,
                            in,
                            tier,
                            language,
                            technology,
                            domain,
                            concept);


                    tableModel.clearAll();

                    for (SearchComponentDataModel c : result) {
                        tableModel.addRow(c);
                    }
                    componentsTable.clearSelection();

                } catch (RepositoryException ex) {
                    progressBar.setVisible(false);
                    JOptionPane.showMessageDialog(SearchComponent.this, "Error getting component details", "Error", JOptionPane.ERROR_MESSAGE);
                    Logger.getLogger(Management.class.getName()).log(Level.SEVERE, null, ex);
                } catch (MalformedQueryException ex) {
                    progressBar.setVisible(false);
                    JOptionPane.showMessageDialog(SearchComponent.this, "Error getting component details", "Error", JOptionPane.ERROR_MESSAGE);
                    Logger.getLogger(Management.class.getName()).log(Level.SEVERE, null, ex);
                } catch (QueryEvaluationException ex) {
                    progressBar.setVisible(false);
                    JOptionPane.showMessageDialog(SearchComponent.this, "Error getting component details", "Error", JOptionPane.ERROR_MESSAGE);
                    Logger.getLogger(Management.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    api.getDatabase().close();
                }
                progressBar.setVisible(false);
                progressBar.setIndeterminate(true);
            }
        }.start();
    }

    private void initSelectedList() {
        //selectedList = new SortedListNameVersionTierModel();
        //jListSelectedComponents.setModel(selectedList);
    }

    private class MySelectionModel extends DefaultListSelectionModel implements ListSelectionModel {
//        @Override
//        public void setSelectionInterval(int index0, int index1) {
//            int modelRow = componentsTable.convertRowIndexToModel(index0);
//            if (!alreadySelectedComponentsFromConsole.contains(tableModel.getDataAtRow(modelRow).getId())) {
//                super.setSelectionInterval(index0, index1);
//            }
//        }
    }

    public class TextAreaRenderer extends JTextArea implements TableCellRenderer {

        private final DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        // Column heights are placed in this Map 
        private final Map<JTable, Map<Object, Map<Object, Integer>>> tablecellSizes = new HashMap<JTable, Map<Object, Map<Object, Integer>>>();

        /** 
         * Creates a text area renderer. 
         */
        public TextAreaRenderer() {
            setLineWrap(true);
            setWrapStyleWord(true);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                boolean hasFocus, int row, int column) {
            // set the Font, Color, etc. 
            renderer.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            //setForeground(renderer.getForeground());
            setBackground(renderer.getBackground());
            setBorder(renderer.getBorder());
            setFont(renderer.getFont());
            setText(renderer.getText());
            
            if (isSelected) {
                setBackground(Color.LIGHT_GRAY);
            } else {
                setBackground(Color.white);
            }

            TableColumnModel columnModel = table.getColumnModel();
            setSize(columnModel.getColumn(column).getWidth(), 0);
            int height_wanted = (int) getPreferredSize().getHeight();
            addSize(table, row, column, height_wanted);
            height_wanted = findTotalMaximumRowSize(table, row);

            if (height_wanted != table.getRowHeight(row)) {
                table.setRowHeight(row, height_wanted);
            }
            return this;
        }

        private void addSize(JTable table, int row, int column, int height) {
            Map<Object, Map<Object, Integer>> rowsMap = tablecellSizes.get(table);
            if (rowsMap == null) {
                tablecellSizes.put(table, rowsMap = new HashMap<Object, Map<Object, Integer>>());
            }
            Map<Object, Integer> rowheightsMap = rowsMap.get(row);
            if (rowheightsMap == null) {
                rowsMap.put(row, rowheightsMap = new HashMap<Object, Integer>());
            }
            rowheightsMap.put(column, height);
        }

        private int findTotalMaximumRowSize(JTable table, int row) {
            int maximum_height = 0;
            Enumeration<TableColumn> columns = table.getColumnModel().getColumns();
            while (columns.hasMoreElements()) {
                TableColumn tc = columns.nextElement();
                TableCellRenderer cellRenderer = tc.getCellRenderer();
                if (cellRenderer instanceof TextAreaRenderer) {
                    TextAreaRenderer tar = (TextAreaRenderer) cellRenderer;
                    maximum_height = Math.max(maximum_height,
                            tar.findMaximumRowSize(table, row));
                }
            }
            return maximum_height;
        }

        private int findMaximumRowSize(JTable table, int row) {
            Map<Object, Map<Object, Integer>> rows = tablecellSizes.get(table);
            if (rows == null) {
                return 0;
            }
            Map<Object, Integer> rowheights = rows.get(row);
            if (rowheights == null) {
                return 0;
            }
            int maximum_height = 0;
            for (Map.Entry<Object, Integer> entry : rowheights.entrySet()) {
                int cellHeight = entry.getValue();
                maximum_height = Math.max(maximum_height, cellHeight);
            }
            return maximum_height;
        }
    }
}
//                    componentsTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//
//                    for (int i = 0; i < componentsTable.getColumnCount(); i++) {
//                        DefaultTableColumnModel colModel = (DefaultTableColumnModel) componentsTable.getColumnModel();
//                        TableColumn col = colModel.getColumn(i);
//                        int width = 0;
//
//                        TableCellRenderer renderer = col.getHeaderRenderer();
//                        for (int r = 0; r < componentsTable.getRowCount(); r++) {
//                            renderer = componentsTable.getCellRenderer(r, i);
//                            Component com = renderer.getTableCellRendererComponent(componentsTable, componentsTable.getValueAt(r, i),
//                                    false, false, r, i);
//                            width = Math.max(width, com.getPreferredSize().width);
//                        }
//                        col.setPreferredWidth(width + 2);
//                    }
