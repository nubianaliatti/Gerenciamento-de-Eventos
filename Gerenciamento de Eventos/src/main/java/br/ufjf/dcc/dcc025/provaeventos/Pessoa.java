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
public class Pessoa {
    private Data dataNascimento;
    private String nome;
    private List<Evento> eventos = new ArrayList<>();

    public Pessoa(Data dataNascimento, String nome) {
        this.dataNascimento = dataNascimento;
        this.nome = nome;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public List<Evento> getEventos() {
        return eventos;
    }
    
    public boolean podeParticiparEvento(Evento evento){
        for(Evento ev : eventos){
            if(evento.getData().diferenca(ev.getData()) == 0)
                return false;
        }
        return true;
    }
    
    public void agendarEvento(Evento evento){
        if(podeParticiparEvento(evento))
            eventos.add(evento);
    }
    
}
