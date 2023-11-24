package DoWhile;

import java.util.Scanner;

public class DoWhile3 {
    public static void main(String[] args) {
        Scanner quantScanner = new Scanner(System.in);
        Scanner prodScanner = new Scanner(System.in);

        System.out.println("Digite quantos produtos serão informados: ");
        int quant = quantScanner.nextInt();

        String vetor[];
        vetor = new String[quant];
        int i=0;
        do{
            System.out.println("Informe o "+(i+1)+"º produto.");
            vetor[i]=prodScanner.nextLine();
            i++;
        }while(i<quant);

        System.out.println("Produtos informados: ");
        for (int t=0; t<quant; t++){
            System.out.println(vetor[t]);
        }
        quantScanner.close();
        prodScanner.close();
    }
}
