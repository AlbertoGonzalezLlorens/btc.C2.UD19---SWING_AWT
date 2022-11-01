package ejercicio4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio4 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Ejercicio4() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 883, 617);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(183, 90, 151, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setBounds(536, 90, 151, 38);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(382, 437, 200, 38);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel = new JLabel("Valor a");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(108, 95, 65, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblValorB = new JLabel("Valor b");
		lblValorB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblValorB.setBounds(468, 90, 65, 22);
		contentPane.add(lblValorB);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblResultado.setBounds(282, 437, 90, 22);
		contentPane.add(lblResultado);
		
		JLabel lblOperaciones = new JLabel("Operaciones");
		lblOperaciones.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblOperaciones.setBounds(372, 207, 90, 22);
		contentPane.add(lblOperaciones);
		
		JButton btnNewButton = new JButton("a+b");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textField_2.setText(String.valueOf(Double.parseDouble(textField.getText())+Double.parseDouble(textField_1.getText())));
				}catch(Exception ex) {
					System.out.println("No ha introducido valores correctos");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(144, 281, 123, 38);
		contentPane.add(btnNewButton);
		
		JButton btnResta = new JButton("a-b");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textField_2.setText(String.valueOf(Double.parseDouble(textField.getText())-Double.parseDouble(textField_1.getText())));
				}catch(Exception ex) {
					System.out.println("No ha introducido valores correctos");
				}
			}
		});
		btnResta.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnResta.setBounds(316, 281, 123, 38);
		contentPane.add(btnResta);
		
		JButton btnMultiplicacion = new JButton("a*b");
		btnMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textField_2.setText(String.valueOf(Double.parseDouble(textField.getText())*Double.parseDouble(textField_1.getText())));
				}catch(Exception ex) {
					System.out.println("No ha introducido valores correctos");
				}
			}
		});
		btnMultiplicacion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnMultiplicacion.setBounds(483, 281, 123, 38);
		contentPane.add(btnMultiplicacion);
		
		JButton btnAb = new JButton("a/b");
		btnAb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textField_2.setText(String.valueOf(Double.parseDouble(textField.getText())/Double.parseDouble(textField_1.getText())));
				}catch(Exception ex) {
					System.out.println("No ha introducido valores correctos");
				}
			}
		});
		btnAb.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAb.setBounds(648, 281, 123, 38);
		contentPane.add(btnAb);
		
		JButton btnAbout = new JButton("About");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Realiza operaciones basicas: \nSuma\nResta\nMultiplicación\nDivisión");
			}
		});
		btnAbout.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAbout.setBounds(702, 437, 123, 38);
		contentPane.add(btnAbout);
	}
}
