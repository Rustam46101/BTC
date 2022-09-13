import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double btc=0, usd=0;
        double btcusd=0;
        Scanner in = new Scanner(System.in);
        System.out.print("What is Bitcoin price today?");
        btc = in.nextInt();

        System.out.print("How much $ do you have?");
        usd = in.nextInt();

        btcusd=usd/btc;
        System.out.printf("You can buy  %f btc \n", btcusd);
        in.close();



    }
}