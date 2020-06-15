package car;

/**
 *
 * @author brett
 */
public class Roof {
    int cost = 0;
    String roof = "";
    public int addRoof(int model){
        if (model == 1){
            cost += 1900;
        }
        else if (model == 2){
            cost += 2200;
        }
        else{
            cost += 3000;
        }
        System.out.println("Sun Roof added.");
        return cost;
    }
    public int removeRoof(int model){
        if (model == 1){
            cost -= 1900;
        }
        else if (model == 2){
            cost -= 2200;
        }
        else{
            cost -= 3000;
        }
        System.out.println("Sun Roof removed.");
        return cost;
    }
    public int getRoof(){
        return cost;
    }
    public String addStringRoof(){
        roof = ", Sun Roof";
        return roof;
    }
    public String removeStringRoof(){
        roof = "";
        return roof;
    }
    public String getStringRoof(){
        return roof;
    }
}
