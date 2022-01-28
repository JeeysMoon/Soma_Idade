/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício_de_revisão5_04_09;

import java.util.Scanner;

/**
 *
 * @author Jennifer
 */
public class Exercício_de_Revisão5_04_09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade = leitor.nextInt();
        int contador = 0, somaIdades = 0; //começando do 0
        
        while(idade > 0) {
            somaIdades += idade; //+= ele mesmo e mais idade
            contador += 1;
            idade = leitor.nextInt();
        }
        if(contador > 0) {
            double media = somaIdades / contador;
            System.out.println(media);
        } else {
            System.out.println("Não foi possível calcular!");
        }
        
        leitor.close();
    }
    
}
