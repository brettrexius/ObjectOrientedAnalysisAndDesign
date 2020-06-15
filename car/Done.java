package car;

import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author brett
 */
public class Done {
    public int done(int cost){
        
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        String numberAsString = numberFormat.format(cost);
        
        System.out.println("    Cost: $" + numberAsString);
        System.out.println("End Order");
        return cost;
        
    }
    public void doneString(String str){
        System.out.println();
        System.out.println("New Order:");
        System.out.println("    " + str);
        
    }
}
