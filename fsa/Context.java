package fsa;
import java.util.Scanner;
/**
 *
 * @author brett
 */
public class Context {
    public AbstractState current;
    char str;
    public Context(){
        current = new State1Minus(this);
    }
    public void run(){
         System.out.println("Enter a, b, or c. q to quit");
        while(true){           
            Scanner input = new Scanner(System.in);
            str = input.next().charAt(0);
            if (str == 'a'){            
                current.op1();
            }
            else if (str == 'b'){
                current.op2();
            }
            else if (str == 'c'){
                current.op3();
            }
            else{
                if (current.isFinal()){
                    System.out.println("word accepted");
                }
                else{
                   System.out.println("word rejected");
                }
            }       
        }
    }
    public void setState(AbstractState s){
        current = s;
    }
}//odd occurence of a,b,c