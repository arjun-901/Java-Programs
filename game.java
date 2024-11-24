import java.util.*;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.swing.*;

class Game extends JPanel {
    private Timer timer;
    private Snake snake;
    private Point cherry;
    private int points = 0;
    private int best = 0;
    private BufferedImage image;
    private GameStatus status;
    private boolean didLoadCherryImage = true;

    private static final Font FONT_M = new Font("MV Boli", Font.PLAIN, 24);
    private static final Font FONT_M_ITALIC = new Font("MV Boli", Font.ITALIC, 24);
    private static final Font FONT_L = new Font("MV Boli", Font.PLAIN, 84);
    private static final Font FONT_XL = new Font("MV Boli", Font.PLAIN, 150);
    private static final int WIDTH = 760;
    private static final int HEIGHT = 520;
    private static final int DELAY = 50;

    // Constructor
    public Game() {
        try {
            image = ImageIO.read(new File("cherry.png"));
        } catch (IOException e) {
            didLoadCherryImage = false;
        }

        addKeyListener(new KeyListener());
        setFocusable(true);
        setBackground(new Color(130, 205, 71));
        setDoubleBuffered(true);

        snake = new Snake(WIDTH / 2, HEIGHT / 2);
        status = GameStatus.NOT_STARTED;
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        render(g);
        Toolkit.getDefaultToolkit().sync();
    }

    // Render the game
    private void update() {
        snake.move();

        if (cherry != null && snake.getHead().intersects(cherry, 20)) {
            snake.addTail();
            cherry = null;
            points++;
        }

        if (cherry == null) {
            spawnCherry();
        }

        checkForGameOver();
    }

    private void reset() {
        points = 0;
        cherry = null;
        snake = new Snake(WIDTH / 2, HEIGHT / 2);
        setStatus(GameStatus.RUNNING);
    }

    private void setStatus(GameStatus newStatus) {
        switch (newStatus) {
            case RUNNING:
                if (timer != null) {
                    timer.cancel();
                }
                timer = new Timer();
                timer.schedule(new GameLoop(), 0, DELAY);
                break;
            case PAUSED:
                if (timer != null) {
                    timer.cancel();
                }
                break;
            case GAME_OVER:
                if (timer != null) {
                    timer.cancel();
                }
                best = Math.max(points, best);
                break;
        }

        status = newStatus;
    }

    private void togglePause() {
        setStatus(status == GameStatus.PAUSED ? GameStatus.RUNNING : GameStatus.PAUSED);
    }

    // Check if the snake has hit the wall or itself
    private void checkForGameOver() {
        Point head = snake.getHead();
        boolean hitBoundary = head.getX() <= 20
                || head.getX() >= WIDTH - 10
                || head.getY() <= 40
                || head.getY() >= HEIGHT - 10;

        boolean ateItself = sna
