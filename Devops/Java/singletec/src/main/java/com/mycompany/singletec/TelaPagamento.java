/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.singletec;

/**
 *
 * @author bella
 */
public class TelaPagamento extends javax.swing.JFrame {

    /**
     * Creates new form telaPagamento
     */
    public TelaPagamento() {
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

        jCheckBox1 = new javax.swing.JCheckBox();
        jButton8 = new javax.swing.JButton();
        BtnReembolso1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        jButton8.setBackground(new java.awt.Color(0, 153, 255));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("ESTUDANTE");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(764, 444));
        getContentPane().setLayout(null);

        BtnReembolso1.setBackground(new java.awt.Color(102, 102, 102));
        BtnReembolso1.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        BtnReembolso1.setForeground(new java.awt.Color(255, 255, 255));
        BtnReembolso1.setText("CANCELA");
        BtnReembolso1.setAutoscrolls(true);
        getContentPane().add(BtnReembolso1);
        BtnReembolso1.setBounds(30, 320, 170, 51);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\bella\\OneDrive\\Área de Trabalho\\Bilhete-unico\\Devops\\Java\\singletec\\src\\main\\java\\com\\mycompany\\singletec\\myimageapp\\pagDeb.PNG")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(370, 90, 180, 130);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel2.setText("Qual a forma de pagamento?");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 20, 330, 40);

        jButton6.setBackground(new java.awt.Color(255, 204, 0));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("TEMPORÁRIA");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(370, 220, 180, 50);

        jButton9.setBackground(new java.awt.Color(0, 153, 255));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("ESTUDANTE");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(120, 220, 190, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\bella\\OneDrive\\Área de Trabalho\\Bilhete-unico\\Devops\\Java\\singletec\\src\\main\\java\\com\\mycompany\\singletec\\myimageapp\\pagDin.PNG")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(120, 90, 190, 130);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setText("Comum");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(520, 330, 50, 20);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\bella\\OneDrive\\Área de Trabalho\\Bilhete-unico\\Devops\\Java\\singletec\\src\\main\\java\\com\\mycompany\\singletec\\myimageapp\\pessoasicon.PNG")); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(380, 310, 120, 70);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("Recarga Selecionada");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(250, 330, 130, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnReembolso1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
