package ejercicio3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3 frame = new Ejercicio3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio3() {

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sistema Operativo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(45, 46, 162, 29);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Windows",true);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBounds(45, 81, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Linux",false);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_1.setBounds(45, 114, 103, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Mac",false);
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_2.setBounds(45, 146, 103, 21);
		contentPane.add(rdbtnNewRadioButton_2);
		
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(rdbtnNewRadioButton);
		bgroup.add(rdbtnNewRadioButton_1);
		bgroup.add(rdbtnNewRadioButton_2);
		
		JLabel lblEspecialidad = new JLabel("Especialidad");
		lblEspecialidad.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEspecialidad.setBounds(45, 200, 162, 29);
		contentPane.add(lblEspecialidad);
		
		JRadioButton rdbtnProgramacin = new JRadioButton("Programación",true);
		rdbtnProgramacin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnProgramacin.setBounds(45, 235, 117, 21);
		contentPane.add(rdbtnProgramacin);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Diseño Gráfico",false);
		rdbtnNewRadioButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_1_1.setBounds(45, 268, 117, 21);
		contentPane.add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton_2_1 = new JRadioButton("Administración",false);
		rdbtnNewRadioButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_2_1.setBounds(45, 302, 117, 21);
		contentPane.add(rdbtnNewRadioButton_2_1);
		
		ButtonGroup bgroup1 = new ButtonGroup();
		bgroup1.add(rdbtnProgramacin);
		bgroup1.add(rdbtnNewRadioButton_1_1);
		bgroup1.add(rdbtnNewRadioButton_2_1);
		
		JSlider slider = new JSlider();
		slider.setMaximum(10);
		slider.setValue(5);
		slider.setBounds(362, 113, 200, 22);
		contentPane.add(slider);
		
		JLabel lblHorasDedicadas = new JLabel("Horas Dedicadas");
		lblHorasDedicadas.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblHorasDedicadas.setBounds(390, 57, 162, 29);
		contentPane.add(lblHorasDedicadas);
		
		JLabel lblNewLabel_1 = new JLabel("0");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(336, 118, 16, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("10");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(578, 120, 16, 13);
		contentPane.add(lblNewLabel_1_1);
		
		
		///sacar los valores
		
		
		JButton btnNewButton = new JButton("Obtener Valores");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value_bgroup = "";
				String value_bgroup1 = "";
				
				if (rdbtnNewRadioButton.isSelected()) {
					value_bgroup = "Windows";
				}else if(rdbtnNewRadioButton_1.isSelected()) {
					value_bgroup = "Linux";
				}else {
					value_bgroup = "Mac";
				}
				
				if (rdbtnProgramacin.isSelected()) {
					value_bgroup1 = "Programación";
				}else if(rdbtnNewRadioButton_1_1.isSelected()) {
					value_bgroup1 = "Diseño Gráfico";
				}else {
					value_bgroup1 = "Administración";
				}
				JOptionPane.showMessageDialog(null, "Su información:\nSistema Operativo: "+value_bgroup+"\nEspecialidad: "+value_bgroup1+"\nHoras: "+slider.getValue());
			}
		});
		
		btnNewButton.setBounds(395, 207, 157, 21);
		contentPane.add(btnNewButton);
	}
}
