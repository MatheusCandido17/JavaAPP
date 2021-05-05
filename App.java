import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import app.StarRater;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.List;

public class App {
   
	

	public static void main(String[] args)  {
		
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JFrame frame=  new JFrame();
		JTabbedPane abas = new JTabbedPane();
		
		JFrame janela = new JFrame("Meu App");
		janela.setLayout(new FlowLayout());
		
		MeuTextField nameTextField = new MeuTextField();

		abas.add("Inicio", janela);
		abas.add("Cadastro",new JPanel());
		abas.add("Perfil", new JPanel());
		
		
		JPanel panel = new JPanel(new GridLayout(2,2));
		panel.add(new MeuLabel("Bem Vindo",Color.BLACK));
		panel.add(new MeuTextField());
		panel.add(new MeuTextArea());
		
		
		
		janela.add(nameTextField);
		janela.add(panel , BorderLayout.CENTER);
		janela.add(new JCheckBox("Aceito os  termos do contrato"));
		
		
		
		
		List<String> listaDeOpcoes = List.of("Boleto", "Cartão");
		MeuRadioGroup group = new MeuRadioGroup(listaDeOpcoes );
		janela.add(group);
		
		MeuRadioGroup group2 = MeuRadioGroup (List.of("Residencial", "Comercial", "Celular"));
        janela.add(group2);
		
	
		
		
		janela.setSize(600, 400);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		
		frame.add(abas);
		
	
		String[] cidades = {"São Paulo", "Osasco", "Diadema"};
		janela.add(new JComboBox<String>(cidades));
		
		janela.add(new StarRater(10, 3.5f));
		
		JButton botao = new JButton("Salvar");
		botao.addActionListener(new BotaoListener(nameTextField));
		botao.addMouseListener(new BotaoListener(nameTextField));
		
		JPanel painelBotao = new JPanel(new FlowLayout());
		painelBotao.add(botao);
		
	   
		abas.add("Inicio", janela);
		abas.add("Cadastro", painelBotao);
		abas.add("Perfil", new JPanel());
		
		
		
		
		janela.add(new JLabel(new ImageIcon("src/filme.png")));
		

		
		
		
	
	}
	private static MeuRadioGroup MeuRadioGroup(List<String> of) {
		return null;
	}

	
	
}
