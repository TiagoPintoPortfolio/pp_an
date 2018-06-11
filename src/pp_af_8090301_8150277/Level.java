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
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Tiago Pinto
 */
public class Level extends LevelAbstract{

    private String levelname_;
    private int[][] bricks={ {0, 1, 0, 1, 1, 0}, {0, 1, 0, 1, 1, 0}};
    
    
    private int numberBricks=1;
    private String brickPath;
    private Long balls;
    private String image;
    private Long paddles;
    private String paddleimag;
    private Barrier paddle;
    private Ball ball;
    //private int brick;
    
    @Override
    public void loadLevel(String string) {

        JSONParser parser = new JSONParser();

        try {

            Object obj = parser.parse(new FileReader("/Users/joaosoares/NetBeansProjects/Json/src/json/level0.json"));

            JSONObject jsonObject = (JSONObject) obj;
            System.out.println(jsonObject);

            String levelName = (String) jsonObject.get("levelName");
            levelname_=levelName;
            System.out.println(levelName);

            // loop array
            /*JSONArray board = (JSONArray) jsonObject.get("board");
            Iterator<Long> iterator = board.iterator();
            while (iterator.hasNext()) {
               
                System.out.println(iterator.next());
            }*/
            
            
            
            //Long numberOfBrick = (Long) jsonObject.get("numberOfBrick");
            //numberOfBrick=numberBricks;
            
            //System.out.println(numberOfBrick);
            
            String brickImagePath = (String) jsonObject.get("brickImagePath");
            brickImagePath=brickPath;
            System.out.println(brickImagePath);
            
            Long ballSpeed = (Long) jsonObject.get("ballSpeed");
            ballSpeed=balls;
            System.out.println(ballSpeed);
            
            String ballImagePath = (String) jsonObject.get("ballImagePath");
            ballImagePath=image;
            System.out.println(ballImagePath);
            
            Long paddleSpeed = (Long) jsonObject.get("paddleSpeed");
            paddleSpeed=paddles;
            System.out.println(paddleSpeed);
            
            String paddleImagePath = (String) jsonObject.get("paddleImagePath");
            paddleImagePath=paddleimag;
            System.out.println(paddleImagePath);
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getName() {
        return levelname_;
    }

    @Override
    public void setName(String string) {
        this.levelname_=string;
    }

    @Override
    public int[][] getBricks() {
        return bricks;
    }

    @Override
    public void setBricks(int[][] ints) {
        this.bricks=ints;
    }

    @Override
    public int getNumberBricks() {
        return numberBricks;
    }

    @Override
    public void setNumberBricks(int i) {
        this.numberBricks=i;
    }

    @Override
    public BallAbstract getBall() {
        return ball;

    @Override
    public2 void setBall(BallAbstract ba) {
        this.ball = (Ball) ba;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBrickImageFilePath(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
}
