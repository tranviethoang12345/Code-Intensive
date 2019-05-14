package game;

import tklibs.SpriteUtils;

public class Ememy extends GameObject{
    public Ememy() {
        this.position.set(180,150);
        this.image = SpriteUtils.loadImage("assets/images/enemies/level0/blue/0.png");
    }

    @Override
    public void run(){
        this.move();
    }
    double count1 = 0;
    private void move() {
        this.position.x = 180 + 80*Math.sin(count1/6);
        this.position.y = 200 + 50*Math.cos(count1/6);
    }
}
