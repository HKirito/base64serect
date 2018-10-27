import java.io.IOException;
import java.util.Base64;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Base64.Decoder decoder = Base64.getDecoder();
        Base64.Encoder encoder = Base64.getEncoder();
        System.out.print("Enter your charest :");
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        byte[] text = str.getBytes("UTF-8");

        String enconded = encoder.encodeToString(text);
        System.out.println("Enocoding :"+enconded);
        System.out.println(new String(decoder.decode(enconded),"UTF-8"));

    }
}
