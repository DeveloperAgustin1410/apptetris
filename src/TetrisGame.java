// TetrisGame.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class TetrisGame extends JPanel implements ActionListener, KeyListener {
    private final int gridWidth = 10;
    private final int gridHeight = 20;
    private final int blockSize = 30;
    private Timer timer;
    private final int delay = 500;

    private Color[][] grid;
    private Tetromino currentPiece;
    private Point piecePosition;
    private int currentRotation;
    private Random random;

    public TetrisGame() {
        setPreferredSize(new Dimension(gridWidth * blockSize, gridHeight * blockSize));
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);

        grid = new Color[gridHeight][gridWidth];
        random = new Random();

        spawnNewPiece();
        timer = new Timer(delay, this);
        timer.start();
    }

    private void spawnNewPiece() {
        currentPiece = Tetromino.values()[random.nextInt(Tetromino.values().length)];
        piecePosition = new Point(gridWidth / 2 - 1, 0);
        currentRotation = 0;

        if (!canMove(piecePosition.x, piecePosition.y, currentRotation)) {
            timer.stop();
            JOptionPane.showMessageDialog(this, "Game Over");
        }
    }

    private boolean canMove(int x, int y, int rotation) {
        for (Point p : currentPiece.getShape(rotation)) {
            int newX = x + p.x;
            int newY = y + p.y;
            if (newX < 0 || newX >= gridWidth || newY < 0 || newY >= gridHeight) {
                return false;
            }
            if (grid[newY][newX] != null) {
                return false;
            }
        }
        return true;
    }

    private void fixPiece() {
        for (Point p : currentPiece.getShape(currentRotation)) {
            int x = piecePosition.x + p.x;
            int y = piecePosition.y + p.y;
            grid[y][x] = currentPiece.getColor();
        }
        clearLines();
        spawnNewPiece();
    }

    private void clearLines() {
        for (int row = gridHeight - 1; row >= 0; row--) {
            boolean fullLine = true;
            for (int col = 0; col < gridWidth; col++) {
                if (grid[row][col] == null) {
                    fullLine = false;
                    break;
                }
            }
            if (fullLine) {
                for (int i = row; i > 0; i--) {
                    System.arraycopy(grid[i - 1], 0, grid[i], 0, gridWidth);
                }
                grid[0] = new Color[gridWidth];
                row++;
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int row = 0; row < gridHeight; row++) {
            for (int col = 0; col < gridWidth; col++) {
                if (grid[row][col] != null) {
                    g.setColor(grid[row][col]);
                    g.fillRect(col * blockSize, row * blockSize, blockSize, blockSize);
                    g.setColor(Color.BLACK);
                    g.drawRect(col * blockSize, row * blockSize, blockSize, blockSize);
                }
            }
        }

        g.setColor(currentPiece.getColor());
        for (Point p : currentPiece.getShape(currentRotation)) {
            int x = piecePosition.x + p.x;
            int y = piecePosition.y + p.y;
            g.fillRect(x * blockSize, y * blockSize, blockSize, blockSize);
            g.setColor(Color.BLACK);
            g.drawRect(x * blockSize, y * blockSize, blockSize, blockSize);
            g.setColor(currentPiece.getColor());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (canMove(piecePosition.x, piecePosition.y + 1, currentRotation)) {
            piecePosition.y++;
        } else {
            fixPiece();
        }
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_LEFT:
                if (canMove(piecePosition.x - 1, piecePosition.y, currentRotation)) piecePosition.x--;
                break;
            case KeyEvent.VK_RIGHT:
                if (canMove(piecePosition.x + 1, piecePosition.y, currentRotation)) piecePosition.x++;
                break;
            case KeyEvent.VK_DOWN:
                if (canMove(piecePosition.x, piecePosition.y + 1, currentRotation)) piecePosition.y++;
                break;
            case KeyEvent.VK_UP:
                int newRotation = (currentRotation + 1) % 4;
                if (canMove(piecePosition.x, piecePosition.y, newRotation)) currentRotation = newRotation;
                break;
        }
        repaint();
    }

    @Override public void keyTyped(KeyEvent e) {}
    @Override public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tetris Game");
        TetrisGame game = new TetrisGame();
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
