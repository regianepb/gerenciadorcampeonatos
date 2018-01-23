package com.gerenciadorcampeonatos.gerenciadorcampeonatos.model;

import br.com.gerenciadorcampeonatos.util.LocalDateAttributeConverter;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity(name = "JOGADORES")
public class Jogadores implements Serializable, Entidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    
    @NotNull
    @Column(name="NOME")
    private String nome;    
    
    @Column(name="APELIDO")
    private String apelido;
    
    @Column(name="DATANASCIMENTO")
    @Convert(converter = LocalDateAttributeConverter.class)
    private LocalDate dataNascimento;
        
    @Column(name="RG")
    private String rg;
    
    @Column(name="DDD_TELEFONE")
    private String dddTelefone;
    
    @Column(name="TELEFONE")
    private String telefone;
    
    @Column(name="DDD_CELULAR")
    private String dddCelular;
    
    @NotNull
    @Column(name="CELULAR")
    private String celular;   
    
    @Column(name="EMAIL")
    private String email;
    
    @Column(name="FACEBOOK")
    private String facebook;
    
    @Column(name="FOTO")
    private String foto;
    
    @Column(name="DATAINCLUSAO")
    @Convert(converter = LocalDateAttributeConverter.class)
    private LocalDate dataInclusao;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "ID_POSICOES")
    private Posicoes posicao;

    public Posicoes getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicoes posicao) {
        this.posicao = posicao;
    }
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDddTelefone() {
        return dddTelefone;
    }

    public void setDddTelefone(String dddTelefone) {
        this.dddTelefone = dddTelefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDddCelular() {
        return dddCelular;
    }

    public void setDddCelular(String dddCelular) {
        this.dddCelular = dddCelular;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public LocalDate getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(LocalDate dataInclusao) {
        this.dataInclusao = dataInclusao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.id);
        return hash = 41 * hash + Objects.hashCode(this.nome);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jogadores other = (Jogadores) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.id, other.id);
    }
    
    
    
    
}

