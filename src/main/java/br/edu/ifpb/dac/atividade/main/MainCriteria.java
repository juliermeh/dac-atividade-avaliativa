package br.edu.ifpb.dac.atividade.main;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class MainCriteria {

    public static void main(String[] args) {
        
        EntityManager em = Persistence
            .createEntityManagerFactory("dac-atividade-avaliativa")
            .createEntityManager();
        new IniciarBD(em).dadosIniciais();
        
        //consultas criteria
        
    }
    
}
