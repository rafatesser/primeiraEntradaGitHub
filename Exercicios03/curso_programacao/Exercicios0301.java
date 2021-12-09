package curso_programacao;

import javax.swing.JOptionPane;

public class Exercicios0301 {
	public static void main(String args[])
	{
		
		boolean passOk = false;
		
		while (passOk == false)
		{
			int x = Integer.parseInt(JOptionPane.showInputDialog("Digite sua senha: "));
			int ans = JOptionPane.showConfirmDialog(null, "Confirma a senha?");
			switch (ans) 
			{	case JOptionPane.YES_OPTION:
					if (x == 1903) {
						JOptionPane.showMessageDialog(null, "Sua senha esta correta. Acesso liberado");
						passOk = true;
					}else
					{
						JOptionPane.showMessageDialog(null, "Senha incorreta, tente novamente.");
					}
					break;
				case JOptionPane.NO_OPTION:
					JOptionPane.showMessageDialog(null, "Vamos digitar novamente...");
					break;
				case JOptionPane.CANCEL_OPTION:
					JOptionPane.showMessageDialog(null, "Cancelando Operação");
					passOk = true;
					break;
			}
		}
		
	}
}
