import java.util.*;

class Fibo {

        int num;

        Fibo(int num){

                this.num = num;
        }

        void fiboSeries() {

                int currentAns = 1;
                int prevAns = 0;
                int temp;

                for(int i = 0; i<num; i++){

                        System.out.print(prevAns+" ");

                        temp = prevAns + currentAns;
                        prevAns = currentAns;
                        currentAns = temp;
                }
                System.out.println();
        }
}

class Client {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter the Number: ");
                int num = sc.nextInt();

                Fibo fibo = new Fibo(num);
                fibo.fiboSeries();
        }
}
