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
public class Carnaval extends Evento{
    
    public Carnaval(float valor, Data data, String nome, int capacidade) {
        super(valor, data, nome, capacidade);
    }

    @Override
    public boolean pessoaPodeParticipar(Pessoa pessoa) {
        int idade = data.getAno() - pessoa.getDataNascimento().getAno();
        if(idade > 18 && temVaga())
            return true;
        else if(idade == 18 && temVaga()){
            if (pessoa.getDataNascimento().getMes() < data.getMes())
                return true;
            else if (pessoa.getDataNascimento().getMes() == data.getMes() && pessoa.getDataNascimento().getDia() < data.getDia()) {
                return true;
            }
        }
        return false;
    }
    
}
