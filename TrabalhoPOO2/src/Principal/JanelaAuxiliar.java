package Principal;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Jose_Junior
 */
public class JanelaAuxiliar extends JFrame implements ActionListener {

    //-------------------variaveis da JanelaConfirmacao de confirmacao----------
    JFrame JanConfirmacao = new JFrame();

    private JList disciplina;
    Container conteudoJanela;

    JButton cancela = new JButton("Cancela");
    JButton confirma = new JButton("Confirma");

    JLabel msg_decisao = new JLabel("Deseja Salvar Seus Dados?");
    public boolean resposta;
    //=========================================================================
// -------------------VARIAVEIS  DA JANELA CADASTRO-----------------------------

    JFrame janCadastro = new JFrame();

    JLabel label_sexo = new JLabel("Sexo");
    JLabel JLnome = new JLabel(" Nome ");
    JLabel JLcomentario = new JLabel("Disciplinas");
    
    JTextArea JTareaRelatorio = new JTextArea();

    TextField TFnome = new TextField();

    List lista_disciplina = new List(5, true);

    JButton botaoLogo = new JButton("VER LOGOMARCA");
    JButton botaoDetalhe = new JButton("VER CADASTRO");
    JButton botaoCadastrar = new JButton("CADASTRAR");
    JButton botaoSair = new JButton("SAIR");

    JRadioButton rb_masculino = new JRadioButton("Masculino", false);
    JRadioButton rb_feminino = new JRadioButton("Feminino", false);
    JRadioButton rb_indefinido = new JRadioButton("Indefinido", false);
//==============================================================================
    //------------------------------janela de cadastro--------------------------
    public void JanelaCadastro(boolean a) {

        JLabel JLverCadastro = new JLabel("VER CADASTRO:");

        lista_disciplina.add(",POO2,");
        lista_disciplina.add(",AUDITORIA,");
        lista_disciplina.add(",REDES II,");
        lista_disciplina.add(",PROGRAMAÇÃO LOGICA,");
        lista_disciplina.add(",CIRCUITOS,");

        JLnome.setBounds(20, 30, 50, 40);
        TFnome.setBounds(100, 30, 350, 30);
        label_sexo.setBounds(30, 80, 50, 40);

        rb_masculino.setBounds(80, 80, 100, 40);
        rb_feminino.setBounds(190, 80, 100, 40);
        rb_indefinido.setBounds(300, 80, 100, 40);
        lista_disciplina.setBounds(50, 150, 150, 90);

        // definição dos botoes na tela de cadastro
        botaoCadastrar.setBounds(150, 330, 100, 30);
        botaoSair.setBounds(400, 330, 90, 30);
        botaoLogo.setBounds(300, 150, 180, 30);
        botaoDetalhe.setBounds(320, 250, 150, 30);
        //criando a janela cadastro
        janCadastro.setLayout(null);
        janCadastro.setTitle("Tela de Cadastro");
        janCadastro.setVisible(a);
        janCadastro.getContentPane().setBackground(Color.LIGHT_GRAY);
        janCadastro.setSize(500, 400);
        janCadastro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janCadastro.add(JLnome);
        janCadastro.add(TFnome);
        janCadastro.add(label_sexo);
        janCadastro.add(rb_masculino);
        janCadastro.add(rb_feminino);
        janCadastro.add(rb_indefinido);
        janCadastro.add(lista_disciplina);
        janCadastro.add(botaoCadastrar);
        janCadastro.add(botaoSair);
        janCadastro.add(botaoLogo);
        janCadastro.add(JLcomentario);
        janCadastro.add(JLverCadastro);

        botaoSair.addActionListener(this);
        botaoLogo.addActionListener(this);
        botaoCadastrar.addActionListener(this);
        botaoDetalhe.addActionListener(this);

    }//fim da decaracao das variaveis da JanelaConfirmacao da tela de cadastro
    
     //=========================================================================
    // -------------- JANELA DE CONFIRMAÇÂO 2-----------------------------------
    public void JanelaConfirmacao() {

        JanConfirmacao.setLayout(null);
        JanConfirmacao.setSize(300, 200);
        JanConfirmacao.setVisible(true);
        JanConfirmacao.getContentPane().setBackground(Color.LIGHT_GRAY);
        JanConfirmacao.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JanConfirmacao.setTitle("Confirmação");
        JanConfirmacao.setLocationRelativeTo(null);

        msg_decisao.setBounds(50, 50, 200, 30);

        cancela.setBounds(50, 100, 100, 20);

        confirma.setBounds(190, 100, 100, 20);

        JanConfirmacao.add(cancela);
        JanConfirmacao.add(confirma);
        JanConfirmacao.add(msg_decisao);

        cancela.addActionListener(this);
        confirma.addActionListener(this);

    }
    //==========================================================================
    //---------------------------JANELA EXIBIR ---------------------------------
    public void JanelaExibir() {

        JFrame janExibir = new JFrame();

        janExibir.setLayout(null);
        janExibir.setVisible(true);
        janExibir.setSize(500, 400);
        janExibir.setTitle("Relatorio de Cadastro!");
        janExibir.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        janExibir.getContentPane().setBackground(Color.green);
        janExibir.setLocationRelativeTo(null);

        String opcao_sexual = null;

        if (rb_masculino.isSelected() == true) {
            opcao_sexual = "Maculino";
        } else if (rb_feminino.isSelected() == true) {
            opcao_sexual = "Feminino";
        } else if (rb_indefinido.isSelected() == true ) {
            opcao_sexual = "Indecidido";
        }

        String disciplinas_s = "  ";
        System.out.println(" ");

        for (String i : lista_disciplina.getSelectedItems()) {
            disciplinas_s = disciplinas_s + i;
        }

        JLabel JL_comentario = new JLabel(JTareaRelatorio.getText());// criação da area de comentario

        JLabel JLaluno = new JLabel(" Aluno: " + TFnome.getText());
        JLabel  JLsexo = new JLabel(" Sexo: " + opcao_sexual);
        JLabel  JLdisciplina = new JLabel("Disciplinas: ");
        
        JLabel JLComentario = new JLabel("Comentarios:");
        JLabel  JLexibe = new JLabel("Dados Cadastrados com sucesso!!");
        JLabel  JLdiscSele = new JLabel(disciplinas_s);

        JLaluno.setBounds(60, 70, 300, 20);
        JLsexo.setBounds(60, 100, 300, 20);
        JLdisciplina.setBounds(60, 120, 100, 30); //label disciplinas
        JLdiscSele.setBounds(20, 140, 290, 30);//disciplinas selecionadas
        JLexibe.setBounds(150, 20, 300, 30);

        JTextArea imprimir = new JTextArea(JTareaRelatorio.getText());//intanciando 

        imprimir.setBounds(60, 250, 120, 80);

        janExibir.add(JLaluno);
        janExibir.add(JLsexo);
        janExibir.add(JLdisciplina);
        janExibir.add(JLComentario);
        janExibir.add(JLexibe);
        janExibir.add(JLdiscSele);
        janExibir.add(imprimir);

    }
//=============================================================================
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == cancela) {
        
            JanConfirmacao.dispose();
        
        } else if (e.getSource() == confirma) {
                botaoDetalhe.setVisible(true);
                janCadastro.add(botaoDetalhe);
            
                   JanConfirmacao.dispose();
                   JOptionPane.showMessageDialog(null, "Dados Cadastrados Com sucesso!!!");
        
        } else if (e.getSource() == botaoLogo) {
                
                    Desenho d = new Desenho();
                    d.janela_canvas();
       
        } else if (e.getSource() == botaoCadastrar) {
         
                    JanelaConfirmacao();
        
        } else if (e.getSource() == botaoSair) {
            
                    JOptionPane.showMessageDialog(null, "Aplicação Finalizada!");
                    System.exit(0);
        
        } else if (e.getSource() == botaoDetalhe) {
            
                    JanelaExibir();
        
        } else {
                    JOptionPane.showMessageDialog(null, "Opcao Invalida");

        }

    }//fim do metodo de acao do botao

}//fim da classe
