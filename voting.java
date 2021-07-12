
// Written by M.R.VIJAY PRASAD MTECH SOFTWARE ENGINEER

import java.util.Scanner;
public class voting {
    public static void main(String[] v){
        System.out.println("WELCOME TO THE VOTING APPLICATION  \n ");
        System.out.print("Enter your age for voting  : ");
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        if(age>=18){
            System.out.println("You can vote");
        }
        else
            System.out.println("You can't vote");
    }
}



// Written by M.R.VIJAY PRASAD MTECH SOFTWARE ENGINEER