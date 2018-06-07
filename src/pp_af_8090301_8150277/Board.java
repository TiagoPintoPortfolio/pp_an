/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_af_8090301_8150277;

import game.abstractClasses.BoardAbstract;
import game.abstractClasses.BrickAbstract;
import game.abstractClasses.LevelAbstract;
import game.colections.ListContract;
import game.interfaces.ClassificationContract;
import game.interfaces.PlayerContract;

/**
 *
 * @author Tiago Pinto
 */
public class Board extends BoardAbstract {

    Player p = new Player();
    Level l = new Level();
    
    @Override
    public PlayerContract getPlayer() {
        return p;    
    }

    @Override
    public void setPlayer(PlayerContract pc) {
        this.p =  (Player) pc;
    }

    @Override
    public ListContract getLevels() {
        return (ListContract) l;
    }

    @Override
    public void setLevels(ListContract lc) {
        this.l = (Level) lc;
    }

    @Override
    public void addLevel(LevelAbstract la) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ClassificationContract getClassification() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setClassification(ClassificationContract cc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BrickAbstract[] createBrickArray(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}