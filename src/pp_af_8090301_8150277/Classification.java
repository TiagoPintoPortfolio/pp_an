/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_af_8090301_8150277;

import game.interfaces.ClassificationContract;
import game.interfaces.PlayerContract;

/**
 *
 * @author Tiago Pinto
 */
public class Classification implements ClassificationContract{

    Level l = new Level();
    Player p = new Player();
    
    //private Level level;
    
    @Override
    public String getLevel() {
        return l.getName();
    }

    @Override
    public void setLevel(String string) {
        //this.setLevel(string);
    }

    @Override
    public PlayerContract getPlayer() {
        return p;
    }

    @Override
    public void setPlayer(PlayerContract pc) {
        this.p = (Player) pc;
    }

    @Override
    public double getPoints() {
        return p.getTotalPoints();
    }

    @Override
    public void setPoints(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
