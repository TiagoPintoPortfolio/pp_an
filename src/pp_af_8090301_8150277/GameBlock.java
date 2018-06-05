/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_af_8090301_8150277;

import game.abstractClasses.GameBlockAbstract;

/**
 *
 * @author Tiago Pinto
 */
public class GameBlock extends GameBlockAbstract{

    private int ballposX = 50;
    private int ballposY = 50;
    
    @Override
    public void setX(int i) {
        this.ballposX = i;
    }

    @Override
    public int getX() {
        return ballposX;
    }

    @Override
    public void setY(int i) {
        this.ballposY = i;
    }

    @Override
    public int getY() {
        return ballposY;
    }
    
}
