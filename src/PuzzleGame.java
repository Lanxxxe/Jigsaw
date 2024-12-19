import javax.swing.*;

public class PuzzleGame extends JFrame {
     public PuzzleGame() {
        this.dispose(); // Close the current window
        new JLevelOne().setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
          
            PuzzleGame game = new PuzzleGame();
            game.setVisible(true);
        });
    }
}
