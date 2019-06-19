import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainFrame extends JFrame implements ActionListener{

	private JButton button1,button2,button3;
	public MainFrame()
	{
		button1=new JButton("alert");
		button1.setBounds(50,50,150,50);
	    button1.setActionCommand("alert");
	    button1.addActionListener(this);
		
		button2=new JButton("print");
		button2.setBounds(250,50,150,50);
	    button2.setActionCommand("print");
	    button2.addActionListener(this);
	    
	    button3=new JButton("exit");
		button3.setBounds(150,150,150,50);
	    button3.setActionCommand("exit");
	    button3.addActionListener(this);
	    
	    add(button1);
	    add(button2);
	    add(button3);
	    setSize(600,300);
	    setLayout(null);
	    setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("alert"))
		{
			System.out.println("save");
			JOptionPane.showMessageDialog(this, "hello");
		}
		else if(e.getActionCommand().equals("print"))
		{
			AsynchronousPrint asynchronousPrint=new AsynchronousPrint();
			Thread t1 =new Thread(asynchronousPrint);  
			t1.start();  
		}
		else if(e.getActionCommand().equals("exit"))
		{
			System.exit(0);
		}
	}
	
	
}
