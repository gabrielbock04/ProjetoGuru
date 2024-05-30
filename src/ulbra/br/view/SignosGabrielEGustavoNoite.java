/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulbra.br.view;

import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno.saolucas
 */
public class SignosGabrielEGustavoNoite extends javax.swing.JFrame {

    /**
     * Creates new form SignosGabrielEGustavoNoite
     */
    public SignosGabrielEGustavoNoite() {
        initComponents();
    }
    
    public String calcularSigno(int dia, int mes, int ano) {
        
        String signo = "";
        if (dia >= 21 && dia <= 31 && mes == 3 || dia >= 1 && dia <= 20 && mes == 4) {
            
            signo = "Aries";
        }
        if (dia >= 21 && dia <= 30 && mes == 4 || dia >= 1 && dia <= 20 && mes == 5) {
            
            signo = "Touro";
        }
        if (dia >= 21 && dia <= 31 && mes == 5 || dia >= 1 && dia <= 20 && mes == 6) {
            
            signo = "Gêmeos";
        }
        if (dia >= 21 && dia <= 30 && mes == 6 || dia >= 1 && dia <= 21 && mes == 7) {
            
            signo = "Câncer";
        }
        if (dia >= 22 && dia <= 31 && mes == 7 || dia >= 1 && dia <= 22 && mes == 8) {
            
            signo = "Leão";
        }
        if (dia >= 23 && dia <= 30 && mes == 8 || dia >= 1 && dia <= 22 && mes == 9) {
            
            signo = "Virgem";
        }
        if (dia >= 23 && dia <= 31 && mes == 9 || dia >= 1 && dia <= 22 && mes == 10) {
            
            signo = "Libra";
        }
        if (dia >= 23 && dia <= 30 && mes == 10 || dia >= 1 && dia <= 21 && mes == 11) {
            
            signo = "Escorpião";
        }
        if (dia >= 22 && dia <= 31 && mes == 11 || dia >= 1 && dia <= 21 && mes == 12) {
            
            signo = "Sagitário";
        }
        if (dia >= 22 && dia <= 30 && mes == 12 || dia >= 1 && dia <= 20 && mes == 1) {
            
            signo = "Capricórnio";
        }
        if (dia >= 21 && dia <= 31 && mes == 1 || dia >= 1 && dia <= 19 && mes == 2) {
            
            signo = "Aquário";
        }
        if (dia >= 20 && dia <= 30 && mes == 2 || dia >= 1 && dia <= 20 && mes == 3) {
            
            signo = "Peixes";
        }
        return signo;
    }

    public String fazerTratamento(String tratamento1) {
        String tratamento = "";
        if (rbFem.isSelected()) {
            tratamento = "Sra";
        } else {
            tratamento = "Sr";
        }
        return tratamento;
        
    }
    
    public double calcularIdade(double dia, double mes,double ano){
        double idade=0;
        dia=Double.parseDouble(txtDia.getText());
        mes=Double.parseDouble(txtMes.getText());
        ano=Double.parseDouble(txtAno.getText());
        idade=(2024-ano);
        return idade;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lbResumo1 = new javax.swing.JLabel();
        lbResumo = new javax.swing.JLabel();
        lbLimpar = new javax.swing.JButton();
        lbConsultar = new javax.swing.JButton();
        lbMes = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        txtDia = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        lbSexo = new javax.swing.JLabel();
        lbDia = new javax.swing.JLabel();
        lbAno = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        rbFem = new javax.swing.JRadioButton();
        rbMasc = new javax.swing.JRadioButton();
        lbNome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbResumo1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbResumo1.setForeground(new java.awt.Color(255, 255, 255));
        lbResumo1.setText("Resumo");
        getContentPane().add(lbResumo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 330, 30));

        lbResumo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbResumo.setForeground(new java.awt.Color(255, 255, 255));
        lbResumo.setText("Resumo");
        getContentPane().add(lbResumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 330, 30));

        lbLimpar.setText("Limpar");
        lbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbLimparActionPerformed(evt);
            }
        });
        getContentPane().add(lbLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, -1, -1));

        lbConsultar.setText("Consultar");
        lbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(lbConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));

        lbMes.setForeground(new java.awt.Color(255, 255, 255));
        lbMes.setText("Mês");
        getContentPane().add(lbMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));

        txtAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnoActionPerformed(evt);
            }
        });
        getContentPane().add(txtAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 70, -1));

        txtDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaActionPerformed(evt);
            }
        });
        getContentPane().add(txtDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 70, -1));

        txtMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMesActionPerformed(evt);
            }
        });
        getContentPane().add(txtMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 70, -1));

        lbSexo.setForeground(new java.awt.Color(255, 255, 255));
        lbSexo.setText("Sexo");
        getContentPane().add(lbSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        lbDia.setForeground(new java.awt.Color(255, 255, 255));
        lbDia.setText("Dia");
        getContentPane().add(lbDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        lbAno.setForeground(new java.awt.Color(255, 255, 255));
        lbAno.setText("Ano");
        getContentPane().add(lbAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        jLabel2.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("GURU ON-LINE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 260, 40));

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 240, -1));

        buttonGroup1.add(rbFem);
        rbFem.setForeground(new java.awt.Color(255, 255, 255));
        rbFem.setText("Feminino");
        getContentPane().add(rbFem, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, -1, -1));

        buttonGroup1.add(rbMasc);
        rbMasc.setForeground(new java.awt.Color(255, 255, 255));
        rbMasc.setSelected(true);
        rbMasc.setText("Masculino");
        getContentPane().add(rbMasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        lbNome.setForeground(new java.awt.Color(255, 255, 255));
        lbNome.setText("Nome:");
        getContentPane().add(lbNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 40, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ulbra/br/view/Logo signos.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbLimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbLimparActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoActionPerformed

    private void txtMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMesActionPerformed

    private void txtDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaActionPerformed

    private void lbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbConsultarActionPerformed
        String nome, signo;
        int dia, mes, ano;
        dia = Integer.parseInt(txtDia.getText());
        mes = Integer.parseInt(txtMes.getText());
        ano = Integer.parseInt(txtAno.getText());
        nome = txtNome.getText();
        signo = calcularSigno(dia, mes, ano);
        lbResumo.setText(fazerTratamento(nome)+" "+nome+" você é do signo de "+signo);
        lbResumo1.setText("Você tem "+calcularIdade(dia, mes, ano)+" anos de idade");
        lbLimpar.setText(signo);
    }//GEN-LAST:event_lbConsultarActionPerformed

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
            java.util.logging.Logger.getLogger(SignosGabrielEGustavoNoite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignosGabrielEGustavoNoite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignosGabrielEGustavoNoite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignosGabrielEGustavoNoite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignosGabrielEGustavoNoite().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAno;
    private javax.swing.JButton lbConsultar;
    private javax.swing.JLabel lbDia;
    private javax.swing.JButton lbLimpar;
    private javax.swing.JLabel lbMes;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbResumo;
    private javax.swing.JLabel lbResumo1;
    private javax.swing.JLabel lbSexo;
    private javax.swing.JRadioButton rbFem;
    private javax.swing.JRadioButton rbMasc;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
