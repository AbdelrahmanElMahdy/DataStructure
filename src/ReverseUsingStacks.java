import java.util.Scanner;
import java.util.Stack;

public class ReverseUsingStacks {
    public static String reversed() {
        System.out.print("please input:");
        String forward_word =new Scanner(System.in).nextLine();

        int len=forward_word.length();
        var stack = new Stack();


        for(int index=0;index < len ;index++)
            stack.push(forward_word.charAt(index));

        forward_word="";
        for(int current=0;current < len ;current++)
            forward_word += stack.pop();

        return forward_word;
    }
}
