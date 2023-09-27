import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LotofacilGUI extends JFrame {
    private JPanel painel = new JPanel();
    private JButton jButtonAposta1 = new JButton("Apostar de 0 a 100");
    private JButton jButtonAposta2 = new JButton("Apostar de A a Z");
    private JButton jButtonAposta3 = new JButton("Apostar par ou ímpar");

    public LotofacilGUI() {
        this.setTitle("Lotofácil");
        this.setSize(400, 200);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
        painel.setBackground(new Color(255, 255, 255));
        painel.add(jButtonAposta1);
        painel.add(jButtonAposta2);
        painel.add(jButtonAposta3);
        this.getContentPane().add(painel);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

        // Adiciona os ActionListeners aos botões
        jButtonAposta1.addActionListener(new Aposta1ActionListener());
        jButtonAposta2.addActionListener(new Aposta2ActionListener());
        jButtonAposta3.addActionListener(new Aposta3ActionListener());
    }

    public static void main(String[] args) {
        new LotofacilGUI();
    }

    class Aposta1ActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Random rnd = new Random(); // Inicialize a classe Random
            int sorteio = rnd.nextInt(101);

            String input = JOptionPane.showInputDialog(null, "Digite sua aposta, de 0 a 100:");
            try {
                int aposta = Integer.parseInt(input);
                if(aposta == sorteio){
                    JOptionPane.showMessageDialog(null, "Você ganhou milzão.");
                } else {
                    JOptionPane.showMessageDialog(null, "Você perdeu! O número sorteado foi: " + sorteio);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Digite um número válido.");
            }
        }
    }

    class Aposta2ActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Random rnd = new Random();
            char letraSorteada = (char) (rnd.nextInt(26) + 'A');

            String input = JOptionPane.showInputDialog(null, "Digite uma letra de A a Z:");
            input = input.toUpperCase();

            if(input.length() == 1 && Character.isLetter(input.charAt(0))){
                char letraApostada = input.charAt(0);
                if(letraApostada == letraSorteada){
                    JOptionPane.showMessageDialog(null, "Você ganhou quinhentão.");
                }else {
                    JOptionPane.showMessageDialog(null, "Você perdeu! A letra sorteada foi: " + letraSorteada);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Digite uma letra válida.");
            }
        }
    }

    class Aposta3ActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String input = JOptionPane.showInputDialog(null, "Digite um número para verificar se é par ou ímpar:");
            try {
                int numeroDigitado = Integer.parseInt(input);
                if(numeroDigitado % 2 == 0){
                    JOptionPane.showMessageDialog(null, "Você ganhou cenzão. O número é par.");
                } else {
                    JOptionPane.showMessageDialog(null, "Você perdeu! O número é ímpar.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Digite um número válido.");
            }
        }
    }
}
