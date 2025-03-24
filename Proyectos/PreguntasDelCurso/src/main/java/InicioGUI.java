package PreguntasDelCurso;

import java.awt.event.*;
import javax.swing.*;

import PreguntasDelCursoMVC.FileHandler;
import PreguntasDelCursoMVC.Modelo.Pregunta;

/**
 * @file InicioGUI.java
 * @brief Clase para el menú principal de la aplicación.
 * @date 20/03/2023
 * @version 1.0
 */
public class InicioGUI extends JFrame implements ActionListener {
    private JMenuBar menuBar;
    private JMenuItem adminMenuItem;
    private JMenuItem preguntasMenuItem;
    //private JButton adminButton;
    //private JButton preguntasButton;
    private PreguntasList questionList;
    private FileHandler<Pregunta> fileHandler;
    
    /**
     * Constructor para la clase MenuGUI.
     * 
     * @param questionList La lista de preguntas.
     * @param fileHandler El manejador de archivos de preguntas.
     */
    public InicioGUI(PreguntasList questionList, FileHandler<Pregunta> fileHandler) {
        super("Menú Principal");
        this.questionList = questionList;
        this.fileHandler = fileHandler;
        
        // Crear la barra de menú y agregarla a la ventana
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        // Crear los elementos del menú y agregarlos directamente a la barra de menú
        adminMenuItem = new JMenuItem("Administración");
        adminMenuItem.addActionListener(this);
        menuBar.add(adminMenuItem);
        
        preguntasMenuItem = new JMenuItem("Jugar");
        preguntasMenuItem.addActionListener(this);
        menuBar.add(preguntasMenuItem);
        
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        /* 
        adminButton = new JButton("Administración");
        adminButton.addActionListener(this);
        
        preguntasButton = new JButton("Jugar");
        preguntasButton.addActionListener(this);
        
        JPanel panel = new JPanel();
        panel.add(adminButton);
        panel.add(preguntasButton);
        
        getContentPane().add(panel);
        
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);*/
    }
    
    /**
     * Método para manejar los eventos de los botones.
     * 
     * @param e El evento que ha ocurrido.
     */
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == adminMenuItem) {
            AdminGUI adminGUI = new AdminGUI(questionList, fileHandler, this); // Pasar 'this' como argumento
            adminGUI.setVisible(true);
        } else if (e.getSource() == preguntasMenuItem) {
            PreguntaGUI preguntaGUI = new PreguntaGUI(questionList, this);
            preguntaGUI.setVisible(true);
        }
        
        dispose();
    }
}
