import java.awt.Frame;
import java.awt.*;
import java.awt.event.*;

 public class WindowClose extends Frame implements WindowListener,MouseListener,ActionListener
{
	 public WindowClose()
	{
		setLayout(FlowLayout);
		Button b1 = new Button("Hello World");
		add(b1);
		b1.addActionListener(this);
		addWindowListener(this);
		addMouseListener(this);
		setSize(400,500);
		setVisible(true);
	}

	public void windowClosing(WindowEvent we)
	{
		setVisible(false);
	}

	public void actionPerformed(ActionEvent e)
	{
		System.out.println("HIIIIIIIIII");
	}

	public void mouseClicked(MouseEvent e)
	{
		System.out.println("Hello World");
	}

	public void mouseEntered(MouseEvent e){};
	public void mouseExited(MouseEvent e){};
	public void mousePressed(MouseEvent e){};
	public void mouseReleased(MouseEvent e){};
	public void windowOpened(WindowEvent we){};
	public void windowIconified(WindowEvent we){};
	public void windowDeiconified(WindowEvent we){};
	public void windowClosed(WindowEvent we){};
	public void windowActivated(WindowEvent we){};
	public void windowDeactivated(WindowEvent we){};

	public static void main(String args[])
	{
		WindowClose n = new WindowClose();

	}
}