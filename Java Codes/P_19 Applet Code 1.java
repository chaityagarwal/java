/*<applet code="Homelet.class" width="300" height="300"></applet>*/
import java.applet.Applet;
import java.awt.*;
public class Homelet extends Applet
{
    public void paint(Graphics g)
    {
        setBackground(Color.cyan);
        g.setColor(Color.red);
        g.fillRect(100,100,200,150);
        int[]xPoints={100,200,300};
        int[]yPoints={100,50,100};
        int nPoints=3;
        g.setColor(Color.green);
        g.fillPolygon(xPoints,yPoints,nPoints);
        g.setColor(Color.yellow);
        g.fillRect(175,175,50,75);
        g.fillRect(350,30,60,60);
    }
}
