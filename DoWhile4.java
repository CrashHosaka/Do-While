package DoWhile;

import java.util.Scanner;

public class DoWhile4 {
    public static void main(String[] args) {
        int i=1;
        float valor;
        float total=0;
        Scanner valorInf = new Scanner(System.in);

        System.out.println("Digite um valor menor ou igual a 0 para parar o programa.");
        do {
            System.out.println("Informe o valor do " + i + "º produto");
            valor = valorInf.nextFloat();
            total =total + valor;
            i++;
        } while (valor>0);

        System.out.println("Preço total a pagar: R$:" + total);

        valorInf.close();
    }
}
