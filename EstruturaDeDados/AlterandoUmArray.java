public class AlterandoUmArray {
    public static void main(String[] args) {
        /*
         * Declarando um array associativo;
         */

         String[] carros = {
            "FIAT Uno",
            "Gol GT",
            "Miura X8",
            "Santana",
            "Fusca"
         };

         /*
          * Alterando um valor do array
          */

          carros[3] = "Golf";

         for(int i = 0; i < carros.length; i++){
            System.out.println(carros[i]);
         }
    }
}
