package br.edu.ifal.tarde.formularioweb;

import java.util.ArrayList;
import java.util.List;

public class Aluno{
    private String nome;
    private String email;
    private String cpf;
    private String sexo;
    private String modulo;
    private List<String> areas = new ArrayList<String>();
    private String senha;

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public List<String> getAreas() {
        return areas;
    }

    public void setAreas(List<String> areas) {
        this.areas = areas;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}