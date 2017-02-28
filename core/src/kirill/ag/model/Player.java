package kirill.ag.model;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by Feor on 26.02.2017.
 */

public class Player extends Actor{

    //Состояния
    public enum State{
        NONE,WALKING,DEAD
    }

    public static final float SPEED=2f;//скорость передвижения
    static final float SIZE=0.7f;//Размер

    Vector2 position=new Vector2();
    Vector2 velocity =new Vector2();
    Rectangle bounds=new Rectangle();

    State state=State.NONE;

    public Player(Vector2 position) {
        this.position = position;
        this.bounds.height=SIZE;
        this.bounds.width=SIZE;
    }

    public Vector2 getPosition() {
        return position;
    }

    public Vector2 getVelocity() {
        return velocity;
    }

    public Rectangle getBounds() {
        return bounds;
    }

    public void update(float delta){
        position.add(velocity.cpy().scl(delta));
    }
}
