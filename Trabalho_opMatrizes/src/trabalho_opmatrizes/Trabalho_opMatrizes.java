package trabalho_opmatrizes;

import java.util.Scanner;

/**
 *
 * @author estev
 */
public class Trabalho_opMatrizes {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Inicialização das matrizes utilizadas no projeto e das variáveis.
        Matriz matrizConvert = new Matriz();
        Matriz matrizConvert2 = new Matriz();
        Matriz matrizResultado = new Matriz();
        Matriz matrizFinal = new Matriz();
        String opcao;
        String vetorEnt;
        String vetorEnt2;

        System.out.println("Calculadora de matrizes");
        System.out.println("Informe a opção desejada, sendo: ");
        System.out.println("(1) - Soma de matrizes;");
        System.out.println("(2) - Subtração de matrizes;");
        System.out.println("(3) - Multiplicação de matrizes;");
        System.out.println("(4) - Produto escalar.");
        System.out.print("Opção: ");

        opcao = scan.nextLine();

        /*Essa função verifica a entrada do usuário e se caso for diferente da
        condição, não executa o projeto.*/
        while (!opcao.matches("[1234]")) {
            System.out.println("Opção inválida, tente novamente!");
            System.out.print("Opção: ");
            opcao = scan.nextLine();
        }

        switch (opcao) {
            //Soma das matrizes
            case "1":
                System.out.println("Informe a primeira matriz:");
                vetorEnt = scan.nextLine().toUpperCase();//Transforma em maiúsculo
                matrizConvert.stringParaVetor(vetorEnt);
                matrizConvert.vetorParaMatriz(matrizConvert.vetor);
                matrizConvert.conversaoMatriz(matrizConvert.matriz);

                System.out.println("Informe a segunda matriz:");
                vetorEnt2 = scan.nextLine().toUpperCase();
                matrizConvert2.stringParaVetor(vetorEnt2);
                matrizConvert2.vetorParaMatriz(matrizConvert2.vetor);
                matrizConvert2.conversaoMatriz(matrizConvert2.matriz);

                matrizResultado.soma(matrizConvert.matrizConvertida,
                        matrizConvert2.matrizConvertida);
                matrizFinal.converterEmRomanos(matrizResultado.matrizResultado);

                break;

            //Subtração das matrizes
            case "2":
                System.out.println("Informe a primeira matriz:");
                vetorEnt = scan.nextLine().toUpperCase();
                matrizConvert.stringParaVetor(vetorEnt);
                matrizConvert.vetorParaMatriz(matrizConvert.vetor);
                matrizConvert.conversaoMatriz(matrizConvert.matriz);

                System.out.println("Informe a segunda matriz:");
                vetorEnt2 = scan.nextLine().toUpperCase();
                matrizConvert2.stringParaVetor(vetorEnt2);
                matrizConvert2.vetorParaMatriz(matrizConvert2.vetor);
                matrizConvert2.conversaoMatriz(matrizConvert2.matriz);

                matrizResultado.subtracao(matrizConvert.matrizConvertida,
                        matrizConvert2.matrizConvertida);
                System.out.println("Como a subtração poderia ocasionar em números negativos,"
                        + "foi optado por deixar a mesma sem a conversão final para romanos.");
                break;

            //Multiplicação das matrizes
            case "3":

                System.out.println("Informe a primeira matriz:");
                vetorEnt = scan.nextLine().toUpperCase();
                matrizConvert.stringParaVetor(vetorEnt);
                matrizConvert.vetorParaMatriz(matrizConvert.vetor);
                matrizConvert.conversaoMatriz(matrizConvert.matriz);

                System.out.println("Informe a segunda matriz:");
                vetorEnt2 = scan.nextLine().toUpperCase();
                matrizConvert2.stringParaVetor(vetorEnt2);
                matrizConvert2.vetorParaMatriz(matrizConvert2.vetor);
                matrizConvert2.conversaoMatriz(matrizConvert2.matriz);

                matrizResultado.multiplicacao(matrizConvert.matrizConvertida,
                        matrizConvert2.matrizConvertida);
                matrizFinal.converterEmRomanos(matrizResultado.matrizResultado);

                break;

            //Produto escalar
            case "4":
                System.out.println("Informe a matriz:");
                vetorEnt = scan.nextLine().toUpperCase();
                matrizConvert.stringParaVetor(vetorEnt);
                matrizConvert.vetorParaMatriz(matrizConvert.vetor);
                matrizConvert.conversaoMatriz(matrizConvert.matriz);

                System.out.println("Informe seu escalar:");
                int escalar = scan.nextInt();

                matrizResultado.multiplicacaoEsc(matrizConvert.matrizConvertida,
                        escalar);
                matrizFinal.converterEmRomanos(matrizResultado.matrizResultado);

                break;

        }

        //Escrita da matriz 1 convertida
//        System.out.println("Conversão da primeira matriz:");
//        for (int i = 0; i < matrizConvert.matrizConvertida.length; i++) {
//            for (int j = 0; j < matrizConvert.matrizConvertida[i].length; j++) {
//                //System.out.print(matriz1[i][j] + "");
//                System.out.print(matrizConvert.matrizConvertida[i][j] + "|");
//            }
//            System.out.println();
//        }
//
//        System.out.println(matrizConvert.matrizConvertida.length + " X " +
//              matrizConvert.matrizConvertida[0].length);

        //Escrita da matriz 2 convertida
//        System.out.println("Conversão da segunda matriz:");
//        for (int i = 0; i < matrizConvert2.matrizConvertida.length; i++) {
//            for (int j = 0; j < matrizConvert2.matrizConvertida[i].length; j++) {
//                //System.out.print(matriz1[i][j] + "");
//                System.out.print(matrizConvert2.matrizConvertida[i][j] + "|");
//            }
//            System.out.println();
//        }
//
//        System.out.println(matrizConvert2.matrizConvertida.length + " X " + matrizConvert2.matrizConvertida[0].length);
        //adicionar verificação para matriz de uma linha só
//        for (int i = 0; i < matrizConvert.matriz.length - 1; i++) {
//
//            if (matrizConvert.matriz[i].length != matrizConvert.matriz[(i + 1)].length) {
//                System.out.println("Matriz inválida. Tente novamente!");
//                break;
//            }
//        }
    }
}
