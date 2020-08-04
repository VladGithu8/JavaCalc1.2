package CalculaitorMain;

public abstract class iMethod implements SUM,DIV,MULT,MIN {

    abstract void summa();
    abstract void div();
    abstract void min();
    abstract void mult();
}
    interface SUM {
        public default Double summa(Double num1, Double num2) {
            Double result = num1 + num2;
            System.out.println("Your result is: " + result );
            System.out.println("Choose: \n1.To continue.\n2.To Exit.");
            return result;}

        public default Integer summa(Integer num1, Integer num2) {
            Integer result = num1 + num2;
            System.out.println("Your result is: " + result );
            System.out.println("Choose: \n1.To continue.\n2.To Exit.");
            return result;}

        public default Double summa(Integer num1, Double num2) {
            Double result = num1 + num2;
            System.out.println("Your result is: " + result );
            System.out.println("Choose: \n1.To continue.\n2.To Exit.");
            return result;}

        public default Double summa(Double num1, Integer num2) {
            Double result = num1 + num2;
            System.out.println("Your result is: " + result );
            System.out.println("Choose: \n1.To continue.\n2.To Exit.");
            return result;}
    }

    interface DIV {
         default Double div(Double num1, Double num2) throws ArithmeticException  {
             try {
                 if (num2 == 0) {
                     System.out.println("Zero ERROR");}
             }
             catch (ArithmeticException e){
                 System.out.println("Don't play with ZerO");}
             finally {}
             Double result  = num1 / num2;
             System.out.println("Your result is: " + result );
             System.out.println("Choose: \n1.To continue.\n2.To Exit.");
             return result ;}
             
         default Integer div(Integer num1, Integer num2) throws ArithmeticException  {
            try {
                if (num2 == 0) {
                    System.out.println("Zero ERROR");}
            }
            catch (ArithmeticException e){
                System.out.println("Don't play with ZerO");}
            finally {}
            Integer result  = num1 / num2;
            System.out.println("Your result is: " + result );
            System.out.println("Choose: \n1.To continue.\n2.To Exit.");
            return result ;}
            
        default Double div(Integer num1, Double num2) throws ArithmeticException  {
            try {
                if (num2 == 0) {
                    System.out.println("Zero ERROR");}
            }
            catch (ArithmeticException e){
                System.out.println("Don't play with ZerO");}
            finally {}
            Double result  = num1 / num2;
            System.out.println("Your result is: " + result );
            System.out.println("Choose: \n1.To continue.\n2.To Exit.");
            return result ;}
            
        default Double div(Double num1, Integer num2) throws ArithmeticException  {
            try {
                if (num2 == 0) {
                    System.out.println("Zero ERROR");}
            }
            catch (ArithmeticException e){
                System.out.println("Don't play with ZerO");}
            finally {}
            Double result  = num1 / num2;
            System.out.println("Your result is: " + result );
            System.out.println("Choose: \n1.To continue.\n2.To Exit.");
            return result ;}
    }

    interface MULT {
        public default Double mult(Double num1, Double num2) {
            Double result = num1 * num2;
            System.out.println("Your result is: " + result );
            System.out.println("Choose: \n1.To continue.\n2.To Exit.");
            return result;}

        public default Integer mult(Integer num1, Integer num2) {
            Integer result = num1 * num2;
            System.out.println("Your result is: " + result );
            System.out.println("Choose: \n1.To continue.\n2.To Exit.");
            return result;}

        public default Double mult(Integer num1, Double num2) {
            Double result = num1 * num2;
            System.out.println("Your result is: " + result );
            System.out.println("Choose: \n1.To continue.\n2.To Exit.");
            return result;}

        public default Double mult(Double num1, Integer num2) {
            Double result = num1 * num2;
            System.out.println("Your result is: " + result );
            System.out.println("Choose: \n1.To continue.\n2.To Exit.");
            return result;}
    }

    interface MIN {
        public default Double min(Double num1, Double num2) {
            Double result = num1 - num2;
            System.out.println("Your result is: " + result );
            System.out.println("Choose: \n1.To continue.\n2.To Exit.");
            return result;}

        public default Integer min(Integer num1, Integer num2) {
            Integer result = num1 - num2;
            System.out.println("Your result is: " + result );
            System.out.println("Choose: \n1.To continue.\n2.To Exit.");
            return result;}

        public default Double min(Integer num1, Double num2) {
            Double result = num1 - num2;
            System.out.println("Your result is: " + result );
            System.out.println("Choose: \n1.To continue.\n2.To Exit.");
            return result;}

        public default Double min(Double num1, Integer num2) {
            Double result = num1 - num2;
            System.out.println("Your result is: " + result );
            System.out.println("Choose: \n1.To continue.\n2.To Exit.");
            return result;}
            }




