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
        //adicionar validação por ponto

        String[] vetor1 = vetorEnt.split("\\s*,+\\s*");
        System.out.println("Vetor quebrado" + Arrays.toString(vetor1));

        String[][] matriz1 = new String[vetor1.length][];
        Integer[][] matrizConvertida = new Integer[vetor1.length][];
        //linha e depois coluna

        //matrizConvertida[0][0] = 0;
        for (int i = 0; i < matriz1.length; i++) {
            matriz1[i] = vetor1[i].split("\\s+");
        }

        int convertido = 0;
        Matriz matriz = new Matriz();

        for (int i = 0; i < matriz1.length; i++) {
            //inicilização da matriz
            //aqui está dizendo quantas colunas tem em cada linha
            matrizConvertida[i] = new Integer[matriz1[i].length];

            for (int j = 0; j < matriz1[i].length; j++) {
                //System.out.print(matriz1[i][j] + "");
                System.out.print(matriz1[i][j] + "|");

                convertido = matriz.traduzirNumeralRomano1(matriz1[i][j]);
                //matriz1[i][j] = Integer.toString(convertido);
                //matrizConvertida[i][j] = Integer.parseInt( matriz1[i][j]);
                matrizConvertida[i][j] = convertido;
            }
            System.out.println();
        }

        System.out.println("Conversão:");
        for (int i = 0; i < matrizConvertida.length; i++) {
            for (int j = 0; j < matrizConvertida[i].length; j++) {
                //System.out.print(matriz1[i][j] + "");
                System.out.print(matrizConvertida[i][j] + "|");
            }
            System.out.println();
        }

        System.out.println(matrizConvertida.length + " X " + matrizConvertida[1].length);

        //adicionar verificação para matriz de uma linha só
        for (int i = 0; i < matriz1.length - 1; i++) {

            if (matriz1[i].length != matriz1[(i + 1)].length) {
                System.out.println("Matriz inválida. Tente novamente!");
                break;
            }
        }

        //http://www.guj.com.br/t/metodo-para-converter-numeros-romanos-para-decimal-alguem-sabe/81923/2
        //http://www.guj.com.br/t/como-converter-inteiro-para-string/24091
    }
}
