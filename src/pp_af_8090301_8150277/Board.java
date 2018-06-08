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
import game.exceptions.NoBricksException;
import game.interfaces.ClassificationContract;
import game.interfaces.PlayerContract;
import java.util.Arrays;

/**
 *
 * @author Tiago Pinto
 */
public class Board extends BoardAbstract {

    private Player p = new Player();
    private Level l = new Level();
    private Brick[] brick = new Brick[6];
    private Ball ball;
    private Barrier barrier;
    
    
    private ListContract lc = new ListContract() {
        
        private Object objects[];
        
        @Override
        public boolean addObject(Object o) {
            int tam = this.size();

        if (tam == this.objects.length){
            return false;

        }else{

            this.objects[tam] = new Object();
            return true;
        }
        }

        @Override
        public Object removeObject(int i) {
             int size = objects.length;

        Object elemDel = 5;

        for (i = 0; i < size; i++) {

            if (objects[i] == elemDel) {
                
                Arrays.toString(objects);
            }
        }

        return true;
        }

        @Override
        public Object getObject(int i) {
            return i;
        }

        @Override
        public int findObject(Object o) {
            for (int i = 0; i<this.size(); i++) {

            if (this.objects[i].equals(o)) {

                return i;
            }
        }

        return -1;
        }

        @Override
        public int size() {
            return size();
        }
    };

    public Board() throws NoBricksException {
        super();
    }
    
    
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
        return lc;
    }

    @Override
    public void setLevels(ListContract lc) {
        this.l = (Level) lc;
    }

    @Override
    public void addLevel(LevelAbstract la) {
        l.loadLevel(TOOL_TIP_TEXT_KEY);
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