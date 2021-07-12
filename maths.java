
// Written by M.R.VIJAY PRASAD MTECH SOFTWARE ENGINEER


import java.util.Scanner;
public class maths
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double c;
        System.out.print("Enter the two numbers : " );
        double a = s.nextInt();
        double b = s.nextInt();
        System.out.println("Press 1 for addition \n");
        System.out.println("Press 2 for subtraction\n ");
        System.out.println("Press 3 for multiplication \n");
        System.out.println("Press 4 for divition \n");
        int press = s.nextInt();
        if(press == 1){
             c = a+b;
            System.out.println("Addition is "  +  c);
        }
        else if(press == 2){
            c = a-b;
            System.out.println("subtraction is "  +  c);
        }
        else if(press == 3){
            c = a*b;
            System.out.println("multiplication is "  +  c);
        }
        else if(press == 4){
            c = a/b;
            System.out.println("Division is "  +  c);
        }
        else{
            System.out.println("Invalid Number");
        }
    }
}

// Written by M.R.VIJAY PRASAD MTECH SOFTWARE ENGINEER