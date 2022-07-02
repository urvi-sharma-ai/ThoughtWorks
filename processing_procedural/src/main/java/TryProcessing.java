import processing.core.PApplet;
public class TryProcessing extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    public static final int WHITE = 255;
    public static final int ball_1 = 1;
    public static final int ball_2 = 2;
    public static final int ball_3 = 3;
    public static final int ball_4 = 4;
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
        background(WHITE);
    }
    @Override
    public void draw() {
        ellipse(ball_1 *x_pos,ball_1*HEIGHT/5,DIAMETER, DIAMETER);
        ellipse(ball_2 *x_pos,ball_2*HEIGHT/5,DIAMETER, DIAMETER);
        ellipse(ball_3 *x_pos,ball_3*HEIGHT/5,DIAMETER, DIAMETER);
        ellipse(ball_4 *x_pos,ball_4*HEIGHT/5,DIAMETER, DIAMETER);
        x_pos = x_pos+1;
    }
}
