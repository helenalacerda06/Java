import java.util.Scanner;

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
        int resultado = primeroNumero + segundoNumero;
        System.out.println("EXERCICIO 5: " + resultado);
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
    public static void trocarValoresDeVariaveis() {
        int a = 20;
        int b = 10;
        int temp = a;

        a = b;
        b = temp;
        System.out.println("EXERCICIO 9: " + a + ", " + b);
    }

    // EXERCICIO 10
    public static void contanteUsandoFinal() {
        final int primeiroNumero = 15;
        System.out.println("EXERCICIO 10: " + primeiroNumero);
    }


    // EXERCICIO 11
    public static void meuNomeCompleto() {
        String a = "Helena Cardoso de Lacerda";
        System.out.println("EXERCICIO 11: " + a);
    }


    // EXERCICIO 12
    public static void tamanhoString() {
        String a = "Meu nome é Helena, sou filha do Evandro.";
        int stringSize = a.length();
        System.out.println("EXERCICIO 12: " + stringSize);
    }


    // EXERCICIO 13
    public static void stringParaMinusculas() {
        String a = "MEU NOME É HELENA";
        String aLowerCase = a.toLowerCase();
        System.out.println("EXERCICIO 13: " + aLowerCase);
    }

    // EXERCICIO 14
    public static void stringParaMaiusculas() {
        String a = "meu nome é helena";
        String aUpperCase = a.toUpperCase();
        System.out.println("EXERCICIO 14: " + aUpperCase);
    }


    // EXERCICIO 15
    public static Boolean stringPalavraEspecifica() {
        String frase = "Eu gosto de Jack off Jill";
        String palavra = "gosto";

        Boolean tem = frase.contains(palavra);
        System.out.println("EXERCICIO 15: " + tem);
        return tem;
    }


    // EXERCICIO 16
    public static void stringSubistituirpalavra() {
        String frase = "Meu nome é Maria";
        String palavraOriginal = "Maria";
        String palavraNova = "Helena";
        String resultado = frase.replace(palavraOriginal, palavraNova);
        System.out.println("EXERCICIO 16: " + resultado);
    }


    // EXERCICIO 17
    public static void stingtresPrimeiros() {
        String a = "1234567";
        String tresPrimeiros = a.substring(0, 3);
        System.out.println("EXERCICIO 17: " + tresPrimeiros);
    }


    // EXERCICIO 18
    public static void stingComparacao() {
        String a = "Eu gosto de chocolate";
        String b = "Ela gosta de frutas";
        if (a.equals(b)) {
            System.out.println("As frase são iguais:)");
        } else {
            System.out.println("EXERCICIO 18: " + "As frases não são iguais");
        }
    }


    //EXERCICIO 19
    public static void stingRemoverEspacos() {
        String a = "                    :)                        ";
        String semEspaco = a.trim();
        System.out.println("EXERCICIO 19: " + semEspaco);
    }


    //EXERCICIO 20
    public static void juntarDuasStrings() {
        String a = "Eu estudo no Acesso.";
        String b = "Lá o lanche é caro!";
        String c = a + " " + b;
        System.out.println("EXERCICIO 20: " + c);
    }


    //EXERCICIO 21
    public static void positivoNegativo() {
        int a = -42;

        if (a >= -0) {
            System.out.println("Número positivo :)");
        } else if (a < 0) {
            System.out.println("EXERCICIO 21: " + "Número negativo :(");
        }
    }

    //EXERCICIO 22
    public static void parImpar() {
        int a = 43;

        if (a % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("EXERCICIO 22: " + "impar");
        }
    }

    //EXERCICIO 23
    public static void aprovadoReprovado() {
        int Helena = 70;
        int Henrique = 50;

        System.out.println("EXERCICIO 23: ");
        if (Helena > 59) {
            System.out.println("Nota Helena: " + Helena + " aprovada :)");
        } else {
            System.out.println("Nota Helena: " + Helena + " reprovada");
        }

        if (Henrique > 59) {
            System.out.println("Nota Henrique: " + Henrique + " aprovado:)");
        } else {
            System.out.println("Nota Henrique: " + Henrique + " reprovado");
        }
    }

    //EXERCICIO 24
    public static void idadeMaiorOuMenor() {
        int Helena = 15;
        int Evandro = 43;

        System.out.println("EXERCICIO 24: ");
        if (Helena < 18) {
            System.out.println("Helena é menor de idade.");
        } else {
            System.out.println("Helena é maior de idade.");
        }

        if (Evandro < 18) {
            System.out.println("Evandro é menor de idade.");
        } else {
            System.out.println("Evandro é maior de idade.");
        }
    }


    //EXERCICIO 25
    public static void compareNumerosMostrarMaior() {
        int a = 21;
        int b = 48;

        System.out.println("EXERCICIO 25: ");

        if (a == b) {
            System.out.print("São iguais.");
        } else {
            System.out.print("Não são iguais.");
        }
        if (a > b) {
            System.out.print(a);
        } else {
            System.out.println(b);
        }
    }


    //EXERCICIO 26
    public static void imprimirLoop(){
        System.out.println("EXERCICIO 26: ");
        for (int a = 1; a < 6; a++){
            System.out.println(a);
        }
    }


    //EXERCICIO 27
    public static void imprimirLoopMaior(){
        System.out.println("EXERCICIO 27: ");
        for (int a =10; a > 0; a--){
            System.out.println(a);
        }
    }


    //EXERCICIO 28
    public static void somarNumerosUmACem(){
        System.out.println("EXERCICIO 28: ");

        int soma = 0;
        for (int a = 0; a < 101; a++){
            soma += a;
            System.out.print(a);
        }
        System.out.println(" " + soma);
    }


    //EXERCICIO 29
    public static void loopPares(){
        System.out.println("EXERCICIO 29");

        for (int a = 0; a <= 20; a = a + 2){
            System.out.println(a);
        }
    }


    //EXERCICIO 30
    public static void loopSenha(){
        System.out.println("EXERCICIO 30: ");

        Scanner a = new Scanner(System.in);
        String correta = "1234";
        String digitada = "";

        while (!digitada.equals(correta)) {
            System.out.println("Digite a senha.");
            digitada = a.nextLine();

            if (digitada.equals(correta)){
                System.out.println("Senha incorreta, tente novamente!");
            }
        }
        System.out.println("Acesso liberado!");
        a.close();

    }


    //FrizzBuzz
    public static void frizzBuzz(){
        for (int a = 1; a <= 50; a++){
            if (a % 3 == 0 && a % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (a % 3 == 0){
                System.out.println("Frizz");
            } else if (a % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println( a);
            }
        }
    }




    public static void primos(int a){
        if (a <= 1){
            return false;
        } for (int b = 2; b < a; b++){
            if (b % a == 0){
                return false;
            }
        }
        return true;
    }
}