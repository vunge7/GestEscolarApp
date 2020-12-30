/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ireport;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import util.BDConexao;

/**
 *
 * @author Necia Caculo
 */
public  class ListTesteReport {
    
    private int idAno  = 0, idClasse=0;

    public ListTesteReport(int idAno, int idClasse) 
            throws SQLException {
        this.idAno = idAno;
        this.idClasse = idClasse;
           
        
        try {
             mostrar();
        } catch (Exception e) {
        }
        
        
    }
    
    
    
    public void mostrar() throws SQLException, JRException, IOException{

        Connection connection =  BDConexao.getConexao();
        HashMap hashMap = new HashMap();
        
        
    
        //obter o path do relatorio
//        String relatorio = "relatorio/Blank_A4.jasper";
        String relatorio = "relatorio/cabecario_pauta.jasper";

        String obterCaminho = new File(relatorio).getAbsoluteFile().getAbsolutePath();
        
        
        
        
        //XLSX(obterCaminho, hashMap, connection);

        try {
            
            JasperFillManager.fillReport(obterCaminho, hashMap, connection);
            JasperPrint jasperPrint = JasperFillManager.fillReport(obterCaminho, hashMap, connection);

            if (jasperPrint.getPages().size() >= 1) {
                JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
                jasperViewer.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "NAO EXISTEM ESTUDANTES CADASTRADOS!...");
            }
        } catch (JRException jex) {
            jex.printStackTrace();
            JOptionPane.showMessageDialog(null, "FALHA AO TENTAR MOSTRAR OS ESTUDANTES CADASTRADOS!...");
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO AO TENTAR MOSTRAR OS ESTUDANTES CADASTRADOS!...");
        }

        }


    public static void main(String[] args) {
        try {
              new ListTesteReport(1,1);
        } catch (Exception e) {
        }
      
    }

 
    
    
    
    

    
}
