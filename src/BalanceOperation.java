import java.util.Scanner;
import java.util.Stack;

public class BalanceOperation {

    public static void balancedOperation() {
        System.out.print("please input:");
        String operation = new Scanner(System.in).nextLine();

        int len = operation.length();
        Stack<Character> stack= new Stack();

        String signed = "[](){}<>";


        int sign_len = 0;
        int counter_1 = 0; // for [
        int counter_2 = 0; // for (
        int counter_3 = 0; // for <
        int counter_4 = 0; // for {


        for (int index = 0; index < len; index++) {
            char current_char = operation.charAt(index);
            if (signed.indexOf(current_char) != -1) {
                stack.push(current_char);
                sign_len++;
                if (current_char == '[')
                    counter_1++;
                else if (current_char == '(')
                    counter_2++;
                else if (current_char == '<')
                    counter_3++;
                else if (current_char == '{')
                    counter_4++;

            }

        }

        System.out.println(counter_1 + " " + counter_2 + " " + counter_3 + " " + counter_4);

        int check = 0;
        for (int current = 0; current < sign_len/2 ; current++) {
            check = checkCase(stack.pop());
            char check_char=stack.pop();
            switch (check) {
                case 1:
                    if(check_char == ']')
                        break;
                    else if (check_char == '[') {
                        counter_1--;
                    } else {
                        System.out.println("missing ]");
                    }
                    break;
                case 2:
                    if(check_char == ')'){
                        counter_2--;
                        break;}
                    else if (check_char == '(') {
                        counter_2--;
                    } else {
                        System.out.println("missing )");
                    }
                    break;
                case 3:
                    if(check_char == '<')
                        break;
                    else if (check_char == '>') {
                        counter_3--;
                    } else {
                        System.out.println("missing >");
                    }
                    break;
                case 4:
                    if(check_char== '}')
                        break;
                    else if (check_char == '{') {
                        counter_4--;
                    } else {
                        System.out.println("missing }");
                    }
                    break;

            }

        }
        if (counter_1 != 0)
            System.out.println("missing" + counter_1 + " of ]");
        if (counter_2 != 0)
            System.out.println("missing" + counter_2 + " of )");
        if (counter_1 != 0)
            System.out.println("missing" + counter_3 + " of >");
        if (counter_1 != 0)
            System.out.println("missing" + counter_4 + " of }");
        if(counter_1==0 && counter_2==0 && counter_3==0 && counter_4==0)
            System.out.println("all is good");
    }


    public static int checkCase(char sign) {
        int check = 0;
        if (sign == '[' || sign == ']')
            check = 1;
        else if (sign == '(' || sign == ')' )
            check = 2;
        else if (sign == '<' || sign == '>')
            check = 3;
        else if (sign == '{' || sign == '}')
            check = 4;
        return check;
    }
}
