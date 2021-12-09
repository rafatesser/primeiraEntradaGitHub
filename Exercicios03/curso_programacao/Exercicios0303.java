package curso_programacao;

import javax.swing.JOptionPane;

public class Exercicios0303 {
	public static void main(String args[])
	{	int cont1 = 0;
		int cont2 = 0;
		int cont3 = 0;
		int combustivel = 0;
		
		while (combustivel != 4)
		{
			combustivel = Integer.parseInt(JOptionPane.showInputDialog("Digite o Combustivel de sua preferencia:\n"
				+ "1.Alcool\n"
				+ "2.Gasolina\n"
				+ "3.Diesel\n"
				+ "4.fim"));
			
			switch (combustivel)
			{
				case 1:
					cont1 += 1;
					break;
				case 2:
					cont2 += 1;
					break;
				case 3:
					cont3 += 1;
					break;
				case 4:
				{
					int confirm = JOptionPane.showConfirmDialog(null, "Deseja finalizar o processo?");
					if (confirm == JOptionPane.YES_OPTION)
						JOptionPane.showMessageDialog(null, "Até logo....");
					else if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) 
					{
						JOptionPane.showMessageDialog(null, "Vamos continuar então....");
						combustivel = 0;
					}
					break;
				}	
				default:
				{
					JOptionPane.showMessageDialog(null, "Opção inválida");
					break;
				}
					
			}
		}
		
		if (cont1 > 0 || cont2 > 0 || cont3 > 0)
			JOptionPane.showMessageDialog(null, "MUITO OBRIGADO\n"
					+ "1.Alcool: " + cont1 + "\n"
					+ "2.Gasolina: " + cont2 + "\n"
					+ "3.Diesel: " + cont3 );
		else
			JOptionPane.showMessageDialog(null, "Não houve interação com o sistema");
		
		
		
	}
}
