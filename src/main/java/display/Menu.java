package display;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import Element.ElementButton;
import Element.ElementLabel;

public class Menu extends JPanel
{
    private static final long serialVersionUID = 1L;
    public long point;
		
    public Menu(){}
		
    public Menu(long point,ActionListener main)
    {
	try
        {
            this.point = point;
            this.setBackground(new Color(0, 0, 0));
            this.setBounds(0,0,1000,600);
            this.setFocusable(true);
            this.setLayout(null);
					
            ElementLabel status = new ElementLabel("GAME OVER!",55,400,100,200,100);
            status.setForeground(Color.white);
					
            ElementLabel showPoint = new ElementLabel("TOTAL : "+this.point,50,400,200,200,100);
            showPoint.setForeground(Color.white);
										
            ElementButton restart = new ElementButton("restart",30,380,350,200,50);
            restart.addActionListener(main);		
					
            this.add(showPoint);
            this.add(status);
            this.add(restart);
	} 
        
        catch(Exception e)
        {
            e.printStackTrace();
	}		
    }
}
