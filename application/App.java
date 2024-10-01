package application;

import com.formdev.flatlaf.FlatDarkLaf;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame{

    public App(){
        super();

        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JButton chats = new JButton("Chats");
        JPanel mainScreen = new JPanel();

        chats = new JButton("Chats");
        setTitle("Main Screen");
        setSize(350, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLocationRelativeTo(null); // centraliza a janela na tela

        mainScreen = new JPanel();
//        mainScreen.setLayout(new BoxLayout(mainScreen, BoxLayout.Y_AXIS));
        mainScreen.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();gbc.fill = GridBagConstraints.HORIZONTAL; // Expande os botões horizontalmente para preencher a área
        gbc.anchor = GridBagConstraints.CENTER;   // Centraliza o botão no eixo x e y
        gbc.weightx = 1;
        gbc.weighty = 0.1;  // Mantém proporções verticais uniformes

        mainScreen.add(chats);
        add(mainScreen);

        // chats.addActionListener(e -> createPromptScreen);
        setVisible(true);
    }
    
}
