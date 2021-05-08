import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;

public class Calculos {
	private static Text var1;
	private static Button btnSeven;
	private static Button btnEight;
	private static Button btnNine;
	private static Button btnSix;
	private static Button btnFive;
	private static Button btnFour;
	private static Button btnThree;
	private static Button btnTwo;
	private static Button btnOne;
	private static Button btnZero;
	private static Button btnSum;
	private static Text var2;
	private static Button btnResult;
	private static Text lastCalc;
	private static Text calcular;
	private static Button btnReset;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(450, 587);
		shell.setText("SWT Application");
		
		var1 = new Text(shell, SWT.BORDER);
		var1.setBounds(34, 34, 353, 68);
		
		var2 = new Text(shell, SWT.BORDER);
		var2.setBounds(25, 488, 124, 42);
		
		btnZero = new Button(shell, SWT.NONE);
		btnZero.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				if(lastCalc.getText().equals("")) {
					var1.setText(var1.getText()+0);
				}else {
					var1.setText("");
					var1.setText(var1.getText()+0);
				}
				lastCalc.setText("");
			}
		});
		btnZero.setText("0");
		btnZero.setBounds(29, 411, 74, 58);
		
		btnOne = new Button(shell, SWT.NONE);
		btnOne.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(lastCalc.getText().equals("")) {
					var1.setText(var1.getText()+1);
				}else {
					var1.setText("");
					var1.setText(var1.getText()+1);
				}
				lastCalc.setText("");
			}
		});
		btnOne.setText("1");
		btnOne.setBounds(29, 326, 74, 58);
		
		btnTwo = new Button(shell, SWT.NONE);
		btnTwo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(lastCalc.getText().equals("")) {
					var1.setText(var1.getText()+2);
				}else {
					var1.setText("");
					var1.setText(var1.getText()+2);
					
				}
				
				lastCalc.setText("");
				
				
			}
		});
		btnTwo.setText("2");
		btnTwo.setBounds(124, 326, 74, 58);
		
		btnThree = new Button(shell, SWT.NONE);
		btnThree.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(lastCalc.getText().equals("")) {
					var1.setText(var1.getText()+3);
				}else {
					var1.setText("");
					var1.setText(var1.getText()+3);
				}
				lastCalc.setText("");
			}
		});
		btnThree.setText("3");
		btnThree.setBounds(218, 326, 74, 58);
		
		btnFour = new Button(shell, SWT.NONE);
		btnFour.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			
				if(lastCalc.getText().equals("")) {
					var1.setText(var1.getText()+4);
				}else {
					var1.setText("");
					var1.setText(var1.getText()+4);
				}
				lastCalc.setText("");
			}
		});
		btnFour.setText("4");
		btnFour.setBounds(29, 249, 74, 58);
		
		btnFive = new Button(shell, SWT.NONE);
		btnFive.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(lastCalc.getText().equals("")) {
					var1.setText(var1.getText()+5);
				}else {
					var1.setText("");
					var1.setText(var1.getText()+5);
				}
				lastCalc.setText("");
			}
		});
		btnFive.setText("5");
		btnFive.setBounds(124, 249, 74, 58);
		
		btnSix = new Button(shell, SWT.NONE);
		btnSix.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(lastCalc.getText().equals("")) {
					var1.setText(var1.getText()+6);
				}else {
					var1.setText("");
					var1.setText(var1.getText()+6);
				}
				lastCalc.setText("");
			}
		});
		btnSix.setText("6");
		btnSix.setBounds(218, 249, 74, 58);
		
		btnSeven = new Button(shell, SWT.NONE);
		btnSeven.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(lastCalc.getText().equals("")) {
					var1.setText(var1.getText()+7);
				}else {
					var1.setText("");
					var1.setText(var1.getText()+7);
				}
				lastCalc.setText("");
			}
		});
		btnSeven.setText("7");
		btnSeven.setBounds(29, 169, 74, 58);
		
		btnEight = new Button(shell, SWT.NONE);
		btnEight.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(lastCalc.getText().equals("")) {
					var1.setText(var1.getText()+8);
				}else {
					var1.setText("");
					var1.setText(var1.getText()+8);
				}
				lastCalc.setText("");
			}
		});
		btnEight.setText("8");
		btnEight.setBounds(124, 169, 74, 58);
		
		btnNine = new Button(shell, SWT.NONE);
		btnNine.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(lastCalc.getText().equals("")) {
					var1.setText(var1.getText()+9);
				}else {
					var1.setText("");
					var1.setText(var1.getText()+9);
				}
				lastCalc.setText("");
			}
		});
		btnNine.setText("9");
		btnNine.setBounds(218, 169, 74, 58);
		
		btnReset = new Button(shell, SWT.NONE);
		btnReset.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				var1.setText("");
				var2.setText("");
				lastCalc.setText("");
				
			}
		});
		btnReset.setText("C");
		btnReset.setBounds(124, 411, 74, 58);
		
		btnSum = new Button(shell, SWT.NONE);
		
		btnSum.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!(var1.getText().equals("")) && !(var2.getText().equals(""))) {
					calculs();
					
				}
					
					var2.setText(var1.getText());
					
					lastCalc.setText("+");
					calcular.setText("+");
					
				
				
			}
		});
		btnSum.setText("+");
		btnSum.setBounds(313, 169, 74, 58);
		
		btnResult = new Button(shell, SWT.NONE);
		btnResult.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				if(!lastCalc.getText().equals("")) {
					var2.setText("");
				}
				calculs();
				
				
			}
		});
		btnResult.setText("=");
		btnResult.setBounds(218, 411, 74, 58);
		
		lastCalc = new Text(shell, SWT.BORDER);
		lastCalc.setBounds(180, 488, 112, 31);
		
		calcular = new Text(shell, SWT.BORDER);
		calcular.setBounds(309, 482, 93, 37);

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	
	public static void calculs() {
		
		try {
			
			int a=Integer.parseInt(var1.getText());
			int b=Integer.parseInt(var2.getText());
			
			
			if(calcular.getText().equals("+")) {
				int res = a + b;
				var1.setText(String.valueOf(res));
				var2.setText("");
				lastCalc.setText("");
			}
			
		}catch(Exception  e) {
			
			var2.setText("");
		}
		
	}

}
