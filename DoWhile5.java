package DoWhile;

public class DoWhile5 {
    public static void main(String[] args) throws InterruptedException {
        int ace=0;
        do{
            Thread.sleep(1000);
            System.out.println("aceleração = "+ (ace) + "m/s²");
            ace++;
        }while(ace<81);

        System.out.println("Você chegou ao seu destino.");

    }
}
