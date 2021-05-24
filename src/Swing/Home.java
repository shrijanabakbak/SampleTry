package Swing;
import java.awt.event.ActionEvent;


import java.awt.event.ActionListener;
import javax.swing.*;


public class Home {
	
	public static void main(String[] args) {
		Login log= new  Login();
	}

}

class Login{ 
	
	
	
	Login(){
		
		JFrame f= new JFrame("LOGIN");
		
		    
		
		JLabel lUsername,lPsw, setLogo;   //reference objects
		JTextField tfUsername;
		JPasswordField pfPsw;
		
		JButton btnLogin,btnSignup;
		
		setLogo= new JLabel(new ImageIcon("D:\\images\\java.jpg"));
		f.add(setLogo);
		setLogo.setBounds(10, 20,160, 90);
		
		
		lUsername= new JLabel("Username");
		f.add(lUsername);
		lUsername.setBounds(100, 170, 300, 30);
		
		lPsw= new JLabel("Password");
		f.add(lPsw);
		lPsw.setBounds(100, 220, 300, 30);
		
		tfUsername= new JTextField(30);
		f.add(tfUsername);
		tfUsername.setBounds(180, 170, 330, 30);
		
		
		pfPsw= new JPasswordField(30);
		f.add(pfPsw);
		pfPsw.setBounds(180, 220, 330, 30);
		
		btnLogin = new JButton("Login");
		f.add(btnLogin);
		btnLogin.setBounds(230, 280, 140, 40);
		
		btnSignup= new JButton("Signup");
		f.add(btnSignup);
		btnSignup.setBounds(230, 330, 140, 40);
		
		
//		action listener , login action
		 btnLogin.addActionListener(new ActionListener() {   //new ActionListener is a constructor 
			public void actionPerformed(ActionEvent e) {
				
				String user= tfUsername.getText();
				String Psw= pfPsw.getText();
				
				boolean res= userLogin(user, Psw);
				
				if(res) {
					new Employee();
					f.dispose();
					
				}else {
					JOptionPane.showMessageDialog(f,"Username or Password Invalid");
				}
				
				if(user.equals("Admin") && Psw.equals("Admin")) {
					new Employee();
					f.dispose();
				}else {
					JOptionPane.showMessageDialog(f, "Username/Password Invalid");
				}
				
				
			}
			 
		 });
		
		
		
		
		
		f.setLayout(null);
		f.setSize(600,600);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	
		
	}// end of constructor
	
	public boolean userLogin(String user, String psw) {
		if(user.equals("Admin") && psw.equals("Admin")) {
			return true;
		}else {		
			return false;
		
	}
}
}
