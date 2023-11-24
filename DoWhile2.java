package DoWhile;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        Scanner quantScanner = new Scanner(System.in);

        System.out.println("Digite quantos logins serão informados:");
        int quant = quantScanner.nextInt();

        Scanner loginScanner = new Scanner(System.in);
        int i = 0;
        String login[];
        login = new String[quant];

        do{
            System.out.println("Realize o seu login: ");
            login[i] = loginScanner.nextLine();
            i++;
        }while(i<quant);
        
        for (int t=0; t<quant ; t++){
            System.out.println((t+1) +"º login: "+ login[t]);
        }
        loginScanner.close();
        quantScanner.close();

    }
}
