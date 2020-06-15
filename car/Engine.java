/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author brett
 */
public class Engine {
    int cost = 0;
    public int addV8(){
        cost += 4000;
        return cost;
    }
    public int subtractV8(){
        cost -= 4000;
        return cost;
    }
    public int addV12(){
        cost += 6000;
        return cost;
    }
    public int subtractV12(){
        cost -= 6000;
        return cost;
    }
}
