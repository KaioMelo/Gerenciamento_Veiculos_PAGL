package br.mil.fab.pagl.model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class OrdemMissao implements Serializable {
    private final static long serialVersionUID = 1L;

    private Integer id_ordem;
    private String solicitante;
    private String contato;
    private String servico;
    private String destino;
    private Date data;

    public OrdemMissao() {
    }

    public OrdemMissao(Integer id_ordem, String solicitante, String contato,  String servico, String destino, Date data) {
        this.id_ordem = id_ordem;
        this.solicitante = solicitante;
        this.contato = contato;
        this.servico = servico;
        this.destino = destino;
        this.data = data;
    }

    public Integer getId_ordem() {
        return id_ordem;
    }

    public void setId_ordem(Integer id_ordem) {
        this.id_ordem = id_ordem;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }


    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdemMissao that = (OrdemMissao) o;
        return Objects.equals(id_ordem, that.id_ordem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_ordem);
    }
}
