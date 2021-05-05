import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;

public class MeuTextField extends JTextField {

	private static final long serialVersionUID = 1L;
 
	public MeuTextField() {
		
		super();
		init();
	}

	private void init() {
		this.setPreferredSize(new Dimension(200,30));
		this.setBackground(Color.WHITE);
		this.setForeground(new Color(50,50,50));
		this.setBorder(BordaFactory.criar());
		
	}
	
}
