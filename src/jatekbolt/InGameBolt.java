
package jatekbolt;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Label;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.plaf.ButtonUI;

/**
 *
 * @author WeimperGergőZsombor(
 */
public class InGameBolt extends javax.swing.JFrame {

    int keret;              //Felhasználó pénze tárolása
    int toltenySeged;       //Az aktuális töltény vásárlásában segít
    int aktualisToltenyAr;   //Az aktuális töltény vásárlásában segít
    int jelenlegiToltenyMennyiseg;
    String azonosito = "";  //Egyedi azonosító a felhasználónak
    boolean tobb;           //Töltényeknél ellenőrzést segíti
    boolean f1megvett = false;  
    boolean f2megvett = false;  
    boolean f3megvett = false;  
    boolean f4megvett = false;  
    //public ArrayList<String> fegyverSeged; //Igaz hamis értékeket eltároló lista
    
    
    public InGameBolt() {
        initComponents();
        this.setLocationRelativeTo(null);   // Középre igazítja az ablakot
        getContentPane().setBackground(new java.awt.Color(216, 216, 216));
        keret = (int)(Math.random() * (15000 - 7500)) + 7500;
        /* Random összeg 7500 és 15000 között, a játékos kezdetleges keretét határozza meg */
        lblFelhasznaloPenz.setText(keret + " $");
        
        azonositoKeszito();
        toltenySzamol(lblF1ToltenyAr, spnrToltenyF1, lblF1ToltenyMennyiseg);
        //toltenySzamol();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlKep1 = new javax.swing.JPanel();
        lblElemKep1 = new javax.swing.JLabel();
        lblFegyver1 = new javax.swing.JLabel();
        lblAr1 = new javax.swing.JLabel();
        btnF1vetel = new javax.swing.JButton();
        btnVissza = new javax.swing.JButton();
        lblBolt = new javax.swing.JLabel();
        lblFelhasznaloPenz = new javax.swing.JLabel();
        lblAzonFelhasznalo = new javax.swing.JLabel();
        pnlKep2 = new javax.swing.JPanel();
        lblAr2 = new javax.swing.JLabel();
        lblFegyver2 = new javax.swing.JLabel();
        lblElemKep2 = new javax.swing.JLabel();
        btnF2vetel = new javax.swing.JButton();
        pnlTolteny2 = new javax.swing.JPanel();
        lblToltenyF2 = new javax.swing.JLabel();
        sldToltenyF2 = new javax.swing.JSlider();
        spnrToltenyF2 = new javax.swing.JSpinner();
        btnF2Toltvetel = new javax.swing.JButton();
        lblF2ToltenyAr = new javax.swing.JLabel();
        lblF2ToltenyMennyiseg = new javax.swing.JLabel();
        pnlTolteny1 = new javax.swing.JPanel();
        spnrToltenyF1 = new javax.swing.JSpinner();
        sldToltenyF1 = new javax.swing.JSlider();
        lblToltenyF1 = new javax.swing.JLabel();
        btnF1Toltvetel = new javax.swing.JButton();
        lblF1ToltenyMennyiseg = new javax.swing.JLabel();
        lblF1ToltenyAr = new javax.swing.JLabel();
        pnlKep3 = new javax.swing.JPanel();
        lblAr3 = new javax.swing.JLabel();
        lblFegyver3 = new javax.swing.JLabel();
        lblElemKep3 = new javax.swing.JLabel();
        btnF3vetel = new javax.swing.JButton();
        pnlTolteny4 = new javax.swing.JPanel();
        lblToltenyF4 = new javax.swing.JLabel();
        sldToltenyF4 = new javax.swing.JSlider();
        spnrToltenyF4 = new javax.swing.JSpinner();
        btnF4Toltvetel = new javax.swing.JButton();
        lblF4ToltenyAr = new javax.swing.JLabel();
        lblF4ToltenyMennyiseg = new javax.swing.JLabel();
        pnlKep4 = new javax.swing.JPanel();
        lblAr4 = new javax.swing.JLabel();
        lblFegyver4 = new javax.swing.JLabel();
        lblElemKep4 = new javax.swing.JLabel();
        btnF4vetel = new javax.swing.JButton();
        pnlTolteny3 = new javax.swing.JPanel();
        lblToltenyF3 = new javax.swing.JLabel();
        sldToltenyF3 = new javax.swing.JSlider();
        spnrToltenyF3 = new javax.swing.JSpinner();
        btnF3Toltvetel = new javax.swing.JButton();
        lblF3ToltenyAr = new javax.swing.JLabel();
        lblF3ToltenyMennyiseg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jatek - Bolt");
        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(720, 610));
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

        btnF1vetel.setBackground(new java.awt.Color(51, 204, 0));
        btnF1vetel.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btnF1vetel.setText("Vásárlás");
        btnF1vetel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnF1vetel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF1vetelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlKep1Layout = new javax.swing.GroupLayout(pnlKep1);
        pnlKep1.setLayout(pnlKep1Layout);
        pnlKep1Layout.setHorizontalGroup(
            pnlKep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKep1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblAr1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(btnF1vetel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlKep1Layout.createSequentialGroup()
                .addComponent(lblElemKep1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKep1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(lblFegyver1)
                .addGap(58, 58, 58))
        );
        pnlKep1Layout.setVerticalGroup(
            pnlKep1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKep1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAr1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblElemKep1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFegyver1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnF1vetel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnVissza.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVissza.setText("Vissza a menübe");
        btnVissza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisszaActionPerformed(evt);
            }
        });

        lblBolt.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblBolt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBolt.setText("<html><p style=\"text-shadow: 2px 2px 5px green\">Bolt</p></html>");

        lblFelhasznaloPenz.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblFelhasznaloPenz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFelhasznaloPenz.setText("<html> <p style=\"color:green;\">x $</p> </html>");
        lblFelhasznaloPenz.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 0), 3));

        lblAzonFelhasznalo.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        lblAzonFelhasznalo.setText("id: ");

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

        btnF2vetel.setBackground(new java.awt.Color(51, 204, 0));
        btnF2vetel.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btnF2vetel.setText("Vásárlás");
        btnF2vetel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnF2vetel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF2vetelActionPerformed(evt);
            }
        });

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
                        .addGap(55, 55, 55)
                        .addComponent(lblFegyver2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKep2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlKep2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblElemKep2)
                    .addComponent(btnF2vetel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnF2vetel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlTolteny2.setBackground(new java.awt.Color(169, 169, 169));

        lblToltenyF2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblToltenyF2.setText("Töltény");

        sldToltenyF2.setMaximum(9999);
        sldToltenyF2.setMinimum(1);
        sldToltenyF2.setValue(1);
        sldToltenyF2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldToltenyF2StateChanged(evt);
            }
        });

        spnrToltenyF2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 9999, 1));
        spnrToltenyF2.setName(""); // NOI18N
        spnrToltenyF2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnrToltenyF2StateChanged(evt);
            }
        });

        btnF2Toltvetel.setBackground(new java.awt.Color(51, 204, 0));
        btnF2Toltvetel.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btnF2Toltvetel.setText("Vásárlás");
        btnF2Toltvetel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnF2Toltvetel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF2ToltvetelActionPerformed(evt);
            }
        });

        lblF2ToltenyAr.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblF2ToltenyAr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblF2ToltenyAr.setText("5$/db");

        lblF2ToltenyMennyiseg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblF2ToltenyMennyiseg.setText("0/9999");
        lblF2ToltenyMennyiseg.setAlignmentX(0.5F);
        lblF2ToltenyMennyiseg.setAlignmentY(0.0F);
        lblF2ToltenyMennyiseg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlTolteny2Layout = new javax.swing.GroupLayout(pnlTolteny2);
        pnlTolteny2.setLayout(pnlTolteny2Layout);
        pnlTolteny2Layout.setHorizontalGroup(
            pnlTolteny2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTolteny2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlTolteny2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnF2Toltvetel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTolteny2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblToltenyF2))
                    .addComponent(sldToltenyF2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTolteny2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(pnlTolteny2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblF2ToltenyMennyiseg, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlTolteny2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(lblF2ToltenyAr))
                            .addComponent(spnrToltenyF2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        pnlTolteny2Layout.setVerticalGroup(
            pnlTolteny2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTolteny2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblToltenyF2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sldToltenyF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnrToltenyF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblF2ToltenyAr)
                .addGap(6, 6, 6)
                .addComponent(lblF2ToltenyMennyiseg)
                .addGap(6, 6, 6)
                .addComponent(btnF2Toltvetel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlTolteny1.setBackground(new java.awt.Color(169, 169, 169));

        spnrToltenyF1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 9999, 1));
        spnrToltenyF1.setName(""); // NOI18N
        spnrToltenyF1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnrToltenyF1StateChanged(evt);
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

        btnF1Toltvetel.setBackground(new java.awt.Color(51, 204, 0));
        btnF1Toltvetel.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btnF1Toltvetel.setText("Vásárlás");
        btnF1Toltvetel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnF1Toltvetel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF1ToltvetelActionPerformed(evt);
            }
        });

        lblF1ToltenyMennyiseg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblF1ToltenyMennyiseg.setText("0/9999");
        lblF1ToltenyMennyiseg.setAlignmentX(0.5F);
        lblF1ToltenyMennyiseg.setAlignmentY(0.0F);
        lblF1ToltenyMennyiseg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblF1ToltenyAr.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblF1ToltenyAr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblF1ToltenyAr.setText("2$/db");

        javax.swing.GroupLayout pnlTolteny1Layout = new javax.swing.GroupLayout(pnlTolteny1);
        pnlTolteny1.setLayout(pnlTolteny1Layout);
        pnlTolteny1Layout.setHorizontalGroup(
            pnlTolteny1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sldToltenyF1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnF1Toltvetel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(pnlTolteny1Layout.createSequentialGroup()
                .addGroup(pnlTolteny1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTolteny1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblToltenyF1))
                    .addGroup(pnlTolteny1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(pnlTolteny1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblF1ToltenyMennyiseg, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnrToltenyF1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlTolteny1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(lblF1ToltenyAr)))
                .addContainerGap())
        );
        pnlTolteny1Layout.setVerticalGroup(
            pnlTolteny1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTolteny1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblToltenyF1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sldToltenyF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnrToltenyF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblF1ToltenyAr)
                .addGap(6, 6, 6)
                .addComponent(lblF1ToltenyMennyiseg)
                .addGap(6, 6, 6)
                .addComponent(btnF1Toltvetel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlKep3.setBackground(new java.awt.Color(169, 169, 169));
        pnlKep3.setMaximumSize(new java.awt.Dimension(300, 300));
        pnlKep3.setMinimumSize(new java.awt.Dimension(150, 150));
        pnlKep3.setPreferredSize(new java.awt.Dimension(160, 160));

        lblAr3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblAr3.setText("Dragunov");

        lblFegyver3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblFegyver3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFegyver3.setText("3500$");

        lblElemKep3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jatekbolt/dragunov.png"))); // NOI18N

        btnF3vetel.setBackground(new java.awt.Color(51, 204, 0));
        btnF3vetel.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btnF3vetel.setText("Vásárlás");
        btnF3vetel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnF3vetel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF3vetelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlKep3Layout = new javax.swing.GroupLayout(pnlKep3);
        pnlKep3.setLayout(pnlKep3Layout);
        pnlKep3Layout.setHorizontalGroup(
            pnlKep3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKep3Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblFegyver3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKep3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlKep3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblElemKep3)
                    .addComponent(btnF3vetel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKep3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAr3)
                .addGap(43, 43, 43))
        );
        pnlKep3Layout.setVerticalGroup(
            pnlKep3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKep3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAr3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblElemKep3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFegyver3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnF3vetel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlTolteny4.setBackground(new java.awt.Color(169, 169, 169));

        lblToltenyF4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblToltenyF4.setText("Töltény");

        sldToltenyF4.setMaximum(9999);
        sldToltenyF4.setMinimum(1);
        sldToltenyF4.setValue(1);
        sldToltenyF4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldToltenyF4StateChanged(evt);
            }
        });

        spnrToltenyF4.setModel(new javax.swing.SpinnerNumberModel(1, 1, 9999, 1));
        spnrToltenyF4.setName(""); // NOI18N
        spnrToltenyF4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnrToltenyF4StateChanged(evt);
            }
        });

        btnF4Toltvetel.setBackground(new java.awt.Color(51, 204, 0));
        btnF4Toltvetel.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btnF4Toltvetel.setText("Vásárlás");
        btnF4Toltvetel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnF4Toltvetel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF4ToltvetelActionPerformed(evt);
            }
        });

        lblF4ToltenyAr.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblF4ToltenyAr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblF4ToltenyAr.setText("100$/db");

        lblF4ToltenyMennyiseg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblF4ToltenyMennyiseg.setText("0/9999");
        lblF4ToltenyMennyiseg.setAlignmentX(0.5F);
        lblF4ToltenyMennyiseg.setAlignmentY(0.0F);
        lblF4ToltenyMennyiseg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlTolteny4Layout = new javax.swing.GroupLayout(pnlTolteny4);
        pnlTolteny4.setLayout(pnlTolteny4Layout);
        pnlTolteny4Layout.setHorizontalGroup(
            pnlTolteny4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTolteny4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlTolteny4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnF4Toltvetel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTolteny4Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblToltenyF4))
                    .addComponent(sldToltenyF4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTolteny4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(pnlTolteny4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblF4ToltenyMennyiseg, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnrToltenyF4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(pnlTolteny4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblF4ToltenyAr)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTolteny4Layout.setVerticalGroup(
            pnlTolteny4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTolteny4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblToltenyF4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sldToltenyF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnrToltenyF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblF4ToltenyAr)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblF4ToltenyMennyiseg)
                .addGap(6, 6, 6)
                .addComponent(btnF4Toltvetel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlKep4.setBackground(new java.awt.Color(169, 169, 169));
        pnlKep4.setMaximumSize(new java.awt.Dimension(300, 300));
        pnlKep4.setMinimumSize(new java.awt.Dimension(150, 150));
        pnlKep4.setPreferredSize(new java.awt.Dimension(160, 160));

        lblAr4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblAr4.setText("RPG-7");

        lblFegyver4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblFegyver4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFegyver4.setText("5000$");

        lblElemKep4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jatekbolt/rpg7.png"))); // NOI18N

        btnF4vetel.setBackground(new java.awt.Color(51, 204, 0));
        btnF4vetel.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btnF4vetel.setText("Vásárlás");
        btnF4vetel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnF4vetel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF4vetelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlKep4Layout = new javax.swing.GroupLayout(pnlKep4);
        pnlKep4.setLayout(pnlKep4Layout);
        pnlKep4Layout.setHorizontalGroup(
            pnlKep4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKep4Layout.createSequentialGroup()
                .addGroup(pnlKep4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlKep4Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lblAr4))
                    .addGroup(pnlKep4Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(lblFegyver4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKep4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlKep4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblElemKep4)
                    .addComponent(btnF4vetel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        pnlKep4Layout.setVerticalGroup(
            pnlKep4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKep4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAr4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblElemKep4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFegyver4)
                .addGap(6, 6, 6)
                .addComponent(btnF4vetel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlTolteny3.setBackground(new java.awt.Color(169, 169, 169));

        lblToltenyF3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblToltenyF3.setText("Töltény");

        sldToltenyF3.setMaximum(9999);
        sldToltenyF3.setMinimum(1);
        sldToltenyF3.setValue(1);
        sldToltenyF3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldToltenyF3StateChanged(evt);
            }
        });

        spnrToltenyF3.setModel(new javax.swing.SpinnerNumberModel(1, 1, 9999, 1));
        spnrToltenyF3.setName(""); // NOI18N
        spnrToltenyF3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnrToltenyF3StateChanged(evt);
            }
        });

        btnF3Toltvetel.setBackground(new java.awt.Color(51, 204, 0));
        btnF3Toltvetel.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        btnF3Toltvetel.setText("Vásárlás");
        btnF3Toltvetel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblF3ToltenyAr.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        lblF3ToltenyAr.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblF3ToltenyAr.setText("10$/db");

        lblF3ToltenyMennyiseg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblF3ToltenyMennyiseg.setText("0/9999");
        lblF3ToltenyMennyiseg.setAlignmentX(0.5F);
        lblF3ToltenyMennyiseg.setAlignmentY(0.0F);
        lblF3ToltenyMennyiseg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlTolteny3Layout = new javax.swing.GroupLayout(pnlTolteny3);
        pnlTolteny3.setLayout(pnlTolteny3Layout);
        pnlTolteny3Layout.setHorizontalGroup(
            pnlTolteny3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTolteny3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlTolteny3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnF3Toltvetel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTolteny3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblToltenyF3))
                    .addComponent(sldToltenyF3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlTolteny3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(pnlTolteny3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblF3ToltenyMennyiseg, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlTolteny3Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(lblF3ToltenyAr))
                            .addComponent(spnrToltenyF3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        pnlTolteny3Layout.setVerticalGroup(
            pnlTolteny3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTolteny3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblToltenyF3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sldToltenyF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnrToltenyF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblF3ToltenyAr)
                .addGap(6, 6, 6)
                .addComponent(lblF3ToltenyMennyiseg)
                .addGap(6, 6, 6)
                .addComponent(btnF3Toltvetel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(lblBolt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVissza, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199)
                        .addComponent(lblFelhasznaloPenz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAzonFelhasznalo)
                        .addGap(51, 51, 51))))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlKep1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlTolteny1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlKep2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlTolteny2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTolteny3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlKep3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlKep4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlTolteny4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblBolt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlKep4, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(pnlKep2, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(pnlKep1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addComponent(pnlKep3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlTolteny1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlTolteny2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlTolteny4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlTolteny3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVissza, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFelhasznaloPenz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAzonFelhasznalo))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        /*this.setLocationRelativeTo(null);   // Középre igazítja az ablakot
        getContentPane().setBackground(new java.awt.Color(216, 216, 216));
        keret = (int)(Math.random() * (15000 - 7500)) + 7500;
        /* Random összeg 7500 és 15000 között, a játékos kezdetleges keretét határozza meg */
        /*lblFelhasznaloPenz.setText(keret + " $");
        
        azonositoKeszito();*/
        
        
    }//GEN-LAST:event_formWindowOpened


    private void btnF1vetelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF1vetelActionPerformed
        fegyverVetel(100, f1megvett, btnF1vetel);
        
    }//GEN-LAST:event_btnF1vetelActionPerformed

    private void sldToltenyF1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldToltenyF1StateChanged
        spnrToltenyF1.setValue(sldToltenyF1.getValue());
    }//GEN-LAST:event_sldToltenyF1StateChanged

    private void spnrToltenyF1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnrToltenyF1StateChanged
        sldToltenyF1.setValue((int) spnrToltenyF1.getValue());
    }//GEN-LAST:event_spnrToltenyF1StateChanged

    private void spnrToltenyF2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnrToltenyF2StateChanged
        sldToltenyF2.setValue((int) spnrToltenyF2.getValue());
    }//GEN-LAST:event_spnrToltenyF2StateChanged

    private void btnF2vetelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF2vetelActionPerformed
        fegyverVetel(2200, f2megvett, btnF2vetel);
    }//GEN-LAST:event_btnF2vetelActionPerformed

    private void sldToltenyF2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldToltenyF2StateChanged
        spnrToltenyF2.setValue(sldToltenyF2.getValue());
    }//GEN-LAST:event_sldToltenyF2StateChanged

    private void btnF1ToltvetelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF1ToltvetelActionPerformed
        toltenySzamol(lblF1ToltenyAr, spnrToltenyF1, lblF1ToltenyMennyiseg);
        
    }//GEN-LAST:event_btnF1ToltvetelActionPerformed

    private void btnF2ToltvetelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF2ToltvetelActionPerformed
        toltenySzamol(lblF2ToltenyAr, spnrToltenyF2, lblF2ToltenyMennyiseg);
    }//GEN-LAST:event_btnF2ToltvetelActionPerformed

    private void btnVisszaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisszaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnVisszaActionPerformed

    private void sldToltenyF4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldToltenyF4StateChanged
        spnrToltenyF4.setValue(sldToltenyF4.getValue());
    }//GEN-LAST:event_sldToltenyF4StateChanged

    private void btnF4vetelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF4vetelActionPerformed
        fegyverVetel(5000, f4megvett, btnF4vetel);
    }//GEN-LAST:event_btnF4vetelActionPerformed

    private void sldToltenyF3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldToltenyF3StateChanged
        spnrToltenyF3.setValue(sldToltenyF3.getValue());
    }//GEN-LAST:event_sldToltenyF3StateChanged

    private void btnF3vetelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF3vetelActionPerformed
        toltenySzamol(lblF3ToltenyAr, spnrToltenyF3, lblF3ToltenyMennyiseg);
    }//GEN-LAST:event_btnF3vetelActionPerformed

    private void spnrToltenyF3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnrToltenyF3StateChanged
        sldToltenyF3.setValue((int) spnrToltenyF3.getValue());
    }//GEN-LAST:event_spnrToltenyF3StateChanged

    private void spnrToltenyF4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnrToltenyF4StateChanged
        sldToltenyF4.setValue((int) spnrToltenyF4.getValue());
    }//GEN-LAST:event_spnrToltenyF4StateChanged

    private void btnF4ToltvetelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF4ToltvetelActionPerformed
        toltenySzamol(lblF4ToltenyAr, spnrToltenyF4, lblF4ToltenyMennyiseg);
    }//GEN-LAST:event_btnF4ToltvetelActionPerformed

    

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
    private void azonositoKeszito() {
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
    }

    private void fegyverVetel(int fegyverOsszeg, boolean aktualisFegyver, JButton kivantFegyver) throws HeadlessException { 
        
        if(keret > fegyverOsszeg){
            keret -= fegyverOsszeg;
            aktualisFegyver = true; //aktuális fegyver
            penzFrissit();
            gombKikapcs(kivantFegyver);
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
    
    private void toltenySzamol(JLabel toltenyAr, JSpinner melyikFegyverToltenye, JLabel vasaroltTolt) {        
        jelenToltenyMegszerzese(vasaroltTolt);

        jelenToltenyArLekerdezese(toltenyAr);   
        
        toltenyNemTobbXSzamol(melyikFegyverToltenye);
        
        toltenyhezKeretNagyobbNulla(toltenySeged);
        
        penzFrissit();      
        
        toltenyDbText(vasaroltTolt);        
    }

    private void toltenyDbText(JLabel vasaroltTolt) {
        vasaroltTolt.setText(toltenySeged + "/9999");
    }

    private void toltenyNemTobbXSzamol(JSpinner melyikFegyverToltenye) throws HeadlessException {
        tobb = false;
        if(jelenlegiToltenyMennyiseg + (int) melyikFegyverToltenye.getValue() <= 9999 && keret - (toltenySeged*aktualisToltenyAr) > 0){
            toltenySeged += (int) melyikFegyverToltenye.getValue();
            tobb = true;
        }
        else JOptionPane.showMessageDialog(rootPane, "Nem lehet 9999-nél több töltényed egy fegyverhez!", "Figyelmeztetés", 1);
        
        if(tobb){
            keret -= toltenySeged*aktualisToltenyAr;
        }
        
    }
    
    private void jelenToltenyMegszerzese(JLabel vasaroltTolt) throws NumberFormatException {
        String jelenlegiTolteny = vasaroltTolt.getText();
        String jelenlegiToltenySeged = jelenlegiTolteny.replace("/9999", "");
        jelenlegiToltenyMennyiseg = Integer.parseInt(jelenlegiToltenySeged);
    }
    
    private void jelenToltenyArLekerdezese(JLabel aktToltAr) throws NumberFormatException {
        String toltAr = aktToltAr.getText();
        String segedKiir = toltAr.replace("$/db", "");
        aktualisToltenyAr = Integer.parseInt(segedKiir);
    }
    
    private void toltenyhezKeretNagyobbNulla(int valtozoOsszeg){
        /*if(keret + valtozoOsszeg < 0){
            JOptionPane.showMessageDialog(rootPane, "Nincs elég pénzed.");
            //System.exit(0);
            /*EZT NEM TUDOM MÉG LEKEZELNI RENDESEN, DE EGY ACTIONT TENNÉK IDE AMI ÁTUGORJA ADOTT FÜGGVÉNYBEN A TOVÁBBIAKAT.*/
        //}
            
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnF1Toltvetel;
    private javax.swing.JButton btnF1vetel;
    private javax.swing.JButton btnF2Toltvetel;
    private javax.swing.JButton btnF2vetel;
    private javax.swing.JButton btnF3Toltvetel;
    private javax.swing.JButton btnF3vetel;
    private javax.swing.JButton btnF4Toltvetel;
    private javax.swing.JButton btnF4vetel;
    private javax.swing.JButton btnVissza;
    private javax.swing.JLabel lblAr1;
    private javax.swing.JLabel lblAr2;
    private javax.swing.JLabel lblAr3;
    private javax.swing.JLabel lblAr4;
    private javax.swing.JLabel lblAzonFelhasznalo;
    private javax.swing.JLabel lblBolt;
    private javax.swing.JLabel lblElemKep1;
    private javax.swing.JLabel lblElemKep2;
    private javax.swing.JLabel lblElemKep3;
    private javax.swing.JLabel lblElemKep4;
    private javax.swing.JLabel lblF1ToltenyAr;
    private javax.swing.JLabel lblF1ToltenyMennyiseg;
    private javax.swing.JLabel lblF2ToltenyAr;
    private javax.swing.JLabel lblF2ToltenyMennyiseg;
    private javax.swing.JLabel lblF3ToltenyAr;
    private javax.swing.JLabel lblF3ToltenyMennyiseg;
    private javax.swing.JLabel lblF4ToltenyAr;
    private javax.swing.JLabel lblF4ToltenyMennyiseg;
    private javax.swing.JLabel lblFegyver1;
    private javax.swing.JLabel lblFegyver2;
    private javax.swing.JLabel lblFegyver3;
    private javax.swing.JLabel lblFegyver4;
    private javax.swing.JLabel lblFelhasznaloPenz;
    private javax.swing.JLabel lblToltenyF1;
    private javax.swing.JLabel lblToltenyF2;
    private javax.swing.JLabel lblToltenyF3;
    private javax.swing.JLabel lblToltenyF4;
    private javax.swing.JPanel pnlKep1;
    private javax.swing.JPanel pnlKep2;
    private javax.swing.JPanel pnlKep3;
    private javax.swing.JPanel pnlKep4;
    private javax.swing.JPanel pnlTolteny1;
    private javax.swing.JPanel pnlTolteny2;
    private javax.swing.JPanel pnlTolteny3;
    private javax.swing.JPanel pnlTolteny4;
    private javax.swing.JSlider sldToltenyF1;
    private javax.swing.JSlider sldToltenyF2;
    private javax.swing.JSlider sldToltenyF3;
    private javax.swing.JSlider sldToltenyF4;
    private javax.swing.JSpinner spnrToltenyF1;
    private javax.swing.JSpinner spnrToltenyF2;
    private javax.swing.JSpinner spnrToltenyF3;
    private javax.swing.JSpinner spnrToltenyF4;
    // End of variables declaration//GEN-END:variables

    
}
