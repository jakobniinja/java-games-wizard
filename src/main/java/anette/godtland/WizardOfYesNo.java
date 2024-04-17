package anette.godtland;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class WizardOfYesNo extends JFrame {

  private static final Long serialVersionUID = 1L;

  protected static final String[] ANSWERS = {
      "Yes.",
      "Go for it!",
      "For sure!",
      "I would say yes.",
      "Most likely yes.",
      "No.",
      "I wouldn't.",
      "In my opinion, no.",
      "Definitely not!",
      "Probably not.",
      "It is very doubtful."
  };

  public WizardOfYesNo() {
    Random random = new Random();
    int numberOfAnswers = ANSWERS.length;
    int pick = random.nextInt(numberOfAnswers);
    String answer = ANSWERS[pick];

    JLabel label = new JLabel();
    label.setText(answer);
    Font font = new Font(Font.SERIF, Font.BOLD, 32);
    label.setFont(font);
    label.setHorizontalAlignment(SwingConstants.CENTER);
    add(label);
    setTitle("Wizard Yes/No");
    setResizable(false);
    pack();
    setSize(400, 200);
    setLocationRelativeTo(null);

    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    try {
      String className = UIManager.getCrossPlatformLookAndFeelClassName();
      UIManager.setLookAndFeel(className);

      EventQueue.invokeLater(WizardOfYesNo::new);
    } catch (Exception e) {
    }
  }
}
