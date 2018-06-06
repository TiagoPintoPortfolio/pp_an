/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_af_8090301_8150277;

import game.interfaces.PlayerContract;

/**
 *
 * @author Tiago Pinto
 */
public class Player implements PlayerContract{
    
    private String name = "";
    private int totalPontos;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String string) {
        this.name = string;
    }

    @Override
    public int getTotalPoints() {
        return totalPontos;
    }

    @Override
    public void setTotalPoints(int i) {
        this.totalPontos = i;
    }
    
}
