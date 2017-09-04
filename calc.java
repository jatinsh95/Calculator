package calculator1;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class calc {
	String op="";
	Double oper[]=new Double[2];
	protected Shell shell;
	private Text input;
	public void switch_v(){
		oper[1]=Double.parseDouble(input.getText());
		switch(op){
		case "+":
		input.setText(""+(oper[0]+oper[1]));
		break;
		case "/":
		input.setText(""+(oper[0]/oper[1]));
		break;
		case "-":
	    input.setText(""+(oper[0]-oper[1]));
		break;
		case "*":
		input.setText(""+(oper[0]*oper[1]));
		break;	
		}
		oper[0]=Double.parseDouble(input.getText());
	}
	
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			calc window = new calc();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("Calc ");
		
		input = new Text(shell, SWT.BORDER);
		input.setBounds(21, 35, 308, 30);
		
		Button addbutton = new Button(shell, SWT.NONE);
		addbutton.setToolTipText("addition");
		addbutton.addSelectionListener(new SelectionAdapter() {
			@Override  	
			public void widgetSelected(SelectionEvent e) {
				if(op=="+"||op=="*"||op=="-"||op=="/"){
					switch_v();
					op="+";
				}else
				{
				oper[0]=Double.parseDouble(input.getText());
				op="+";
				input.setText("");
				}
			}
		});
		addbutton.setBounds(265, 143, 55, 21);
		addbutton.setText("+");
		
		Button subtractbutton = new Button(shell, SWT.NONE);
		subtractbutton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(op=="+"||op=="*"||op=="-"||op=="/"){
					switch_v();
					op="-";
				}else
				{
				oper[0]=Double.parseDouble(input.getText());
				op="-";
				input.setText("");
				}
			}	
		});
		subtractbutton.setToolTipText("substraction");
		subtractbutton.setBounds(324, 143, 55, 21);
		subtractbutton.setText("-");
		
		Button divbutton = new Button(shell, SWT.NONE);
		divbutton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(op=="+"||op=="*"||op=="-"||op=="/"){
					switch_v();
					op="/";
					
				}else
				{
				oper[0]=Double.parseDouble(input.getText());
				op="/";
				input.setText("");
				}
			}
		});
		divbutton.setBounds(265, 170, 55, 21);
		divbutton.setText("/");
		
		Button mulbutton = new Button(shell, SWT.NONE);
		mulbutton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(op=="+"||op=="*"||op=="-"||op=="/"){
					switch_v();
					op="*";
				}else
				{
				oper[0]=Double.parseDouble(input.getText());
				op="*";
				input.setText("");
				}
			}
		});
		mulbutton.setBounds(324, 170, 55, 21);
		mulbutton.setText("*");
		
		Button b1 = new Button(shell, SWT.NONE);
		b1.setTouchEnabled(true);
		
		b1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(input.getText().contains(".")){
					input.setText("1");
				}else
				input.setText(input.getText()+"1");
			}
		});
		b1.setBounds(21, 107, 44, 25);
		b1.setText("1");
		
		Button b2 = new Button(shell, SWT.NONE);
		b2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				input.setText(input.getText()+"2");
			}
		});
		b2.setBounds(71, 107, 44, 25);
		b2.setText("2");
		
		Button b3 = new Button(shell, SWT.NONE);
		b3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(input.getText().contains(".")){
					input.setText("3");
				}else
				input.setText(input.getText()+"3");
			}
		});
		b3.setBounds(121, 107, 44, 25);
		b3.setText("3");
		
		Button b4 = new Button(shell, SWT.NONE);
		b4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(input.getText().contains(".")){
					input.setText("4");
				}else
				input.setText(input.getText()+"4");
			}
		});
		b4.setBounds(21, 135, 44, 25);
		b4.setText("4");
		
		Button b5 = new Button(shell, SWT.NONE);
		b5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(input.getText().contains(".")){
					input.setText("5");
				}else
				input.setText(input.getText()+"5");
			}
		});
		b5.setBounds(71, 135, 44, 25);
		b5.setText("5");
		
		Button b6 = new Button(shell, SWT.NONE);
		b6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(input.getText().contains(".")){
					input.setText("6");
				}else
				input.setText(input.getText()+"6");
			}
		});
		b6.setBounds(121, 135, 44, 25);
		b6.setText("6");
		
		Button b7 = new Button(shell, SWT.NONE);
		b7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(input.getText().contains(".")){
					input.setText("7");
				}else
				input.setText(input.getText()+"7");
			}
		});
		b7.setBounds(21, 164, 44, 25);
		b7.setText("7");
		
		Button b8 = new Button(shell, SWT.NONE);
		b8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(input.getText().contains(".")){
					input.setText("8");
				}else
				input.setText(input.getText()+"8");
			}
		});
		b8.setBounds(71, 164, 44, 25);
		b8.setText("8");
		
		Button b9 = new Button(shell, SWT.NONE);
		b9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(input.getText().contains(".")){
					input.setText("9");
				}else
				input.setText(input.getText()+"9");
			}
		});
		b9.setBounds(121, 164, 44, 25);
		b9.setText("9");
		
		Button b0 = new Button(shell, SWT.NONE);
		b0.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(input.getText().contains(".")){
					input.setText("0");
				}else
				input.setText(input.getText()+"0");
			}
		});
		b0.setBounds(21, 195, 44, 25);
		b0.setText("0");
		
		Button equal = new Button(shell, SWT.NONE);
		equal.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			switch_v();
				}
		});
		equal.setBounds(71, 195, 94, 25);
		equal.setText("=");
		
		Button Clear = new Button(shell, SWT.NONE);
		Clear.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				input.setText("");
				op="";
			}
		});
		Clear.setBounds(265, 106, 75, 25);
		Clear.setText("clear");
		
		
		
		

	}
}
