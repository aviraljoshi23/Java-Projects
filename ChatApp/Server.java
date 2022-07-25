package chat;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.io.*;
import java.awt.event.*;

public class Server implements ActionListener{
	
	JTextField text;
	JPanel  a1;
	static Box vertical = Box.createVerticalBox();
	static DataOutputStream dos;
	static JFrame jf = new JFrame(); 
	
	Server(){
		jf.setLayout(null);
		
		JPanel jp = new JPanel();
		jp.setBackground(new Color(99, 136, 224));
		jp.setBounds(0,0,400,70);
		jp.setLayout(null);
		jf.add(jp);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/arrowleft.png"));
		Image i2 = i1.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel back = new JLabel(i3);
		back.setBounds(5,20,25,25);
		jp.add(back);

		back.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent ap) {
				System.exit(0);
			}
		});
		
		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("image/Picture1.png"));
		Image i5 = i4.getImage().getScaledInstance(40,45,Image.SCALE_DEFAULT);
		ImageIcon i6= new ImageIcon(i5);
		JLabel jethabhai = new JLabel(i6);
		jethabhai.setBounds(40,10,50,50);
		jp.add(jethabhai);
		
		jethabhai.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent ap) {
				System.exit(0);
			}
		});
		
		
		ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("image/Picture2.png"));
		Image i8 = i7.getImage().getScaledInstance(20,20,Image.SCALE_DEFAULT);
		ImageIcon i9= new ImageIcon(i8);
		JLabel icon = new JLabel(i9);
		icon.setBounds(260,7,50,50);
		jp.add(icon);
		
		ImageIcon p1 = new ImageIcon(ClassLoader.getSystemResource("image/Picture3.png"));
		Image p2 = p1.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
		ImageIcon p3= new ImageIcon(p2);
		JLabel icon2 = new JLabel(p3);
		icon2.setBounds(300,10,45,45);
		jp.add(icon2);
		
		ImageIcon t1 = new ImageIcon(ClassLoader.getSystemResource("image/Picture4.png"));
		Image t2 = t1.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
		ImageIcon t3= new ImageIcon(t2);
		JLabel icon3 = new JLabel(t3);
		icon3.setBounds(330,10,45,45);
		jp.add(icon3);
		
		JLabel name  = new JLabel("Jethalal Gada");
		name.setBounds(100,5,100,50);
		name.setForeground(Color.BLACK);
		name.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		jp.add(name);
		
		JLabel status  = new JLabel("Active Now");
		status.setBounds(110,35,150,25);
		status.setForeground(Color.BLACK);
		status.setFont(new Font("Comic Sans MS", Font.BOLD,10));
		jp.add(status);
		
		a1 = new JPanel();
		a1.setBounds(5,60,375,460);
		jf.add(a1);
		//setUndecorated(true);
		
	    text = new JTextField();
		text.setBounds(4,520,300,40);
		text.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		jf.add(text);
		
		/*JScrollPane sp = new JScrollPane(a1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		add(sp);*/
		
		
		JButton send = new JButton("Send");
		send.setBounds(300,520,82,40);
		send.addActionListener(this);
		send.setBackground(new Color(202, 237, 114));
		send.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
		jf.add(send);
		
		jf.setSize(400,600); 
		jf.setLocation(200,50);
		//jf.setUndecorated(true);
		jf.getContentPane().setBackground(Color.WHITE);
		jf.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ap){
		try {
		String out = text.getText();
		
		JPanel p2 = formatLabel(out);
		//p2.add(output);
		
		a1.setLayout(new BorderLayout());
		
		JPanel right = new JPanel(new BorderLayout());
		right.add(p2,BorderLayout.LINE_END);
		vertical.add(right);
		vertical.add(Box.createVerticalStrut(15));
		a1.add(vertical,BorderLayout.PAGE_START);
		
		dos.writeUTF(out);
		
		text.setText("");
		
		jf.repaint();
		jf.invalidate();
		jf.validate();
		
		}catch(Exception e)
		{
			e.printStackTrace(); 
		}
	}
	public static JPanel formatLabel(String out) {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		
		JLabel output  = new JLabel("<html><p style=\"width: 150px\">" + out + "</p></html>");
		output.setFont(new Font("Comic Sans MS",Font.PLAIN,15));
		output.setBackground(new Color(169, 204, 252));
		output.setOpaque(true);
		output.setBorder(new EmptyBorder(15,15,15,50));
		
		panel.add(output);
		
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        
        JLabel time = new JLabel();
        time.setText(sdf.format(cal.getTime()));
        
        panel.add(time);
		
		return panel;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Server();
		
		try {
			ServerSocket skt = new ServerSocket(6001);		
			while(true){
				Socket s = new Socket();
				   skt.accept();
				 DataInputStream dis = new DataInputStream(s.getInputStream());
				 dos = new DataOutputStream(s.getOutputStream());
				 
				 while(true){
					//jf.setLayout(new BorderLayout());
					String mess = dis.readUTF();
					JPanel panel = formatLabel(mess);
					JPanel left = new JPanel(new BorderLayout());
					left.add(panel,BorderLayout.LINE_START);
					vertical.add(left);
					//jf.add(vertical,BorderLayout.PAGE_START);
					jf.validate();
				 }
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
