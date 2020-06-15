package fsa;
/**
 *
 * @author brett
 */
public class State6Plus implements AbstractState {
    //a moves to state 5
    //b moves to state 4
    //c moves to state 1
    Context context;
    public State6Plus(Context c) {
        context = c;
    }
     @Override //a
    public void op1() {
        System.out.println("Concrete State 6 doing op1() and changing to Concrete State 5");
        context.setState(new State5Plus(context));
    }
    @Override //b
    public void op2() {
        System.out.println("Concrete State 6 doing op2() and changing to Concrete State 4");
        context.setState(new State4Plus(context));
    }
    @Override //c
    public void op3() {
        System.out.println("Concrete State 6 doing op3() and changing to Concrete State 1");
        context.setState(new State1Minus(context));
    }
    @Override
    public boolean isFinal(){
        return true;
    }
}