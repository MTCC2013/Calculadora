package br.com.senai.view;

//@author Mauricio Cardoso & Andrey Filippy
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.math.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class view extends JFrame {
    //Criando variaveis
    //variavel botoes padrao
    private JButton bt0;
    private JButton bt01;
    private JButton bt02;
    private JButton bt03;
    private JButton bt04;
    private JButton bt05;
    private JButton bt06;
    private JButton bt07;
    private JButton bt08;
    private JButton bt09;
    //variavel botoes operaçoes
    private JButton btSoma;
    private JButton btSubt;
    private JButton btMult;
    private JButton btDiv;
    //variavel botoes especiais
    private JButton btAoC;
    private JButton btAoQ;
    private JButton btRaizC;
    private JButton btRaizQ;   
    private JButton btBackspace;
    private JButton btPot;
    private JButton btPerc;
    private JButton btFat;    
    private JButton btIgual;
    private JButton btMaior;
    private JButton btMenor;
    private JTextField btTxt;

//---------- Construtor
    public view() {
        super("Calculadora JAVA");


//---------- Criando Paineis
        //criando painel 
        JPanel painel = new JPanel();
        //criando painelBackground(para a cor de fundo)
        JPanel painelBackground = new JPanel();
        //criando o painel dos botoes
        JPanel painelBotoes = new JPanel();

//---------- Criando Botoes  e eventos       
        //Criando  Botoes padrao
        bt0 = new JButton("0");
        bt01 = new JButton("1");
        bt02 = new JButton("2");
        bt03 = new JButton("3");
        bt04 = new JButton("4");
        bt05 = new JButton("5");
        bt06 = new JButton("6");
        bt07 = new JButton("7");
        bt08 = new JButton("8");
        bt09 = new JButton("9");

        //Criando  Botoes 4 operaçoes
        btSoma = new JButton("+");
        btSubt = new JButton("-");
        btMult = new JButton("*");
        btDiv = new JButton("/");

        //Criando Botoes especiais
        btAoQ = new JButton("X²");
        btAoC = new JButton("X³");
        btRaizQ = new JButton("√²");
        btRaizC = new JButton("√³");
        btFat = new JButton("!");
        btPot = new JButton("bª");       
        btBackspace = new JButton("C");
        btPerc = new JButton("%");
        btIgual = new JButton("=");
        btMaior = new JButton(">");
        btMenor = new JButton("<");

//---------- Criando  Janela de Texto
        btTxt = new JTextField();
        //deixando em modo false a editação da janela
        btTxt.setEditable(false);
        //tamanho da janela de texto em largura
        btTxt.setFont(new Font("Century Gothic", Font.PLAIN, 24));

//---------- Colocando Cores        
        //colocando cor na Janela de Texto
        btTxt.setBackground(Color.white);
        //Colocando cor nos paineis
        painelBackground.setBackground(Color.black);
        painel.setBackground(Color.black);
        painelBotoes.setBackground(Color.black);
        //Colocando cores nos botoes
        bt0.setBackground(Color.white);
        bt01.setBackground(Color.white);
        bt02.setBackground(Color.white);
        bt03.setBackground(Color.white);
        bt04.setBackground(Color.white);
        bt05.setBackground(Color.white);
        bt06.setBackground(Color.white);
        bt07.setBackground(Color.white);
        bt08.setBackground(Color.white);
        bt09.setBackground(Color.white);

        btSoma.setBackground(Color.orange);
        btSubt.setBackground(Color.orange);
        btDiv.setBackground(Color.orange);
        btMult.setBackground(Color.orange);
        btMaior.setBackground(Color.orange);
        btMenor.setBackground(Color.orange);

        btAoC.setBackground(Color.LIGHT_GRAY);
        btAoQ.setBackground(Color.LIGHT_GRAY);
        btPerc.setBackground(Color.LIGHT_GRAY);
        btFat.setBackground(Color.LIGHT_GRAY);
        btPot.setBackground(Color.LIGHT_GRAY);
        btRaizC.setBackground(Color.LIGHT_GRAY);
        btRaizQ.setBackground(Color.LIGHT_GRAY);

        btBackspace.setBackground(Color.red);
        btIgual.setBackground(Color.white);

        //Colocando cores nos numeros do botao
        btSoma.setForeground(Color.black);
        btSubt.setForeground(Color.black);
        btMult.setForeground(Color.black);
        btDiv.setForeground(Color.black);
        btMenor.setForeground(Color.black);
        btMaior.setForeground(Color.black);
        btBackspace.setForeground(Color.white);


//---------- Adicionando botoes e paineis á Janela
        //Adicionando Painel á Janela
        getContentPane().add(painelBackground);
        painelBackground.add(painel);
        //Adicionando Layout tipo BorderLayout ao painel
        painel.setLayout(new BorderLayout(5, 5));
        painel.add(BorderLayout.NORTH, btTxt);
        painel.add(BorderLayout.CENTER, painelBotoes);
        //Adicionando painelBotoes ao painel
        painel.add(painelBotoes);
        //Adicionando Layout tipo GridLayout ao painelBotoes
        painelBotoes.setLayout(new GridLayout(5, 5, 3, 3));
        //Adicionando todos os botoes ao painelBotoes
        //Primeira Linha               
        painelBotoes.add(btRaizQ);
        painelBotoes.add(btAoQ);
        painelBotoes.add(btRaizC);
        painelBotoes.add(btAoC);
        painelBotoes.add(btBackspace);
        //Segunda Linha
        painelBotoes.add(bt07);
        painelBotoes.add(bt08);
        painelBotoes.add(bt09);
        painelBotoes.add(btSoma);
        painelBotoes.add(btPot);
        //Terceira Linha
        painelBotoes.add(bt04);
        painelBotoes.add(bt05);
        painelBotoes.add(bt06);
        painelBotoes.add(btSubt);
        painelBotoes.add(btFat);
        //Quarta Linha
        painelBotoes.add(bt01);
        painelBotoes.add(bt02);
        painelBotoes.add(bt03);
        painelBotoes.add(btMult);
        painelBotoes.add(btPerc);
        //Quinta Linha
        painelBotoes.add(btMenor);
        painelBotoes.add(bt0);
        painelBotoes.add(btMaior);
        painelBotoes.add(btDiv);
        painelBotoes.add(btIgual);

//---------- Menu 
        //criando menu
        MenuBar bar = new MenuBar();
        //criando item Arquivo
        Menu calc = new Menu("Arquivo");
        //criando item Sair 
        MenuItem exit = new MenuItem("     Sair    ");
        //adicionando o comando exit(sair) no item arquivo
        calc.add(exit);
        //implementando o evento exit
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        //adicionado o item arquivo ao menu
        bar.add(calc);
        //criando item Sobre
        Menu about = new Menu("Sobre");
        //Adicionando item "Sobre" ao menu
        bar.add(about);
        //criando item Calculadora
        MenuItem about1 = new MenuItem(" Calculadora");
        //Adicionando item Calculadora ao item "Sobre"
        about.add(about1);
        //Implementando o evento Calculadora
        about1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //mostra uma menssagem ao clicar no item calculadora
                JOptionPane.showMessageDialog(null, "___Calculadora em Java___"
                        + "\n"
                        + "\n" + " Versão:         1.0 "
                        + "\n" + " Data:              Março/2013"
                        + "\n" + " Autores:        Mauricio Cardoso "
                        + "\n" + "                         & Andrey Filippy");

            }
        });
        //Adicionando item "Sobre" ao menu 
        bar.add(about);
        //setando o menu á janela
        setMenuBar(bar);

//---------- Atributos da Janela
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setSize(280, 240);


//---------- Eventos
        // Criação do objeto "ev" para se criar a classe interna "Eventos"
        Eventos ev = new Eventos();

        // Adição do ‘ActionListener’ aos botões(JButton)  
        bt0.addActionListener(ev);
        bt01.addActionListener(ev);
        bt02.addActionListener(ev);
        bt03.addActionListener(ev);
        bt04.addActionListener(ev);
        bt05.addActionListener(ev);
        bt06.addActionListener(ev);
        bt07.addActionListener(ev);
        bt08.addActionListener(ev);
        bt09.addActionListener(ev);
        btBackspace.addActionListener(ev);
        btSoma.addActionListener(ev);
        btSubt.addActionListener(ev);
        btMult.addActionListener(ev);
        btDiv.addActionListener(ev);
        btIgual.addActionListener(ev);

        btPot.addActionListener(ev);
        btAoQ.addActionListener(ev);
        btAoC.addActionListener(ev);
        btRaizQ.addActionListener(ev);
        btRaizC.addActionListener(ev);
        btFat.addActionListener(ev);
        btPerc.addActionListener(ev);
        btMenor.addActionListener(ev);
        btMaior.addActionListener(ev);

    }
    // Classe para tratamento de eventos

    private class Eventos implements ActionListener {

        double rs, numero1, numero2;
        // Operador para cada sinal
        char operador;
        // Método que detecta os eventos 

        public void actionPerformed(ActionEvent e) {

            // Condição das ações de clique nos botões(JButton)  
            //ação de clique no botao 0
           //se o botao 0 for clicado
            if (e.getSource() == bt0) {
                //caixe de texto vai receber caixa texto mais o botao 0
                btTxt.setText(btTxt.getText() + bt0.getText());
            }           
            if (e.getSource() == bt01) {
                btTxt.setText(btTxt.getText() + bt01.getText());
            }            
            if (e.getSource() == bt02) {
                btTxt.setText(btTxt.getText() + bt02.getText());
            }            
            if (e.getSource() == bt03) {
                btTxt.setText(btTxt.getText() + bt03.getText());
            }
            if (e.getSource() == bt04) {
                btTxt.setText(btTxt.getText() + bt04.getText());
            }
            if (e.getSource() == bt05) {
                btTxt.setText(btTxt.getText() + bt05.getText());
            }
            if (e.getSource() == bt06) {
                btTxt.setText(btTxt.getText() + bt06.getText());
            }
            if (e.getSource() == bt07) {
                btTxt.setText(btTxt.getText() + bt07.getText());
            }
            if (e.getSource() == bt08) {
                btTxt.setText(btTxt.getText() + bt08.getText());
            }
            if (e.getSource() == bt09) {
                btTxt.setText(btTxt.getText() + bt09.getText());                
            }
            //quando o botao Backspace(C) for clicado
            if (e.getSource() == btBackspace) {
                // Faz com que o JTextField fique vazio 
                btTxt.setText("");
            }
            //quando o botao Subt for clicado
            if (e.getSource() == btSubt) {
                //converte string em double
                numero1 = Double.parseDouble(btTxt.getText());
                btTxt.setText("");
                operador = '-';
            }
            if (e.getSource() == btMult) {
                numero1 = Double.parseDouble(btTxt.getText());
                btTxt.setText("");
                operador = '*';
            }
            if (e.getSource() == btDiv) {
                numero1 = Double.parseDouble(btTxt.getText());
                btTxt.setText("");
                operador = '/';
            }
            if (e.getSource() == btSoma) {
                numero1 = Double.parseDouble(btTxt.getText());
                btTxt.setText("");
                operador = '+';
            }
            if (e.getSource() == btMaior) {
                numero1 = Double.parseDouble(btTxt.getText());
                btTxt.setText("");
                operador = '>';
            }
            if (e.getSource() == btMenor) {
                numero1 = Double.parseDouble(btTxt.getText());
                btTxt.setText("");
                operador = '<';
            }
            if (e.getSource() == btPerc) {
                numero1 = Double.parseDouble(btTxt.getText());
                btTxt.setText("");
                operador = '%';
            }
            if (e.getSource() == btFat) {
                numero1 = Double.parseDouble(btTxt.getText());
                btTxt.setText("");
                operador = '!';
            }
           
            if (e.getSource() == btRaizQ) {
                String a = btTxt.getText();
                numero1 = Double.parseDouble(btTxt.getText());
                numero2 = Math.sqrt(numero1);
                String k = String.valueOf(numero2);
                btTxt.setText(k);
            }
            if (e.getSource() == btRaizC) {
                String a = btTxt.getText();
                numero1 = Double.parseDouble(btTxt.getText());
                numero2 = Math.cbrt(numero1);
                String k = String.valueOf(numero2);
                btTxt.setText(k);
            }
            if (e.getSource() == btAoQ) {
                String a = btTxt.getText();
                numero1 = Double.parseDouble(btTxt.getText());
                numero2 = Math.pow(numero1, 2);
                String k = String.valueOf(numero2);
                btTxt.setText(k);
            }
            if (e.getSource() == btAoC) {
                String a = btTxt.getText();
                numero1 = Double.parseDouble(btTxt.getText());
                numero2 = Math.pow(numero1, 3);
                String k = String.valueOf(numero2);
                btTxt.setText(k);
            }
            if (e.getSource() == btPot) {
                String a = btTxt.getText();
                numero1 = Double.parseDouble(btTxt.getText());
                numero2 = Math.exp(numero1);
                String k = String.valueOf(numero2);
                btTxt.setText(k);
            }
            
            if (e.getSource() == btIgual) {               

                // Condição para cada operador  
                switch (operador) {
                    case ('+'): {
                        numero2 = Double.parseDouble(btTxt.getText());
                        rs = (numero1 + numero2);
                    }
                    break;

                    case ('-'): {
                        numero2 = Double.parseDouble(btTxt.getText());
                        rs = (numero1 - numero2);
                    }
                    break;
                    case ('*'): {
                        numero2 = Double.parseDouble(btTxt.getText());
                        rs = (numero1 * numero2);
                    }
                    break;
                    case ('/'): {
                        numero2 = Double.parseDouble(btTxt.getText());
                        rs = (numero1 / numero2);
                    }
                    break;
                    case ('>'): {
                        numero2 = Double.parseDouble(btTxt.getText());
                        if(numero1 > numero2){
                            rs = numero1;
                        }else{
                            rs = numero2;
                        }
                        
                    }
                    break;
                    case ('<'): {
                        numero2 = Double.parseDouble(btTxt.getText());
                        if(numero1 < numero2){
                            rs = numero1;
                        }else{
                            rs = numero2;
                        }
                        
                    }
                    break;
                    case ('%'): {
                        numero2 = Double.parseDouble(btTxt.getText());
                        rs = numero1 * (numero2 / 100);
    
                    }
                    break;
                    case ('!'): {
                        double x = 1;
                       for(double i = numero1;i > 1;i--){
                           x = x * i;
                       }
                       rs = x;
                    }
                    break;
                        
                    

                }
                btTxt.setText("" + rs);
            }
        }
    }
}

