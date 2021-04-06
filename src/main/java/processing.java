import processing.core.PApplet;

public class processing  extends  PApplet{

    float x1=0,x2=0,x3=0,x4=0,y1=400/5,y2=(400*2)/5,y3=(400*3)/5,y4=(400*4)/5;


    public static void main(String[] args) {
        PApplet.main("processing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(600,400);

    }

    @Override
    public void draw() {

        System.out.println(y1+ "  "+ y2 +" "+ y3 + " "+y4);


        ellipse(x1,y1,10,10);

        ellipse(x2,y2,10,10);

        ellipse(x3,y3,10,10);

        ellipse(x4,y4,10,10);
        x1+=1;
        x2+=2;
        x3+=3;
        x4+=4;



    }
}
