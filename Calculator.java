import java.util.*;
class Calculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no1 : ");
        int a=sc.nextInt();
        
        System.out.println("enter no2 : ");
        int b=sc.nextInt();
        
        System.out.println("enter operator what you want to do like +,-,*,/: ");
        char operator=sc.next().charAt(0);
        
        switch (operator){
            case '+':
                System.out.println("Addition is : "+(a+b));
                break;
                case '-':
                    System.out.println("Substraction is :" +(a-b));
                    break;
                    case '*':
                        System.out.println("Multiplication is :" +(a*b));
                        break;
                        case '/':
                            System.out.println("Division is : "+(a/b));
        }
        
        
    }
}