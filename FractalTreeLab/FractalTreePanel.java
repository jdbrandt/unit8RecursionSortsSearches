//********************************************************************
//  KochPanel.java       Author: Lewis/Loftus/Cocking
//
//  Represents a drawing surface on which to paint a Koch Snowflake.
//********************************************************************

import java.awt.*;
import javax.swing.JPanel;
import java.awt.geom.*;

public class FractalTreePanel extends JPanel
{
    private final static int PANEL_WIDTH = 400;
    private final static int PANEL_HEIGHT = 400;


    private static final Point2D.Double iPoint = new Point2D.Double(PANEL_WIDTH/2, PANEL_HEIGHT);
    private static final double LENGTH = 200;
    private static final double THETA = Math.PI/90;
    private static final double MAX_ORDER = 10;

    private int current; //current order

    //-----------------------------------------------------------------
    //  Sets the initial fractal order to the value specified.
    //-----------------------------------------------------------------
    public FractalTreePanel(int currentOrder)
    {
        current = currentOrder;
        setBackground(Color.black);
        setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
    }

    //-----------------------------------------------------------------
    //  Draws the fractal recursively. Base case is an order of 1 for
    //  which a simple straight line is drawn. Otherwise three
    //  intermediate points are computed, and each line segment is
    //  drawn as a fractal.
    //-----------------------------------------------------------------
    public void drawFractal(int order, Point2D.Double iPoint, double length, double theta,
    Graphics2D g2)
    {
        if (order < MAX_ORDER)
        {
            double deltax = length*Math.sin(theta);
            double deltay = length*Math.cos(theta);
            
            Point2D.Double posPoint = new Point2D.Double(iPoint.getX()+deltax, iPoint.getY()-deltay);
            Point2D.Double negPoint = new Point2D.Double(iPoint.getX()-deltax, iPoint.getY()-deltay);
            
            g2.draw(new Line2D.Double(iPoint,posPoint));
            g2.draw(new Line2D.Double(iPoint,negPoint));
            drawFractal(order+1, posPoint, length/2, theta-THETA, g2);
            drawFractal(order+1, negPoint, length/2, theta-THETA, g2);
        }
    }
    //-----------------------------------------------------------------
    //  Performs the initial calls to the drawFractal method.
    //-----------------------------------------------------------------
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.setColor(Color.green);

        drawFractal(current, iPoint, LENGTH, 0, (Graphics2D) g);
    }

    //-----------------------------------------------------------------
    //  Sets the fractal order to the value specified.
    //-----------------------------------------------------------------
    public void setOrder(int order)
    {
        current = order;
    }

    //-----------------------------------------------------------------
    //  Returns the current order.
    //-----------------------------------------------------------------
    public int getOrder()
    {
        return current;
    }
}
