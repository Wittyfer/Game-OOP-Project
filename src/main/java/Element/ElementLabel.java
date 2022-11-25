package Element;

import javax.swing.JLabel;

public class ElementLabel extends JLabel
{
    private static final long serialVersionUID = 1L;
		
    public ElementLabel(String title,int size,int x,int y,int w,int h)
    {
	super(title);
	setFont(Element.getFont(size));
	setBounds(x,y,w,h);
    }
}
