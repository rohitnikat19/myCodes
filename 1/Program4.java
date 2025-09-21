
import java.util.*;

class SquareRoot{

        int num;

        SquareRoot(int num){

                this.num = num;
        }

        int getSquareRoot(){

                int ans = 0;

                for(int i = 0; i <=num/2; i++){

                        if(i*i == num){

                                ans = i;

                        }
                }
                if(ans != 0){

                        return ans;
                } else {

                        return 0;
                }

        }
}

class Client{

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter Number to get Square Root");
                int num = sc.nextInt();

                SquareRoot sqroot = new SquareRoot(num);
                System.out.println(sqroot.getSquareRoot());

        }
}
