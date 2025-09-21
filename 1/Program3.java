import java.util.*;

class Digits {

        int num;

        Digits(int num){

                this.num = num;
        }

        void getDigit(){

                String s_num = Integer.toString(num);

                for(int i = 0; i < s_num.length(); i++){

                        System.out.println(s_num.charAt(i));

                }
        }

}

class Client {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter the Number");
                int num = sc.nextInt();

                Digits digit = new Digits(num);

                digit.getDigit();
        }
}
