package CalculaitorMain;

public abstract class iMethod implements SUM,DIV,MULT,MIN {

    abstract void summa();

    abstract void div();

    abstract void min();

    abstract void mult();
}


    interface SUM {
        public default int summa(int num1, int num2) {
            int action = num1 + num2;
            System.out.println("Your result is: " + action);
            return action;
        }

    }

    interface DIV {


        public default int div(int num1, int num2) throws ArithmeticException  {
            try {
                if (num2 == 0) {
                    System.out.println("Zero ERROR");
                }
            }
            catch (ArithmeticException e){
                System.out.println("Don't play with ZerO");
            }
            finally {
            restart:;}


            int action = num1 / num2;
            System.out.println("Your result is: " + action);
            return action;
        }
    }

    interface MULT {


        public default int mult(int num1, int num2) {
            int action = num1 * num2;
            System.out.println("Your result is: " + action);
          return (int) action;
        }
    }

    interface MIN {


        public default int min(int num1, int num2) {
            double action = num1 - num2;
            System.out.println("Your result is: " + action);
        return (int) action;
        }
    }

