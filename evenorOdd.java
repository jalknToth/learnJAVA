import java.util.Scanner;

public class evenOdd {

        public static void main(String[] args) {
                //Ask for number
                Scanner sc = new Scanner(System.in);
                System.out.println("Write a number");
                int x = sc.nextInt();

                // Find out if the number above is even or odd
                if (x % 2 == 0) {
                        System.out.println(x + " is even.");
                } else {
                        System.out.println(x + " is odd.");
        }
    }
}



/*
python


number = int(input("Write a number: "))

if number % 2 == 0:
        print(x, "is even")
else:
        print(x, "is ood")



*/
