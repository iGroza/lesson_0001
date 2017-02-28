package kirill.ag.model;

import com.badlogic.gdx.math.*;

/**
 * Created by Feor on 26.02.2017.
 */

public class Brick {
    //Размер кирпича
    static final float SIZE=1f;

    //Координаты
    Vector2 position = new Vector2();
    Rectangle bounds = new Rectangle();

    public Brick(Vector2 position) {
        this.position = position;
        this.bounds.width=SIZE;
        this.bounds.height=SIZE;
    }
}
