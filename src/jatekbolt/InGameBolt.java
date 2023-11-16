
package jatekbolt;

import java.awt.Color;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.plaf.ButtonUI;

/**
 *
 * @author WeimperGergőZsombor(
 */
public class InGameBolt extends javax.swing.JFrame {

    int keret;
    String azonosito = "";
    boolean f1megvett = false;
    boolean f2megvett = false;
    boolean f3megvett = false;
    public ArrayList<String> fegyverSeged; //Igaz hamis értékeket eltároló lista
    
    
    public InGameBolt() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlKep1 = new javax.swing.JPanel();
        lblElemKep1 = new javax.swing.JLabel();
        lblFegyver1 = new javax.swing.JLabel();
        lblAr1 = new javax.swing.JLabel();
        btnVissza = new javax.swing.JButton();
        lblBolt = new javax.swing.JLabel();
        lblFelhasznaloPenz = new javax.swing.JLabel();
        lblAzonFelhasznalo = new javax.swing.JLabel();
        btnF1vetel = new javax.swing.JButton();
        sldToltenyF1 = new javax.swing.JSlider();
        lblToltenyF1 = new javax.swing.JLabel();
        spnrToltenyF1 = new javax.swing.JSpinner();
        pnlKep2 = new javax.swing.JPanel();
        lblAr2 = new javax.swing.JLabel();
        lblFegyver2 = new javax.swing.JLabel();
        lblElemKep2 = new javax.swing.JLabel();
        spnrToltenyF2 = new javax.swing.JSpinner();
        btnF2vetel = new javax.swing.JButton();
        sldToltenyF2 = new javax.swing.JSlider();
        lblToltenyF2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jatek - Bolt");
        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(800, 610));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlKep1.setBackground(new java.awt.Color(169, 169, 169));
        pnlKep1.setMaximumSize(new java.awt.Dimension(150, 150));
        pnlKep1.setMinimumSize(new java.awt.Dimension(150, 150));
        pnlKep1.setPreferredSize(new java.awt.Dimension(160, 160));

        lblElemKep1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jatekbolt/pistol.png"))); // NOI18N
        lblElemKep1.setText("Kep helye");

        lblFegyver1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblFegyver1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFegyver1.setText("100$");

        lblAr1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblAr1.setText("Pisztoly");

        javax.swing.GroupLayout pnlKep1Layout = new javax.swing.GroupLayout(pnlKep1);
        pnlKep1.setLayout(pnlKep1Layout);
        pnlKep1Layout.setHorizontalGroup(
            pnlKep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKep1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblElemKep1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKep1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFegyver1)
                .addGap(59, 59, 59))
            .addGroup(pnlKep1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblAr1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlKep1Layout.setVerticalGroup(
            pnlKep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKep1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAr1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblElemKep1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFegyver1)
                .addContainerGap())
        );

        btnVissza.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVissza.setText("Vissza a menübe");

        lblBolt.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblBolt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBolt.setText("<html><p style=\"text-shadow: 2px 2px 5px green\">Bolt</p></html>");

        lblFelhasznaloPenz.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblFelhasznaloPenz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFelhasznaloPenz.setText("<html> <p style=\"color:green;\">x $</p> </html>");
        lblFelhasznaloPenz.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0), 3));

        lblAzonFelhasznalo.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        lblAzonFelhasznalo.setText("id: ");

        btnF1vetel.setBackground(new java.awt.Color(51, 204, 0));
        btnF1vetel.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btnF1vetel.setText("Vásárlás");
        btnF1vetel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnF1vetel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF1vetelActionPerformed(evt);
            }
        });

        sldToltenyF1.setMaximum(9999);
        sldToltenyF1.setMinimum(1);
        sldToltenyF1.setValue(1);
        sldToltenyF1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldToltenyF1StateChanged(evt);
            }
        });

        lblToltenyF1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblToltenyF1.setText("Töltény");

        spnrToltenyF1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 9999, 1));
        spnrToltenyF1.setName(""); // NOI18N
        spnrToltenyF1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnrToltenyF1StateChanged(evt);
            }
        });

        pnlKep2.setBackground(new java.awt.Color(169, 169, 169));
        pnlKep2.setMaximumSize(new java.awt.Dimension(300, 300));
        pnlKep2.setMinimumSize(new java.awt.Dimension(150, 150));
        pnlKep2.setPreferredSize(new java.awt.Dimension(160, 160));

        lblAr2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblAr2.setText("Ak-47");

        lblFegyver2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblFegyver2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFegyver2.setText("2200$");

        lblElemKep2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jatekbolt/ak47.png"))); // NOI18N

        javax.swing.GroupLayout pnlKep2Layout = new javax.swing.GroupLayout(pnlKep2);
        pnlKep2.setLayout(pnlKep2Layout);
        pnlKep2Layout.setHorizontalGroup(
            pnlKep2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKep2Layout.createSequentialGroup()
                .addGroup(pnlKep2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlKep2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lblAr2))
                    .addGroup(pnlKep2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lblFegyver2)))
                .addGap(0, 0, 0))
            .addGroup(pnlKep2Layout.createSequentialGroup()
                .addComponent(lblElemKep2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlKep2Layout.setVerticalGroup(
            pnlKep2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKep2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAr2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblElemKep2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFegyver2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        spnrToltenyF2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 9999, 1));
        spnrToltenyF2.setName(""); // NOI18N
        spnrToltenyF2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnrToltenyF2StateChanged(evt);
            }
        });

        btnF2vetel.setBackground(new java.awt.Color(51, 204, 0));
        btnF2vetel.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btnF2vetel.setText("Vásárlás");
        btnF2vetel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnF2vetel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF2vetelActionPerformed(evt);
            }
        });

        sldToltenyF2.setMaximum(9999);
        sldToltenyF2.setMinimum(1);
        sldToltenyF2.setValue(1);
        sldToltenyF2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldToltenyF2StateChanged(evt);
            }
        });

        lblToltenyF2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblToltenyF2.setText("Töltény");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlKep1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(btnF1vetel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sldToltenyF1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(lblToltenyF1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(spnrToltenyF1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(lblToltenyF2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(spnrToltenyF2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnF2vetel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(pnlKep2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(sldToltenyF2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(392, 392, 392))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVissza, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(237, 237, 237)
                .addComponent(lblFelhasznaloPenz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAzonFelhasznalo)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(lblBolt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblBolt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlKep1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlKep2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnF1vetel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblToltenyF1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sldToltenyF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnrToltenyF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnF2vetel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblToltenyF2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sldToltenyF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnrToltenyF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVissza, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAzonFelhasznalo)
                    .addComponent(lblFelhasznaloPenz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.setLocationRelativeTo(null);   // Középre igazítja az ablakot
        getContentPane().setBackground(new java.awt.Color(216, 216, 216));
        keret = (int)(Math.random() * (15000 - 7500)) + 7500;
        /* Random összeg 7500 és 15000 között, a játékos kezdetleges keretét határozza meg */
        lblFelhasznaloPenz.setText(keret + " $");
        
        char azonbetu;
        int azonszam;
        Random rndbetu = new Random();
        for (int i = 0; i < 4; i++) {
            azonbetu = (char)(rndbetu.nextInt(26) + 'A');
            azonszam = (int)(Math.random() * (9));
            azonosito += String.valueOf(azonbetu);
            azonosito += String.valueOf(azonszam);
        }
        lblAzonFelhasznalo.setText("id: " + azonosito);
        
        
    }//GEN-LAST:event_formWindowOpened

    private void btnF1vetelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF1vetelActionPerformed
        fegyverVetel(100, f1megvett);
        gombKikapcs(btnF1vetel);
    }//GEN-LAST:event_btnF1vetelActionPerformed

       

    private void sldToltenyF1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldToltenyF1StateChanged
        spnrToltenyF1.setValue(sldToltenyF1.getValue());
    }//GEN-LAST:event_sldToltenyF1StateChanged

    private void spnrToltenyF1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnrToltenyF1StateChanged
        sldToltenyF1.setValue((int) spnrToltenyF1.getValue());
    }//GEN-LAST:event_spnrToltenyF1StateChanged

    private void spnrToltenyF2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnrToltenyF2StateChanged
        
    }//GEN-LAST:event_spnrToltenyF2StateChanged

    private void btnF2vetelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF2vetelActionPerformed
        fegyverVetel(2200, f2megvett);
        gombKikapcs(btnF2vetel);
    }//GEN-LAST:event_btnF2vetelActionPerformed

    private void sldToltenyF2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldToltenyF2StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_sldToltenyF2StateChanged

    

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
            java.util.logging.Logger.getLogger(InGameBolt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InGameBolt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InGameBolt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InGameBolt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InGameBolt().setVisible(true);
            }
        });
    }

    //Metódusok
    private void fegyverVetel(int fegyverOsszeg, boolean aktualisFegyver) throws HeadlessException { 
        
        if(keret > fegyverOsszeg){
            keret -= fegyverOsszeg;
            aktualisFegyver = true; //aktuális fegyver
            penzFrissit();
        }
        else{
            nincsKeret();
        }
        
    }
    
    private void gombKikapcs(JButton aktGomb) {
        aktGomb.setEnabled(false);
        aktGomb.setText("Már megvan");
    }
    
    private void penzFrissit() {
        lblFelhasznaloPenz.setText(keret + " $");
    }
    
    private void nincsKeret() throws HeadlessException {
        JOptionPane.showMessageDialog(rootPane, "Nincs elég pénzed!");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnF1vetel;
    private javax.swing.JButton btnF2vetel;
    private javax.swing.JButton btnVissza;
    private javax.swing.JLabel lblAr1;
    private javax.swing.JLabel lblAr2;
    private javax.swing.JLabel lblAzonFelhasznalo;
    private javax.swing.JLabel lblBolt;
    private javax.swing.JLabel lblElemKep1;
    private javax.swing.JLabel lblElemKep2;
    private javax.swing.JLabel lblFegyver1;
    private javax.swing.JLabel lblFegyver2;
    private javax.swing.JLabel lblFelhasznaloPenz;
    private javax.swing.JLabel lblToltenyF1;
    private javax.swing.JLabel lblToltenyF2;
    private javax.swing.JPanel pnlKep1;
    private javax.swing.JPanel pnlKep2;
    private javax.swing.JSlider sldToltenyF1;
    private javax.swing.JSlider sldToltenyF2;
    private javax.swing.JSpinner spnrToltenyF1;
    private javax.swing.JSpinner spnrToltenyF2;
    // End of variables declaration//GEN-END:variables

    
}
