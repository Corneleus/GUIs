package GUIs;
import java.awt.BorderLayout; 
import javax.swing.JPanel;
import java.awt.Color; 
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame; 
 
/*
 * 15.7 (Change color using a mouse) Write a program that displays the color of a
circle as black when the mouse button is pressed and as white when the mouse
button is released.
 */
public class SolveAndDiscuss {

	public static void main(String[] args) { 
		
		JFrame f = new JFrame(); 
		
		final JPanel p = new JPanel(); 

		f.add(p, BorderLayout.CENTER); 
		p.addMouseListener(new MouseAdapter(){ 

		@Override 
		public void mouseReleased(MouseEvent e) { 
		p.setBackground(Color.white); 
		} 		
		
		@Override 
		public void mousePressed(MouseEvent e) { 
		p.setBackground(Color.black); 
		} 

}); 

		f.setSize(200,200); 
		f.setVisible(true); 
		} 

}