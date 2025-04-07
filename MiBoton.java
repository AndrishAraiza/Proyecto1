import javax.swing.*;
import java.awt.event.*;

public class MiBoton extends JButton implements ActionListener{

   private int status;

 public MiBoton(String text, int status){

	this.setText(text);
	this.status = status;
}
    public void actionPerformed(ActionEvent e) {
        
	switch(status){
	case 1: System.out.println("CLICK PERRO");
	break;
	case 2: System.out.println("CLICk mas perro");
        break;
    }


}
}
