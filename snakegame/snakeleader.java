import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class FDemo extends JFrame
{  
       JPDemo jp1;
	FDemo()
	{ 
	 super.setTitle("snake & Leader");
		jp1=new JPDemo();
		add(jp1);
		
	}
}
class JPDemo extends JPanel implements ActionListener
{
	ImageIcon img1,img2,img3,img4;
	ImageIcon img5,img6,img7;
	ImageIcon img8,img9;
	ImageIcon img10,img11;
	
	
   Image swt,board,s21,start2;
   Image player1,player2;
   Image player11,player12;
   Image dice,dice1;
   
   JButton b1,b2,b3,b4;
   
   JTextField tx1,tx2,tx3;
   
   int px1=40;
   int py2=620;
   
   int p1=120;
   int p2=620;
	JPDemo()
	{
		setBackground(Color.black);
		
		img1=new ImageIcon("swt.jpg");
		img2=new ImageIcon("board.jpg");
		img3=new ImageIcon("s21.jpg");
		img4=new ImageIcon("start2.jpg");
		img5=new ImageIcon("about.jpg");
		img6=new ImageIcon("reset.jpg");
		img7=new ImageIcon("start1.jpg");
		img8=new ImageIcon("player1.jpg");
		img9=new ImageIcon("player2.jpg");
		
		img10=new ImageIcon("dice.jpg");
		img11=new ImageIcon("dice1.jpg");
		
		swt=img1.getImage();
		board=img2.getImage();
		s21=img3.getImage();
		start2=img4.getImage();
		
		player1=img8.getImage();
		player2=img9.getImage();
		
		player11=img8.getImage();
		player12=img9.getImage();
				
		dice=img10.getImage();
		dice1=img11.getImage();
		
		
		setLayout(null);
		b1=new JButton(img5);
		b1.setBounds(50,120,100,30);
		add(b1);

		b2=new JButton(img6);
		b2.setBounds(50,180,100,30);
		add(b2);
		
		Font f=new Font("Bauhaus 93",Font.ITALIC,20);
		
		b3=new JButton("Roll");
		b3.setBounds(50,500,100,30);
		add(b3);
		b3.setFont(f);
		b3.setForeground(Color.red);
		b3.addActionListener(this);
		
		b4=new JButton(img7);
		b4.setBounds(20,560,150,60);
		add(b4);
		b4.setFont(f);
		b4.setForeground(Color.red);

		tx1=new JTextField("Start Game");
		tx1.setBounds(50,230,150,35);
		add(tx1);
		tx1.setBackground(Color.black);
		tx1.setForeground(Color.green);
		tx1.setFont(f);
		
		tx2=new JTextField("Player 1 Name");
		tx2.setBounds(50,290,150,35);
		add(tx2);
		tx2.setBackground(Color.black);
		tx2.setForeground(Color.green);
		tx2.setFont(f);
		
		tx3=new JTextField("Player 2 Name");
		tx3.setBounds(50,375,150,35);
		add(tx3);
		tx3.setBackground(Color.black);
		tx3.setForeground(Color.green);
		tx3.setFont(f);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(new Color(4,129,255));
		g.fillRect(0,0,200,735);
		
		g.drawImage(swt,0,0,this);
		g.drawImage(board,200,0,this);
		g.drawImage(s21,920,25,this);
		g.drawImage(start2,20,550,this);
		
		g.drawImage(player1,px1,py2,this);
		g.drawImage(player2,p1,p2,this);
		
		g.drawImage(player11,10,280,this);
		g.drawImage(player12,10,360,this);
		
		g.drawImage(dice,10,420,this);
		g.drawImage(dice1,110,420,this);
	}
	
	int count=0;
	int count11=0;
	int q=2;
	public void actionPerformed(ActionEvent e)
	{
if(e.getSource()==b3){
      int random=(int)Math.round((Math.random()*5)+1);
      
	  // px1=140;
	  // py2=645;
	  
      switch(random){
        case 1:
        img11=new ImageIcon("dice1.jpg");
        break;
        case 2:
        img11=new ImageIcon("dice2.jpg");
        break;
        case 3:
        img11=new ImageIcon("dice3.jpg");
        break;
        case 4:
        img11=new ImageIcon("dice4.jpg");
        break;
        case 5:
        img11=new ImageIcon("dice5.jpg");
        break;
        case 6:
        img11=new ImageIcon("dice6.jpg");
        break;
      }		
	  if(q%2==0)
	  {
	  px1=210;
	  py2=645;
	  int k=1;
	  int count1=0;
	  count=count+random;
	  
	  M:
	  for(int i=1;i<=10;i++)
	  {
		  if(k==11)
		  {
			  px1-=70;
			  k--;
		  }
		  if(k==0)
		  {
			  px1+=70;
			  k++;
		  }
	  
	  for(int j=1;j<=10;j++)
	  {
		  count1++;
		  try
		  {
			  Thread.sleep(100);
		
		}
		  catch(Exception s){}
		  if(count1==count)break M;
		  if(i%2==1)
		  {
			  px1+=70;
			  k++;
		  }
		  else
		  {
			  px1-=70;
			  k--;
		  }
	  }
	  py2-=70;
	  }
	  }
	  else
	  {
	  p1=210;
	  p2=645;
	  int k1=1;
	  int count21=0;
	  count11=count11+random;
	  
	  M:
	  for(int i1=1;i1<=10;i1++)
	  {
		  if(k1==11)
		  {
			  p1-=70;
			  k1--;
		  }
		  if(k1==0)
		  {
			  p1+=70;
			  k1++;
		  }
	  
	  for(int j1=1;j1<=10;j1++)
	  {
		  count21++;
		  try
		  {
			  Thread.sleep(1000);
		  }
		  catch(Exception s){}
		  if(count21==count11)break M;
		  if(i1%2==1)
		  {
			  p1+=70;
			  k1++;
		  }
		  else
		  {
			  p1-=70;
			  k1--;
		  }
	  }
	  p2-=70;
	  }
	  }
			dice1=img11.getImage();
			q++;
		     repaint();
		     System.out.println(random);
}
	}
}
class Demo
{
public static void main(String ar[])
{
	FDemo f=new FDemo();
	f.setVisible(true);
	f.setBounds(100,80,990,750);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
}
}