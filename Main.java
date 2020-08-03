package CalculaitorMain;

import java.util.Scanner;


class Main {
    static class Action extends iMethod {

        @Override
        void summa() {
        }

        @Override
        void div() {
        }

        @Override
        void min() {
        }

        @Override
        void mult() {
        }
    }


    public static void main(String[] args) {

        //String cont,exit;

        String Greet = "Greetings! This is command line calculator!";
        String twoNums = ":::Choose two numbers:::";

        Action a = new Action();
        System.out.println(Greet);
        System.out.println(twoNums);


        Scanner scan = new Scanner(System.in);
        int firstNum = scan.nextInt();
        int secondNum = scan.nextInt();


        System.out.println("1.+\n2.-\n3./\n4.*");
        System.out.println("Choose number of method :");

        int choose = scan.nextInt();

        //int exitContinue = scan.nextInt();
        switch (choose) {
            case 1:
                a.summa(firstNum, secondNum);
                break;
            case 2:
                a.min(firstNum, secondNum);
                break;
            case 3:
                a.div(firstNum, secondNum);
                break;
            case 4:
                a.mult(firstNum, secondNum);
                break;
        }



        }



    }




