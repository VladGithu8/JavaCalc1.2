package CalculaitorMain;

import java.util.Scanner;

class Main {
    static class Action extends iMethod {

        @Override
        void summa() {}

        @Override
        void div() {}

        @Override
        void min() {}

        @Override
        void mult() {}
    }
        public static void main(String[] args) {
            
            int exit = 0;
            String Greet = "Greetings! This is command line calculator!";
            String twoNums = ":::Choose two numbers:::";

            Action a = new Action();
            System.out.println(Greet);
            System.out.println(twoNums);

            Scanner scan = new Scanner(System.in);
            
            /// Start loop
            do{ 
                
            System.out.print("First number: ");
            Double firstNum = scan.nextDouble();
            System.out.print("Second number: ");
            Double secondNum = scan.nextDouble();

            System.out.println("1.+\n2.-\n3./\n4.*");
            System.out.println("Choose number of method :");

            int choose = scan.nextInt();

                switch (choose) {
                case 1:
                    a.summa(firstNum, secondNum);
                    exit = scan.nextInt();
                    break;
                case 2:
                    a.min(firstNum, secondNum);
                    exit = scan.nextInt();
                    break;
                case 3:
                    a.div(firstNum, secondNum);
                    exit = scan.nextInt();
                    break;
                case 4:
                    a.mult(firstNum, secondNum);
                    exit = scan.nextInt();
                    break;}

             } while (exit!=2);
            
            /// End loop
            System.out.println("The End");
    }
}
