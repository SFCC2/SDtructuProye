package video.Appvideo;

import Vistas.tool;
import Vistas.tool;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
public class Controlador implements ActionListener {
    tool marco;
    public Controlador(tool marco)  {
        this.marco = marco;
        this.marco.setVisible(true);
        this.marco.Pause.addActionListener(this);
        this.marco.play.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(this.marco.Pause)){
             
        }
        if(e.getSource().equals(this.marco.play)){
            
        }           
    }   
}