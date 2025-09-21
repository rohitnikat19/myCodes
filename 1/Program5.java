import java.util.*;
class EvenNum{

        long num;

        EvenNum(long num){

                this.num = num;
        }

        long getEvenAdd(){

                long rem;
                long sum = 0;

                while(num > 0){

                        rem = num % 10;
                        num = num / 10;
                        if(rem % 2 == 0) {

                                sum = sum + rem;
                        }
                }
                return sum;
        }
}

class Client{

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter the Number");
                long num = sc.nextLong();

                EvenNum evenum = new EvenNum(num);
                System.out.println("Addition of Even digits from a number is "+evenum.getEvenAdd());
        }
}
