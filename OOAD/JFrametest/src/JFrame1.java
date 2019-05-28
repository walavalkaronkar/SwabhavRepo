import java.awt.Button;

import javax.swing.JFrame;

public class JFrame1 extends JFrame{
	JFrame1(){
		Button b=new Button("click"); 
		b.setBounds(30, 100, 80, 30);
		add(b);
		setSize(300,300); 
		setLayout(null);
		setVisible(true);
	}
}
