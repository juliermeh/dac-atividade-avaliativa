package br.edu.ifpb.dac.atividade.um.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Telefone implements Serializable {
    
    @Id
    @GeneratedValue
    private int ID;
    private String numero;
    private TelefoneType telefone;

    public Telefone() { }

    public Telefone(String numero, TelefoneType telefone) {
        this.numero = numero;
        this.telefone = telefone;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TelefoneType getTelefone() {
        return telefone;
    }

    public void setTelefone(TelefoneType telefone) {
        this.telefone = telefone;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    
}
