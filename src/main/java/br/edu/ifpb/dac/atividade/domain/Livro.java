package br.edu.ifpb.dac.atividade.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Livro implements Serializable {
    
    @Id
    @GeneratedValue
    private int ID;
    @OneToMany
    @JoinColumn(name = "autor_id")
    private List<Autor> autores;
    private String titulo;
    private String ISSBN;
    @Temporal(TemporalType.DATE)
    private Date lancamento;

    public Livro() { }

    public Livro(String titulo, String ISSBN, Date lancamento, Autor autor) {
        this();
        this.titulo = titulo;
        this.ISSBN = ISSBN;
        this.lancamento = lancamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISSBN() {
        return ISSBN;
    }

    public void setISSBN(String ISSBN) {
        this.ISSBN = ISSBN;
    }

    public Date getLancamento() {
        return lancamento;
    }

    public void setLancamento(Date lancamento) {
        this.lancamento = lancamento;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
    
}
