/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_af_8090301_8150277;

import game.abstractClasses.BrickAbstract;

/**
* Nome: João António Brochado Soares
* Número: 8090301
* Turma: T3
*
* Nome: Tiago Alexandre Magalhães Fonseca Azevedo Pinto
* Número: 8150277
* Turma: T2
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
        this.destroyed = bln;
    }

    @Override
    public void setX(int i) {
        this.brickX = i;
    }

    @Override
    public int getX() {
        return brickX;
    }

    @Override
    public void setY(int i) {
        this.brickY = i;
    }

    @Override
    public int getY() {
        return brickX;
    }
    
}
