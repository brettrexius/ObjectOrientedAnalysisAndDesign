package fsa;
/**
 *
 * @author brett
 */
public class State1Minus implements AbstractState {
    //b or c stays in state 1
    //a moves to state 2
    Context context;
    public State1Minus(Context c) {
        context = c;
    }
     @Override //a
    public void op1() {
        System.out.println("Concrete State 1 doing op2() and changing to Concrete State 2");
        context.setState(new State2(context));     
    }
    @Override //b
    public void op2() {
        System.out.println("Concrete State 1 doing op1()");
    }
    @Override //c
    public void op3() {
        System.out.println("Concrete State 1 doing op1()");
    }   
    @Override
    public boolean isFinal(){
        return false;
    }
}
