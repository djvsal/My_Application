/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nepal;

import javax.swing.*;

/**
 *
 * @author chandra
 */
public class LOGIN_FORM extends JFrame{
    public LOGIN_FORM(){
    
        JPanel jp=new JPanel();
        JLabel jl=new JLabel("Username");
        JLabel jl2=new JLabel("Password");
        JTextField un=new JTextField(20);
        JPasswordField psw=new JPasswordField(20);
        JButton log=new JButton("Login");
        JButton can=new JButton("Cancel");
        jp.add(jl);
        jp.add(un);
        jp.add(jl2);
        jp.add(psw);
        jp.add(log);
        jp.add(can);
        add(jp);
        setVisible(true);
        setSize(200,200);
        
        
        
        
    }
    public static void main(String args[]){
    new LOGIN_FORM();
    }
    
    
}
