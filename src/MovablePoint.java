public class MovablePoint extends Ponit {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint (float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] result = new float[2];
        result[0] = this.xSpeed;
        result[1] = this.ySpeed;
        return result;
    }

    @Override
    public String toString() {
        return "X:" +  this.getX() + ", "  + "Y:" +this.getY() +  "MovablePoint{" + "xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
    }
}

