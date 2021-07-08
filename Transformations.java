
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;



import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JFrame;  
import javax.swing.JPanel;  

public class Transformations extends Frame implements ActionListener {
	


// Initialize coordinates of the triangle 
int[] x = {500,700,600};
int[] y = {300,300,100};




public static void main(String[] args) {
	

	  Transformations t=new Transformations();
	  t.setSize(800, 800);
	  t.setTitle("Transformation");
	  t.setVisible(true);
	 
	  
	  
	  
// Set Frame size to 800x800)
// Set background color
// Set visibility

}
public Transformations() {
	TransDesign design=new TransDesign();
	
	MenuBar bar=new MenuBar();
    Menu menu=new Menu("Initial point");
    MenuItem item1=new MenuItem("DEfault");
    menu.add(item1);
    bar.add(menu);
    setMenuBar(bar);
    item1.addActionListener(new ActionListener(){
  	   public void actionPerformed(ActionEvent event) {
  		  System.out.println(">>>>>>>>");
          design.initialPosition();
 	   }
});
    
    Panel p1=new Panel();
    p1.setLayout(new GridBagLayout());        
       
    p1.setLayout(new java.awt.GridBagLayout());
    //Adding left button the screen
    Button TranslateRight =new Button("Translate Right");
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    p1.add(TranslateRight, gridBagConstraints);
    // Adding Right button on the screen
    Button TranslateLeft=new Button("Translate Left");
    gridBagConstraints = new GridBagConstraints();
   
    p1.add(TranslateLeft, gridBagConstraints);
    Button TranslateDown =new Button("Translate Down");
    gridBagConstraints = new GridBagConstraints();
    p1.add(TranslateDown, gridBagConstraints);
    
    Button TranslateUp =new Button("Translate Up");
    gridBagConstraints = new GridBagConstraints();
    p1.add(TranslateUp, gridBagConstraints);
    
    Button ReflectX =new Button("Reflect X");
    gridBagConstraints = new GridBagConstraints();
    p1.add(ReflectX, gridBagConstraints);
    
    
    addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {System.exit(0);}
    });


    
    add(p1,BorderLayout.PAGE_START);
    
    ReflectX.addActionListener(new ActionListener(){
  	   public void actionPerformed(ActionEvent event) {
  		   design.ReflectX();
  	   }
  });
    

   
    TranslateDown.addActionListener(new ActionListener(){
 	   public void actionPerformed(ActionEvent event) {
 		   design.down();
 	   }
 });
    TranslateUp.addActionListener(new ActionListener(){
  	   public void actionPerformed(ActionEvent event) {
  		   design.up();
  	   }
  });
    TranslateRight.addActionListener(new ActionListener(){
    	   public void actionPerformed(ActionEvent event) {
    		   design.left();
    	   }
    });
    
    TranslateLeft.addActionListener(new ActionListener(){
 	   public void actionPerformed(ActionEvent event) {
		   design.right();
	   }
});
    this.add(design,BorderLayout.CENTER);
     

    
    

}
public void paintComponent(Graphics2D g)
{
	super.paint(g);  
	  Graphics2D g2d = (Graphics2D) g;  
    
     int width= this.getWidth();
	  int height=this.getHeight();
	
	 
     
} 
// Draw 2 lines and paint 1 filledtriangle

public void paint(Graphics g) {
	
    g.drawLine(800, 400, 0, 400);
    g.drawLine(400, 800, 400, 0);
    g.fillPolygon(new int[] {500,700,600}, new int[] {300,300,100},3);
    
    
   
	
}



public void windowClosing(WindowEvent arg0) {
    int res=JOptionPane.showConfirmDialog(this, "Are You Sure", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
if(res==JOptionPane.YES_OPTION){
    System.exit(0);
}     
}






class TransDesign extends JPanel {
    private int Xcord = 0;
    private int Ycord =0;
    private Dimension size = new Dimension(800,800);

     public void initialPosition(){
         Xcord=0;
         Ycord=0;
         repaint();
     }

    public void left() {
        Xcord-=15;
        repaint();
        
    }

    public void right() {
        Xcord+=15;
        repaint();
    }
    public void up() {
        Ycord-=15;
        repaint();
    }

    public void down() {
        Ycord+=15;
        repaint();
    }
    
    public void ReflectX() {
       Ycord=-(400-getHeight());
        repaint();
    }
    
    
    /** Suggest a size to the layout manager. */
    @Override
    public Dimension getPreferredSize() {
        return size;
    }
    
    protected void paintComponent(Graphics aTriangle) {
        super.paintComponent(aTriangle);
        // This will center the ball if it is the first time painted
        // OR if the x or y co-ord goes off the left/top edge.
        // Further logic left to user..
        if (Xcord<0 || Ycord<0) {
            Xcord = getWidth()/2;
            Ycord = getHeight()/2;
        }
        aTriangle.drawLine(800, 400, 0, 400);
        aTriangle.drawLine(400, 800, 400, 0);
        aTriangle.fillPolygon(new int[] {500-Xcord,700-Xcord,600-Xcord}, new int[] {300+Ycord,300+Ycord,100+Ycord},3);
    
         
    }







}






@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}




}






