import java.util.*;

class PerfectNum {

        int num;

        PerfectNum(int num){

                this.num = num;
        }

        void findSomeOnePerfect(){

                int sum = 0;

                for(int i = 1; i<=num/2; i++){

                        if(num % i == 0){

                                sum = sum + i;
                        }
                }
                if(sum == num ){
                        System.out.println(num+" is perfect number");
                } else {
                        System.out.println(num+" is not perfect number");
                }
        }
}

class Client {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter the Number: ");
                int num = sc.nextInt();

                PerfectNum pn = new PerfectNum(num);
                pn.findSomeOnePerfect();

        }
}
