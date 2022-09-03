import java.util.Scanner; 
 class FirstLetterPrinter{ 
     public static void main(String[] args) { 
     Scanner in = new Scanner(System.in); 
     String input = in .nextLine(); 
     System.out.println(firstLetterPrinter(input)); 
     } 
    static String firstLetterPrinter(String str) { 
        String str2="";
        if(str.trim()!=null){
            String[] stringarray=str.split( "[\\s,.]+");
            for(String a:stringarray){
                char[] chararray=a.toCharArray();
                str2+=chararray[0];
            }
        }
        return str2;
    }
}
