/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_opmatrizes;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;


/**
 *
 * @author estev
 */
public class Trabalho_opMatrizes {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    //System.out.println("Informe a primeira matriz, com base no seguinte exemplo:");
    //Inserir descritivo
    //matriz1 = scan.nextLine();
    //Entender porque não funciona com o next.
    //String[] arrayVetor = matriz1.split("\\s");
    //String[][] matrizVetor = arrayVetor.split(",");
    //System.out.println(Arrays.toString(arrayVetor));
    
    System.out.println("Informe a primeira matriz:");
    String vetorEnt = scan.nextLine();
    vetorEnt = vetorEnt.replace("[", "");
    vetorEnt = vetorEnt.replace("]", "");
    //adicionar explicação
    String[] vetor1 = vetorEnt.split(",+\\s+|,+|\\s+,+");
    System.out.println("Vetor quebrado" + Arrays.toString(vetor1));
        
    String[][] matriz1 = new String[vetor1.length][];

    for (int i = 0; i < matriz1.length; i++) {
      matriz1[i] = vetor1[i].split("\\s+");
    }

    for (int i = 0; i < matriz1.length; i++) {
      for (int j = 0; j < matriz1[i].length; j++) {
        //System.out.print(matriz1[i][j] + "");
        System.out.print(matriz1[i][j] + "|");
      }
      System.out.println();
    }
    System.out.println(matriz1.length+" X "+matriz1[1].length);
    
    //adicionar verificação para matriz de uma linha só
    
    for (int i = 0; i < matriz1.length; i++) {
      if (matriz1[i].length < matriz1[(i+1)].length || matriz1[(i+1)].length < matriz1[i].length) {
        System.out.println("Matriz inválida. Tente novamente!");
        break;
      }
    }
    
  }
  
}
