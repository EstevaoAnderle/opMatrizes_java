/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_opmatrizes;

/**
 *
 * @author estev
 */
public class Matriz {

    //String vetorEnt;
    //String vetorEnt2;
    String[] vetor;
    String[][] matriz;
    Integer[][] matrizConvertida;

    public String[] stringParaVetor(String entrada) {
        entrada = entrada.replace("[", "");
        entrada = entrada.replace("]", "");

        this.vetor = entrada.split("\\s*,+\\s*");

        return vetor;
    }

    public String[][] vetorParaMatriz(String[] vetor) {
        matriz = new String[vetor.length][];

        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = vetor[i].split("\\s+");
        }

        return matriz;
    }

    public Integer[][] conversaoMatriz(String[][] matriz) {

        int convertido = 0;
        matrizConvertida = new Integer[matriz.length][];

        for (int i = 0; i < matriz.length; i++) {
            //inicilização da matriz
            //aqui está dizendo quantas colunas tem em cada linha

            matrizConvertida[i] = new Integer[matriz[i].length];

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "|");

                convertido = traduzirNumeralRomano1(matriz[i][j]);
                matrizConvertida[i][j] = convertido;
            }
            System.out.println(); 
        }
        return matrizConvertida;
    }

    public int traduzirNumeralRomano1(String texto) {
        //matrizConvertida = new Integer[vetor.length][];

        int n = 0;
        int numeralDaDireita = 0;
        for (int i = texto.length() - 1; i >= 0; i--) {
            int valor = (int) traduzirNumeralRomano(texto.charAt(i));
            n += valor * Math.signum(valor + 0.5 - numeralDaDireita);
            numeralDaDireita = valor;
        }
        return n;
    }

    public double traduzirNumeralRomano(char caractere) {
        return Math.floor(Math.pow(10, "IXCM".indexOf(caractere))) + 5 * Math.floor(Math.pow(10, "VLD".indexOf(caractere)));
    }

}
