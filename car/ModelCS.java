package car;

/**
 *
 * @author brett
 */
public class ModelCS {

    int cost = 0;
    String ModelCS = "";
    public int addModelCS(){
        cost += 54000;
        System.out.println("Model CS Selected.");
        return cost;
    }
    public int removeModelCS(){
        cost -= 54000;
        System.out.println("Model CS Unselected.");
        return cost;
    }
    public int getModelCS(){
        return cost;       
    } 
    public String addStringModelCS(){
        ModelCS = "Car: CS with ";
        return ModelCS;
    }
    public String removeStringModelCS(){
        ModelCS = "";
        return ModelCS;
    }
    public String getStringModelCS(){
        return ModelCS;
    }
    
}
