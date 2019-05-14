package game;

public class Vector2D {
    public double x;
    public double y;

//    public game.Vector2D() {
//        this.x = 0;
//        this.y = 0;
//    }
    public Vector2D() {
        this(0,0); //this.x = 0; this.y = 0;
    }

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void add(double x, double y) {
        this.x += x;
        this.y += y;
    }

    public void substract(double x, double y) {
        this.x -= x;
        this.y -= y;
    }

    public void scale(double rate) {
        this.x *= rate;
        this.y *= rate;
    }

    public void set(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void set(Vector2D other) {
        this.set(other.x, other.y);
    }

    public Vector2D clone() {
        return new Vector2D(this.x, this.y);
    }

    public double getLength() {
//        Math.sqrt(this.x * this.x + this.y * this.y);
        return Math.sqrt(x * x + y * y);
    }

    public void setLength(double Length) {
        double oldLength = this.getLength();
        if(oldLength != 0){
            this.x = this.x * Length / oldLength;
            this.y = this.y * Length / oldLength;
        }
    }

    public double getAngle() {
//        Math.sqrt(2);
//        Math.pow(2,3);
//        Math.cos(Math.PI / 4);
//        Math.acos(0.5);
        return Math.atan(y / x);
    }

    public void setAngle(double angle) {
        double length = this.getLength();
        if(length != 0) {
            this.x = length * Math.cos(angle);
            this.y = length * Math.sin(angle);
        }
    }
}

