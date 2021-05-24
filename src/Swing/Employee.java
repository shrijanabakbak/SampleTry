package Swing;


import java.awt.event.ActionEvent;

import java.sql.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Employee {
	public static void main(String[] args) {
		Employee emp= new Employee ();
		
	}

	Employee(){
		
		JFrame f= new JFrame("Employee Table");
		
		JLabel lName,lCode, lDesignation, lSalary, setLogo;
		JTextField tfName;
		JTextField tfCode;
		JTextField tfDesignation;
		JTextField tfSalary;
		
		JButton btnSave, btnExit;
		
		setLogo= new JLabel(new ImageIcon("D:\\images\\employee.jpg"));
		f.add(setLogo);
		setLogo.setBounds(195,20,300, 120);
		
		
		lName= new JLabel("Name");
		f.add(lName);
		lName.setBounds(100, 150, 300, 30);
	
		lCode= new JLabel("Code");
		f.add(lCode);
		lCode.setBounds(100, 190, 300, 30);
		
		lDesignation= new JLabel("Designation");
		f.add(lDesignation);
		lDesignation.setBounds(100, 230, 300, 30);
		
		lSalary= new JLabel("Salary");
		f.add(lSalary);
		lSalary.setBounds(100, 270, 300, 30);
		
		tfName= new JTextField(50);
		f.add(tfName);
		tfName.setBounds(180, 150, 330, 30);
		
		tfCode= new JTextField(30);
		f.add(tfCode);
		tfCode.setBounds(180, 190, 330, 30);
		
		tfDesignation= new JTextField(30);
		f.add(tfDesignation);
		tfDesignation.setBounds(180, 230, 330, 30);
		
		tfSalary= new JTextField(30);
		f.add(tfSalary);
		tfSalary.setBounds(180, 270, 330, 30);
		
		btnSave = new JButton("Save");
		f.add(btnSave);
		btnSave.setBounds(180, 330, 140, 40);
		
		btnExit = new JButton("Exit");
		f.add(btnExit);
		btnExit.setBounds(360, 330, 140, 40);
		
		 
//		btnExit.addActionListener(new ActionListener() { 
//			public void actionPerformed(ActionEvent e) {  //this line is a method 
////				new Login()
////				f.dispose();
//				int select= JOptionPane.showConfirmDialog(btnExit, "Are you sure?");
//				if(select==0) {
//					new Login();
//					f.dispose();
//				}
//			}
//		});
		
		btnExit.addActionListener(e->{
			int select= JOptionPane.showConfirmDialog(btnExit,"Are you sure?");
			if (select==0) {
				new Login();
				f.dispose();
			}
			
		});
		
		btnSave.addActionListener(e->{;
		String name= tfName.getText();
		String code= tfCode.getText();
		String position= tfDesignation.getText();
		int salary= Integer.parseInt(tfSalary.getText());
		
//		System.out.println(name + code + position + salary);
		
		try {
			DbConnect db= new DbConnect();
			
			String query="Insert into employee values ('"+name+"','"+code+"','"+position+"',"+salary+")";
			System.out.println(query);
			
			int result= db.connection().executeUpdate(query); //  select-->executeQuery , insert --> executeUpdate
			
			if (result>0) {
				JOptionPane.showMessageDialog(btnSave, "Employee Added");
			}
			
			
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}


		
		});
		
		JButton btnView= new JButton("View Employee");
		f.add(btnView);
		btnView.setBounds(270,400, 140,40);
		
		btnView.addActionListener(e->{ 
			new ViewEmp();
			f.dispose();
			
		});
			
		f.setLayout(null);
		f.setSize(600,600);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	
}

		
		 
			
	

