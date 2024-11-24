public class ArrayCopy {
    
    /*
     * Neste estudo utilizo o array copy, esta função tem como objetivo
     * copiar um array de forma integral ou parcial;
     */
    public static void main(String[] args) {
        int[] matriz = {2,4,6,8,1,0,1,2};//Matriz inicial;
        int[] copy = new int[3];//Matriz cópia;
        System.arraycopy(matriz, 0, copy, 0, 3);//Função que copia a matriz;
        for(int i = 0; i < copy.length; i++){//Iteração sobre a matriz cópia;
            System.out.println(copy[i]);
        }
    }    
}
