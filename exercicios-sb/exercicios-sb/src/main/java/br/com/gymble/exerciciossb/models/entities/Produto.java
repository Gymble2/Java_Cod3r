package br.com.gymble.exerciciossb.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @NotBlank
    private String nome;
    
    @Min(0)
    private Double preco;
    
    @Min(0)
    @Max(100)
    private Double desconto;
    
    public Produto() {
        super();
    }

    public Produto(String nome, Double preco, Double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {  
        this.desconto = desconto;
    }

    public Double calcularPrecoComDesconto() {
        if (this.preco == null) {
            throw new NullPointerException("O preço do produto não pode ser nulo.");
        }
        return this.preco - (this.preco * (this.desconto / 100));
    }
}
