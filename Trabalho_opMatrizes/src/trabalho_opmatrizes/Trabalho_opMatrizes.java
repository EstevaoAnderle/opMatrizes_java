/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_opmatrizes;

import java.util.Arrays;
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

        Scanner scan = new Scanner(System.in);
        Matriz matrizConvert = new Matriz();
        Matriz matrizConvert2 = new Matriz();

        //System.out.println("Informe a primeira matriz, com base no seguinte exemplo:");
        //Inserir descritivo
        //matriz1 = scan.nextLine();
        //Entender porque não funciona com o next.
        System.out.println("Informe a primeira matriz:");
        String vetorEnt = scan.nextLine();
        matrizConvert.stringParaVetor(vetorEnt);
        //vetorEnt = vetorEnt.replace("[", "");
        //vetorEnt = vetorEnt.replace("]", "");

        //String[] vetor1 = vetorEnt.split("\\s*,+\\s*");
        System.out.println("Vetor quebrado da primeira matriz" + Arrays.toString(matrizConvert.stringParaVetor(vetorEnt)));

        System.out.println("Informe a segunda matriz:");
        String vetorEnt2 = scan.nextLine();
        matrizConvert2.stringParaVetor(vetorEnt2);

        //String[] vetor2 = vetorEnt2.split("\\s*,+\\s*");
        System.out.println("Vetor quebrado da segunda matriz" + Arrays.toString(matrizConvert2.stringParaVetor(vetorEnt)));

        //String[][] matriz1 = new String[matrizConvert.vetor.length][];
        //Integer[][] matrizConvertida1 = new Integer[matrizConvert.vetor.length][];
        // String[][] matriz2 = new String[matrizConvert2.vetor.length][];
        //Integer[][] matrizConvertida2 = new Integer[matrizConvert2.vetor.length][];
        //linha e depois coluna
        //*********************Conversão da primeira matriz
//        for (int i = 0; i < matriz1.length; i++) {
//            matriz1[i] = matrizConvert.vetor[i].split("\\s+");
//        }
        matrizConvert.vetorParaMatriz(matrizConvert.vetor);

        //*********************Conversão da segunda matriz
//        for (int i = 0; i < matriz2.length; i++) {
//            matriz2[i] = matrizConvert2.vetor[i].split("\\s+");
//        }
        matrizConvert2.vetorParaMatriz(matrizConvert2.vetor);

        //Conversão para romano da primeira matriz
//        int convertido = 0;
//
//        for (int i = 0; i < matrizConvert.matriz.length; i++) {
//            //inicilização da matriz
//            //aqui está dizendo quantas colunas tem em cada linha
//            matrizConvert.matrizConvertida[i] = new Integer[matrizConvert.matriz[i].length];
//
//            for (int j = 0; j < matrizConvert.matriz[i].length; j++) {
//                System.out.print(matrizConvert.matriz[i][j] + "|");
//
//                convertido = matrizConvert.traduzirNumeralRomano1(matrizConvert.matriz[i][j]);
//                matrizConvert.matrizConvertida[i][j] = convertido;
//            }
//            System.out.println();
//        }
        matrizConvert.conversaoMatriz(matrizConvert.matriz);

        //Conversão para romano da segunda matriz
//        int convertido2 = 0;
//        for (int i = 0; i < matrizConvert2.matriz.length; i++) {
//            //inicilização da matriz
//            //aqui está dizendo quantas colunas tem em cada linha
//            matrizConvert2.matrizConvertida[i] = new Integer[matrizConvert2.matriz[i].length];
//
//            for (int j = 0; j < matrizConvert2.matriz[i].length; j++) {
//                System.out.print(matrizConvert2.matriz[i][j] + "|");
//
//                convertido2 = matrizConvert2.traduzirNumeralRomano1(matrizConvert2.matriz[i][j]);
//                matrizConvert2.matrizConvertida[i][j] = convertido2;
//            }
//            System.out.println();
//        }
        //Escrita da matriz 1 convertida
        System.out.println("Conversão da primeira matriz:");
        for (int i = 0; i < matrizConvert.matrizConvertida.length; i++) {
            for (int j = 0; j < matrizConvert.matrizConvertida[i].length; j++) {
                //System.out.print(matriz1[i][j] + "");
                System.out.print(matrizConvert.matrizConvertida[i][j] + "|");
            }
            System.out.println();
        }

        System.out.println(matrizConvert.matrizConvertida.length + " X " + matrizConvert.matrizConvertida[0].length);

        //Escrita da matriz 2 convertida
        System.out.println("Conversão da segunda matriz:");
        for (int i = 0; i < matrizConvert2.matrizConvertida.length; i++) {
            for (int j = 0; j < matrizConvert2.matrizConvertida[i].length; j++) {
                //System.out.print(matriz1[i][j] + "");
                System.out.print(matrizConvert2.matrizConvertida[i][j] + "|");
            }
            System.out.println();
        }

        System.out.println(matrizConvert2.matrizConvertida.length + " X " + matrizConvert2.matrizConvertida[0].length);
        

        //adicionar verificação para matriz de uma linha só
//        for (int i = 0; i < matrizConvert.matriz.length - 1; i++) {
//
//            if (matrizConvert.matriz[i].length != matrizConvert.matriz[(i + 1)].length) {
//                System.out.println("Matriz inválida. Tente novamente!");
//                break;
//            }
//        }
        //http://www.guj.com.br/t/metodo-para-converter-numeros-romanos-para-decimal-alguem-sabe/81923/2
        //http://www.guj.com.br/t/como-converter-inteiro-para-string/24091
    }
}
