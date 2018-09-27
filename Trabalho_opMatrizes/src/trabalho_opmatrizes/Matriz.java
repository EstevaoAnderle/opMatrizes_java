/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho_opmatrizes;

import static java.util.Collections.nCopies;

/**
 *
 * @author estev
 */
public class Matriz {

    //Declaração das variáveis utilizadas, matrizes e vetores.
    int escalar;
    String[] vetor;
    String[][] matriz;
    Integer[][] matrizConvertida;
    Integer[][] matrizResultado;
    String[][] matrizFinal;

    //Esse método transforma a entrada do usuário em um vetor.
    public String[] stringParaVetor(String entrada) {

        //Inserir descrição do replace
        entrada = entrada.replace("[", "");
        entrada = entrada.replace("]", "");

        this.vetor = entrada.split("\\s*,+\\s*");

        return vetor;
    }

    //Esse método transforma o vetor convertido anteriormente em uma matriz.
    public String[][] vetorParaMatriz(String[] vetor) {

        matriz = new String[vetor.length][];

        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = vetor[i].split("\\s+");
        }

        return matriz;
    }

    //Aqui ele converte a matriz de romanos em uma matriz de inteiros.
    public Integer[][] conversaoMatriz(String[][] matriz) {

        for (int i = 0; i < matriz.length - 1; i++) {
            if (matriz[i].length != matriz[(i + 1)].length) {
                System.out.println("Matriz inválida. Comece novamente!");
                System.exit(0);
            }
        }

        int convertido = 0;
        matrizConvertida = new Integer[matriz.length][];

        for (int i = 0; i < matriz.length; i++) {
            //inicilização da matriz
            //aqui está dizendo quantas colunas tem em cada linha

            matrizConvertida[i] = new Integer[matriz[i].length];

            for (int j = 0; j < matriz[i].length; j++) {
                convertido = traduzirNumeralRomanoFinal(matriz[i][j]);
                matrizConvertida[i][j] = convertido;
            }
        }
        return matrizConvertida;
    }

    //Aqui ele realiza a conversão de números decimais para romanos.
    //Verificar quando o resultado é negativo e zero.
    public String[][] converterEmRomanos(Integer[][] matrizResultado) {
        int[] decimais = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X",
            "IX", "V", "IV", "I"};

        matrizFinal = new String[matrizResultado.length][];

        for (int i = 0; i < matrizResultado.length; i++) {
            matrizFinal[i] = new String[matrizResultado[i].length];

            for (int j = 0; j < matrizResultado[i].length; j++) {
                for (int k = 0; k < decimais.length; k++) {
                    StringBuilder result = new StringBuilder();
                    int parteInteira = matrizResultado[i][j] / decimais[k];
                    matrizResultado[i][j] -= decimais[k] * parteInteira;

                    result.append(String.join("", nCopies(parteInteira, romanos[k])));
                    matrizFinal[i][j] = result.toString();
                }

            }
        }

        System.out.println("A conversão das matrizes é:");
        for (int i = 0; i < matrizFinal.length; i++) {
            for (int j = 0; j < matrizFinal[i].length; j++) {
                System.out.print(matrizFinal[i][j] + "|");
            }
            System.out.println();
        }

        return matrizFinal;
    }

    //Aqui é o método que realiza a conversão.
    //Author: Francisco Edmundo
    public int traduzirNumeralRomanoFinal(String texto) {

        int n = 0;
        int numeralDaDireita = 0;
        for (int i = texto.length() - 1; i >= 0; i--) {//Analisa cada caractere de trás para frente.
            int valor = (int) traduzirNumeralRomano(texto.charAt(i));
            n += valor * Math.signum(valor + 0.5 - numeralDaDireita);
            /*Adiciona ao total o valor obtido, usando o método math.signum, que
            vai decidir se é positivo ou negativo. Esse método retorna -1 se o número
            da direita for maior e 1 se for menor.*/

            numeralDaDireita = valor;
        }
        return n;
    }

    public double traduzirNumeralRomano(char caractere) {
        return Math.floor(Math.pow(10, "IXCM".indexOf(caractere))) + 5
                * Math.floor(Math.pow(10, "VLD".indexOf(caractere)));

        /*Primeiramente, o 10 é elevado à potência do segundo argumento (math.pow)
        e arredonda o número (math.floor). Por exemplo: se o caractere for 'I', vai
        ser elevado a 0 = 1.

        Caso o caractere esteja contido na string "VLD", vai fazer o mesmo que
        no anterior, mas vai multiplicar por 5, visto que essas letras tem valor
        5, 50 e 500.
         */
    }

    //Aqui ele realiza a soma das matrizes, passando o resultado para uma outra matriz.
    public Integer[][] soma(Integer[][] matrizConvert, Integer[][] matrizConvert2) {
        matrizResultado = new Integer[matrizConvert.length][];

        if (matrizConvert.length != matrizConvert2.length || matrizConvert[0].length != matrizConvert2[0].length) {
            System.out.println("As dimensões das matrizes são diferentes, logo, não é possível realizar essa operação.");
        } else {
            for (int i = 0; i < matrizConvert.length; i++) {
                matrizResultado[i] = new Integer[matrizConvert[i].length];
                for (int j = 0; j < matrizConvert[i].length; j++) {
                    matrizResultado[i][j] = matrizConvert[i][j] + matrizConvert2[i][j];
                }
            }

            System.out.println("A soma das matrizes é:");
            for (int i = 0; i < matrizResultado.length; i++) {
                for (int j = 0; j < matrizResultado[i].length; j++) {
                    System.out.print(matrizResultado[i][j] + "|");
                }
                System.out.println();
            }
        }
        return matrizResultado;
    }

    //Aqui ele realiza a subtração das matrizes.
    public Integer[][] subtracao(Integer[][] matrizConvert, Integer[][] matrizConvert2) {
        matrizResultado = new Integer[matrizConvert.length][];

        if (matrizConvert.length != matrizConvert2.length || matrizConvert[0].length != matrizConvert2[0].length) {
            System.out.println("As dimensões das matrizes são diferentes, logo, não é possível realizar essa operação.");
        } else {
            for (int i = 0; i < matrizConvert.length; i++) {
                matrizResultado[i] = new Integer[matrizConvert[i].length];
                for (int j = 0; j < matrizConvert[i].length; j++) {
                    matrizResultado[i][j] = matrizConvert[i][j] - matrizConvert2[i][j];
                }
            }

            System.out.println("A subtração das matrizes é:");
            for (int i = 0; i < matrizResultado.length; i++) {
                for (int j = 0; j < matrizResultado[i].length; j++) {
                    System.out.print(matrizResultado[i][j] + "|");
                }
                System.out.println();
            }
        }
        return matrizResultado;
    }

    //Aqui ele realiza a multiplicação das matrizes.
    public Integer[][] multiplicacao(Integer[][] matrizConvert, Integer[][] matrizConvert2) {
        matrizResultado = new Integer[matrizConvert.length][];

        if (matrizConvert.length != matrizConvert2[0].length) {
            System.out.println("As dimensões das matrizes são diferentes, logo, não é possível realizar essa operação.");
        } else {
            for (int i = 0; i < matrizConvert.length; i++) {
                matrizResultado[i] = new Integer[matrizConvert2[i].length];
                for (int j = 0; j < matrizConvert2[0].length; j++) {
                    matrizResultado[i][j] = 0;
                }
            }

            for (int i = 0; i < matrizConvert.length; i++) {
                for (int j = 0; j < matrizConvert2[i].length; j++) {
                    for (int k = 0; k < matrizConvert[i].length; k++) {
                        matrizResultado[i][j] += matrizConvert[i][k] * matrizConvert2[k][j];
                    }
                }
            }

            System.out.println("A multiplicação das matrizes é:");
            for (int i = 0; i < matrizResultado.length; i++) {
                for (int j = 0; j < matrizResultado[i].length; j++) {
                    System.out.print(matrizResultado[i][j] + "|");
                }
                System.out.println();
            }
        }
        return matrizResultado;
    }

    //Aqui é realizado o produto escalar das matrizes.
    public Integer[][] multiplicacaoEsc(Integer[][] matrizConvert, int escalar) {
        matrizResultado = new Integer[matrizConvert.length][];

        for (int i = 0; i < matrizConvert.length; i++) {
            matrizResultado[i] = new Integer[matrizConvert[i].length];
            for (int j = 0; j < matrizConvert[i].length; j++) {
                matrizResultado[i][j] = matrizConvert[i][j] * escalar;
            }
        }

        System.out.println("A multiplicação por escalar da matriz é:");
        for (int i = 0; i < matrizResultado.length; i++) {
            for (int j = 0; j < matrizResultado[i].length; j++) {
                //System.out.print(matriz1[i][j] + "");
                System.out.print(matrizResultado[i][j] + "|");
            }
            System.out.println();
        }

        return matrizResultado;
    }

}
