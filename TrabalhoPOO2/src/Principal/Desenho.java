package Principal;

import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
/**
 *
 * @author Jose_Junior
 */
public class Desenho {

	JFrame janelaCanv = new JFrame();
	
	public void janela_canvas(){
		
		
		janelaCanv.setLocationRelativeTo(null);
		janelaCanv.setBackground(Color.cyan);
		janelaCanv.setSize(300, 350);
		janelaCanv.setVisible(true);
		janelaCanv.setTitle("Marca");
		janelaCanv.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
		janelaCanv.add(new desenharCanvas());
		
	}
		
	
	public class desenharCanvas extends Canvas{

		public void paint(Graphics g){
			g.drawLine(150, 0, 0, 300);
			g.drawLine(0, 300, 300, 100);
			g.drawLine(300, 100, 0, 100);
                        g.drawLine(0, 100, 300, 300);
                        g.drawLine(300, 300, 150, 0);
		}	
			
	}
	
}
