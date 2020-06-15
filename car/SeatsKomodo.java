package car;

/**
 *
 * @author brett
 */
public class SeatsKomodo {
    int cost = 0;
    String komodo = "";
    public int addSeatsKomodo(){
        cost += 12000;
        System.out.println("Komodo Skin Seats added.");
        return cost;
    }
    public int removeSeatsKomodo(){
        cost -= 12000;
        System.out.println("Komodo Skin Seats removed.");
        return cost;
    }
    public int getSeatsKomodo(){
        return cost;       
    }  
    public String addStringKomodo(){
        komodo = ", Komodo Drago Skin Seats";
        return komodo;
    }
    public String removeStringKomodo(){
        komodo = "";
        return komodo;
    }
    public String getStringKomodo(){
        return komodo;
    }
}
