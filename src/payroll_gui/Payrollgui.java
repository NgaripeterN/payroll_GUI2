package payroll_gui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.border.TitledBorder;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;

public class Payrollgui extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldEmployeeName;
	private JTextField textFieldHourlySalary;
	private JTextField textFieldMonday1;
	private JTextField textFieldMonday2;
	private JTextField textFieldTuesday2;
	private JTextField textFieldTuesday1;
	private JTextField textFieldWednesday1;
	private JTextField textFieldWednesday2;
	private JTextField textFieldThursday1;
	private JTextField textFieldThursday2;
	private JTextField textFieldFriday2;
	private JTextField textFieldFriday1;
	private JTextField textFieldSaturday1;
	private JTextField textFieldSaturday2;
	private JTextField textFieldSunday1;
	private JTextField textFieldSunday2;
	private JTextField textFieldRegularHours;
	private JTextField textFieldOvertimeHours;
	private JTextField textFieldRegularAmount;
	private JTextField textFieldOvertimeAmount;
	private JTextField textFieldNetPay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payrollgui frame = new Payrollgui();
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
	public Payrollgui() {
		setBackground(new Color(255, 255, 255));
		setTitle("Georgetown Cleaning Services - Employee Payroll");
		
		setForeground(new Color(45, 45, 255));
		setFont(new Font("Bahnschrift", Font.BOLD, 20));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 913, 658);
		contentPane = new JPanel();
		contentPane.setSize(new Dimension(4, 4));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 899, 35);
		panel.setBackground(SystemColor.textHighlight);
		
		JLabel lblNewLabel = new JLabel("Georgetown Cleaning Services - Employee Payroll");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel);
		contentPane.setLayout(null);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Employee Identification", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(35, 35, 35)));
		panel_1.setBounds(5, 67, 884, 103);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 36, 125, 31);
		panel_1.add(lblNewLabel_1);
		
		textFieldEmployeeName = new JTextField();
		textFieldEmployeeName.setBounds(125, 40, 250, 27);
		panel_1.add(textFieldEmployeeName);
		textFieldEmployeeName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Hourly Salary:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(481, 41, 88, 24);
		panel_1.add(lblNewLabel_2);
		
		textFieldHourlySalary = new JTextField();
		textFieldHourlySalary.setBounds(580, 40, 198, 27);
		panel_1.add(textFieldHourlySalary);
		textFieldHourlySalary.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Time Sheet", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(27, 27, 27)));
		panel_2.setBounds(5, 201, 884, 216);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Monday");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(142, 25, 62, 27);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tuesday");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(235, 25, 72, 27);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Wednesday");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(342, 25, 78, 27);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Thursday");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(477, 27, 62, 23);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Friday");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(595, 29, 45, 18);
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Saturday");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(700, 29, 62, 18);
		panel_2.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Sunday");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(806, 29, 72, 18);
		panel_2.add(lblNewLabel_9);
		
		textFieldMonday1 = new JTextField();
		textFieldMonday1.setBounds(126, 62, 85, 22);
		panel_2.add(textFieldMonday1);
		textFieldMonday1.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("First week:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_10.setBounds(10, 64, 85, 20);
		panel_2.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Second Week:");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_11.setBounds(10, 122, 97, 23);
		panel_2.add(lblNewLabel_11);
		
		textFieldMonday2 = new JTextField();
		textFieldMonday2.setColumns(10);
		textFieldMonday2.setBounds(126, 125, 85, 22);
		panel_2.add(textFieldMonday2);
		
		textFieldTuesday2 = new JTextField();
		textFieldTuesday2.setColumns(10);
		textFieldTuesday2.setBounds(235, 125, 72, 22);
		panel_2.add(textFieldTuesday2);
		
		textFieldTuesday1 = new JTextField();
		textFieldTuesday1.setColumns(10);
		textFieldTuesday1.setBounds(235, 62, 72, 22);
		panel_2.add(textFieldTuesday1);
		
		textFieldWednesday1 = new JTextField();
		textFieldWednesday1.setColumns(10);
		textFieldWednesday1.setBounds(342, 62, 85, 22);
		panel_2.add(textFieldWednesday1);
		
		textFieldWednesday2 = new JTextField();
		textFieldWednesday2.setColumns(10);
		textFieldWednesday2.setBounds(342, 125, 85, 22);
		panel_2.add(textFieldWednesday2);
		
		textFieldThursday1 = new JTextField();
		textFieldThursday1.setColumns(10);
		textFieldThursday1.setBounds(466, 62, 85, 22);
		panel_2.add(textFieldThursday1);
		
		textFieldThursday2 = new JTextField();
		textFieldThursday2.setColumns(10);
		textFieldThursday2.setBounds(466, 125, 85, 22);
		panel_2.add(textFieldThursday2);
		
		textFieldFriday2 = new JTextField();
		textFieldFriday2.setColumns(10);
		textFieldFriday2.setBounds(583, 125, 72, 22);
		panel_2.add(textFieldFriday2);
		
		textFieldFriday1 = new JTextField();
		textFieldFriday1.setColumns(10);
		textFieldFriday1.setBounds(583, 62, 72, 22);
		panel_2.add(textFieldFriday1);
		
		textFieldSaturday1 = new JTextField();
		textFieldSaturday1.setColumns(10);
		textFieldSaturday1.setBounds(689, 62, 85, 22);
		panel_2.add(textFieldSaturday1);
		
		textFieldSaturday2 = new JTextField();
		textFieldSaturday2.setColumns(10);
		textFieldSaturday2.setBounds(689, 125, 85, 22);
		panel_2.add(textFieldSaturday2);
		
		textFieldSunday1 = new JTextField();
		textFieldSunday1.setColumns(10);
		textFieldSunday1.setBounds(800, 62, 78, 22);
		panel_2.add(textFieldSunday1);
		
		textFieldSunday2 = new JTextField();
		textFieldSunday2.setColumns(10);
		textFieldSunday2.setBounds(800, 125, 78, 22);
		panel_2.add(textFieldSunday2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Payroll Processing", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(22, 22, 22)));
		panel_3.setBounds(5, 445, 884, 166);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnProcessIt = new JButton("Process it");
		btnProcessIt.setFont(new Font("Dialog", Font.PLAIN, 17));
		btnProcessIt.setBounds(10, 32, 120, 111);
		panel_3.add(btnProcessIt);
		btnProcessIt.addActionListener((ActionListener) new ActionListener() {
	        public void actionPerformed(ActionEvent arg0) {
	        	String EmployeeName = textFieldEmployeeName.getText();
	        	double HourlySalary, Monday1, Tuesday1, Wednesday1, Thursday1, Friday1, Saturday1, Sunday1,
	        			TotalHours1,RegularHours1,RegularAmount1 ,OvertimeHours1,OvertimeAmount1=0,
	        	           Monday2, Tuesday2, Wednesday2, Thursday2, Friday2, Saturday2, Sunday2,
	        	              TotalHours2, RegularHours2,RegularAmount2,OvertimeHours2,OvertimeAmount2=0,
	        	              TotalRegularHours,TotalRegularAmount,TotalOvertimeHours,TotalOvertimeAmount,OvertimeRate,NetPay;
	        	 // Get the number of hours worked each day
	        	HourlySalary = Double.valueOf(textFieldHourlySalary.getText());
	            Monday1 = Double.valueOf(textFieldMonday1.getText());
	            Tuesday1 = Double.valueOf(textFieldTuesday1.getText());
	            Wednesday1 = Double.valueOf(textFieldWednesday1.getText());
	            Thursday1 = Double.valueOf(textFieldThursday1.getText());
	            Friday1 = Double.valueOf(textFieldFriday1.getText());
	            Saturday1 = Double.valueOf(textFieldSaturday1.getText());
	            Sunday1 = Double.valueOf(textFieldSunday1.getText());
	            Monday2 = Double.valueOf(textFieldMonday2.getText());
	            Tuesday2 = Double.valueOf(textFieldTuesday2.getText());
	            Wednesday2 = Double.valueOf(textFieldWednesday2.getText());
	            Thursday2 = Double.valueOf(textFieldThursday2.getText());
	            Friday2 = Double.valueOf(textFieldFriday2.getText());
	            Saturday2 = Double.valueOf(textFieldSaturday2.getText());
	            Sunday2 = Double.valueOf(textFieldSunday2.getText());
	            TotalHours1 = Monday1+Tuesday1+Wednesday1+Thursday1+Friday1+Saturday1+Sunday1;
	            TotalHours2 = Monday2+Tuesday2+Wednesday2+Thursday2+Friday2+Saturday2+Sunday2;
	            OvertimeRate = HourlySalary * 1.5;
	            if (TotalHours1 < 40) {
	                RegularHours1 = TotalHours1;
	                RegularAmount1 = HourlySalary * RegularHours1 ;
	                OvertimeHours1 = 0;
	                OvertimeAmount1=0;
	            } else {
	                RegularHours1 = 40;
	                RegularAmount1 = HourlySalary * 40;
	                OvertimeHours1  = TotalHours1 - 40;
	                OvertimeAmount1 = OvertimeHours1 *  OvertimeRate;
	            }

	            if (TotalHours2 < 40) {
	                RegularHours2 = TotalHours2;
	                RegularAmount2 = HourlySalary * RegularHours2 ;
	                OvertimeHours2 = 0;
	                OvertimeAmount1=0;
	            } else {
	                RegularHours2 = 40;
	                RegularAmount2 = HourlySalary * 40;
	                OvertimeHours2 = TotalHours2 - 40;
	                OvertimeAmount2 = OvertimeHours2 *  OvertimeRate;
	            }
	            
	                TotalRegularHours = RegularHours1 + RegularHours2;
	        	    TotalOvertimeHours = OvertimeHours1 + OvertimeHours2;
	        	    TotalRegularAmount = RegularAmount1 + RegularAmount2;
	        	    TotalOvertimeAmount = OvertimeAmount1 +  OvertimeAmount2;
	        	    NetPay = TotalRegularAmount + TotalOvertimeAmount;
	        	    textFieldRegularHours.setText(String.format("%.2f", TotalRegularHours));
	        	    textFieldOvertimeHours.setText(String.format("%.2f", TotalOvertimeHours));
	        	    textFieldRegularAmount.setText(String.format("%.2f", TotalRegularAmount));
	        	    textFieldOvertimeAmount.setText(String.format("%.2f", TotalOvertimeAmount));
	        	    textFieldNetPay.setText(String.format("%.2f", NetPay));
	        	} 
        });
   	
		     
		JButton btnclose = new JButton("Close");
		btnclose.setFont(new Font("Dialog", Font.PLAIN, 16));
		btnclose.setBounds(747, 56, 85, 58);
		panel_3.add(btnclose);
		btnclose.addActionListener(new ActionListener() {
		   
		    public void actionPerformed(ActionEvent e) {
		        // Close the window
		        dispose();
		    }
		});
		JLabel lblNewLabel_12 = new JLabel("Regular:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_12.setBounds(140, 53, 54, 25);
		panel_3.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Overtime:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_13.setBounds(140, 102, 63, 25);
		panel_3.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Hours");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_14.setBounds(259, 32, 54, 13);
		panel_3.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Amount");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_15.setBounds(389, 32, 76, 15);
		panel_3.add(lblNewLabel_15);
		
		textFieldRegularHours = new JTextField();
		textFieldRegularHours.setEditable(false);
		textFieldRegularHours.setBounds(217, 56, 96, 25);
		panel_3.add(textFieldRegularHours);
		textFieldRegularHours.setColumns(10);
		
		textFieldOvertimeHours = new JTextField();
		textFieldOvertimeHours.setEditable(false);
		textFieldOvertimeHours.setBounds(217, 104, 96, 25);
		panel_3.add(textFieldOvertimeHours);
		textFieldOvertimeHours.setColumns(10);
		
		textFieldRegularAmount = new JTextField();
		textFieldRegularAmount.setEditable(false);
		textFieldRegularAmount.setColumns(10);
		textFieldRegularAmount.setBounds(369, 56, 96, 25);
		panel_3.add(textFieldRegularAmount);
		
		textFieldOvertimeAmount = new JTextField();
		textFieldOvertimeAmount.setEditable(false);
		textFieldOvertimeAmount.setColumns(10);
		textFieldOvertimeAmount.setBounds(369, 104, 96, 25);
		panel_3.add(textFieldOvertimeAmount);
		
		JLabel lblNewLabel_16 = new JLabel("Net Pay:");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_16.setBounds(513, 72, 63, 25);
		panel_3.add(lblNewLabel_16);
		
		textFieldNetPay = new JTextField();
		textFieldNetPay.setEditable(false);
		textFieldNetPay.setColumns(10);
		textFieldNetPay.setBounds(575, 78, 96, 25);
		panel_3.add(textFieldNetPay);
	}
	}

