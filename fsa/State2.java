package fsa;
/**
 *
 * @author brett
 */
public class State2 implements AbstractState {
    //a stays in state 2
    //c moves to state 1
    //b moves to state 3
    Context context;
    public State2(Context c){
        context = c;
    }
    @Override //a
    public void op1() {
        System.out.println("Concrete State 2 doing op1()");
    }
    @Override //b
    public void op2() {       
        System.out.println("Concrete State 2 doing op3() and changing to Concrete State 3");
        context.setState(new State3(context));
    }
    @Override //c
    public void op3() {
        System.out.println("Concrete State 2 doing op2() and changing to Concrete State 1");
        context.setState(new State1Minus(context));
    }
    @Override
    public boolean isFinal(){
        return false;
    }
}
