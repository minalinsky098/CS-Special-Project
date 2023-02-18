import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class WindowSwitch extends JFrame{
	JLabel item0;
	public JFrame h =new JFrame();
	public JFrame k =new JFrame();
	public JFrame q =new JFrame();
	private JLabel item1;
	private JButton butt1;
	private JButton butt2;
	private JButton kback;
	private JButton qback1;
	private JButton quit;
	
	public WindowSwitch() {
		super("Switching Windows");
		item0=new JLabel("This is the MAIN WINDOW");
		h.add(item0);
		item1=new JLabel("                                                                                                                                                 ");
		h.add(item1);
		item1=new JLabel("                                                                                                                                                 ");
		h.add(item1);
		item1=new JLabel("                                              ");
		h.add(item1);
		butt1=new JButton("Press me for Window K");
		h.add(butt1);

		butt2=new JButton("Press me for Window  Q");
		h.add(butt2);

		quit=new JButton("QUIT");
		h.add(quit);
		
	k.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	k.getContentPane();
	item1=new JLabel("Hi This is Window K");
	k.add(item1);
	item1=new JLabel("                                                                                                                                                 ");
	k.add(item1);
	item1=new JLabel("                                                                                                                                                 ");
	k.add(item1);
	kback=new JButton("BACK TO HOME");
	k.add(kback);
	

	
	q.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	q.getContentPane();
	item1=new JLabel("     Hi This is Window Q");
	q.add(item1);
	item1=new JLabel("                                                                                                                                                 ");
	q.add(item1);
	item1=new JLabel("                                                                                                                                                 ");
	q.add(item1);
	item1=new JLabel("                                                                                                                                                 ");
	q.add(item1);
	item1=new JLabel("                                                                                                                                                 ");
	q.add(item1);
	qback1 = new JButton("BACK TO HOME");
	q.add(qback1);
	
	

	handlers handle=new handlers();
	butt1.addActionListener(handle);	
	butt2.addActionListener(handle);
	kback.addActionListener(handle);
	qback1.addActionListener(handle);
	quit.addActionListener(handle);
	
	}
	
	public static void main(String args[]) {
		WindowSwitch hoho=new WindowSwitch();
		    hoho.h.setLayout(new FlowLayout());
			hoho.h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			hoho.h.setSize(700,500);
			hoho.h.setLocation(500,300);
			hoho.h.setVisible(true);	
			
			
	}
	
	public class handlers implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==butt1) {
				k.setLayout(new FlowLayout());
				k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				k.setSize(700,500);
				k.setLocation(500,300);
				k.setVisible(true);
				h.setVisible(false);}
				
				if(e.getSource()==kback){
					k.setVisible(false);
					h.setVisible(true);
				
				}
				
					
					
			   else if(e.getSource()==butt2) {
						h.setVisible(false);
						q.setVisible(true);
						q.setLayout(new FlowLayout());
						q.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						q.setSize(700,500);
						q.setLocation(500,300);
							}
					
					if(e.getSource()==qback1){
						
						h.setVisible(true);
						q.setVisible(false);}
					
					
						
				if(e.getSource()==quit){
					int x=JOptionPane.showConfirmDialog(null, "Do you wish to quit?", "QUIT", JOptionPane.YES_NO_OPTION);
					if (x==0){
						h.dispose();}
					 
				}
				
				
					
			
		}
	}
}