
/*
 * ProvinciaVisao.java
 *
 * Created on 27/12/2013, 12:24:14
 */


package visao;



import dao.TipoConfirmacaoDao;
import entity.TipoConfirmacao;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.JPAEntntityMannagerFactoryUtil;// o q faz?

/**
 *
 * @author Nécia Caculo
 */
public class TipoConfirmacaoVisao extends javax.swing.JFrame {

    /** Creates new form ProvinciaVisao */
    
   
    private EntityManagerFactory emf = JPAEntntityMannagerFactoryUtil.em;
//    private Encarregado encarregado;
//    private EncarregadoDao  encarregadoDao = new EncarregadoDao(emf);
    private TipoConfirmacao tipoconfirmacao;
    private TipoConfirmacaoDao tipoconfirmacaoDao = new TipoConfirmacaoDao(emf);
    private int cod_unidade = 0, idUser=0;
    
    public TipoConfirmacaoVisao(int idUser) {
        
        initComponents();
        setLocationRelativeTo(null);
        actualizar();
        this.idUser=idUser;
        
           
    
    }

    private void actualizar()
    {
        adicionar_tabela(  tipoconfirmacaoDao.buscaTodasTipoConfirmacaos());
    }
    public void salvar()
    {
        
        
        if(!vazios_campos() )
        {
                if( !tipoconfirmacaoDao.exist_tipoconfirmacao(txtDesignacao.getText() ) )
                {
                        try {
                                    tipoconfirmacao = new TipoConfirmacao();
                                    setDadosUnidade();
                                    tipoconfirmacaoDao.create(tipoconfirmacao);
                                    actualizar();
                                    limpar();
                                    JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!...");   
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Erro ao cadastrar o tipoconfirmacao ", "ERRO", JOptionPane.ERROR_MESSAGE);
                        }

                }else  JOptionPane.showMessageDialog(null, "Esta tipoconfirmacao já existe ", "AVISO", JOptionPane.WARNING_MESSAGE);
        }else JOptionPane.showMessageDialog(null, "Pf digite o tipoconfirmacao ", "AVISO", JOptionPane.WARNING_MESSAGE);
    }
    
    
    
    private boolean vazios_campos()
    {
    
           if(   txtDesignacao.getText().equals("") )
           {
               txtDesignacao.requestFocus();
               JOptionPane.showMessageDialog(null, "Pf Digite o tipoconfirmacao", "AVISO", JOptionPane.WARNING_MESSAGE);
               return true;
           }
//           else if( txtDesignacao.getText().equals("") )
//           {
//               txtAbreviatura.requestFocus();
//               JOptionPane.showMessageDialog(null, "Pf Digite a abreviatura da classe", "Necia", JOptionPane.WARNING_MESSAGE);
//               return true;
//           }
           else return false;
    
    }
    
    public void setDadosUnidade(){
                tipoconfirmacao.setDesignacao(txtDesignacao.getText().toUpperCase() );
                //tipoconfirmacao.setAbreviatura( txtAbreviatura.getText().toUpperCase() );
    }
    
 /////////////////////////
//    VER
//    private void setDados()
//    {
//            encarregado = encarregadoDao.findTipoPagamento( getIdTipoPagamento() );
//            
//            txtDesignacao.setText(   tipoPagamento.getDescrisao() );
//            //txtValor.setText(    String.valueOf( tipoPagamento.getValorPagar()  )   );
//                
//    
//    
//    }
// 
    public void alterar()
    {
       
       if(! vazios_campos())
       {
                try {
                            tipoconfirmacao = tipoconfirmacaoDao.findTipoConfirmacao(this.cod_unidade );
                            setDadosUnidade();
                            tipoconfirmacaoDao.edit(tipoconfirmacao);
                            actualizar();
                            limpar();
                            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!...");  
                            
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao alterar o tipoconfirmacao ", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
       }else JOptionPane.showMessageDialog(null, "Pf. selecione o tipoconfirmacao");
        
    
    }
    
     public void limpar() {
            txtDesignacao.setText("");
     }
        
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDesignacao = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ERP-UAN");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Novo de Confirmação:");

        txtDesignacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDesignacaoActionPerformed(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N.º", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(0).setMinWidth(0);
        jTable1.getColumnModel().getColumn(0).setMaxWidth(50);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDesignacao, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDesignacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/6665_32x32.png"))); // NOI18N
        jToggleButton1.setText("Salvar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar_32x32_1.png"))); // NOI18N
        jButton1.setText("Alterar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/eliminar_32x32.png"))); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logout 32x32.png"))); // NOI18N
        jButton3.setText("Saír");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(192, 208, 232));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("CADASTRO DE TIPO DE CONFIRMAÇÃO");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(127, 127, 127))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDesignacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDesignacaoActionPerformed
      // salvar();
        //JOptionPane.showMessageDialog(null, "Teste ");
    }//GEN-LAST:event_txtDesignacaoActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
          if( evt.getClickCount() >=2 ){
        
            setDadosUnidadeModelo();
                    
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
            salvar();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          alterar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        eliminar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TipoConfirmacaoVisao(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField txtDesignacao;
    // End of variables declaration//GEN-END:variables

    
    
//    private int getIdEIncarregado()
//    {
//    
//             return encarregadoDao.getIdByNome(String.valueOf( 1 )  );
//    
//    }
    
    
    private void adicionar_tabela( List<TipoConfirmacao> tipoconfirmacao)
    {
     
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();

            modelo.setRowCount(0);
            for (int i = 0; i < tipoconfirmacao.size(); i++) 
            {
               modelo.addRow(new Object[]{
               tipoconfirmacao.get(i).getPkTipoConfirmacao(),
               tipoconfirmacao.get(i).getDesignacao(),
               //tipoconfirmacao.get(i).getAbreviatura()
               
            });
            }

    }

    
    public void setDadosUnidadeModelo()
    {
    
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
     
            txtDesignacao.setText(  String.valueOf( modelo.getValueAt(jTable1.getSelectedRow(), 1) ) );
       
            this.cod_unidade =   Integer.parseInt( String.valueOf( modelo.getValueAt(jTable1.getSelectedRow(), 0) ) );

    }
    
    
    private void eliminar()
     {
         try {
              tipoconfirmacaoDao.destroy(this.cod_unidade );
                actualizar();
                limpar();
               JOptionPane.showMessageDialog(null, "Estado Civil eliminado com sucesso!...");
               
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Erro ao eliminar o Estado Civil", "ERRO", JOptionPane.ERROR_MESSAGE);
         }
     
    }
    
    
    
    
}
