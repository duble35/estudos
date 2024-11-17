package classRoom;

import java.util.Stack;

public class Pilha {
    public static void main(String[] args){
        
       /*
        Aqui estou utilizando o conceito de pilha (Stack),
        a pilha de forma distinta de um array comum permite
        adicionar e retirar um elemento do fim da pilha, neste caso,
        o último elemento adicionado ao topo da pilha também é o primeiro
        a ser retirado da pilha.
        para adicionar um elemento na pilha utilizamos o método push,
        para retirar um elemento da pilha utilizamos o método pop e
        para aferir se a pilha está vazia utilizamos o método empity.
        */
           
       Stack pilha = new Stack();
       pilha.push("Carlos Sousa");
       pilha.push("Adriene Cristina");
       
      if(!pilha.empty()){
          pilha.pop();//Retirou o último nome adicionado na pilha
          pilha.pop();//Retirou o último nome adicionado na pilha
          System.out.println(pilha);
      }else{
          System.out.println("A pilha esta vazia.");
      }
        
    }
}
