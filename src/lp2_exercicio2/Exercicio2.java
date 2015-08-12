/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2_exercicio2;

import java.util.Scanner;
/**
 *
 * @author 31463738
 */
public class Exercicio2 {
    
    private int op;
        
    public Exercicio2() {        
    }
    
    public void Imprimir(){
        Scanner leia= new Scanner(System.in);        
        System.out.println("Digite seu estado civil:\n 1- Solteiro(a)\n 2- Desquitado(a)\n 3- Casado(a)\n 4- Divorciado(a)\n 5-Viúvo(a) ");
        op=leia.nextInt();
        System.out.println("");
        
            switch(op){            
                case 1: 
                    System.out.print("Você é Solteiro(a).");
                    break;
                case 2: 
                    System.out.println("Você é Desquitado(a).");
                    break;
                case 3: 
                    System.out.println("Você é Casado(a).");
                    break;
                case 4: 
                    System.out.println("Você é Divorciado(a).");
                    break;
                case 5:
                    System.out.println("Você é Viúvo(a).");
                    break;
                default:
                    System.out.println("Opção inválida!");       
            }       
    }       
}
