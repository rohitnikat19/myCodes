import java.util.*;

class RevNum {

        int num;
        int rev;

        RevNum(int num){

                this.num = num;
        }

        int getReverseNum() {

                while(num > 0){

                        int rem = num % 10;
                        rev = rev * 10 + rem;
                        num = num / 10;
                }
                return rev;

        }

}

class Client {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter the Number");
                int num = sc.nextInt();

                RevNum revNum = new RevNum(num);

                System.out.println("Reverse Number is " +(revNum.getReverseNum()));

        }
}
