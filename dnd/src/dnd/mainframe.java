package dnd;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class mainframe {
	//This is the JFrame that runs the program.
	private static JFrame frame =  new JFrame("dmgen");
	
	//This is the pane in the JFrame
	private static Container pane = frame.getContentPane();
	public static void main(String[] args) {
		npc thing = new npc();
		
		// TODO Auto-generated method stub
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pane = frame.getContentPane();
		JButton button2 = new JButton("gen struct");
		JButton button1 = new JButton("gen quest");
		button2.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent evt) {
				 structGen stuff=new structGen();
				System.out.println( stuff.GenStruct());
			  }
			});
		button1.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent evt) {
				System.out.println(thing.createQuest());
			  }
			});
		pane.add(button2);
		pane.add(button1);
		 
		//This Layout Manager is more important later in the pane design methods
		pane.setLayout(new GridBagLayout());
		frame.setSize(1000, 600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
