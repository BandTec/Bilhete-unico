/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.singletec;

/**
 *
 * @author Miguel Moreira
 */
public class TelaFormaDePagamento extends javax.swing.JFrame {

    /**
     * Creates new form TelaFormaDePagamento
     */
    public TelaFormaDePagamento() {
        initComponents();
        setLocationRelativeTo(null);
         lblFrase.setText("<html><font color=red> NOVO LIMITE </font> DE SALDO PARA CRÉDITO COMUM <font color=red> R$ 43,00 </font> "
                 + "<br> Para cartões sem identificações ou emitidos até 2013" +
                 "<br><font color=red> Combater a fraude para garantir benefícios </font>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblFrase = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Miguel Moreira\\Desktop\\Java\\singletec\\src\\main\\java\\com\\mycompany\\singletec\\myimageapp\\bilhete_unico.jpeg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 279, 174);

        lblFrase.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFrase.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblFrase);
        lblFrase.setBounds(483, 11, 261, 135);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Formas de pagamento:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(320, 190, 220, 22);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Miguel Moreira\\Desktop\\Java\\singletec\\src\\main\\java\\com\\mycompany\\singletec\\myimageapp\\icon_certo.png")); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 240, 158, 105);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Miguel Moreira\\Desktop\\Java\\singletec\\src\\main\\java\\com\\mycompany\\singletec\\myimageapp\\icon_certo.png")); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(500, 240, 167, 105);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Miguel Moreira\\Desktop\\Java\\singletec\\src\\main\\java\\com\\mycompany\\singletec\\myimageapp\\icon_dinheiro.png")); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(100, 330, 190, 200);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Miguel Moreira\\Desktop\\Java\\singletec\\src\\main\\java\\com\\mycompany\\singletec\\myimageapp\\icon_cartão.jpg")); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(480, 330, 190, 200);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaFormaDePagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFormaDePagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFormaDePagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFormaDePagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFormaDePagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFrase;
    // End of variables declaration//GEN-END:variables
}
