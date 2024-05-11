package DTO;

import java.time.LocalTime;
import java.util.Date;

public class Pessoa {
    private int      idPessoa;
    private String   eMail;
    private String   apelido;
    private String   nacionalidade;
    private String   nome;
    private String   dataNascimento;
    private String   nrDeTelofone;
    private String   genero;
    private String   numeroDeIdentificacao;
    private String   endereço;
    private boolean status_Pessoa;
    private String   password;
    private String mesDeCadastro;
   // private LocalTime horaDeCadastro;


    public String getMesDeCadastro() {
        return mesDeCadastro;
    }

    public void setMesDeCadastro(String mesDeCadastro) {
        this.mesDeCadastro = mesDeCadastro;
    }

    public boolean isStatus_Pessoa() {
        return status_Pessoa;
    }

    public void setStatus_Pessoa(boolean status_Pessoa) {
        this.status_Pessoa = status_Pessoa;
    }



    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNrDeTelofone() {
        return nrDeTelofone;
    }

    public void setNrDeTelofone(String nrDeTelofone) {
        this.nrDeTelofone = nrDeTelofone;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNumeroDeIdentificacao() {
        return numeroDeIdentificacao;
    }

    public void setNumeroDeIdentificacao(String numeroDeIdentificacao) {
        this.numeroDeIdentificacao = numeroDeIdentificacao;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }





}
