package curso_programacao;

import javax.swing.JOptionPane;

public class Exercicios0302 {
	public static void main(String args[])
	{
		boolean bool = false;
		
		while (!bool)
		{
			int x = Integer.parseInt(JOptionPane.showInputDialog
					("Digite a primeira coordenada"));
			int y = Integer.parseInt(JOptionPane.showInputDialog
					("Digite a segunda coordenada: "));
			if (x == 0 || y == 0)
			{
				int confirm = JOptionPane.showConfirmDialog(null, "PONTO ORIGEM, deseja encerrar?", "ORIGEM", JOptionPane.OK_CANCEL_OPTION);
				if(confirm == JOptionPane.OK_OPTION)
				{
					JOptionPane.showMessageDialog(null, "Nos vemos em breve, ADEUS!!");
					bool = true;
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Vamos voltar então...");
				}
			}else if (x > 0 && y > 0)
				JOptionPane.showMessageDialog(null, "Você esta no Q1");
			else if (x > 0 && y < 0) 
				JOptionPane.showMessageDialog(null, "Você está no Q2");
			else if (x < 0 && y < 0) 
				JOptionPane.showMessageDialog(null, "Você está no Q3");
			else
				JOptionPane.showMessageDialog(null, "Você está no Q4");
				
		}
	}
}
