import java.io.*;
import java.util.*;

public class Selde {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bil = in.nextInt();

        if (bil == selde(bil)){
            System.out.println(bil + " adalah selde.");
        }
        else {
            System.out.println(bil + " bukan selde.");
        }
    }

    public static int selde(int bil){
        int rev = 0;
        while (bil!=0){
            rev = rev*10 + bil%10;
            bil = bil/10;
        }
        return rev;
    }
}