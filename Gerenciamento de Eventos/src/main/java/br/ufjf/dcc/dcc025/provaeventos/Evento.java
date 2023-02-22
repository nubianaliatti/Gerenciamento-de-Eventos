/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ufjf.dcc.dcc025.provaeventos;

/**
 *
 * @author ice
 */
//NUBIA RIBEIRO NALIATTI DE MELLO 202035007
import java.util.*;
public abstract class Evento {
    private float valor;
    protected Data data;
    private String nome;
    private int capacidade;
    private List<Pessoa> participantes = new ArrayList<>();

    public Evento(float valor, Data data, String nome, int capacidade) {
        this.valor = valor;
        this.data = data;
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public float getValor() {
        return valor;
    }

    public Data getData() {
        return data;
    }

    public String getNome() {
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public List<Pessoa> getParticipantes() {
        return participantes;
    }
    
    public boolean temVaga(){
        if(participantes.size() >= this.capacidade)
            return false;
        return true;
    }
    
    public abstract boolean pessoaPodeParticipar(Pessoa pessoa);
    
    public void adicionaPessoa(Pessoa pessoa){
        if(pessoaPodeParticipar(pessoa))
            participantes.add(pessoa);
    }
    
}
