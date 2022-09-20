import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.InputMismatchException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class insertarLibro extends JFrame { // un jframe separado para insertar Datos
	String titulo,autor,isbn,editorial,ano,pagina;
	int year,page;
	JTextField t = new JTextField("");
	JTextField a = new JTextField("");
	JTextField i = new JTextField("");
	JTextField ee = new JTextField("");
	JTextField an = new JTextField("");
	JTextField p = new JTextField("");
	
	JButton button1= new JButton();
	JButton button2= new JButton();
	
	boolean error = false;
	public insertarLibro() {
		this.setLayout(new FlowLayout(FlowLayout.CENTER,10,10)); 
		this.setSize(300, 400);
		this.setTitle("Insertar Libro");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		button1.setText("Insertar datos");
		button1.setFocusable(false);
		this.add(button1);
		button2.setText("Volver");
		button2.setFocusable(false);
		this.add(button2);
		button2.addActionListener(e->{
			this.dispose();
		});
		t.setPreferredSize(new Dimension(240,30));
		t.setText("Titulo");
		
		a.setPreferredSize(new Dimension(240,30));
		a.setText("Autor");
		
		i.setPreferredSize(new Dimension(240,30));
		i.setText("ISBN");
		
		ee.setPreferredSize(new Dimension(240,30));
		ee.setText("Editorial");
		
		an.setPreferredSize(new Dimension(240,30));
		an.setText("Año");
		
		p.setPreferredSize(new Dimension(240,30));
		p.setText("Numero de pagina");
		
		
		button1.addActionListener(e->{
		try {
			titulo = t.getText();
			autor = a.getText();
			isbn = i.getText();
			editorial = ee.getText();
			ano = an.getText();
			year = Integer.parseInt(ano);
			pagina = p.getText();
			page = Integer.parseInt(pagina);
			
		}catch(InputMismatchException | NumberFormatException | NullPointerException a) {
			JOptionPane.showMessageDialog(null, "Dato(s) INVALIDO, VUELVA A INTRODUCIR.","Insertar Datos", JOptionPane.WARNING_MESSAGE);
			error = true;
			
			
		}
		if(!error) {
			ej2.meterDatos(titulo, autor, isbn, editorial, year, page);
		}else {
			this.dispose();
		}
			
		});
		
		this.add(t);
		this.add(a);
		this.add(i);
		this.add(ee);
		this.add(an);
		this.add(p);
		
		
		this.setVisible(true);
	}
}
