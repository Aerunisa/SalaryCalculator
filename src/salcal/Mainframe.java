package salcal;

import java.awt.event.KeyEvent;

public class Mainframe extends RumusAbs {
    
    
    String aa, bb, cc;

    public Mainframe() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BSalary = new javax.swing.JTextField();
        FoodAll = new javax.swing.JTextField();
        TransAll = new javax.swing.JTextField();
        Calculate = new javax.swing.JButton();
        PPh = new javax.swing.JTextField();
        BPJS = new javax.swing.JTextField();
        NSalary = new javax.swing.JTextField();
        Clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jLabel1.setText("Salary Calculator");

        jLabel5.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jLabel5.setText("Income");

        jLabel2.setText("Basic Salary");

        jLabel3.setText("Food Allowance");

        jLabel4.setText("Transport Allowance");

        jLabel7.setText("PPh 21");

        jLabel8.setText("BPJS");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Net Salary");

        BSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalaryActionPerformed(evt);
            }
        });
        BSalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BSalaryKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BSalaryKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BSalaryKeyTyped(evt);
            }
        });

        FoodAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodAllActionPerformed(evt);
            }
        });
        FoodAll.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FoodAllKeyTyped(evt);
            }
        });

        TransAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransAllActionPerformed(evt);
            }
        });
        TransAll.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TransAllKeyTyped(evt);
            }
        });

        Calculate.setText("Calculate");
        Calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculateActionPerformed(evt);
            }
        });
        Calculate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CalculateKeyTyped(evt);
            }
        });

        PPh.setEditable(false);
        PPh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PPhActionPerformed(evt);
            }
        });

        BPJS.setEditable(false);
        BPJS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPJSActionPerformed(evt);
            }
        });

        NSalary.setEditable(false);
        NSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NSalaryActionPerformed(evt);
            }
        });

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addContainerGap(260, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TransAll, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PPh, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FoodAll, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(96, 248, Short.MAX_VALUE))
                            .addComponent(BSalary, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BPJS, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(68, 68, 68)
                                .addComponent(NSalary)))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Calculate)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Clear)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FoodAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TransAll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Calculate)
                .addGap(19, 19, 19)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PPh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BPJS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(NSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(Clear)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        BSalary.setText("");
        FoodAll.setText("");
        TransAll.setText("");
        PPh.setText("");
        BPJS.setText("");
        NSalary.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void CalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculateActionPerformed
        aa = BSalary.getText();
        bb = FoodAll.getText();
        cc = TransAll.getText();
        Apph21();
        Abpjs();
        ANSalary();
    }//GEN-LAST:event_CalculateActionPerformed

    private void BSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalaryActionPerformed
    }//GEN-LAST:event_BSalaryActionPerformed
    private void FoodAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodAllActionPerformed
    }//GEN-LAST:event_FoodAllActionPerformed
    private void TransAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransAllActionPerformed
    }//GEN-LAST:event_TransAllActionPerformed
    private void PPhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PPhActionPerformed
    }//GEN-LAST:event_PPhActionPerformed
    private void BPJSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPJSActionPerformed
    }//GEN-LAST:event_BPJSActionPerformed
    private void NSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NSalaryActionPerformed
    }//GEN-LAST:event_NSalaryActionPerformed
    private void BSalaryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BSalaryKeyPressed
    }//GEN-LAST:event_BSalaryKeyPressed
    private void BSalaryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BSalaryKeyReleased
    }//GEN-LAST:event_BSalaryKeyReleased
    private void CalculateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CalculateKeyTyped
    }//GEN-LAST:event_CalculateKeyTyped

    private void BSalaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BSalaryKeyTyped
        char karakter = evt.getKeyChar();
        if (!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_BSalaryKeyTyped

    private void FoodAllKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FoodAllKeyTyped
        char karakter = evt.getKeyChar();
        if (!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_FoodAllKeyTyped

    private void TransAllKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TransAllKeyTyped
        char karakter = evt.getKeyChar();
        if (!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE)))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_TransAllKeyTyped

    @Override
    public void Apph21(){
        //pph21
        gaji1 = Integer.parseInt(BSalary.getText());//6jt
        tunjangan = (Integer.parseInt(FoodAll.getText())+(Integer.parseInt(TransAll.getText())));//450rb+100rb
        bjabatan = ((gaji1)*5)/100;//biaya jabatan 1bulan
        pengurang = bjabatan+iuran; //gaji5% + iuran 100rb
        
        netto = gaji1 - pengurang;//netto 1 bulan
        pph21 = netto + tunjangan;
        pphtotal = (gaji1+tunjangan)-pph21;
        
        
        String pph21S = Float.toString(pphtotal);
        PPh.setText(String.valueOf(pph21S));
    }
    
    @Override
    public void Abpjs(){
        //bpjs
        bpjs = ((gaji1 + tunjangan)*4)/100;
        
        
        String bpjsS = Float.toString(bpjs);
        BPJS.setText(String.valueOf(bpjsS));
    }
    
    @Override
    public void ANSalary(){
        //netsalary
        total = pphtotal+bpjs;
        total2 = (gaji1+tunjangan) - total;
        
        
        String nettoS = Float.toString(total2);
        NSalary.setText(String.valueOf(nettoS));
    }
    
   
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Mainframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField BPJS;
    public javax.swing.JTextField BSalary;
    public javax.swing.JButton Calculate;
    public javax.swing.JButton Clear;
    public javax.swing.JTextField FoodAll;
    public javax.swing.JTextField NSalary;
    public javax.swing.JTextField PPh;
    public javax.swing.JTextField TransAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}