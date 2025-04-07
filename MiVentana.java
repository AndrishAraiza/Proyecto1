import javax.swing.*;
import java.awt.event.*;

public class MiVentana {

     String url;
     ImageIcon imagen1;

 public void showVentana(){
  
  JFrame ventana = new JFrame();

  JLabel texto1 = new JLabel("Hola xD!");
  JTextField cuadroTxt = new JTextField();
  JButton boton1 = new JButton("Click ME!");
  JButton boton2 = new JButton("Pinchame");
  MiBoton boton3 = new MiBoton("Pinchame mas", 1);
  MiBoton boton4 = new MiBoton("Pinchame mas mas", 2);
  JRadioButton rbtn1 = new JRadioButton("Opcion 1", true);
  rbtn1.setActionCommand("1");
  JRadioButton rbtn2 = new JRadioButton("Opcion 2", false);
  rbtn2.setActionCommand("2");

  ButtonGroup grupo1 = new ButtonGroup();
  grupo1.add(rbtn1);
  grupo1.add(rbtn2);

  url = "images/unison.png";
  imagen1 = new ImageIcon(this.getClass().getResource(url));

  JLabel txtImagen = new JLabel();
  txtImagen.setIcon(imagen1);

  //setBounds(posx, posy, ancho, largo);
  texto1.setBounds(10, 10, 100, 25);
  cuadroTxt.setBounds(10, 50, 100, 25);
  boton1.setBounds(10, 80, 110, 25);  
  boton2.setBounds(10, 110, 110, 25);
  boton3.setBounds(10, 140, 110, 50);
  boton4.setBounds(10, 190, 140, 50);
  rbtn1.setBounds(10,240,100,25);
  rbtn2.setBounds(10,290,100,25);
  txtImagen.setBounds(150,10,200,200);
  ActionListener listener = new ActionListener() {

  public void actionPerformed(ActionEvent e)  {
   
	if (e.getSource() == rbtn1)  {System.out.println("Click en rbtn1");
        url = "images/unison.png";
        imagen1 = new ImageIcon(this.getClass().getResource(url));
        txtImagen.setIcon(imagen1);
          }else if (e.getSource() == rbtn2) { System.out.println("Click en rbtn2");
            url = "images/amlo.png";
            imagen1 = new ImageIcon(this.getClass().getResource(url));
              txtImagen.setIcon(imagen1);
}
}
};

  boton1.addActionListener(listener);
  boton2.addActionListener(listener);
  boton3.addActionListener(boton3);
  boton4.addActionListener(boton4);
  rbtn1.addActionListener(listener);
  rbtn2.addActionListener(listener);

  ventana.add(texto1);
  ventana.add(cuadroTxt);
  ventana.add(boton1);
  ventana.add(boton2);
  ventana.add(boton3);
  ventana.add(boton4);
  ventana.add(rbtn1);
  ventana.add(rbtn2);
  ventana.add(txtImagen);

  ventana.setTitle("Mi ventana #1");
  ventana.setSize(400,400);
  ventana.setResizable(false);
  ventana.setLayout(null);
  ventana.setLocationRelativeTo(null); 
  ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
  ventana.setVisible(true);  



}


}
