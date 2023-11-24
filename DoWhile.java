package DoWhile;

public class DoWhile {
    public static void main(String[] args) throws InterruptedException {

		int i = 0;
		do {
            Thread.sleep(1000);
			System.out.println(i+" segundos se passaram, continue a assisir o filme.");
			i++;
		} while (i <= 7200);
	}
}
