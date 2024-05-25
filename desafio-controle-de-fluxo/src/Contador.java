import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parametro");
        int parametroDois = scanner.nextInt();

        try{
            contar(parametroUm, parametroDois);
        }        
        catch(ParametrosInvalidosException exception){
            System.out.println("O segundo parametro deve ser maior do que o primeiro");
        }

      

    }
    public static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        
        if(parametroDois < parametroUm){
            System.out.println("entrou no if");
            throw new ParametrosInvalidosException();
       
        }

        int cont = parametroDois - parametroUm;
        
        for(int i = 0; i <= cont; i++){
            System.out.println(i);
        }
    }
}
