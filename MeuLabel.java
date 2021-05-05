
import java.io.Serializable;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;


public class MeuLabel extends JLabel implements Serializable {

	private static final long serialVersionUID = 1L;

	//mudar o tamanho da fonte e a Cor			
	private int size = 26;
	
	
	
	
	
	public MeuLabel (String texto, Color black) {
		super(texto);
		init();
		}

	
	private void init () {
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setForeground(new Color(199,4,92));
		this.setFont(new Font(null, Font.BOLD,size));
		this.setPreferredSize(new Dimension(100,100));
		}	
}
