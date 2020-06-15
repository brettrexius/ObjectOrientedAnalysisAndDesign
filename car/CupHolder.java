package car;

/**
 *
 * @author brett
 */
public class CupHolder {
    int cost = 0;
    String CupHolder = "";
    public int addCupHolder(){
        cost += 1;
        System.out.println("Cup Holder added.");
        return cost;
    }
    public int removeCupHolder(){
        cost -= 1;
        System.out.println("Cup Holder removed.");
        return cost;
    }
    public int getCupHolder(){
        return cost;       
    }    
    public String addStringCupHolder(){
        CupHolder = ", Cup Holder";
        return CupHolder;
    }
    public String removeStringCupHolder(){
        CupHolder = "";
        return CupHolder;
    }
    public String getStringCupHolder(){
        return CupHolder;
    }
}
