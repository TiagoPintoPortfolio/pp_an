/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_af_8090301_8150277;

import game.abstractClasses.GameBlockAbstract;

/**
* Nome: João António Brochado Soares
* Número: 8090301
* Turma: T3
*
* Nome: Tiago Alexandre Magalhães Fonseca Azevedo Pinto
* Número: 8150277
* Turma: T2
*/
public class GameBlock extends GameBlockAbstract{

    private int blockX = 50;
    private int blockY = 50;
    
    @Override
    public void setX(int i) {
        this.blockX = i;
    }

    @Override
    public int getX() {
        return blockX;
    }

    @Override
    public void setY(int i) {
        this.blockY = i;
    }

    @Override
    public int getY() {
        return blockY;
    }
    
}
