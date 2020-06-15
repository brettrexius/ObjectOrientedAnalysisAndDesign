package car;

/**
 *
 * @author brett
 */
public class Tow {
    int cost = 0;
    String tow = "";
    public int addTow(){
        cost += 3000;
        return cost;
    }
    public int removeTow(){
        cost -= 3000;
        return cost;
    }
    public int getTow(){
        return cost;
    }
    public String addStringTow(){
        tow = ", Towing Package";
        return tow;
    }
    public String removeStringTow(){
        tow = "";
        return tow;
    }
    public String getStringTow(){
        return tow;
    }
    
}
