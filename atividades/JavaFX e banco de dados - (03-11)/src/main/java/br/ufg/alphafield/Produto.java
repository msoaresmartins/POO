package br.ufg.alphafield;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "produtos")
public class Produto {
    @DatabaseField(id = true)
    private String codigo;
    @DatabaseField(canBeNull = false)
    private String nome;
    @DatabaseField
    private double preco;
    @DatabaseField
    private int quantidade;
    @DatabaseField
    private String validade;

    public Produto() { } // exigido pelo ORMLite

    public Produto(String codigo, String nome, double preco, int quantidade, String validade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.validade = validade;
    }

    public String getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getQuantidade() { return quantidade; }
    public String getValidade() { return validade; }
}
