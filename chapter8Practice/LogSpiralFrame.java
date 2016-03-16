import java.awt.event.*;
import javax.swing.*;

public class LogSpiralFrame extends JFrame
{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 600;

    private LogSpiralPanel scene;
    
    public LogSpiralFrame()
    {
        scene = new LogSpiralPanel();
        add(scene);
        
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }
    
    

}
