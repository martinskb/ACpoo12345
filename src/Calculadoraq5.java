
import javax.swing.JOptionPane;

public class CalculadoraDialogQ5 {
    public static void main(String[] args) {
        while (true) {
            try {
                String s1 = JOptionPane.showInputDialog(null, "Digite o primeiro número (ou Cancel para sair):");
                if (s1 == null) break; // Cancel
                double a = Double.parseDouble(s1.trim());

                String s2 = JOptionPane.showInputDialog(null, "Digite o segundo número (ou Cancel para sair):");
                if (s2 == null) break;
                double b = Double.parseDouble(s2.trim());

                Object[] opcoes = {"+", "-", "×", "÷"};
                int escolha = JOptionPane.showOptionDialog(
                        null,
                        "Escolha a operação",
                        "Operação",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opcoes,
                        opcoes[0]
                );

                if (escolha == -1) break; // fechou a janela

                double resultado;
                switch (escolha) {
                    case 0: resultado = a + b; break;
                    case 1: resultado = a - b; break;
                    case 2: resultado = a * b; break;
                    case 3:
                        if (b == 0) {
                            JOptionPane.showMessageDialog(null, "Erro: divisão por zero!");
                            continue;
                        }
                        resultado = a / b;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Operação inválida");
                        continue;
                }

                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida! Digite um número.");
            }
        }
    }
}
