public class ParametrosInvalidosException extends Exception{
    static void validarParametro (int parametroUM, int parametroDois) throws ParametrosInvalidosException{
        if(parametroDois < parametroUM){
            System.out.println("Não é possivel fazer uma lista com o segundo parametro menor que o primeiro");
            
        }
            
    }
    
}
