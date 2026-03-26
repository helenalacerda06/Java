public class ResolucaoExercicios {

    // EXERCICIO 1
    public static void variavelValor10() {
        int numero = 10;
        System.out.println("EXERCICIO 1: " + numero);
    }


    // EXERCICIO 2
    public static void variaveldouble() {
        double numero = 5.5;
        System.out.println("EXERCICIO 2: " + numero);
    }


    // EXERCICIO 3
    public static void variavelnome() {
        String nome = "Helena";
        System.out.println("EXERCICIO 3: " + nome);
    }


    // EXERCICIO 4
    public static void variavelVerdadeira() {
        boolean Maria = false;
        boolean Helena = true;
        System.out.println("EXERCICIO 4: " + Helena);
    }


    // EXERCICIO 5
    public static void variavelSoma() {
        int primeroNumero = 2;
        int segundoNumero = 0;
        System.out.println("EXERCICIO 5: " + primeroNumero + segundoNumero);
    }

    // EXERCICIO 6
    public static void mutiplicacaodouble() {
        double primeiroNumero = 2.2;
        double segundoNumero = 3.3;
        System.out.println("EXERCICIO 6: " + primeiroNumero * segundoNumero);
    }


    // EXERCICIO 7
    public static void intParaDouble() {
        int variavelInteira = 3;
        double variavelDouble = variavelInteira;
        System.out.println("EXERCICIO 7: " + variavelDouble);
    }


    // EXERCICIO 8
    public static void stringParaInt() {
        String a = "123";
        int b = Integer.parseInt(a);
        System.out.println("EXERCICIO 8: " + b);
    }


    // EXERCICIO 9
    public static void trocarValoresDeVariaveis(){
        int a = 20;
        int b = 10;
        int temp = a;

        a = b;
        b = temp;
        System.out.println("EXERCICIO 9: " + a +", " + b);
    }

    // EXERCICIO 10
    public static void contanteUsandoFinal(){
        final int primeiroNumero = 15;
        System.out.println("EXERCICIO 10: " + primeiroNumero);
    }


    // EXERCICIO 11
    public static void meuNomeCompleto(){
        String a = "Helena Cardoso de Lacerda";
        System.out.println("EXERCICIO 11: " + a);
    }


    // EXERCICIO 12
    public static void tamanhoString(){
        String a = "Meu nome é Helena, sou filha do Evandro.";
        int stringSize = a.length();
        System.out.println("EXERCICIO 12: " + stringSize);
    }


    //EXERCICIO 13
    public static void stringParaMinusculas(){
        String a = "MEU NOME É HELENA";

    }
}