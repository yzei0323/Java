import java.util.Scanner;

public class  Ex01{

   public static void main( String[] args) {   
 
      int  pos_cnt=0 ,  neg_cnt=0, even_cnt=0,  odd_cnt=0 ;
      int  input ;
      int  n=1; 

      Scanner sc = new Scanner( System.in);

      while( n<=5){
            input  = sc.nextInt();
            if( input  >0 ){
                   pos_cnt= pos_cnt+1;                 
                   if( input %2  == 0){
                         even_cnt++;
                   }else{
                         odd_cnt++;
                   }                  
            }else{
                   neg_cnt= neg_cnt+1;
            }      
           n++;   
      }

       System.out.println("post_cnt = " + pos_cnt);
       System.out.println("neg_cnt = " + neg_cnt);
       System.out.println("even_cnt = " + even_cnt);
       System.out.println("odd_cnt = " + odd_cnt);
   }
}
