import java.util.Scanner;


public class calculadora {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int opcao;
        double n1, n2, resultado;
        do {
            System.out.println("Digite uma opção: ");
            System.out.println("1. Soma\n2.Subtração\n3.Multiplicação\n4.Divisão\n5.FIM");
            opcao = leia.nextInt();
            System.out.println("Digite o primeiro número: ");
            n1 = leia.nextDouble();
            System.out.println("Digite o segundo número: ");
            n2 = leia.nextDouble();

            switch (opcao){
                case 1:
                    resultado = n1 + n2;
                    System.out.println("A soma dos números é igual a: "+resultado);
                    break;
                case 2:
                    resultado = n1 - n2;
                    System.out.println("A subtração dos números é igual a: "+resultado);
                    break;
                case 3:
                    resultado = n1 * n2;
                    System.out.println("A multiplicação dos números é igual a: "+resultado);
                    break;
                case 4:
                    if (n2 != 0){
                        resultado = n1 / n2;
                        System.out.println("A divisão dos números é igual a: "+resultado);
                    }else {
                        System.out.println("Coloque um divisor válido");
                        while (n2 == 0){
                            System.out.println("Digite o divisor: ");
                            n2 = leia.nextDouble();
                        }
                        resultado = n1 / n2;
                        System.out.println(("A divisão dos números é igual a: " + resultado));
                    }
                    break;
                case 5:
                    break;
            }
        }while(opcao!=5);
    }
}
