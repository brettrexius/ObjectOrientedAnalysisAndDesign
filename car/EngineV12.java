package car;

/**
 *
 * @author brett
 */
public class EngineV12 {
    int cost = 0;
    String V12 = "";
    public int addV12Engine(){
        cost += 6000;
        System.out.println("V12 Engine Added.");
        return cost;
    }
    public int removeV12Engine(){
        cost -= 6000;
        System.out.println("V12 Engine Removed.");
        return cost;
    }
    public int getV12Engine(){
        return cost;       
    }  
    public String addStringV12(){
        V12 = "V-12 Engine";
        return V12;
    }
    public String removeStringV12(){
        V12 = "";
        return V12;
    }
    public String getStringV12(){
        return V12;
    }
}
