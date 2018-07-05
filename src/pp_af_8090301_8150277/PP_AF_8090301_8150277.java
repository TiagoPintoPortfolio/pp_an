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
* Nome: João António Brochado Soares
* Número: 8090301
* Turma: T3
*
* Nome: Tiago Alexandre Magalhães Fonseca Azevedo Pinto
* Número: 8150277
* Turma: T2
*/
public class PP_AF_8090301_8150277 {

    private static BoardAbstract b;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoBricksException, InterruptedException {
        
        //Criar nível -> Level l = new Level();
        //Chamar o método loadLevel -> l.loadLevel();
        
        String string = "pp_af_8090301_8150277/levels/level0.json";
        
        Level l = new Level();
        l.loadLevel(string);
        
        //Player p = new Player();
        
        Board b = new Board();
        b.addLevel(l);
        //b.setPlayer(pc);
        //b.setClassification();
        Game game = new Game(b);
        
        game.initUI();
        
        game.waitUntilClosed();
        
        ClassificationContract classification = game.getLastClassification();
        
        System.out.println(classification.toString());
           
        
    }
    
}
