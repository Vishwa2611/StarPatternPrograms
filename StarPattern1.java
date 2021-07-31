//Java program to print    ` * ** *** *** ** * `  pattern based

public class StarPattern1 {

    public static void main(String[] args) {

        int n = 30;
      
        int mid = n / 2;

        for(int i = 1 ; i <= n ; i++){

            boolean midCheck =  i <= mid ;

            int j;

            boolean cond = true;

            if(midCheck){
                j= 0;
                cond = j < i;
            }else{
                j = n - i ;
            }

            while(cond) {

                System.out.print("*");

                if(midCheck){

                    j++;

                    cond = j < i;

                }else{

                    cond = j >= 1;

                    j--;
                }
            }


            System.out.print(" ");
        }

    }
}
