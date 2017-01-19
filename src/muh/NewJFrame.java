/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package muh;

public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regeneDDDrated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        hacim = new javax.swing.JButton();
        kutle = new javax.swing.JButton();
        basinc = new javax.swing.JButton();
        enerji = new javax.swing.JButton();
        bernoulli = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KİMYA MÜHENDİSLİĞİNDE İDEAL GAZ HESAPLAMALRI");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setToolTipText("");
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 408));
        jPanel1.setLayout(null);

        hacim.setBackground(new java.awt.Color(70, 151, 70));
        hacim.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        hacim.setText("Boyle-Mariotte Yasası");
        hacim.setActionCommand("Boyle Yasası");
        hacim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hacimActionPerformed(evt);
            }
        });
        jPanel1.add(hacim);
        hacim.setBounds(170, 130, 163, 40);

        kutle.setBackground(new java.awt.Color(104, 201, 104));
        kutle.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        kutle.setText("Avagadro Yasası");
        kutle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kutleActionPerformed(evt);
            }
        });
        jPanel1.add(kutle);
        kutle.setBounds(20, 180, 140, 37);

        basinc.setBackground(new java.awt.Color(152, 203, 118));
        basinc.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        basinc.setText("Amagat Yasası");
        basinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basincActionPerformed(evt);
            }
        });
        jPanel1.add(basinc);
        basinc.setBounds(180, 230, 120, 36);

        enerji.setBackground(new java.awt.Color(31, 95, 52));
        enerji.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        enerji.setText("İdeal Gaz Yasası");
        enerji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enerjiActionPerformed(evt);
            }
        });
        jPanel1.add(enerji);
        enerji.setBounds(20, 280, 140, 37);

        bernoulli.setBackground(new java.awt.Color(9, 164, 48));
        bernoulli.setText("İdeal ");
        bernoulli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bernoulliActionPerformed(evt);
            }
        });
        jPanel1.add(bernoulli);
        bernoulli.setBounds(150, 340, 170, 37);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muh/images/thEumbnail.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 10, 320, 110);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muh/images/yeni.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 700, 408);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bernoulliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bernoulliActionPerformed
        bernoulli git = new bernoulli();
        git.show();
    }//GEN-LAST:event_bernoulliActionPerformed

    private void enerjiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enerjiActionPerformed
        idealGazYasasi git = new idealGazYasasi();
        git.show();
    }//GEN-LAST:event_enerjiActionPerformed

    private void basincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basincActionPerformed
        amagatYasasi git = new amagatYasasi();
        git.show();
    }//GEN-LAST:event_basincActionPerformed

    private void kutleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kutleActionPerformed
        avagadroYasasi git = new avagadroYasasi();
        git.show();

    }//GEN-LAST:event_kutleActionPerformed

    private void hacimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hacimActionPerformed

        boyleYasasi git = new boyleYasasi();
        git.show();

    }//GEN-LAST:event_hacimActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton basinc;
    private javax.swing.JButton bernoulli;
    private javax.swing.JButton enerji;
    private javax.swing.JButton hacim;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kutle;
    // End of variables declaration//GEN-END:variables
}
