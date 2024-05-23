
import javax.swing.JFrame;

public class Container extends JFrame {

    public Container() {
        add(new Fase());
        setTitle("Meu Jogo");
        setSize(1024, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Container();
    }

}
