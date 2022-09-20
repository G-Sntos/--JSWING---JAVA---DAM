import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class jFrame2 extends JFrame{  //class de nuevo frame para el Leer XML via DOM
	String resulta;
	JTextArea texts;
	JButton button1= new JButton();
	
	public jFrame2() {
		this.setLayout(new FlowLayout(FlowLayout.CENTER,10,10)); 
		this.setSize(400, 500);
		this.setTitle("LEER VIA DOM");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		texts = new JTextArea(25,20);
		texts.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(texts); 
		resulta = ej2.leerXML();
		texts.setText(resulta);
		this.add(scrollPane);
		button1.setText("Volver");
		button1.setFocusable(false);
		this.add(button1);
		button1.addActionListener(e->{
			this.dispose();
		});
		this.setVisible(true);
	}
}
