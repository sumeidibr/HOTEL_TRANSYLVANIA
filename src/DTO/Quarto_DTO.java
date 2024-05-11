/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author $umeid_ibr
 */
public class Quarto_DTO {

   private int id, Capacidade;

    private String Tipo, Descricao, Localizacao, Numero_quarto;
    private float Preco_noite;
     private boolean Disponibilidade;

    public boolean isDisponibilidade() {
        return Disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        Disponibilidade = disponibilidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidade() {
        return Capacidade;
    }

    public void setCapacidade(int capacidade) {
        Capacidade = capacidade;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public String getLocalizacao() {
        return Localizacao;
    }

    public void setLocalizacao(String localizacao) {
        Localizacao = localizacao;
    }



    public String getNumero_quarto() {
        return Numero_quarto;
    }

    public void setNumero_quarto(String numero_quarto) {
        Numero_quarto = numero_quarto;
    }

    public float getPreco_noite() {
        return Preco_noite;
    }

    public void setPreco_noite(float preco_noite) {
        Preco_noite = preco_noite;
    }



}
