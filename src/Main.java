import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
HashTable T=new HashTable();
        System.out.println(T.lst); ;
        T.remove(0);
        T.put(10,"Ahmed");
        T.put(15,"mahdy");
        T.put(0,"jj");
        System.out.println(T.get(0));
        T.remove(0);
        System.out.println(T.get(0));

    }
}