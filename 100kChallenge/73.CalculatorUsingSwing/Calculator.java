import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Calculator implements ActionListener{
	
	JLabel lblDisplay;
	JButton btnPlus;
	JButton btnSub;
	JButton btnDiv;
	JButton btnMul;
	JButton btnDot;
	JButton btnEqual;
	JButton btnClear;

	JButton btnZero;
	JButton btnOne;
	JButton btnTwo;
	JButton btnThree;
	JButton btnFour;
	JButton btnFive;
	JButton btnSix;
	JButton btnSeven;
	JButton btnEight;
	JButton btnNine;

	String operation = "";
	boolean isOperatorClicked = false;
	String prevValue = "";
	
	public Calculator(){
		JFrame jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setLocation(300,100);
		jf.setSize(600,600);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lblDisplay = new JLabel();
		lblDisplay.setBounds(50,50,500,50);
		lblDisplay.setBackground(Color.gray);
		lblDisplay.setOpaque(true);
		lblDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDisplay.setForeground(Color.white);
		jf.add(lblDisplay);

		btnSeven = new JButton("7");
		btnSeven.setBounds(50,150,50,50);
		btnSeven.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnSeven.addActionListener(this);
		jf.add(btnSeven);

		btnEight = new JButton("8");
		btnEight.setBounds(120,150,50,50);
		btnEight.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnEight.addActionListener(this);
		jf.add(btnEight);
		
		btnNine = new JButton("9");
		btnNine.setBounds(190,150,50,50);
		btnNine.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnNine.addActionListener(this);
		jf.add(btnNine);

		btnDiv = new JButton("/");
		btnDiv.setBounds(260,150,50,50);
		btnDiv.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnDiv.addActionListener(this);
		jf.add(btnDiv);

		btnFour = new JButton("4");
		btnFour.setBounds(50,220,50,50);
		btnFour.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnFour.addActionListener(this);
		jf.add(btnFour);

		btnFive = new JButton("5");
		btnFive.setBounds(120,220,50,50);
		btnFive.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnFive.addActionListener(this);
		jf.add(btnFive);

		btnSix = new JButton("6");
		btnSix.setBounds(190,220,50,50);
		btnSix.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnSix.addActionListener(this);
		jf.add(btnSix);

		btnMul = new JButton("x");
		btnMul.setBounds(260,220,50,50);
		btnMul.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnMul.addActionListener(this);
		jf.add(btnMul);

		btnOne = new JButton("1");
		btnOne.setBounds(50,290,50,50);
		btnOne.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnOne.addActionListener(this);
		jf.add(btnOne);

		btnTwo = new JButton("2");
		btnTwo.setBounds(120,290,50,50);
		btnTwo.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnTwo.addActionListener(this);
		jf.add(btnTwo);

		btnThree = new JButton("3");
		btnThree.setBounds(190,290,50,50);
		btnThree.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnThree.addActionListener(this);
		jf.add(btnThree);

		btnSub = new JButton("-");
		btnSub.setBounds(260,290,50,50);
		btnSub.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnSub.addActionListener(this);
		jf.add(btnSub);

		btnDot = new JButton(".");
		btnDot.setBounds(50,360,50,50);
		btnDot.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnDot.addActionListener(this);
		jf.add(btnDot);
		
		btnZero = new JButton("0");
		btnZero.setBounds(120,360,50,50);
		btnZero.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnZero.addActionListener(this);
		jf.add(btnZero);

		btnEqual = new JButton("=");
		btnEqual.setBounds(190,360,50,50);
		btnEqual.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnEqual.addActionListener(this);
		jf.add(btnEqual);

		btnPlus = new JButton("+");
		btnPlus.setBounds(260,360,50,50);
		btnPlus.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnPlus.addActionListener(this);
		jf.add(btnPlus);

		btnClear = new JButton("C");
		btnClear.setBounds(330,360,50,50);
		btnClear.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnClear.addActionListener(this);
		jf.add(btnClear);


	}


	public static void main(String args[]){
		new Calculator();	
	}

	public double getResult(String operation){
		double result = 0;

		if(prevValue.equals("")){
			result = Double.parseDouble(lblDisplay.getText());
		}else{
			switch(operation){
				case "+":
					result = Double.parseDouble(prevValue) + Double.parseDouble(lblDisplay.getText());
					break;
				case "-":
					result = Double.parseDouble(prevValue) - Double.parseDouble(lblDisplay.getText());
					break;
				case "*":
					result = Double.parseDouble(prevValue) * Double.parseDouble(lblDisplay.getText());
					break;
				case "/":
					result = Double.parseDouble(prevValue) / Double.parseDouble(lblDisplay.getText());
					break;

			}
		}
		return result;
	}

	public void actionPerformed(ActionEvent e){
		double result = 0;
		if(e.getSource() == btnClear){
			lblDisplay.setText("");
			operation = "";
			prevValue = "";
		}else if(e.getSource() == btnEqual){
			result = getResult(operation);
			lblDisplay.setText(""+ result);
			System.out.println(result);
			isOperatorClicked = false;
			prevValue = "";
		}else if(e.getSource() == btnPlus){
			if(!isOperatorClicked){
				isOperatorClicked = true;
				if(prevValue != "" && operation != ""){
					result = getResult(operation);
					lblDisplay.setText(""+ result);
				}
				prevValue = lblDisplay.getText();
			}
			operation = "+";
		}else if(e.getSource() == btnSub){

			if(!isOperatorClicked){
				isOperatorClicked = true;
				if(prevValue != "" && operation != ""){
					result = getResult(operation);
					lblDisplay.setText(""+ result);
				}
				prevValue = lblDisplay.getText();
			}
			operation = "-";

		}else if(e.getSource() == btnMul){

			if(!isOperatorClicked){
				isOperatorClicked = true;
				if(prevValue != "" && operation != ""){
					result = getResult(operation);
					lblDisplay.setText(""+ result);
				}
				prevValue = lblDisplay.getText();
			}
			operation = "*";
			
		}else if(e.getSource() == btnDiv){

			if(!isOperatorClicked){
				isOperatorClicked = true;
				if(prevValue != "" && operation != ""){
					result = getResult(operation);
					lblDisplay.setText(""+ result);
				}
				prevValue = lblDisplay.getText();
			}
			operation = "/";

		
		}else if(e.getSource() == btnDot){
			if(!lblDisplay.getText().contains(".")){
				if(isOperatorClicked){
					lblDisplay.setText(".");
					isOperatorClicked = false;
				}else{
					lblDisplay.setText(lblDisplay.getText() + ".");
				}
			}
		}else if(e.getSource() == btnZero){
			if(isOperatorClicked){
				lblDisplay.setText("0");
				isOperatorClicked = false;
			}else{
				lblDisplay.setText(lblDisplay.getText() + "0");
			}
		}else if(e.getSource() == btnOne){
			if(isOperatorClicked){
				lblDisplay.setText("1");
				isOperatorClicked = false;
			}else{
				lblDisplay.setText(lblDisplay.getText() + "1");
			}
		}else if(e.getSource() == btnTwo){
			if(isOperatorClicked){
				lblDisplay.setText("2");
				isOperatorClicked = false;
			}else{
				lblDisplay.setText(lblDisplay.getText() + "2");
			}
		}else if(e.getSource() == btnThree){
			if(isOperatorClicked){
				lblDisplay.setText("3");
				isOperatorClicked = false;
			}else{
				lblDisplay.setText(lblDisplay.getText() + "3");
			}
		}else if(e.getSource() == btnFour){

			if(isOperatorClicked){
				lblDisplay.setText("4");
				isOperatorClicked = false;
			}else{
				lblDisplay.setText(lblDisplay.getText() + "4");
			}

		}else if(e.getSource() == btnFive){

			if(isOperatorClicked){
				lblDisplay.setText("5");
				isOperatorClicked = false;
			}else{
				lblDisplay.setText(lblDisplay.getText() + "5");
			}
		}else if(e.getSource() == btnSix){
			if(isOperatorClicked){
				lblDisplay.setText("6");
				isOperatorClicked = false;
			}else{
				lblDisplay.setText(lblDisplay.getText() + "6");
			}
		}else if(e.getSource() == btnSeven){
			if(isOperatorClicked){
				lblDisplay.setText("7");
				isOperatorClicked = false;
			}else{
				lblDisplay.setText(lblDisplay.getText() + "7");
			}
		}else if(e.getSource() == btnEight){
			if(isOperatorClicked){
				lblDisplay.setText("8");
				isOperatorClicked = false;
			}else{
				lblDisplay.setText(lblDisplay.getText() + "8");
			}
		}else if(e.getSource() == btnNine){
			if(isOperatorClicked){
				lblDisplay.setText("9");
				isOperatorClicked = false;
			}else{
				lblDisplay.setText(lblDisplay.getText() + "9");
			}
		}
	}

}
