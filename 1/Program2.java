import java.util.*;

class FactorialNum {

        int num;
        int prod = 1;

        FactorialNum(int num){

                this.num = num;
        }

        int factorial(){

                for(int i = 1; i<=num; i++){

                        prod = prod*i;
                }

                return prod;
        }

}

class Client {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter the Number to get factorial");
                int num = sc.nextInt();

                FactorialNum fn = new FactorialNum(num);

                System.out.println(fn.factorial());

        }
}
