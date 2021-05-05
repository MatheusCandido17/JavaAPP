import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;


public class BotaoListener implements ActionListener, MouseListener{
	

	private MeuTextField nameTextField;

	public BotaoListener(MeuTextField nameTextField) {
		this.setNameTextField(nameTextField);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse in");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse out");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null,"Clikou no botao");
        		
	}

	public MeuTextField getNameTextField() {
		return nameTextField;
	}

	public void setNameTextField(MeuTextField nameTextField) {
		this.nameTextField = nameTextField;
	}
	
	
	

}
