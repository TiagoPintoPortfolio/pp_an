/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_af_8090301_8150277;

import game.abstractClasses.BallAbstract;
import game.abstractClasses.BarrierAbstract;
import game.abstractClasses.LevelAbstract;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Tiago Pinto
 */
public class Level extends LevelAbstract{

    private String level = "pp_af_8090301_8150277.levels/level0.json";
    private int[][] bricks;
    private int numberBricks = 1;
    private String brickPath = "pp_af_8090301_8150277.levels/brick.png";
    
    @Override
    public void loadLevel(String string) {
        
        JSONParser parser = new JSONParser();
                
                try {

            Object obj = parser.parse(new FileReader("pp_af_8090301_8150277.levels/level0.json"));

            JSONObject jsonObject = (JSONObject) obj;
            System.out.println(jsonObject);

            String levelName = (String) jsonObject.get("levelName");
            System.out.println(levelName);


            // loop array
            JSONArray board = (JSONArray) jsonObject.get("board");
            Iterator<String> iterator = board.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
            
            String numberOfBrick = (String) jsonObject.get("numberOfBrick");
            System.out.println(numberOfBrick);
            
            String brickImagePath = (String) jsonObject.get("brickImagePath");
            System.out.println(brickImagePath);
            
            String ballSpeed = (String) jsonObject.get("ballSpeed");
            System.out.println(ballSpeed);
            
            String ballImagePath = (String) jsonObject.get("ballImagePath");
            System.out.println(ballImagePath);
            
            String paddleSpeed = (String) jsonObject.get("paddleSpeed");
            System.out.println(paddleSpeed);
            
            String paddleImagePath = (String) jsonObject.get("paddleImagePath");
            System.out.println(paddleImagePath);
            

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (org.json.simple.parser.ParseException ex) {
            Logger.getLogger(Level.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

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
