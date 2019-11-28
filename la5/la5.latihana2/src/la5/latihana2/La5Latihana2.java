/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la5.latihana2;
 import java.awt.Frame; 
/**
 *
 * @author Muryy
 */
 public class GraphicPanel extends Panel { 
 
     public GraphicPanel() { 
 
          setBackground(Color.black); 
 
     } 
public class La5Latihana2 {

    /**
     * @param args the command line arguments
     */
     public void paint(Graphics g) { 
 
     g.setColor(new Color(0,255,0)); //green 
 
     g.setFont(new Font("Helvetica",Font.PLAIN,16)); 
 
     g.drawString("Hello GUI World!", 30, 100); 
 
     g.setColor(new Color(1.0f,0,0)); //red 
 
     g.fillRect(30, 100, 150, 10); 
 
     }
    public static void main(String[] args) {
        // TODO code application logic here
          Frame f = new Frame("Testing Graphics Panel"); 
 
     GraphicPanel gp = new GraphicPanel(); 
 
     f.add(gp); 
 
     f.setSize(600, 300); 
 
     f.setVisible(true); 
 

    }
 }
