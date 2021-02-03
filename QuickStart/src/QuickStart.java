import java.util.Scanner;

class QuickStart {
    public static void main(String[] args) {
        Scanner var= new Scanner(System.in);

        /* This part of the prgram will take a number from the user and print whether it is positive or negative */
        System.out.println("    Type in any number and I can tell you whether it is positive or negative. Why not give it a try?");
        int n= Integer.valueOf(var.nextLine());
        if (n>0) {
            System.out.println("*Your number is positive.");
        } else if (n==0) {
            System.out.println("*Your number is 0, which is neither positive nor negative.");
        } else {
            System.out.println("*Your number is negative.");
        }

        /* This part of the program will take 4 numbers and tell the user the sum, difference, quotient, and average. */
        System.out.println("    I can also take 4 numbers that you give me and find their sum, difference, quotient, and average.");
        System.out.println("*Enter your first number here:");
        double n1= Integer.valueOf(var.nextLine());
        System.out.println("*Enter your second number here:");
        double n2= Integer.valueOf(var.nextLine());
        System.out.println("*Enter your third number here:");
        double n3= Integer.valueOf(var.nextLine());
        System.out.println("*Enter your fourth and final number here:");
        double n4= Integer.valueOf(var.nextLine());
        System.out.println("*The sum of your numbers is "+(n1+n2+n3+n4)+"; the difference of your numbers is "+(n1-n2-n3-n4)+"; the quotient of your numbers is "+(n1/n2/n3/n4)+"; the average of your numbers is "+((n1+n2+n3+n4)/4)+".");

        /* I couldn't understand what "grade" I'm supposed to use, so this part of the program will tell a user what their grade is on a test. */
        System.out.println("    Oh, before you leave, I can even tell you your score on a test. Heads up, I will ask you input the total points available and how many points you got.");
        System.out.println("*Enter the total points available here:");
        double total= Integer.valueOf(var.nextLine());
        System.out.println("*Enter how many points you got here:");
        double score= Integer.valueOf(var.nextLine());
        System.out.println("*Your score on the test was "+((score/total)*100)+"%.");
        System.out.println("    That's all for now, so goodbye, and hopefully I'll see you again. Feel free to use this program anytime.");
    }
}