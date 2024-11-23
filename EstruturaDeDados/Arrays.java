package estudos.EstruturaDeDados;

public class Arrays {
    public static void main(String[] args) {
        
        /*
         * Arrays são variáveis/estuturas capazes de armazenar multiplos valores
         * omogêneos, em outras palavras, estruturas capazes de armazenar dados
         * do mesmo tipo por exemplo, dados do tipo int ou String.
         */

        /*
         * Os arrays em java obedecem a seguinte norma: tipo[] nomeDoArray = new tipo[tamanho(int)];
         */

         String[] frutas = new String[5]; //Define o tipo e o tamanho do array;
         frutas[0] = "Maçã"; //Elemento do array;
         frutas[1] = "Pêra"; //Elemento do array;
         frutas[2] = "Úva"; //Elemento do array;
         frutas[3] = "Laranja"; //Elemento do array;
         frutas[4] = "Morango"; //Elemento do array;

        int i; //Variável contadora;

        for(i = 0; i < frutas.length; i++){ //Laço de repetição para interará os sobre o array;
            System.out.println(frutas[i]); //Imprime os elementos do array;
        }

    }
}
