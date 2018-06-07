/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_af_8090301_8150277;

import game.abstractClasses.BrickAbstract;

/**
 *
 * @author Tiago Pinto
 */
public class Brick extends BrickAbstract{
    
    private int brickX = 100;
    private int brickY = 100;
    private boolean destroyed;
    
    
    @Override
    public boolean isDestroyed() {
        
        return destroyed;
    }

    @Override
    public void setDestroyed(boolean bln) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setX(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getX() {
        return brickX;
    }

    @Override
    public void setY(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getY() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
