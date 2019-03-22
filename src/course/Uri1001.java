package course;

import java.io.IOException;
import java.util.Scanner;

public class Uri1001 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println("X = " + (A + B));


        sc.close();

    }

}