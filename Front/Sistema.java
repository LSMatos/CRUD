/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Front;

import javax.swing.JOptionPane;

/**
 *
 * @author Anderson
 */
public class Sistema extends javax.swing.JFrame {

    /**
     * Creates new form Sistema
     */
    public Sistema() {
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

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        Desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        m_arquivo = new javax.swing.JMenu();
        sm_deslogar = new javax.swing.JMenuItem();
        sm_sair = new javax.swing.JMenuItem();
        m_cadastros = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        CadastrarAluno = new javax.swing.JMenuItem();
        ExcluirAluno = new javax.swing.JMenuItem();
        sm_atualizar = new javax.swing.JMenuItem();
        m_sobre = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Academia Runway");

        m_arquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/Imagens/usuario.png"))); // NOI18N
        m_arquivo.setText("Arquivo");

        sm_deslogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/Imagens/cadeado.png"))); // NOI18N
        sm_deslogar.setText("Deslogar");
        sm_deslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sm_deslogarActionPerformed(evt);
            }
        });
        m_arquivo.add(sm_deslogar);

        sm_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/Imagens/sair.png"))); // NOI18N
        sm_sair.setText("Sair");
        sm_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sm_sairActionPerformed(evt);
            }
        });
        m_arquivo.add(sm_sair);

        jMenuBar1.add(m_arquivo);

        m_cadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/Imagens/adicionar.png"))); // NOI18N
        m_cadastros.setText("Cadastros");
        m_cadastros.add(jSeparator1);

        CadastrarAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/Imagens/adicionar.png"))); // NOI18N
        CadastrarAluno.setText("Cadastrar Alunos");
        CadastrarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarAlunoActionPerformed(evt);
            }
        });
        m_cadastros.add(CadastrarAluno);

        ExcluirAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/Imagens/deletar.png"))); // NOI18N
        ExcluirAluno.setText("Excluir Aluno");
        ExcluirAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirAlunoActionPerformed(evt);
            }
        });
        m_cadastros.add(ExcluirAluno);

        sm_atualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/Imagens/usuario.png"))); // NOI18N
        sm_atualizar.setText("Atualizar Alunos");
        sm_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sm_atualizarActionPerformed(evt);
            }
        });
        m_cadastros.add(sm_atualizar);

        jMenuBar1.add(m_cadastros);

        m_sobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Visao/Imagens/importante.png"))); // NOI18N
        m_sobre.setText("Sobre");
        m_sobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_sobreMouseClicked(evt);
            }
        });
        jMenuBar1.add(m_sobre);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sm_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sm_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sm_sairActionPerformed

    private void sm_deslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sm_deslogarActionPerformed
        Inicial i = new Inicial();
        i.setVisible(true);
        i.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_sm_deslogarActionPerformed

    private void m_sobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_sobreMouseClicked
        JOptionPane.showMessageDialog(null,"Desenvolvimento: Anderson Coimbra.","Aviso",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_m_sobreMouseClicked

    private void CadastrarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarAlunoActionPerformed
        CadastroDeAlunos c =new CadastroDeAlunos();
        c.setVisible(true);
        c.setLocation(300, 200);
        Desktop.add(c);
    }//GEN-LAST:event_CadastrarAlunoActionPerformed

    private void ExcluirAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirAlunoActionPerformed
        ExcluirAluno ea =new ExcluirAluno();
        ea.setVisible(true);
        ea.setLocation(300, 200);
        Desktop.add(ea);
    }//GEN-LAST:event_ExcluirAlunoActionPerformed

    private void sm_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sm_atualizarActionPerformed
        AtualizarAlunos a =new AtualizarAlunos();
        a.setVisible(true);
        a.setLocation(300, 200);
        Desktop.add(a);
    }//GEN-LAST:event_sm_atualizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadastrarAluno;
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuItem ExcluirAluno;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu m_arquivo;
    private javax.swing.JMenu m_cadastros;
    private javax.swing.JMenu m_sobre;
    private javax.swing.JMenuItem sm_atualizar;
    private javax.swing.JMenuItem sm_deslogar;
    private javax.swing.JMenuItem sm_sair;
    // End of variables declaration//GEN-END:variables
}
