import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstUniqueInHash {
    public static char FirstUniqueInHash(String name){
        Map<Integer,Character> map = new HashMap<>();
        System.out.print(" :");
        for(int index=0;index<name.length();index++)
            map.put(index,name.charAt(index));

        int current=0;
        char unique=' ';
        for (int i =0 ;i< name.length();i++){
            for (int j=0;j< name.length();j++){
                if(map.get(i)==map.get(j) && i !=j)
                    current++;
            }
            if (current==0){
                unique=map.get(i);
                break;
            }
            else current=0;

        }
        return unique;
    }
}
