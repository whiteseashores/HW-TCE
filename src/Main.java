//input java.util.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = 1;
        int[] arr1 = {1, 2, 3};

        do {
            try {
                System.out.println("Please enter a number : ");
                int N = input.nextInt();
                System.out.println(arr1[N]);
                x = 2;
            }
            catch (Exception e) {
                System.out.println("This is why QA Engineers always have to do boundary testing! The array only has 3 values and you've requested a 4th !");
            }
        } while(x==1);
    }


}