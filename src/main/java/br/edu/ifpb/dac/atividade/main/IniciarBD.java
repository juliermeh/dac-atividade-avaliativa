package br.edu.ifpb.dac.atividade.main;

import javax.persistence.EntityManager;

public class IniciarBD {
    
    private final EntityManager em;

    public IniciarBD(EntityManager em) {
        this.em = em;
    }
     
    
}
