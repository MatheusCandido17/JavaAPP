import javax.swing.JRadioButton;

import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;

public class MeuRadioGroup extends JPanel {

	private static final long serialVersionUID = 1L;
	
    private List <String> opcoes;
    private ButtonGroup grupo = new ButtonGroup();
    
    public MeuRadioGroup(List<String> opcoes) {
    
    	this.opcoes = opcoes;
    	init();
    	
    	
    }

	private void init() {
	
		opcoes.forEach(opcao ->{
			JRadioButton botao = new JRadioButton(opcao);
			grupo.add(botao);
			this.add(botao);
			
		});
	}
    
}
