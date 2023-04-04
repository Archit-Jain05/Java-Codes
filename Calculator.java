import java.awt.*;
import java.awt.event.*;
import java.awt.Frame;

public class Calculator extends Frame implements ActionListener
{
	Button exit;
	Button plus;
	Button minus;
	Button mult;
	Button div;
	Button reset;
	TextField tb1,tb2,tb3;
	Label lbl1,lbl2,lbl3;

	public Calculator()
	{
		setLayout(new GridLayout(2,2,25,25));
		setVisible(true);
		exit = new Button("Exit");
		plus = new Button("+");
		minus = new Button("-");
		mult = new Button("X");
		div = new Button("/");
		reset = new Button("Reset");

		lbl1 = new Label("Enter Number 1:");
		lbl2 = new Label("Enter number 2:");
		lbl3 = new Label("Result:");

		tb1 = new TextField(10);
		tb2 = new TextField(10);
		tb3 = new TextField(10);

		tb3.setEditable(false);

		exit.addActionListener(this);
		plus.addActionListener(this);
		minus.addActionListener(this);
		mult.addActionListener(this);
		div.addActionListener(this);
		reset.addActionListener(this);

		add(lbl1);
		add(tb1);
		add(lbl2);
		add(tb2);
		add(lbl3);
		add(tb3);
		add(plus);
		add(minus);
		add(mult);
		add(div);
		add(reset);
		add(exit);

	}

	public void actionPerformed(ActionEvent a)
	{
		Button bn = a.getSource();

		switch(bn)
		{
			case "reset":
			{
				this.Repaint();
			} 
		}
	}

	public static void main(String args[])
	{
		Calculator c = new Calculator();
	}

}