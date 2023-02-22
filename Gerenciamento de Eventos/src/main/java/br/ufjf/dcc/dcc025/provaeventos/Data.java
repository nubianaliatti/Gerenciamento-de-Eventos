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
public class Data {
    private int dia, mes, ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }    
    
    public static Data parser(String data) throws DataException{
        String[]vetor = data.split("/");
        if(Integer.parseInt(vetor[0]) > 30 || Integer.parseInt(vetor[1]) > 12 || Integer.parseInt(vetor[0]) <= 0 || Integer.parseInt(vetor[1]) <= 0 || vetor[0].length()>2 || vetor[1].length()>2||vetor[2].length()!=4){
            throw new DataException();
        }
        return new Data(Integer.parseInt(vetor[0]),Integer.parseInt(vetor[1]),Integer.parseInt(vetor[2]));
    }
    
    public int diferenca(Data data){
        int diferenca = (data.ano*360 + data.mes*30 + data.dia) - (this.ano*360 + this.mes*30 + this.dia);
        return diferenca;
    }
    
}
