package br.com.calculadora.app;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

	public class NewCalculadoraBrunex {

		private JFrame frmCalculadoraBrunosilva;
		private JTextField display;

		double valor1;
		double valor2;
		double resultado;
		String operacao;
		String resposta;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						NewCalculadoraBrunex window = new NewCalculadoraBrunex();
						window.frmCalculadoraBrunosilva.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the application.
		 */
		public NewCalculadoraBrunex() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frmCalculadoraBrunosilva = new JFrame();
			frmCalculadoraBrunosilva.setTitle("Calculadora BrunoSilva");
			frmCalculadoraBrunosilva.setResizable(false);
			frmCalculadoraBrunosilva.setBounds(100, 100, 400, 600);
			frmCalculadoraBrunosilva.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frmCalculadoraBrunosilva.getContentPane().setLayout(null);

			display = new JTextField();
			display.setHorizontalAlignment(SwingConstants.RIGHT);
			display.setFont(new Font("Fira Code SemiBold", Font.PLAIN, 50));
			display.setText("0");
			display.setBounds(28, 31, 314, 83);
			frmCalculadoraBrunosilva.getContentPane().add(display);
			display.setColumns(10);

			JButton btn0 = new JButton("0");
			btn0.setFont(new Font("Fira Code SemiBold", Font.BOLD, 24));
			btn0.setBounds(28, 457, 152, 72);
			frmCalculadoraBrunosilva.getContentPane().add(btn0);

			btn0.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String num = display.getText() + btn0.getText();
					display.setText(num);
				}
			});

			JButton btn1 = new JButton("1");
			btn1.setFont(new Font("Fira Code SemiBold", Font.BOLD, 24));
			btn1.setBounds(28, 374, 71, 72);
			frmCalculadoraBrunosilva.getContentPane().add(btn1);

			btn1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String num = display.getText() + btn1.getText();
					display.setText(num);
				}
			});

			JButton btn2 = new JButton("2");
			btn2.setFont(new Font("Fira Code SemiBold", Font.BOLD, 24));
			btn2.setBounds(109, 374, 71, 72);
			frmCalculadoraBrunosilva.getContentPane().add(btn2);

			btn2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String num = display.getText() + btn2.getText();
					display.setText(num);
				}
			});

			JButton btn3 = new JButton("3");
			btn3.setFont(new Font("Fira Code SemiBold", Font.BOLD, 24));
			btn3.setBounds(190, 374, 71, 72);
			frmCalculadoraBrunosilva.getContentPane().add(btn3);

			btn3.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String num = display.getText() + btn3.getText();
					display.setText(num);
				}
			});

			JButton btn4 = new JButton("4");
			btn4.setFont(new Font("Fira Code SemiBold", Font.BOLD, 24));
			btn4.setBounds(28, 291, 71, 72);
			frmCalculadoraBrunosilva.getContentPane().add(btn4);

			btn4.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String num = display.getText() + btn4.getText();
					display.setText(num);
				}
			});

			JButton btn5 = new JButton("5");
			btn5.setFont(new Font("Fira Code SemiBold", Font.BOLD, 24));
			btn5.setBounds(109, 291, 71, 72);
			frmCalculadoraBrunosilva.getContentPane().add(btn5);

			btn5.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String num = display.getText() + btn5.getText();
					display.setText(num);
				}
			});

			JButton btn6 = new JButton("6");
			btn6.setFont(new Font("Fira Code SemiBold", Font.BOLD, 24));
			btn6.setBounds(190, 291, 71, 72);
			frmCalculadoraBrunosilva.getContentPane().add(btn6);

			btn6.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String num = display.getText() + btn6.getText();
					display.setText(num);
				}
			});

			JButton btn7 = new JButton("7");
			btn7.setFont(new Font("Fira Code SemiBold", Font.BOLD, 24));
			btn7.setBounds(28, 208, 71, 72);
			frmCalculadoraBrunosilva.getContentPane().add(btn7);
			btn7.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String num = display.getText() + btn7.getText();
					display.setText(num);
				}
			});

			JButton btn8 = new JButton("8");
			btn8.setFont(new Font("Fira Code SemiBold", Font.BOLD, 24));
			btn8.setBounds(109, 208, 71, 72);
			frmCalculadoraBrunosilva.getContentPane().add(btn8);
			btn8.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String num = display.getText() + btn8.getText();
					display.setText(num);
				}
			});

			JButton btn9 = new JButton("9");
			btn9.setFont(new Font("Fira Code SemiBold", Font.BOLD, 24));
			btn9.setBounds(190, 208, 71, 72);
			frmCalculadoraBrunosilva.getContentPane().add(btn9);

			btn9.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String num = display.getText() + btn9.getText();
					display.setText(num);
				}
			});

			JButton btnPonto = new JButton(".");
			btnPonto.setFont(new Font("Fira Code SemiBold", Font.BOLD, 24));
			btnPonto.setBounds(190, 457, 71, 72);
			frmCalculadoraBrunosilva.getContentPane().add(btnPonto);

			btnPonto.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String num = display.getText() + btnPonto.getText();
					display.setText(num);
				}
			});

			JButton btnAC = new JButton("AC");
			btnAC.setFont(new Font("Fira Code SemiBold", Font.BOLD, 24));
			btnAC.setBounds(28, 125, 71, 72);
			frmCalculadoraBrunosilva.getContentPane().add(btnAC);

			btnAC.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String apague = null;

					if (display.getText().length() > 0) {
						StringBuilder str = new StringBuilder(display.getText());
						str.deleteCharAt(display.getText().length() - 1);
						apague = str.toString();
						display.setText(apague);
					}

				}
			});

			JButton btnResultado = new JButton("=");
			btnResultado.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String resposta;
					valor2 = Double.parseDouble(display.getText());
					
					if (operacao == "") {
						display.setText("0");
					}else
					
					if (operacao == "+") {
						resultado = valor1 + valor2;
						resposta = String.format("%.2f", resultado);
						display.setText(resposta);

					} else if (operacao == "-") {
						resultado = valor1 - valor2;
						resposta = String.format("%.2f", resultado);
						display.setText(resposta);

					} else if (operacao == "x") {
						resultado = valor1 * valor2;
						resposta = String.format("%.2f", resultado);
						display.setText(resposta);

					} else if (operacao == "/") {
						resultado = valor1 / valor2;
						resposta = String.format("%.2f", resultado);
						display.setText(resposta);

					} else if (operacao == "%") {
						resultado = valor1 % valor2;
						resposta = String.format("%.2f", resultado);
						display.setText(resposta);

					}
				}
			});

			btnResultado.setFont(new Font("Fira Code SemiBold", Font.BOLD, 24));
			btnResultado.setBounds(271, 374, 71, 153);
			frmCalculadoraBrunosilva.getContentPane().add(btnResultado);

			JButton btnPorcentagem = new JButton("%");
			btnPorcentagem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					valor1 = Double.parseDouble(display.getText());
					display.setText("");
					operacao = "%";
				}
			});

			btnPorcentagem.setFont(new Font("Fira Code SemiBold", Font.BOLD, 24));
			btnPorcentagem.setBounds(109, 125, 71, 72);
			frmCalculadoraBrunosilva.getContentPane().add(btnPorcentagem);

			JButton btnDivisao = new JButton("/");
			btnDivisao.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					valor1 = Double.parseDouble(display.getText());
					display.setText("");
					operacao = "/";
				}
			});

			btnDivisao.setFont(new Font("Fira Code SemiBold", Font.BOLD, 24));
			btnDivisao.setBounds(190, 125, 71, 72);
			frmCalculadoraBrunosilva.getContentPane().add(btnDivisao);

			JButton btnMultiplica = new JButton("x");
			btnMultiplica.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					valor1 = Double.parseDouble(display.getText());
					display.setText("");
					operacao = "*";
				}
			});

			btnMultiplica.setFont(new Font("Fira Code SemiBold", Font.BOLD, 24));
			btnMultiplica.setBounds(271, 125, 71, 72);
			frmCalculadoraBrunosilva.getContentPane().add(btnMultiplica);

			JButton btnSubtrai = new JButton("-");
			btnSubtrai.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					valor1 = Double.parseDouble(display.getText());
					display.setText("");
					operacao = "-";
				}
			});

			btnSubtrai.setFont(new Font("Fira Code SemiBold", Font.BOLD, 24));
			btnSubtrai.setBounds(271, 208, 71, 72);
			frmCalculadoraBrunosilva.getContentPane().add(btnSubtrai);

			JButton btnSoma = new JButton("+");
			btnSoma.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					valor1 = Double.parseDouble(display.getText());
					display.setText("");
					operacao = "+";
				}
			});

			btnSoma.setFont(new Font("Fira Code SemiBold", Font.BOLD, 24));
			btnSoma.setBounds(271, 291, 71, 72);
			frmCalculadoraBrunosilva.getContentPane().add(btnSoma);

		}
	}
