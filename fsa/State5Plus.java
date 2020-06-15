package fsa;
/**
 *
 * @author brett
 */
public class State5Plus implements AbstractState {
    //a stays in state 5
    //b moves to state 6
    //c moves to state 4
    Context context;
    public State5Plus(Context c) {
        context = c;
    }
     @Override //a
    public void op1() {
        System.out.println("Concrete State 5 doing op1()"); 
    }
    @Override //b
    public void op2() {
        System.out.println("Concrete State 5 doing op2() and changing to Concrete State 6");
        context.setState(new State6Plus(context));
    }
    @Override //c
    public void op3() {
        System.out.println("Concrete State 5 doing op3() and changing to Concrete State 4");
        context.setState(new State4Plus(context));
    }
    @Override
    public boolean isFinal(){
        return true;
    }
}