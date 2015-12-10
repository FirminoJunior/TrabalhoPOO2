package Principal;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 *
 * @author Jose_Junior
 */
public class Janela extends JFrame implements ActionListener {

	// --- autenticação do sistema usuario e senha---
    String nome = "admin";
    String senha = "123";

    static int quantidade = 5;

	//---------propriedades da JanelaConfirmacao de login------------
    JFrame janela1;

    JFrame janela2;

    JButton botaoLogin;

    JLabel JLlogin;
    JLabel JLsenha;

    TextField TfLogin;
    TextField Tfsenha;

	//-------propriedades da JanelaConfirmacao de confirmação---- 
    JButton bt_seguinte;
    JButton bt_sair;

    JLabel JLdecisao;

	//instancia da JanelaConfirmacao auxiliar
    JanelaAuxiliar aux;

    public void actionPerformed(ActionEvent e) {
        boolean clique = true;
        if (nome.equals(TfLogin.getText()) && senha.equals(Tfsenha.getText())) {
//            janelaLogin(false); //deixa de exibir a janela de login na tela
//            janelaConfirmacao(true);// exibe a janela confirmação
//            JOptionPane confirmacao = new JOptionPane("deseja realmente fazer esta operação?", JOptionPane.QUESTION_MESSAGE, JOptionPane.YES_NO_OPTION);
            int n = JOptionPane.showConfirmDialog(this, "deseja realmente fazer esta operação?", "Confirmacao", JOptionPane.YES_NO_OPTION);
            if (n==0) {
                //cadastro
                aux.JanelaCadastro(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Informacoes Incorretas!!");

            janelaLogin(true);// chamndo a janela login

        }

    }

        	// JanelaConfirmacao principal
    public void janelaLogin(boolean a) {

        janela1 = new JFrame();

        janela2 = new JFrame();

        botaoLogin = new JButton(" Logar ");

        JLlogin = new JLabel(" admin: ");
        JLsenha = new JLabel(" Senha: ");

        TfLogin = new TextField();
        Tfsenha = new TextField();

	//-------propriedades da JanelaConfirmacao de confirmação---- 
        bt_seguinte = new JButton(" Next ");
        bt_sair = new JButton(" Exit ");

        JLdecisao = new JLabel(" Want to register this information? ");

        aux = new JanelaAuxiliar();

        JPanel pDados = new javax.swing.JPanel();
        pDados.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados de LOGIN"));
              // pDados.setToolTipText("");   

        //Criando um painel
        pDados.setBounds(45, 10, 300, 190);
        pDados.setBackground(Color.RED);
        pDados.setLayout(null);
                //pDados.add(TfLogin);
        // pDados.add(Tfsenha);

        //---informando cada posição----
        botaoLogin.setBounds(160, 200, 100, 30);
        botaoLogin.addActionListener(this);//adicinando a ação do botão LOGIN
        
        JLlogin.setBounds(0, 75, 45, 25);
        JLsenha.setBounds(0, 140, 60, 20);

        TfLogin.setBounds(60, 70, 230, 30);
        Tfsenha.setBounds(60, 140, 200, 30);

        //criando a JanelaLogin
        janela1.setLayout(null);
        janela1.setTitle("Janela LOGIN");
        janela1.setVisible(a);
        janela1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        janela1.getContentPane().setBackground(Color.LIGHT_GRAY);
        janela1.setLocationRelativeTo(null);
        janela1.setSize(400, 300);

                //-----adicionando elementos na JanelaLogin-----
        

        pDados.add(JLlogin);
        pDados.add(JLsenha);

        pDados.add(TfLogin);
        pDados.add(Tfsenha);

        janela1.add(botaoLogin);
        
        janela1.add(pDados);

    }
	//--------------------JANELA CONFIRMAÇAO-------------------------

   
   

}
