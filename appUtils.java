
import java.util.Scanner;

public class appUtils {
    public static final Scanner scn = new Scanner(System.in);

    public static int readInt() {
        while (!appUtils.scn.hasNextInt()) {
            System.out.println("Input tidak valid. Silakan masukkan angka.");
            appUtils.scn.next();
        }
        int result = scn.nextInt();
        appUtils.scn.nextLine();
        return result;
    }

    public static String readLine() {
        String result = scn.nextLine();
        return result;
    }

    public static double readDouble(){
        while (!appUtils.scn.hasNextDouble()) {
            System.out.println("Input tidak valid. Silakan masukkan angka.");
            appUtils.scn.next();
        }
        double result = scn.nextDouble();
        appUtils.scn.nextLine();
        return result;
    }

    public static boolean konfirmasi(String text) {
        System.out.println(text + " (Y/N)");
        String konfirmasi = readLine();
        return konfirmasi.toLowerCase().equals("y");
    }
}
