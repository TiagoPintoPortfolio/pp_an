/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_af_8090301_8150277;

import game.abstractClasses.BallAbstract;
import game.abstractClasses.BarrierAbstract;
import game.abstractClasses.LevelAbstract;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Tiago Pinto
 */
public class Level extends LevelAbstract{

    private String level = "";
    private int[][] bricks;
    private int numberBricks = 1;
    private String brickPath = "pp_af_8090301_8150277.levels/brick.png";
    
    @Override
    public void loadLevel(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return level;
    }

    @Override
    public void setName(String string) {
        this.level = string;
    }

    @Override
    public int[][] getBricks() {
        return bricks;
    }

    @Override
    public void setBricks(int[][] ints) {
        this.bricks = ints;
    }

    @Override
    public int getNumberBricks() {
        return numberBricks;
    }

    @Override
    public void setNumberBricks(int i) {
        this.numberBricks = i;
    }

    @Override
    public BallAbstract getBall() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBall(BallAbstract ba) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BarrierAbstract getPaddle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPaddle(BarrierAbstract ba) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getBrickImageFilePath() {
        return brickPath;
    }

    @Override
    public void setBrickImageFilePath(String string) {
        this.brickPath = string;
    }
    
}
