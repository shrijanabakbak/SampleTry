package Swing;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.table.*;
import java.awt.*;
import javax.swing.JOptionPane;

public class ViewEmp {
	public static void main(String[] args) {
		ViewEmp vm = new ViewEmp();
	}
	ViewEmp(){
		JFrame f= new JFrame("View Employee");
		
		
		String column[]= {"Name","Code","Position","Salary"};
//		String data [][]= {
//				{"Spiderman","sp0012","Avenger","123456"},
//				{"Superman","sm0012","Hero","1234"}
//		
//		};
		
		DbConnect db= new DbConnect();
		String query="Select * from employee";
		
		ArrayList<Staff> emp= new ArrayList<Staff>();
			try {
				ResultSet result= db.connection().executeQuery(query);
				
				while(result.next()) {
					String name= result.getString("name");
					String code= result.getString("code");
					String position= result.getString("position");
					int salary= result.getInt("salary");
//					int salary= Integer.parseInt( result.getString("salary"));
					
					Staff em= new Staff(name, code, position, salary);
					emp.add(em);
					
//					System.out.println(name+code+position+salary);
//					System.out.println("-----------------");
//					
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		Object data[][]= new Object[emp.size()][column.length];
		for(int i=0; i<emp.size(); i++) {
			data[i][0]=emp.get(i).name;
			data[i][1]=emp.get(i).code;
			data[i][2]=emp.get(i).position;
			data[i][3]=emp.get(i).salary;
			
		}
		
		JTable jtEmp= new JTable(data, column);
		JScrollPane sp= new JScrollPane(jtEmp);
		f.add(sp);
		sp.setBounds(40, 40, 800, 400);
		
		JButton btnBack= new JButton("Back");
		f.add(btnBack);
		btnBack.setBounds(5,5, 100,30);
		
		JButton btnUpdate= new JButton("Update");
		f.add(btnUpdate);
		btnUpdate.setBounds(40, 460, 100, 30);
		
		JButton btnDelete= new JButton("Delete");
		f.add(btnDelete);
		btnDelete.setBounds(740, 460, 100, 30);
	        
	        
	    btnBack.addActionListener(e->{
	    	new Employee();
	    	f.dispose();
	    });
	    
	    btnDelete.addActionListener(e->{
	    	int row = jtEmp.getSelectedRow();
	    	if(row>=0) {
	    	TableModel model= jtEmp.getModel();	    	
	    	String code =  (String) model.getValueAt(row, 1 );
	    	String dquery = "Delete from employee where code ='"+code+"'";
	    	
	    	try {
	    		 int dresult = db.connection().executeUpdate(dquery);
	    		 if(dresult>=1) {
	    			 JOptionPane.showMessageDialog(sp, "Employee Deleted");
	    			 new ViewEmp();
	    			 f.dispose();
	    		}
	    	}catch (SQLException e1) {
	    		e1.printStackTrace();
	    		}
	    		}else {

	    	JOptionPane.showMessageDialog(sp, "please select Row");

            }
	    });
	    
	    

        btnUpdate.addActionListener(e->{
        	int row = jtEmp.getSelectedRow();
        	if(row>=0) {
        		
            JLabel lname = new JLabel("Name");
            f.add(lname);
            lname.setBounds(50, 500, 300, 50);

            JTextField tfname = new JTextField();
            f.add(tfname);
            tfname.setBounds(90, 510, 150, 30);

            JLabel lcode = new JLabel("Code");
            f.add(lcode);
            lcode.setBounds(240, 500, 300, 50);

            JTextField tfcode = new JTextField();
            f.add(tfcode);
            tfcode.setBounds(280, 510, 150, 30);
           
            JLabel lpos = new JLabel("Desigination");
            f.add(lpos);
            lpos.setBounds(440, 500, 300, 50);
            
            JTextField tfpos = new JTextField();
            f.add(tfpos);
            tfpos.setBounds(520, 510, 150, 30);
            
            JLabel lsalary = new JLabel("Salary");
            f.add(lsalary);
            lsalary.setBounds(680, 500, 300, 50);
            
            JTextField tfsalary = new JTextField();
            f.add(tfsalary);
            tfsalary.setBounds(730, 510, 150, 30);
            
            JButton btnChange = new JButton("Make Change");
            f.add(btnChange);
            btnChange.setBounds(400, 550, 150, 50);
            
            
            
            
            JButton btnCancle = new JButton("Cancel");
            f.add(btnCancle);
            btnCancle.setBounds(400, 600, 150, 50);

                        
            TableModel model = jtEmp.getModel();
                   
                tfname.setText((String) model.getValueAt(row, 0));
                tfcode.setText((String) model.getValueAt(row, 1));
                tfpos.setText((String) model.getValueAt(row, 2));

                int salary = (int) model.getValueAt(row, 3);
                tfsalary.setText(salary+"");

                // update action
 
                    btnChange.addActionListener(e3->{

                    String name = tfname.getText();

                    String code = tfcode.getText();

                    String pos = tfpos.getText();

                    int Salary = Integer.parseInt(tfsalary.getText()); 
                    String code1= (String) model.getValueAt(row, 1);
                    String query1="Update employee set name='"+name+"',position='"+pos+"',salary='"+salary+"' where code='"+code+"'";
                    
                    System.out.println(query1);

                    System.out.println(name + code + pos + salary);
                    
                    try {
                        int upresult = db.connection().executeUpdate(query1);
                        //int inresulet=db.connection().executeUpdate(query2);
                        if (upresult>0) {
                            
                            JOptionPane.showMessageDialog(sp, "Employee updated");
                            new ViewEmp();
                            f.dispose();
                        }
                                                       
                    }catch (SQLException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                });

                
                
                //cancle action
                btnCancle.addActionListener(e2->{
                	new ViewEmp();
                	f.dispose();
                });

           }else {

                JOptionPane.showMessageDialog(sp, "Select Row for Update");
           }
        });
		
		
		f.setSize(900,600);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
	
		
	}
}
