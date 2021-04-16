

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class BighaCalculator extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	JFrame frame =null;
	Calculator calculator=null;
	
	JLabel result=null;
	
	JTextField txUnitFactor=null;
	JTextField txBigha=null;
	JTextField txKattha=null;
	JTextField txDhur=null;
	JTextField txDhurki=null;
	JTextField txFurki=null;
	JTextField txLurki=null;
	JTextField txSurki=null;
	JTextField txBigha2=null;
	JTextField txKattha2=null;
	JTextField txDhur2=null;
	JTextField txDhurki2=null;
	JTextField txFurki2=null;
	JTextField txLurki2=null;
	JTextField txSurki2=null;
	
	JButton addition=null;
	JButton substraction=null;
	JButton multiplication=null;
	JButton division=null;
	JButton clear=null;
	JButton exit=null;
	
	public BighaCalculator()
	{
		frame = new JFrame("Traditional Land Calculator");
		
		//Label Variables Declaration
		JLabel lbFirstUnit=new JLabel("First Unit:");
		JLabel lbSecondUnit=new JLabel("Second Unit:");
		JLabel lbUnitFactor=new JLabel("Unit Factor:");
		JLabel lbBigha=new JLabel("Bigha:");
		JLabel lbKattha=new JLabel("Kattha:");
		JLabel lbDhur=new JLabel("Dhur:");
		JLabel lbDhurki=new JLabel("Dhurki:");
		JLabel lbFurki=new JLabel("Furki:");
		JLabel lbLurki=new JLabel("Lurki:");
		JLabel lbSurki=new JLabel("Surki:");
		JLabel lbResult=new JLabel("Result:");
		result=new JLabel();
		
		//Unit TextFeild Declaration
		txUnitFactor=new JTextField();
		txBigha=new JTextField();
		txKattha=new JTextField();
		txDhur=new JTextField();
		txDhurki=new JTextField();
		txFurki=new JTextField();
		txLurki=new JTextField();
		txSurki=new JTextField();
		txBigha2=new JTextField();
		txKattha2=new JTextField();
		txDhur2=new JTextField();
		txDhurki2=new JTextField();
		txFurki2=new JTextField();
		txLurki2=new JTextField();
		txSurki2=new JTextField();
		
		//Computation Button Declaration
		addition=new JButton("Addition");
		substraction=new JButton("Substract");
		multiplication=new JButton("Multiply");
		division=new JButton("Division");
		clear=new JButton("Clear");
		exit=new JButton("Exit");
		
		//Adding components into tab pane,panel and the frame.
		JTabbedPane tab = new JTabbedPane();
		
		//First Tab Components
		JPanel firstLayoutPanel = new JPanel();
		firstLayoutPanel.setLayout(null);
		//First Unit Layout
		lbFirstUnit.setBounds(100,100,150, 25);
		firstLayoutPanel.add(lbFirstUnit);
		lbBigha.setBounds(200,80,50,25);
		firstLayoutPanel.add(lbBigha);
		lbKattha.setBounds(255,80,50,25);
		firstLayoutPanel.add(lbKattha);
		lbDhur.setBounds(305,80,50,25);
		firstLayoutPanel.add(lbDhur);
		lbDhurki.setBounds(355,80,50,25);
		firstLayoutPanel.add(lbDhurki);
		lbFurki.setBounds(405,80,50,25);
		firstLayoutPanel.add(lbFurki);
		lbLurki.setBounds(455,80,50,25);
		firstLayoutPanel.add(lbLurki);
		lbSurki.setBounds(505,80,50,25);
		firstLayoutPanel.add(lbSurki);
		
		txBigha.setBounds(200,100,50,25);
		txBigha.getDocument().addDocumentListener(new ValueChangeListener());
		firstLayoutPanel.add(txBigha);
		txKattha.setBounds(250,100,50,25);
		txKattha.getDocument().addDocumentListener(new ValueChangeListener());
		firstLayoutPanel.add(txKattha);
		txDhur.setBounds(300,100,50,25);
		txDhur.getDocument().addDocumentListener(new ValueChangeListener());
		firstLayoutPanel.add(txDhur);
		txDhurki.setBounds(350,100,50,25);
		txDhurki.getDocument().addDocumentListener(new ValueChangeListener());
		firstLayoutPanel.add(txDhurki);
		txFurki.setBounds(400,100,50,25);
		txFurki.getDocument().addDocumentListener(new ValueChangeListener());
		firstLayoutPanel.add(txFurki);
		txLurki.setBounds(450,100,50,25);
		txLurki.getDocument().addDocumentListener(new ValueChangeListener());
		firstLayoutPanel.add(txLurki);
		txSurki.setBounds(500,100,50,25);
		txSurki.getDocument().addDocumentListener(new ValueChangeListener());
		firstLayoutPanel.add(txSurki);
		
		//Second Unit Layout
		lbSecondUnit.setBounds(100,130,150, 25);
		firstLayoutPanel.add(lbSecondUnit);
		txBigha2.setBounds(200,130,50,25);
		firstLayoutPanel.add(txBigha2);
		txKattha2.setBounds(250,130,50,25);
		firstLayoutPanel.add(txKattha2);
		txDhur2.setBounds(300,130,50,25);
		firstLayoutPanel.add(txDhur2);
		txDhurki2.setBounds(350,130,50,25);
		firstLayoutPanel.add(txDhurki2);
		txFurki2.setBounds(400,130,50,25);
		firstLayoutPanel.add(txFurki2);
		txLurki2.setBounds(450,130,50,25);
		firstLayoutPanel.add(txLurki2);
		txSurki2.setBounds(500,130,50,25);
		firstLayoutPanel.add(txSurki2);
		
		lbUnitFactor.setBounds(100, 160, 100, 25);
		firstLayoutPanel.add(lbUnitFactor);
		txUnitFactor.setBounds(200, 160, 100, 25);
		txUnitFactor.getDocument().addDocumentListener(new ValueChangedListener());
		firstLayoutPanel.add(txUnitFactor);
		
		lbResult.setBounds(200,190,100, 25);
		firstLayoutPanel.add(lbResult);
		result.setBounds(250,190,400, 25);
		firstLayoutPanel.add(result);
		
		addition.setBounds(280,230,100, 25);
		addition.addActionListener(new CalculatorListener());
		firstLayoutPanel.add(addition);
		substraction.setBounds(380,230,100, 25);
		substraction.addActionListener(new CalculatorListener());
		firstLayoutPanel.add(substraction);
		
		multiplication.setBounds(280,255,100, 25);
		multiplication.addActionListener(new CalculatorListener());
		firstLayoutPanel.add(multiplication);
		division.setBounds(380,255,100, 25);
		division.addActionListener(new CalculatorListener());
		firstLayoutPanel.add(division);
		
		clear.setBounds(280,280,100, 25);
		clear.addActionListener(new CalculatorListener());
		firstLayoutPanel.add(clear);
		exit.setBounds(380,280,100, 25);
		exit.addActionListener(new CalculatorListener());
		firstLayoutPanel.add(exit);
		
		tab.add("Calculate",firstLayoutPanel);
		
		//Second Tab Components
		JPanel secondLayoutPanel = new JPanel();
		secondLayoutPanel.setLayout(null);
		
		tab.add("User Guide",secondLayoutPanel);
		
        frame.add(tab);
		frame.setSize(700, 400);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
	}
	public static void main(String[] args)
	{
		new BighaCalculator();
	}
	
	class CalculatorListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			calculator=new CalculatorImpl();
			int[] firstUnits=populateFirstUnitData();
			int[] secondUnits=populateSecondUnitData();
			String actionCommand=e.getActionCommand();
			int unitFactor=0;
			if(actionCommand.equals("Addition"))
			{
				String addResult=calculator.addition(firstUnits,secondUnits);
				result.setText(addResult);
			}
			if(actionCommand.equals("Substract"))
			{
				String addResult=calculator.substraction(firstUnits, secondUnits);
				result.setText(addResult);
			}
			if(actionCommand.equals("Multiply"))
			{
				System.out.println("Hi I am OK.......Multiply");
				unitFactor=getUnitFactor();
				if(unitFactor>0)
				{
					String multiResult=calculator.multiplication(firstUnits,unitFactor);
					result.setText(multiResult);
				}
			}
			if(actionCommand.equals("Division"))
			{
				System.out.println("Hi I am OK.......Division");
				unitFactor=getUnitFactor();
				if(unitFactor>0)
				{
					String multiResult=calculator.division(firstUnits,unitFactor);
					result.setText(multiResult);
				}
			}
			
			if(actionCommand.equals("Clear"))
			{
				clearTextFieldData();
			}
			if(actionCommand.equals("Exit"))
			{
				frame.setVisible(false);
				frame.dispose();
			}
		}
		
		private int[] populateFirstUnitData()
		{
			try 
			{
				int bigha=0,kattha=0,dhur=0,dhurki=0,furki=0,lurki=0,surki=0;
				if(!txBigha.getText().equals(""))
					bigha=Integer.parseInt(txBigha.getText());
				if(!txKattha.getText().equals(""))
					kattha=Integer.parseInt(txKattha.getText());
				if(!txDhur.getText().equals(""))
					dhur=Integer.parseInt(txDhur.getText());
				if(!txDhurki.getText().equals(""))
					dhurki=Integer.parseInt(txDhurki.getText());
				if(!txFurki.getText().equals(""))
					furki=Integer.parseInt(txFurki.getText());
				if(!txLurki.getText().equals(""))
					lurki=Integer.parseInt(txLurki.getText());
				if(!txSurki.getText().equals(""))
					surki=Integer.parseInt(txSurki.getText());
				
				result.setText("");
				int firstUnits[]={bigha,kattha,dhur,dhurki,furki,lurki,surki};
				return firstUnits;
			} 
			catch (NumberFormatException e) 
			{
				result.setText("Please enter digit only..."+e.getMessage());
			}
			return null;
		}
		
		private int[] populateSecondUnitData()
		{
			try 
			{
				int bigha=0,kattha=0,dhur=0,dhurki=0,furki=0,lurki=0,surki=0;
				if(!txBigha2.getText().equals(""))
					bigha=Integer.parseInt(txBigha2.getText());
				if(!txKattha2.getText().equals(""))
					kattha=Integer.parseInt(txKattha2.getText());
				if(!txDhur2.getText().equals(""))
					dhur=Integer.parseInt(txDhur2.getText());
				if(!txDhurki2.getText().equals(""))
					dhurki=Integer.parseInt(txDhurki2.getText());
				if(!txFurki2.getText().equals(""))
					furki=Integer.parseInt(txFurki2.getText());
				if(!txLurki2.getText().equals(""))
					lurki=Integer.parseInt(txLurki2.getText());
				if(!txSurki2.getText().equals(""))
					surki=Integer.parseInt(txSurki2.getText());
				
				result.setText("");
				int secondUnits[]={bigha,kattha,dhur,dhurki,furki,lurki,surki};
				return secondUnits;
			} 
			catch (NumberFormatException e) 
			{
				result.setText("Please enter digit only..."+e.getMessage());
			}
			return null;
		}
		private int getUnitFactor()
		{
			int unitFactor=0;
			try 
			{
				if(txUnitFactor.getText() !="")
					unitFactor=Integer.parseInt(txUnitFactor.getText());
				
				result.setText("");
			} 
			catch (NumberFormatException e) 
			{
				result.setText("Please enter digit into Unit Factor...");
			}
			return unitFactor;
		}
		private void clearTextFieldData()
		{
			txBigha.setText("");
			txKattha.setText("");
			txDhur.setText("");
			txDhurki.setText("");
			txFurki.setText("");
			txLurki.setText("");
			txSurki.setText("");
			txBigha2.setText("");
			txKattha2.setText("");
			txDhur2.setText("");
			txDhurki2.setText("");
			txFurki2.setText("");
			txLurki2.setText("");
			txSurki2.setText("");
			txUnitFactor.setText("");
		}
	}
	
	class ValueChangedListener implements DocumentListener
	{

		@Override
		public void insertUpdate(DocumentEvent e) 
		{
			disbaleSecondUnits();
		}

		@Override
		public void removeUpdate(DocumentEvent e) 
		{
			disbaleSecondUnits();
		}

		@Override
		public void changedUpdate(DocumentEvent e)
		{
			disbaleSecondUnits();
		}
		
		private void disbaleSecondUnits()
		{
			txBigha2.setEnabled(false);
			txKattha2.setEnabled(false);
			txDhur2.setEnabled(false);
			txDhurki2.setEnabled(false);
			txFurki2.setEnabled(false);
			txLurki2.setEnabled(false);
			txSurki2.setEnabled(false);
		}
	}
	class ValueChangeListener implements DocumentListener
	{

		@Override
		public void insertUpdate(DocumentEvent e) 
		{
			enabaleSecondUnits();
		}

		@Override
		public void removeUpdate(DocumentEvent e) 
		{
			enabaleSecondUnits();
		}

		@Override
		public void changedUpdate(DocumentEvent e)
		{
			enabaleSecondUnits();
		}
		
		private void enabaleSecondUnits()
		{
			txBigha2.setEnabled(true);
			txKattha2.setEnabled(true);
			txDhur2.setEnabled(true);
			txDhurki2.setEnabled(true);
			txFurki2.setEnabled(true);
			txLurki2.setEnabled(true);
			txSurki2.setEnabled(true);
		}
	}
}
