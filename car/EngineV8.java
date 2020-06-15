package car;

/**
 *
 * @author brett
 */
public class EngineV8 {
    int cost = 0;
    String V8 = "";
    public int addV8Engine(){
        cost += 4000;
        System.out.println("V8 Engine Added.");
        return cost;
    }
    public int removeV8Engine(){
        cost -= 4000;
        System.out.println("V8 Engine Removed.");
        return cost;
    }
    public int getV8Engine(){
        return cost;       
    }  
    public String addStringV8(){
        V8 = "V-8 Engine";
        return V8;
    }
    public String removeStringV8(){
        V8 = "";
        return V8;
    }
    public String getStringV8(){
        return V8;
    }
}
