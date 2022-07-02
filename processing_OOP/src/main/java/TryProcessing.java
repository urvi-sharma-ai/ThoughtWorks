import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int x_pos=0;
    public static void main(String[] args) {
        PApplet.main("TryProcessing");
    }
    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }
    @Override
    public void setup() {
        paintWhite();
    }
    @Override
    public void draw() {
        for (int ball = 1; ball <= 4; ball ++) {
            drawCircle(ball*x_pos, ball*HEIGHT/5);
        }
        x_pos = x_pos+1;
    }
    private void drawCircle(int x, float y){
        ellipse(x,y,DIAMETER, DIAMETER);
    }
    private void paintWhite(){
       background(255);
    }
}
