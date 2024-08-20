/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktik3;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SuccessForm extends JFrame {

    public SuccessForm() {
        initComponents();
    }

    private void initComponents() {

        JPanel jPanel = new JPanel();
        JLabel jLabel = new JLabel("Selamat datang di Form Sukses!");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.add(jLabel);
        getContentPane().add(jPanel);

        pack();
        setLocationRelativeTo(null); // Memusatkan form di layar
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new SuccessForm().setVisible(true));
    }
}
