/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_opmatrizes;

import java.util.Scanner;

/**
 *
 * @author estev
 */
public class Trabalho_opMatrizes {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    String matriz1;
    
    Scanner scan = new Scanner(System.in);
    
    //System.out.println("Informe a primeira matriz, com base no seguinte exemplo:");
    //Inserir descritivo
    //matriz1 = scan.nextLine();
    //Entender porque não funciona com o next.
    //String[] arrayVetor = matriz1.split("\\s");
    //String[][] matrizVetor = arrayVetor.split(",");
    //System.out.println(Arrays.toString(arrayVetor));
    
    String input;
    System.out.println("Informe a primeira matriz, com base no seguinte exemplo:");
    input = scan.nextLine();
    String[] rows = input.split(",");
        
    String[][] matrix = new String[rows.length][];

    for (int i = 0; i < matrix.length; i++) {
      matrix[i] = rows[i].split("\\s");
    }

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j]);
      }
      System.out.println();
    }
    
  }
  
}
