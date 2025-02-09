package controller.member;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Member;
import service.impl.MemberServiceImpl;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AddMemberUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldUsername;
	private JTextField textFieldPassword;
	private JTextField textFieldAddress;
	private JTextField textFieldPhone;
	private JTextField textFieldMobile;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMemberUI frame = new AddMemberUI();
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
	public AddMemberUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(27, 10, 386, 60);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("會員註冊");
		lblNewLabel_4.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(152, 27, 106, 23);
		panel.add(lblNewLabel_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(27, 83, 386, 329);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("姓名");
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel.setBounds(87, 28, 64, 23);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("帳號");
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(87, 69, 64, 23);
		panel_1.add(lblNewLabel_1);
		
		textFieldName = new JTextField();
		textFieldName.setFont(new Font("新細明體", Font.PLAIN, 18));
		textFieldName.setColumns(10);
		textFieldName.setBounds(151, 28, 109, 23);
		panel_1.add(textFieldName);
		
		textFieldUsername = new JTextField();
		textFieldUsername.setFont(new Font("新細明體", Font.PLAIN, 18));
		textFieldUsername.setColumns(10);
		textFieldUsername.setBounds(151, 69, 109, 22);
		panel_1.add(textFieldUsername);				
		
		JLabel lblNewLabel_2 = new JLabel("密碼");
		lblNewLabel_2.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(87, 113, 64, 23);
		panel_1.add(lblNewLabel_2);
		
		textFieldPassword = new JTextField();
		textFieldPassword.setFont(new Font("新細明體", Font.PLAIN, 18));
		textFieldPassword.setColumns(10);
		textFieldPassword.setBounds(151, 113, 109, 23);
		panel_1.add(textFieldPassword);
		
		textFieldAddress = new JTextField();
		textFieldAddress.setFont(new Font("新細明體", Font.PLAIN, 18));
		textFieldAddress.setColumns(10);
		textFieldAddress.setBounds(151, 154, 109, 22);
		panel_1.add(textFieldAddress);
		
		JLabel lblNewLabel_1_1 = new JLabel("地址");
		lblNewLabel_1_1.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(87, 154, 64, 23);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("電話");
		lblNewLabel_3.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(87, 200, 64, 23);
		panel_1.add(lblNewLabel_3);
		
		textFieldPhone = new JTextField();
		textFieldPhone.setFont(new Font("新細明體", Font.PLAIN, 18));
		textFieldPhone.setColumns(10);
		textFieldPhone.setBounds(151, 200, 109, 23);
		panel_1.add(textFieldPhone);
		
		textFieldMobile = new JTextField();
		textFieldMobile.setFont(new Font("新細明體", Font.PLAIN, 18));
		textFieldMobile.setColumns(10);
		textFieldMobile.setBounds(151, 241, 109, 22);
		panel_1.add(textFieldMobile);
		
		JLabel lblNewLabel_1_2 = new JLabel("手機");
		lblNewLabel_1_2.setFont(new Font("新細明體", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(87, 241, 64, 23);
		panel_1.add(lblNewLabel_1_2);
		
		JButton btnRegister = new JButton("註冊");
		btnRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String username = textFieldUsername.getText();
				
				if(new MemberServiceImpl().isUsernameBeenUse(username))
				{
					AddMemberErrorUI addMemberErrorUI = new AddMemberErrorUI();
					addMemberErrorUI.setVisible(true);
					dispose();
				}
				else
				{
					String name = textFieldName.getText();
					String password = textFieldPassword.getText();
					String address = textFieldAddress.getText();
					String phone = textFieldPhone.getText();
					String mobile = textFieldMobile.getText();
					
					Member member = new Member(name,username,password,address,phone,mobile);
					new MemberServiceImpl().addMember(member);
					
//					
					AddMemberSuccessUI addMemberSuccessUI = new AddMemberSuccessUI();
					addMemberSuccessUI.setVisible(true);
					dispose();
					
				}
				
			}
		});
		btnRegister.setFont(new Font("新細明體", Font.PLAIN, 18));
		btnRegister.setBounds(118, 288, 119, 23);
		panel_1.add(btnRegister);
	}

}
