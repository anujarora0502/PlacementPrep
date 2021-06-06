import java.util.*;

public class compressString{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        String str = scn.nextLine();
         
        StringBuilder sb = new StringBuilder();

        int count = 1;
        char previous = str.charAt(0);
        sb.append(str.charAt(0));

        for(int i = 1;i<str.length();i++){
            if(str.charAt(i) == previous){
               count++;
            }else{ 
               sb.append(count);
               sb.append(str.charAt(i));
               previous = str.charAt(i);
               count = 1;
            }

        }

        sb.append(count);

        if(sb.length()<str.length()){
            System.out.println(sb.toString());
        }else{
            System.out.println(str);
        }
        

        scn.close();

    }
}