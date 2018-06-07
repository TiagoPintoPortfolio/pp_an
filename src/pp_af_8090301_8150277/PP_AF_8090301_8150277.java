/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_af_8090301_8150277;

import game.abstractClasses.BoardAbstract;
import game.exceptions.NoBricksException;
import game.interfaces.ClassificationContract;
import game.main.Game;

/**
 *
 * @author Tiago Pinto
 */
public class PP_AF_8090301_8150277 {

    private static BoardAbstract b;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoBricksException, InterruptedException {
        
        Game game = new Game(b);
        
        game.initUI();
        
        game.waitUntilClosed();
        
        ClassificationContract classification = game.getLastClassification();
        
        System.out.println(classification.toString());
        
        
        
    }
    
}
