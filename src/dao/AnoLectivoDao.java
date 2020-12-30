/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import controller.AnoLectivoJpaController;
import entity.AnoLectivo;
import java.util.List;
import java.util.Vector;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

/**
 *
 * @author Necia Caculo
 */
public class AnoLectivoDao extends AnoLectivoJpaController {

    public AnoLectivoDao(EntityManagerFactory emf) {
        super(emf);
    }

    public Vector<String> buscaTodos() {
        EntityManager em = getEntityManager();
        Query query = em.createQuery("SELECT u.designacao FROM AnoLectivo u");
        Vector<String> result = (Vector) query.getResultList();

        result.add(0, "-- SELECIONE --");

        return result;
    }

    public List<AnoLectivo> buscaTodasAnoLectivos() {
        EntityManager em = getEntityManager();
        Query query = em.createQuery("SELECT u FROM AnoLectivo u");
        return query.getResultList();
    }

    public String getDescricaoById(long idAnoLectivo) {
        EntityManager em = getEntityManager();
        Query query = em.createQuery("SELECT u.designacao FROM AnoLectivo u WHERE u.pkAnoLectivo = :pkAnoLectivo")
                .setParameter("idAnoLectivo", idAnoLectivo);

        List list = query.getResultList();

        if (list != null) {
            return String.valueOf(list.get(0));
        }
        return "";
    }

    public List<AnoLectivo> getDescricaoByIdProfissao(int idAnoLectivo) {

        EntityManager em = getEntityManager();
        Query query = em.createQuery("SELECT u.designacao FROM AnoLectivo u WHERE u.pkAnoLectivo = :pkAnoLectivo")
                .setParameter("pkAnoLectivo", idAnoLectivo);

        //List list = query.getResultList();
        return query.getResultList();
    }

//     public  AnoLectivo   getUnidadeByAbreviatura(String abreviatura) 
//     {         
//            
//            EntityManager em = getEntityManager();
//            Query query = em.createQuery ("SELECT u FROM AnoLectivo u WHERE u.abreviatura = :abreviatura")
//                    .setParameter("abreviatura", abreviatura);
//            
//            List<AnoLectivo> list = query.getResultList();
//            
//            if ( !list.isEmpty()) {
//                   return list.get(0);             
//            }
//            return new AnoLectivo(0);
//            
//    }
    public int getIdByDescricao(String designacao) {

        System.out.println("UNIDADE " + designacao);
        EntityManager em = getEntityManager();
        Query query = em.createQuery("SELECT u FROM AnoLectivo u WHERE u.designacao = :designacao")
                .setParameter("designacao", designacao);

        List<AnoLectivo> result = query.getResultList();

        if (!result.isEmpty()) {
            return result.get(0).getPkAnoLectivo();
        }
        return 0;

    }

    public AnoLectivo getAnoLectivoByDesignacao(String designacao) {

        EntityManager em = getEntityManager();
        Query query = em.createQuery("SELECT a FROM AnoLectivo a WHERE  a.designacao = :designacao")
                .setParameter("designacao", designacao);
        List<AnoLectivo> result = query.getResultList();
        em.close();

        if (result != null) {
            return result.get(0);
        }
        return null;

    }

    public boolean exist_ano(String designacao) {
        EntityManager em = getEntityManager();
        Query query = em.createQuery("SELECT u FROM AnoLectivo u WHERE u.designacao = :designacao")
                .setParameter("designacao", designacao);

        List result = query.getResultList();

        if (!result.isEmpty()) {
            return true;
        }
        return false;
    }

    public int getLastAno() {

        EntityManager em = getEntityManager();
        Query query = em.createQuery("SELECT  MAX(f.pkAnoLectivo) FROM AnoLectivo f");

        List<Integer> result = query.getResultList();
        if (!result.isEmpty()) {
            return result.get(0);
        }
        return 0;
    }

}
