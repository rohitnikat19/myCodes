import java.util.*;

class CompositeOrNot {

        int num;

        CompositeOrNot(int num){

                this.num = num;
        }

        String checkComposite(){

                int k = 0;

                for(int i = 1; i<= 9; i++) {

                        if(num % i == 0){
                                k++;
                        }
                }
                if(k > 2){
                        return "Number "+num+" is Composite";

                } else {

                        return "Number "+num+" is not Composite";
                }
        }
}

class Client {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter the Number");
                int num = sc.nextInt();

                CompositeOrNot con = new CompositeOrNot(num);

                System.out.println(con.checkComposite());

        }
}
