/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_af_8090301_8150277;

import game.abstractClasses.BarrierAbstract;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Tiago Pinto
 */
public class Barrier extends BarrierAbstract implements KeyListener, ActionListener{
    
    private int speed = 10;
    private int paddleX = 5;
    private int paddleY = 5;
    
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
        this.paddleX = i;
    }

    @Override
    public int getX() {
        return paddleX;
    }

    @Override
    public void setY(int i) {
        this.paddleY = i;
    }

    @Override
    public int getY() {
        return paddleY;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   public void keyPressed(){
   
   
   }
   
   public void keyReleased(){
   
   }
    
}
