package anette.godtland;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WizardOfYesNo extends JFrame {

  public static final String ANSWER = "NO";

  public WizardOfYesNo() {
    JLabel label = new JLabel();
    label.setText(ANSWER);
    add(label);
    setSize(400, 200);
    setLocationRelativeTo(null);

    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new WizardOfYesNo();
  }
}
