package game.player;

import game.GameObject;
import game.KeyEventPress;
import tklibs.Mathx;
import tklibs.SpriteUtils;

public class Player extends GameObject {

    public Player() {
        this.image = SpriteUtils.loadImage("assets/images/players/straight/0.png");
        position.set(200,500);

    }

    int count = 0;
    @Override
    public void run() {
        this.move();
        this.limitPosition();
        //shoot
        this.fire();
        System.out.println(GameObject.objects.size());
    }


    private void fire() {
        count++;
        if (KeyEventPress.isFirePress && count > 20) {
            PlayerBullet bullet = GameObject.recycle(PlayerBullet.class);
            bullet.position.set(this.position.x, this.position.y);

            PlayerBullet bullet1 = GameObject.recycle(PlayerBullet.class);
            bullet1.position.set(this.position.x - 10, this.position.y);

            PlayerBullet bullet2 = GameObject.recycle(PlayerBullet.class);
            bullet2.position.set(this.position.x + 10, this.position.y);

            PlayerBullet bullet3 = GameObject.recycle(PlayerBullet.class);
            bullet3.position.set(this.position.x - 15, this.position.y+5);

            PlayerBullet bullet4 = GameObject.recycle(PlayerBullet.class);
            bullet4.position.set(this.position.x + 15, this.position.y+5);

            count = 0;
        }
    }

    private void limitPosition() {
        position.x = Mathx.clamp(position.x, 0, 384 - 32);
        position.y = Mathx.clamp(position.y, 0, 600 - 48);
    }

    private void move() {
        if(KeyEventPress.isUpPress) {
            this.position.y --;
        }
        if(KeyEventPress.isLeftPress){
            this.position.x --;
        }
        if(KeyEventPress.isRightPress){
            this.position.x ++;
        }
        if(KeyEventPress.isDownPress){
            this.position.y ++;
        }
    }
}
