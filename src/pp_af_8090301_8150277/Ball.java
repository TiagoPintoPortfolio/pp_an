/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_af_8090301_8150277;

import game.abstractClasses.BallAbstract;

/**
 *
 * @author Tiago Pinto
 */
public class Ball extends BallAbstract{

    private int ballXdir = 25;
    private int ballYdir = 25;
    private int ballX = 50;
    private int ballY = 50;
    private int speed = 50;
    
    
    @Override
    public void setXDir(int i) {
        this.ballXdir = i;
    }

    @Override
    public void setYDir(int i) {
        this.ballYdir = i;
    }

    @Override
    public int getXDir() {
        return ballXdir;
    }

    @Override
    public int getYDir() {
        return ballYdir;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void setSpeed(int i) {
        this.speed = i;
    }

    @Override
    public void setX(int i) {
        this.ballX = i;
    }

    @Override
    public int getX() {
        return ballX;
    }

    @Override
    public void setY(int i) {
        this.ballY = i;
    }

    @Override
    public int getY() {
        return ballY;
    }
    
}
