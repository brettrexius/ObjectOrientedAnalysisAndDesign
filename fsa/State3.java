package fsa;
/**
 *
 * @author brett
 */
public class State3 implements AbstractState {
    //a moves to state 2
    //b moves to state 1
    //c moves to state 4
    Context context;
    public State3(Context c) {
        context = c;
    }
     @Override //a
    public void op1() {
        System.out.println("Concrete State 3 doing op1() and changing to Concrete State 2");
        context.setState(new State2(context));
    }
    @Override //b
    public void op2() {
        System.out.println("Concrete State 3 doing op2() and changing to Concrete State 1");
        context.setState(new State1Minus(context));
    }
    @Override //c
    public void op3() {
        System.out.println("Concrete State 3 doing op3() and changing to Concrete State 4");
        context.setState(new State4Plus(context));
    }
    @Override
    public boolean isFinal(){
        return false;
    }
}