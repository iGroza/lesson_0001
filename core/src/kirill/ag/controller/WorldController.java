package kirill.ag.controller;

import java.util.HashMap;
import java.util.Map;

import kirill.ag.model.Player;

/**
 * Created by Feor on 27.02.2017.
 */

public class WorldController {
    enum  Keys{
        LEFT,RIGHT,UP,DOWN
    }

    public Player player;
    static Map<Keys,Boolean> keys= new HashMap<Keys, Boolean>();

    static {
        keys.put(Keys.DOWN ,false);
        keys.put(Keys.RIGHT ,false);
        keys.put(Keys.UP ,false);
        keys.put(Keys.DOWN ,false);
    }

    public WorldController(Player player) {
        this.player = player;
    }


    public void leftPressed(){
        keys.put(Keys.LEFT ,true);
    }
    public void rightPressed(){
        keys.put(Keys.RIGHT ,true);
    }
    public void upPressed(){
        keys.put(Keys.UP ,true);
    }
    public void downPressed(){
        keys.put(Keys.DOWN ,true);
    }

    public void leftReleased(){
        keys.put(Keys.LEFT ,false);
    }
    public void rightReleased(){
        keys.put(Keys.RIGHT ,false);
    }
    public void upReleased(){
        keys.put(Keys.UP ,false);
    }
    public void downReleased(){
        keys.put(Keys.DOWN ,false);
    }

    public void resetWay(){
        downReleased();
        rightReleased();
        upReleased();
        downReleased();
    }
    public void update(float delta){
        processInput();
        player.update(delta);
    }

    private void processInput() {
        if(keys.get(Keys.LEFT ))
            player.getVelocity().x = -Player.SPEED;
        if(keys.get(Keys.RIGHT ))
            player.getVelocity().x = Player.SPEED;
        if(keys.get(Keys.UP ))
            player.getVelocity().y = Player.SPEED;
        if(keys.get(Keys.DOWN ))
            player.getVelocity().y = -Player.SPEED;


    }
}
