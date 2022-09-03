import java.util.Scanner; 
 
class PatternPrinter{ 
 public static void main(String[] args) { 
 Scanner in = new Scanner(System.in); 
 int n = in .nextInt(); 
 patternPrinter(n); 
 } 
 static void patternPrinter(int n) {
     if(n==0){
         System.out.println("");
     }
     for(int i=n;i>0;i--){
         int number=n;
         while(number>=1){
                if(i==1){
                    int k=0;
                     while(k<n){
                    System.out.println(number+" ");
                    k++;
                    number=number-1;
                    } 
                }
                else{
                int k=0;
                while(k<i){
                    System.out.println(number+" ");
                    k++;
                } 
                number=number-1;
                }
         }
         System.out.println("\n");
     }
 // write your code here 
 } 
} 