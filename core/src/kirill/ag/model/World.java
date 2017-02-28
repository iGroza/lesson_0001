package kirill.ag.model;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

/**
 * Created by Feor on 26.02.2017.
 */

public class World {
    //Кирпичи
    Array<Brick> bricks = new Array<Brick>();
    Player player;

    //Размеры мира
    public int width;
    public int heigth;

    public World(int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public Array<Brick> getBricks() {

        return bricks;
    }

    public Player getPlayer() {
        return player;
    }

    //Создание мира
    public void createWorld() {
        player = new Player(new Vector2(width / 2, heigth / 2));

        for (int i = 0; i < heigth; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == heigth - 1 || j == 0 || j == width - 1)
                    bricks.add(new Brick(new Vector2(j, i)));
            }
        }
    }
}
