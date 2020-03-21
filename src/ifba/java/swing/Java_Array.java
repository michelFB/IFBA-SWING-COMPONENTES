/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifba.java.swing;

/**
 *
 * @author michel
 */
public class Java_Array {

    public static void main(String[] args) {
        //Declaração de um Array
        int idade[];
        int tabela[][];
        
        //Alocação de um Array
        idade = new int[5];
        tabela = new int[5][5];

        //Declaração e Alocação Juntos
        int idades[] = new int[10];     //Array de inteiros
        String nomes[] = new String[5]; //Array de String
             
        //Percorrendo um vetor
        for (int i = 0; i < 10; i++) {
            idades[i] = i * 10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(idades[i]);
        }
        
        //Atribuição de um vetor
        nomes[0] = "michel";
        nomes[1] = "João";
        //Acessamdo elementos do vetor
        System.out.println(nomes[0]+", "+nomes[1]);
    }

}


//Quais as diferenças entre array e arraylist?

//Array
//Tem o tamanho fixo, temos que declarar o seu tamanho ao cria-ló
//É uma estrutura de dados nativa do core do Java
//Tem seus valores acessados por []
//Pode armazenar tanto tipos primitivos como objetos

//Arraylist
//Tem tamanho dinâmico, não é obrigatório declarar seu tamanho em sua instanciação
//Faz parte do framework Collection, sendo uma implementação da interface List
//Tem seus valores acessados por metodos, ex: get()
//Não suporta tipos primitivos, apenas objetos
//Obs: quando fazemos arraylist.add(1), o tipo primitivo int é convertido para um objeto Integer

// ArrayList é uma classe presente no pacote java.util, é uma implementação da interface List, 
//que faz parte do framework Collection, que nos prover uma array dinâmico.