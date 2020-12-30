/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import dao.NotaDao;
import dao.EstudanteDao;
import dao.DisciplinaDao;
import dao.AnoLectivoDao;
import dao.ClasseDao;
import dao.ConfirmacaoMatriculaDao1;
import dao.CursoDao;
import dao.ItemTurmaProfDisciplinaDao;
import dao.ProfessorDao;
import dao.TipoNotaDao;
import dao.TrimestreDao;
import dao.TurmaDao;
import dao.UsuarioDao;
import entity.AnoLectivo;
import entity.ConfirmacaoMatricula;
import entity.Estudante;
import entity.Nota;
import entity.Professor;
import entity.Turma;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.persistence.EntityManagerFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.JPAEntntityMannagerFactoryUtil;
import util.MetodosUtil;
import util.PictureChooser;

/**
 *
 * @author mac
 */
public class NotaVisao extends javax.swing.JFrame {
    
    private EntityManagerFactory emf = JPAEntntityMannagerFactoryUtil.em;
    private EstudanteDao estudanteDao = new EstudanteDao(emf);
    private TrimestreDao semestreDao = new TrimestreDao(emf);
    private AnoLectivoDao anoLectivoDao = new AnoLectivoDao(emf);
    private DisciplinaDao disciplinaDao = new DisciplinaDao(emf);
    private TipoNotaDao tipoNotaDao = new TipoNotaDao(emf);
    private ClasseDao classeDao = new ClasseDao(emf);
    private CursoDao cursoDao = new CursoDao(emf);
    private TurmaDao turmaDao = new TurmaDao(emf);
    private ConfirmacaoMatriculaDao1 confirmacaoMatriculaDao = new ConfirmacaoMatriculaDao1(emf);
    private UsuarioDao usuarioDao = new UsuarioDao(emf);
    private NotaDao notaDao = new NotaDao(emf);
    private ProfessorDao professorDao = new ProfessorDao(emf);
    private TrimestreDao trimestreDao = new TrimestreDao(emf);
    private DefaultListModel listModel = new DefaultListModel();
    private DefaultListModel listModelTurma = new DefaultListModel();
    private ItemTurmaProfDisciplinaDao itemTurmaProfDisciplinaDao = new ItemTurmaProfDisciplinaDao(emf);
    private PictureChooser image_view;
    private ImageIcon imageIcon;
    private Nota nota;
    private int id_professor = 0, cod_nota = 0, cod_estudante = 0;
    
    public NotaVisao(int id_professor) {
        initComponents();
        setLocationRelativeTo(null);
        this.id_professor = id_professor;
        jList1.setModel(listModel);
        setCampos();
        txt_iniciais_nome.addKeyListener(new TratarEventoTeclado());
        //limpar_campos();
        mostra_turma_professor_Disciplina();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_iniciais_nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmb_disciplina = new javax.swing.JComboBox<>();
        cmb_semestre = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLAnoLectivo = new javax.swing.JLabel();
        cmb_turma = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        cmb_avaliacao = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        dc_data_lancamento = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        txt_nota = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        btn_salvar1 = new javax.swing.JButton();
        btn_salvar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        txt_iniciais_nome.setEditable(false);
        txt_iniciais_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_iniciais_nomeActionPerformed(evt);
            }
        });

        jLabel2.setText("Pesquisar Iniciais nome:");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jList1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jList1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_iniciais_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txt_iniciais_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(277, 277, 277))
        );

        jPanel2.setBackground(new java.awt.Color(192, 208, 232));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("                       CADASTRO DE NOTAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText(" ");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel4.setText("Disciplina:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        cmb_disciplina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_disciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_disciplinaActionPerformed(evt);
            }
        });
        jPanel4.add(cmb_disciplina, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 160, -1));

        cmb_semestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_semestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_semestreActionPerformed(evt);
            }
        });
        jPanel4.add(cmb_semestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 162, -1));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Trimestre:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 70, 20));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setText("Turmas:");

        jLabel5.setText("Ano Lectivo:");

        jLAnoLectivo.setBackground(new java.awt.Color(0, 0, 0));
        jLAnoLectivo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        cmb_turma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_turma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_turmaMouseClicked(evt);
            }
        });
        cmb_turma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_turmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_turma, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLAnoLectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLAnoLectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmb_turma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod.", "Nota", "Disciplina", "Avaliação", "Data de Lançamento", "Trimestre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        jScrollPane4.setViewportView(jTable1);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cmb_avaliacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmb_avaliacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_avaliacaoActionPerformed(evt);
            }
        });

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Avaliação:");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Data de Lançamento:");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Nota:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmb_avaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nota, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dc_data_lancamento, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmb_avaliacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dc_data_lancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Logout 32x32.png"))); // NOI18N
        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btn_salvar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/6665_32x32.png"))); // NOI18N
        btn_salvar1.setText("Visualizar");
        btn_salvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(btn_salvar1)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_salvar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3)))
        );

        btn_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/6665_32x32.png"))); // NOI18N
        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/eliminar_32x32.png"))); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane4)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(234, 234, 234)
                                .addComponent(btn_salvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here
        setCodEstudante();
        actualizar();
    }//GEN-LAST:event_jList1MouseClicked

    private void jList1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList1KeyReleased
        // TODO add your handling code here:
        //mostrar_dados();
    }//GEN-LAST:event_jList1KeyReleased

    private void txt_iniciais_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_iniciais_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_iniciais_nomeActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        // TODO add your handling code here:
        procedimento_salvar();
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cmb_avaliacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_avaliacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_avaliacaoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        procedimento_eliminar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmb_semestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_semestreActionPerformed
        // TODO add your handling code here:
        actualizar();
    }//GEN-LAST:event_cmb_semestreActionPerformed

    private void btn_salvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salvar1ActionPerformed

    private void cmb_turmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_turmaMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_cmb_turmaMouseClicked

    private void cmb_turmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_turmaActionPerformed
        // TODO add your handling code here:
        adicionar_estudantes_jList();
        adicionar_disciplinas();
    }//GEN-LAST:event_cmb_turmaActionPerformed

    private void cmb_disciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_disciplinaActionPerformed
        // TODO add your handling code here:
        actualizar();
    }//GEN-LAST:event_cmb_disciplinaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        setCodNota();
    }//GEN-LAST:event_jTable1MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NotaVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotaVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotaVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotaVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotaVisao(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_salvar;
    private javax.swing.JButton btn_salvar1;
    private javax.swing.JComboBox<String> cmb_avaliacao;
    private javax.swing.JComboBox<String> cmb_disciplina;
    private javax.swing.JComboBox<String> cmb_semestre;
    private javax.swing.JComboBox<String> cmb_turma;
    private com.toedter.calendar.JDateChooser dc_data_lancamento;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLAnoLectivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_iniciais_nome;
    private javax.swing.JTextField txt_nota;
    // End of variables declaration//GEN-END:variables

    private void adicionar_estudantes_jList() {
        
        List<Estudante> list = estudanteDao.buscaTodosEstudanteByTurma(getIdTurma());
        try {
            listModel.clear();
            for (int i = 0; i < list.size(); i++) {
                listModel.add(i, list.get(i).getNomeCompleto());
            }
        } catch (Exception e) {
        }
        
    }
    
    private void adicionar_estudantes_jList(List<ConfirmacaoMatricula> list) {
        
        listModel.clear();
        try {
            for (int i = 0; i < list.size(); i++) {
                listModel.add(i, list.get(i).getFkEstudante().getNomeCompleto());
            }
            
        } catch (Exception e) {
        }
        
    }
    
    private void mostra_turma_professor_Disciplina() {
        try {
            cmb_turma.setModel(new DefaultComboBoxModel((Vector) turmaDao.buscaTurmaProfessorDisciplina(this.id_professor)));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    // Adicionar turmas
//    private void adicionar_turmas_jList()
//    {
//
//        listModelTurma.clear();
//        try
//        {
//            List<Turma> list = turmaDao.getAllTurmaByClasseAnoCurso( getIdClasse(), 1, getIdCurso() );
//            for ( int i = 0; i < list.size(); i++ )
//            {
//                listModelTurma.add( i, list.get( i ).getDesignacao() );
//            }
//
//        }
//        catch ( Exception e )
//        {
//        }
//
//    }
    //Pesquisa
    private void adicionar_turmas_jList(List<Turma> list) {
        
        listModelTurma.clear();
        try {
            for (int i = 0; i < list.size(); i++) {
                listModelTurma.add(i, list.get(i).getDesignacao());
            }
            
        } catch (Exception e) {
        }
        
    }
    
    private boolean validar_campos() {
        
        if (txt_nota.getText().equals("")) {
            
            JOptionPane.showMessageDialog(null, "Pf digite a nota do aluno", "AVISO", JOptionPane.WARNING_MESSAGE);
            
            txt_nota.requestFocus();
            
            return false;
            
        } else if (!valor_numero()) {
            
            txt_nota.setText("");
            JOptionPane.showMessageDialog(null, "A nota tem que ser somente número", "AVISO", JOptionPane.WARNING_MESSAGE);
            return false;
            
        } else if (dc_data_lancamento.getCalendar() == null) {
            JOptionPane.showMessageDialog(null, "Pf insira a data de nascimento do nota", "AVISO", JOptionPane.WARNING_MESSAGE);
            //setSelectedIndex(0);
            dc_data_lancamento.requestFocus();
            return false;
        } else if (cmb_avaliacao.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Pf seleccione o semestre da nota", "AVISO", JOptionPane.WARNING_MESSAGE);
            //setSelectedIndex(2);
            cmb_avaliacao.requestFocus();
            return false;
            
        }
//        else if (cmb_disciplina.getSelectedIndex() == 0) {
//            JOptionPane.showMessageDialog(null, "Pf seleccione a disciplina da nota", "AVISO", JOptionPane.WARNING_MESSAGE);
//            //setSelectedIndex(2);
//            cmb_disciplina.requestFocus();
//            return false;
//
//        }
//        else if ( cmb_anoLectivo.getSelectedIndex() == 0 )
//        {
//            JOptionPane.showMessageDialog( null, "Pf seleccione o ano lectivo nota", "AVISO", JOptionPane.WARNING_MESSAGE );
//            //setSelectedIndex(2);
//            cmb_anoLectivo.requestFocus();
//            return false;
//
//        }

        return true;
        
    }
    
    private void limpar_campos() {
        
        txt_nota.setText("");
        dc_data_lancamento.setDate(null);
        cmb_avaliacao.setSelectedIndex(0);
        cmb_disciplina.setSelectedIndex(0);
//        cmb_anoLectivo.setSelectedIndex( 0 );
        cmb_semestre.setSelectedIndex(0);
        
    }
    
    private void actualizar() {
        System.err.println("Id Disciplina: " + getIdDisciplina());
        System.err.println("Id Ano: " + getIdAno());
        System.err.println("Id Estudante: " + cod_estudante);
        System.err.println("Id Trinmestre: " + getIdTrimestre());
        List<Nota> list_notas = notaDao.getAllNotaEstudanteByIdDiciplinaAndAnoLectivoAndIdEstudanteAndTrimestre(getIdDisciplina(), getIdAno(), cod_estudante, getIdTrimestre());
        adicionar_tabela(list_notas);
    }
    
    private void procedimento_eliminar() {
        
        if (this.cod_nota != 0) {
            
            int opcao = JOptionPane.showConfirmDialog(null, "Tens a certeza que pretendes eliminar essa nota do estudante : " + txt_nota.getText());
            
            if (opcao == JOptionPane.YES_OPTION) {
                
                eliminar();
                
            } else if (opcao == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Nota não eliminada", "INFO", JOptionPane.INFORMATION_MESSAGE);
            } else if (opcao == JOptionPane.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(null, "Operação cancelada");
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Pf seleccione a nota", "AVISO", JOptionPane.WARNING_MESSAGE);
        }
        
    }
    
    private void eliminar() {
        try {
            notaDao.destroy(this.cod_nota);
            actualizar();
            this.cod_nota = 0;
            JOptionPane.showMessageDialog(null, "Nota eliminado com sucesso!...");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao eliminar a nota", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    private boolean valor_numero() {
        try {
            Double.parseDouble(txt_nota.getText());
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
    
    private void procedimento_salvar() {
        
        if (validar_campos()) {

            //if(  !notaDao.exist_nota( txt_nota )   ){
            try {
                
                this.nota = new Nota();
                setDadosNota();
                this.notaDao.create(this.nota);

                //mostrar_total_nota();
                adicionar_estudantes_jList();
                actualizar();
//                limpar_campos();
                JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!...");
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar a nota", "ERRO", JOptionPane.ERROR_MESSAGE);
            }

//                     }else JOptionPane.showMessageDialog(null, "Este nota ja se encontra cadastrado no banco de dados","ERRO", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    private void setCampos() {
        
        cmb_semestre.setModel(new DefaultComboBoxModel(semestreDao.buscaTodos()));
        
        jLAnoLectivo.setText(setAnoLectivo());
//        cmbClasse.setModel( new DefaultComboBoxModel( classeDao.buscaTodos() ) );
//        cmbCurso.setModel( new DefaultComboBoxModel( cursoDao.buscaTodos() ) );
        cmb_avaliacao.setModel(new DefaultComboBoxModel(tipoNotaDao.buscaTodos()));
        dc_data_lancamento.setDate(new Date());
        //adicionar_estudantes_jList();

    }
    
    public void setDadosNota() {
        
        this.nota.setValor(Double.parseDouble(txt_nota.getText().toUpperCase()));
        //setValor(  Double.parseDouble(modelo.getValueAt(i, 1).toString() ) );
        this.nota.setFkAnoLectivo(anoLectivoDao.findAnoLectivo(getIdAno()));
        this.nota.setFkTrimestre(semestreDao.findTrimestre(semestreDao.getIdByDescricao(getDescricaoSemestre())));
        this.nota.setFkDisciplina(disciplinaDao.findDisciplina(disciplinaDao.getIdByDescricao(getDescricaoDisciplina())));
        this.nota.setFkTipoNota(tipoNotaDao.findTipoNota(tipoNotaDao.getIdByDescricao(getDescricaoAvaliacao())));
        nota.setFkEstudante(estudanteDao.findEstudante(estudanteDao.getIdByEstudante(getNomeCompleto())));
        nota.setFkProfessor(professorDao.findProfessor(this.id_professor));
        this.dc_data_lancamento.setDate(new Date());
        actualizar();
    }
    
    private String getDescricaoDisciplina() {
        return String.valueOf(cmb_disciplina.getSelectedItem());
    }
    
    private String getDescricaoSemestre() {
        return String.valueOf(cmb_semestre.getSelectedItem());
    }
    
    private String getDescricaoAvaliacao() {
        return String.valueOf(cmb_avaliacao.getSelectedItem());
    }
    
    private String setAnoLectivo() {
        int idLast = anoLectivoDao.getLastAno();
        return anoLectivoDao.findAnoLectivo(idLast).getDesignacao();
    }
    
    private void adicionar_disciplinas() {
        try {
            cmb_disciplina.setModel(new DefaultComboBoxModel((Vector) itemTurmaProfDisciplinaDao.getAllDisicplinaByIdAnoAndIdTurmaAndIdProfessor(getIdAno(), getIdTurma(), id_professor)));
            
        } catch (Exception e) {
        }
    }
    
    private int getIdAno() {
        return anoLectivoDao.getLastAno();
    }
    
    private int getIdDisciplina() {
        return disciplinaDao.getIdByDescricao(cmb_disciplina.getSelectedItem().toString());
    }
    
    private int getIdTrimestre() {
        return trimestreDao.getIdByDescricao(cmb_semestre.getSelectedItem().toString());
    }
    
    private void setCodEstudante() {
        String nome_estudante = jList1.getSelectedValue().toString();
        this.cod_estudante = estudanteDao.getIdByEstudante(nome_estudante);
    }

    private void setCodNota() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        int linhaSelecionada = jTable1.getSelectedRow();
        this.cod_nota =   Integer.parseInt(modelo.getValueAt(linhaSelecionada, 0).toString()) ;
    }

    //----------- evento do teclado ---------------------------------------
    class TratarEventoTeclado implements KeyListener {
        
        String prefixo = "";
        
        public void keyPressed(KeyEvent evt) {
            
            if (evt.getKeyCode() != KeyEvent.VK_BACK_SPACE && evt.getKeyCode() != KeyEvent.VK_ENTER) {
                char key = evt.getKeyChar();
                
                try {
                    
                    prefixo = txt_iniciais_nome.getText().trim() + key;
                    // adicionar_estudantes_jList(  estudanteDao.getALLEstudante_LIKE_nomeCompleto(prefixo));

                } catch (Exception e) {
                    e.printStackTrace();
//                    limpar_campos();
                }
                
            } else if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                try {
                    
                    prefixo = prefixo.toString().trim().substring(0, prefixo.length() - 1);
                    //adicionar_estudantes_jList(  estudanteDao.getALLEstudante_LIKE_nomeCompleto(prefixo));

                } catch (Exception e) {
//                    limpar_campos();
                }
                
            }
        }
        
        public void keyReleased(KeyEvent evt) {
        }
        
        public void keyTyped(KeyEvent evt) {
        }
        
    }
    
    private int getIdTurma() {
        return turmaDao.getTurmaByDesignacao(cmb_turma.getSelectedItem().toString()).getPkTurma();
    }
    
    private String getNomeCompleto() {
        return jList1.getSelectedValue();
    }

//    private int getIdTurma()
//    {
//        return turmaDao.getIdByDescricao( jListTurma.getSelectedValue() );
//    }
//    private int getIdCurso()
//    {
//        return cursoDao.getCursoByDesignacao( cmbCurso.getSelectedItem().toString() ).getPkCurso();
//    }
//
//    private int getIdClasse()
//    {
//        return classeDao.getClasseByDesignacao( cmbClasse.getSelectedItem().toString() ).getPkClasse();
//    }
//private void adicionar_tabela(){
//            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
//            modelo.setRowCount(0);
//            
//            List<Nota> lista = notaDao.buscaTodasNotas();
//            List<Estudante> lista_estudante = estudanteDao.buscaTodosEstudante();
//            
//            System.out.println("size:  " +lista.size());
//            try {
//            
//                    for (int i = 0; i < lista.size(); i++) {
//                        
//                       Nota get = lista.get(i);
//                        modelo.addRow(new Object[]{
//                                get.getFkEstudante().getPkEstudante(),
//                                get.getFkEstudante().getNomeCompleto(),
//                                get.getValor(),
//                                get.getFkSemestre().getDesignacao(),
//                                get.getFkDisciplina().getDesignacao(),
//                                get.getFkTipoNota().getDesignacao(),
//                                get.getData(),
//                                //get.getFkFuncionario().getFkFuncao().getDesignacao(),
////                                MetodosUtil.getDataString(get.getDataInicio()),
////                                MetodosUtil.getDataString(get.getDataFim()),
//                                get.getPkNota()
//
//                            });
//                }
//                
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//            
//    }
    private void adicionar_tabela(List<Nota> nota) {
        
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        
        modelo.setRowCount(0);
        
        if (nota != null) {
            for (int i = 0; i < nota.size(); i++) {
                modelo.addRow(new Object[]{
                    nota.get(i).getPkNota(),
                    nota.get(i).getValor(),
                    nota.get(i).getFkDisciplina().getDesignacao(),
                    nota.get(i).getFkTipoNota().getDesignacao(),
                    MetodosUtil.getDataString(nota.get(i).getData()),
                    nota.get(i).getFkTrimestre().getDesignacao()
                
                });
            }
        }
        
    }
    
}
