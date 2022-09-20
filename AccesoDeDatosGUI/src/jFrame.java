import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class jFrame extends JFrame{ // jFrame main para el menu
	
	
	JButton button1= new JButton();
	JButton button2= new JButton();
	JButton button3= new JButton();
	JButton button4= new JButton();
	JButton button5= new JButton();
	JButton button6= new JButton();
	JButton button8= new JButton();
	JTextPane a  = new JTextPane();
	
	boolean on = true;
	
	
	public boolean isOn() {
		return on;
	}


	public void setOn(boolean on) {
		this.on = on;
	}


	public jFrame() {
		
		this.setEnabled(isOn());
		this.setLayout(new FlowLayout(FlowLayout.CENTER,10,10)); 
		this.setSize(300, 350);
		this.setTitle("GUI ACCESO DE DATOS");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		button1.setText("Insertar libro");
		button2.setText("Actualizar - Crear un XML NUEVO.");
		button3.setText("Generar XML con XSTREAM");
		button4.setText("Visualizar via DOM");
		button5.setText("Visualizar via SAX");
		button6.setText("Generar HTML con SXL");
		button8.setText("Salir");
		
		button1.setFocusable(false);
		button2.setFocusable(false);//para quitar el "border" del texto.
		button3.setFocusable(false);
		button4.setFocusable(false);
		button5.setFocusable(false);
		button6.setFocusable(false);
		button8.setFocusable(false);

		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(button6);
		this.add(button8);
		
		
		
		button1.addActionListener(e->{
			insertarLibro xxx = new insertarLibro();
		}); //Lamda expression que aprendi en youtube.
		button2.addActionListener(e->{
			ej2.crearFicheroXML();
			JOptionPane.showMessageDialog(null, "FICHERO CREADO!.","GUI ACCESO DE DATOS", JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, "SI EXISTE UNO HA SIDO REEMPLAZADO.","GUI ACCESO DE DATOS", JOptionPane.WARNING_MESSAGE);
		});
		button3.addActionListener(e->{
			ej2.crearXMLXstream();
			JOptionPane.showMessageDialog(null, "Fichero Creado! via Xstream!.","GUI ACCESO DE DATOS", JOptionPane.INFORMATION_MESSAGE);
			
		});
		button4.addActionListener(e->{
			jFrame2 xxx = new jFrame2();
			
		});
		button5.addActionListener(e->{
			jFrame3 xxx = new jFrame3();
			
		});
		button6.addActionListener(e->{
			ej2.generarHTML();
		});
		button8.addActionListener(e->System.exit(0));
		
		this.setVisible(true);
	}


	
	
}
