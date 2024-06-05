public class ExemploForArray {
    public static void main(String[] args)  {

        //em arrays o indice inicia em zero 
        String alunos [] = {"Felipe", "Jonas", "Julia", "Marcos"};

        //for(int x=1; x < alunos.length; x++){

            //System.out.println("O aluno no indice x=" + x +  " é "  + alunos [x]);



        //exemplo2 do uso de array    
            for(String aluno : alunos){

                System.out.println("Nome do aluno é: " + aluno);

            }
        }
    }

