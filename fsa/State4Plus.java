package fsa;
/**
 *
 * @author brett
 */
public class State4Plus implements AbstractState{
    //b or c stays in state 4
    // a moves to state 5
    Context context;
    public State4Plus(Context c) {
        context = c;
    }
     @Override //a
    public void op1() {
        
       System.out.println("Concrete State 3 doing op2() and changing to Concrete State 5");
        context.setState(new State5Plus(context));
    }
    @Override //b
    public void op2() {
        System.out.println("Concrete State 4 doing op1()");
    }
    @Override //c
    public void op3() {
        System.out.println("Concrete State 4 doing op1()");
    }
    @Override
    public boolean isFinal(){
        return true;
    }
}
