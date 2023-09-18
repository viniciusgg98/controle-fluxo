import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem){
        super(mensagem);
    }
}

public class Contador{
    
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
       

        System.out.println("Digite o primeiro parametro");
        int parametroUm = input.nextInt();

        System.out.println("Digite o segundo parametro");
        int parametroDois = input.nextInt();
        input.close();
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
                System.out.println(e.getMessage());
            
        }
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O segundo pârametro deve ser maior que o primeiro");
        } else {
            for (int i = 1; parametroUm < parametroDois; i++, parametroUm++) {
                System.out.println("Imprimindo o número "+ i);
                }
            }
    }
}