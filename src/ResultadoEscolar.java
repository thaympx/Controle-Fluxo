public class ResultadoEscolar {
    public static void main(String[] args) {
       int nota = 10;

//fluxo "se" for verdadeiro
      // if (nota >= 7) 
       //System.out.println("Aprovado");

//Condição encandeada
       //else if (nota >=5 && nota < 7)
        //System.out.println("Prova de Recuperação");

//fluxo "se não" for falso
      // else
       //System.out.println("Reprovado");

//Condição ternária 
    
        //String resultado = nota >= 7 ? "Aprovado" :  "Reprovado";

         //System.out.println(resultado);


         String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
         
         System.out.println(resultado);

    }
}
