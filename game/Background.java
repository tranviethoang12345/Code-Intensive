package game;

import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Background extends GameObject{

    public Background() {
        position.set(0, 800-3109);
        this.image = SpriteUtils.loadImage("assets/images/background/0.png");
    }

    @Override
    public void run () {
        this.position.y++;
        this.position.y += 2;
        if (this.position.y >= 0)
        {
            this.position.y = (600-3109);
        }
    }
}

