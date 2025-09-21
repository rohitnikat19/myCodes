import java.util.*;
class EvenOddSquare{

        long num;

        EvenOddSquare(long num){

                this.num = num;
        }

        void evenOdd(){

                long rem;

                while(num > 0){
                        rem = num % 10;
                        num = num / 10;

                        if(rem % 2 == 0){

                                System.out.println("Even digit "+rem);
                        }else{
                                System.out.println("Odd digit Square "+(rem*rem));
                        }
                }
        }
}

class Client{

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter a Number");
                long num = sc.nextLong();

                EvenOddSquare eos = new EvenOddSquare(num);
                eos.evenOdd();


        }
}
