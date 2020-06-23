package calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class jisuanqi implements ActionListener
{       Font font= new Font("宋体",Font.BOLD,18);//添加字体font
        Font font1= new Font("宋体",Font.BOLD,30);//添加字体font1
		JFrame f =new JFrame("计算器");//添加窗口组件
		JButton b0=new JButton("0");
		JButton b1=new JButton("1");
		JButton b2=new JButton("2");
		JButton b3=new JButton("3");
		JButton b4=new JButton("4");
		JButton b5=new JButton("5");
		JButton b6=new JButton("6");
		JButton b7=new JButton("7");
		JButton b8=new JButton("8");
		JButton b9=new JButton("9");
		JButton b10=new JButton("+");
		JButton b11=new JButton("-");
		JButton b12=new JButton("×");
		JButton b13=new JButton("÷");
		JButton b14=new JButton("^");
		JButton b15=new JButton("=");
		JButton b16=new JButton("CE");
		JButton b17=new JButton(".");
		JButton b18=new JButton("log");
		JButton b19=new JButton("π");//添加20个按钮组件
		JTextField t = new JTextField(16);//添加文本框组件
		JMenuBar b=new JMenuBar();//添加菜单栏组件
		JMenu m=new JMenu("菜单");//添加菜单组件
		JLabel m1=new JLabel("后退");//添加标签组件
		JMenuItem item=new JMenuItem("说明");//添加菜单项组建item
		JMenuItem item1=new JMenuItem("退出");//添加菜单项组建item2
	    JPanel p1=new JPanel();//添加面板组件p1
	    JPanel p2=new JPanel();//添加面板组件p2
		double num1,num2,result;//成员变量保存运算数据及结果
		int i;  // 判断运算操作符
		int j=0;  //判断数字是否为运算结果
		int times=0;//统计.的使用次数
   
	public jisuanqi() //构造函数
    { 
			  f.setResizable(false);//设置窗体大小不可改变
			  b0.addActionListener(this);
		      b1.addActionListener(this);      
		      b2.addActionListener(this);
		      b3.addActionListener(this);
		      b4.addActionListener(this);      
		      b5.addActionListener(this);
		      b6.addActionListener(this);
		      b7.addActionListener(this);
		      b8.addActionListener(this);
		      b9.addActionListener(this);
		      b10.addActionListener(this);
		      b11.addActionListener(this);
		      b12.addActionListener(this);
		      b13.addActionListener(this);
		      b14.addActionListener(this);
		      b15.addActionListener(this);
		      b16.addActionListener(this);
		      b17.addActionListener(this);
		      b18.addActionListener(this);
		      b19.addActionListener(this);
		      item.addActionListener(this);
		      item1.addActionListener(this);//给20个按钮及2个菜单项注册行动事件监听器
		      f.addWindowListener(new monitor());//给窗体f注册窗口事件监听器
		      p1.setLayout(new GridLayout(5,4,10,10));//面板p1网格布局
		      p1.add(b16);p1.add(b14);p1.add(b13);p1.add(b12);
		      p1.add(b7); p1.add(b8);p1.add(b9); p1.add(b11);
		      p1.add(b4); p1.add(b5);p1.add(b6); p1.add(b10);
		      p1.add(b1); p1.add(b2);p1.add(b3); p1.add(b15);
		      p1.add(b18);p1.add(b0);p1.add(b17);p1.add(b19);//将20个按钮添加到面板p1中
		      p2.add(t);b.add(m);b.add(m1);m.add(item);m.add(item1);
		      /*将文本框添加到面板p2中，菜单添加到菜单栏中，菜单项添加到菜单中，将标签添加到菜单栏中*/
		      b0.setBackground(new Color(255,250,205));
		      b0.setFont(font);
		      b1.setBackground(new Color(255,250,205));
		      b1.setFont(font);
		      b2.setBackground(new Color(255,250,205));
		      b2.setFont(font);
		      b3.setBackground(new Color(255,250,205));
		      b3.setFont(font);
		      b4.setBackground(new Color(255,250,205));
		      b4.setFont(font);
		      b5.setBackground(new Color(255,250,205));
		      b5.setFont(font);
		      b6.setBackground(new Color(255,250,205));
		      b6.setFont(font);
		      b7.setBackground(new Color(255,250,205));
		      b7.setFont(font);
		      b8.setBackground(new Color(255,250,205));
		      b8.setFont(font);
		      b9.setBackground(new Color(255,250,205));
		      b9.setFont(font);
		      b10.setBackground(new Color(238,232,170));
		      b10.setFont(font);
		      b11.setBackground(new Color(238,232,170));
		      b11.setFont(font);
		      b12.setBackground(new Color(238,232,170));
		      b12.setFont(font);
		      b13.setBackground(new Color(238,232,170));
		      b13.setFont(font);
		      b14.setBackground(new Color(238,232,170));
		      b14.setFont(font);
		      b15.setBackground(new Color(255,255,120));
		      b15.setFont(font);
		      b16.setBackground(new Color(160,82,45));
		      b16.setFont(font);
		      b17.setBackground(new Color(255,250,205));
		      b17.setFont(font);
		      b18.setBackground(new Color(238,232,170));
		      b18.setFont(font);
		      b19.setBackground(new Color(255,250,205));
		      b19.setFont(font);//设置按钮颜色
		      m1.addMouseListener(new MouseListener(){
					public void mouseClicked(MouseEvent e) {
						    String s=t.getText();
						    int j=s.length();
						    if(j>=1)
						    {String s1=s.substring(0,j-1);
						     t.setText(s1);}					    
					}
					public void mouseEntered(MouseEvent e) {
						// 处理鼠标移入
					}
					public void mouseExited(MouseEvent e) {
						// 处理鼠标离开
					}
					public void mousePressed(MouseEvent e) {
						// 处理鼠标按下
					}
					public void mouseReleased(MouseEvent e) {
						// 处理鼠标释放
					}
				});//标签m1注册鼠标事件监听器并实现鼠标实现鼠标事件接口
	
		      f.add(p2,"North"); //面板p2使用边界布局    
		      f.add(p1,"Center"); //面板p1使用边界布局    
		      f.setLocation(1000, 200);//窗体f初始坐标  
		      f.setSize(300, 500);//窗体f初始大小
		      f.setJMenuBar(b);//将菜单栏添加到窗体中
		      f.setVisible(true);//窗体f可见
		      t.setFont(font1);//文本框运用字体font1
		      t.setBackground(new Color(240,240,200));//设置文本框背景颜色
		      t.setHorizontalAlignment(JTextField.RIGHT);//设置文本框右对齐
		      t.setEditable(false);//设置文本框不可修改
		    }

	public void actionPerformed(ActionEvent e)//实现动作事件接口
	{  	
		if(e.getActionCommand().equals("0"))
		    {	if(j==0)//判断文本框字符串是否为结果
		          { String a=t.getText();
		          t.setText(a+"0");  }//不是结果，继续相连输入
		       else
		    	  {t.setText("0");
		          j=0;}//是最终结果，重置数字为零，可继续添加数字，并将j重置为零
		    }
		
		if(e.getActionCommand().equals("1"))
		    {   if(j==0)   
		        {String a=t.getText();
		    	  t.setText(a+"1"); }
		        else
		    	  {t.setText("1");
		    	  j=0;}
		    }  
		
		if(e.getActionCommand().equals("2"))
		    {   if(j==0)
		      {String a=t.getText();
	    	  t.setText(a+"2"); }
		        else
		    	  {t.setText("2");
		    	  j=0;}
		    }
		
		if(e.getActionCommand().equals("3"))
	        {   if(j==0) 
			 {String a=t.getText();
	    	  t.setText(a+"3"); }
	            else
		    	  {t.setText("3");
		    	  j=0;}
	        }
		
		if(e.getActionCommand().equals("4"))
	        {   if(j==0)
			 {String a=t.getText();
	    	  t.setText(a+"4"); }
	            else
	            {t.setText("4");
		    	  j=0;}
	        }
		
		if(e.getActionCommand().equals("5"))
		    {   if(j==0)
		      {String a=t.getText();
   	          t.setText(a+"5"); }
		        else
		        {t.setText("5");
		    	  j=0;}
            }
		if(e.getActionCommand().equals("6"))
		    {   if(j==0)
		     {String a=t.getText();
   	          t.setText(a+"6"); }
		        else
		        {t.setText("6");
		    	  j=0;}
            }
		if(e.getActionCommand().equals("7"))
		    {   if(j==0)
		     {String a=t.getText();
   	          t.setText(a+"7"); }
		        else
		        {t.setText("7");
		    	  j=0;}
            }
		
		if(e.getActionCommand().equals("8"))
		    {   if(j==0)
		     {String a=t.getText();
   	         t.setText(a+"8"); }
		        else
		        {t.setText("8");
		    	  j=0;}
            }
		
		if(e.getActionCommand().equals("9"))
		    {   if(j==0)
		     {String a=t.getText();
   	          t.setText(a+"9"); }
		        else
		        {t.setText("9");
		    	  j=0;}
            }
		
		if(e.getActionCommand().equals("π"))
	        { t.setText("3.141592654"); 
	          j=1;}//设置π的值，不允许π后加数字
		
		if(e.getActionCommand().equals("."))
	    { if(j==0)//不是结果
		   {
	       String a=t.getText();
	       times++;//.个数加1
	       if(times==1)
	       {  if(a.length()==0)//开始输入“.”显示为“0.”
	 	    	  {t.setText("0.");}
	    	  else if(a.length()==1&&a.charAt(0)=='-')//开始输入“-.”显示为“-0.”
	    	      {t.setText("-0.");}
	    	  else
	    	  {t.setText(a+".");}//不是结果且只有一个‘.’
	       }
		   }
	    else
	    	{t.setText("0.");
	         j=0;}//是结果后输入‘.’显示为“0.”
	    }
		
		if(e.getActionCommand().equals("CE"))
	    {   j=0;
			times=0;
			t.setText(""); }//清除文本框并初始化j,times,表示当前不是结果且无小数点
				
		if(e.getActionCommand().equals("+"))
		{ j=0;
		  times=0;
          String a=t.getText();
          if(a.length()!=0)
          {num1=Double.parseDouble(a);
    	  t.setText(""); 
    	  i=1;}//'+'是运算符，i=1表示加运算
          else
          t.setText("+");  //'+'是正号
          }
		
		if(e.getActionCommand().equals("-"))
	    {     j=0;
			  times=0;
	          String a=t.getText();
	          if(a.length()!=0)
	          {num1=Double.parseDouble(a);
	    	  t.setText(""); 
	    	  i=2;}//'+'是运算符，i=2表示减运算
	          else
	          t.setText("-");  //'-'是负号
	          }
		
		if(e.getActionCommand().equals("×"))
	    {     j=0;
			  times=0;
	          String a=t.getText();
	          num1=Float.parseFloat(a);
	    	  t.setText(""); 
	          i=3;}
		
		if(e.getActionCommand().equals("÷"))
	    {     j=0;
			  times=0;
	          String a=t.getText();
	          num1=Float.parseFloat(a);
	    	  t.setText(""); 
	          i=4;}
		
		if(e.getActionCommand().equals("^"))
	    {     j=0;
			  times=0;
	          String a=t.getText();
	          num1=Double.parseDouble(a);
	    	  t.setText(""); 
	          i=5;}
		if(e.getActionCommand().equals("log"))
	    {     j=0;
			  times=0;
	          String a=t.getText();
	          num1=Double.parseDouble(a);
	    	  t.setText(""); 
	          i=6;}
		
		if(e.getActionCommand().equals("="))
		    {j=1;
			 String a=t.getText();
		     num2=Double.parseDouble(a);
		    if(i==1)
		     {result=num1+num2;
		      String r=Double.toString(result);
		      t.setText(r);}
		    if(i==2)
		     {result=num1-num2;
		     String r=Double.toString(result);
		     t.setText(r);}
		    if(i==3)
			{result=num1*num2;
			String r=Double.toString(result);
		    t.setText(r);}
		    if(i==4)
			   if(num2!=0)
			    {result=num1/num2;
		         String r=String.format("%15.7f",result);//保留十五位有效数字，七位小数
		         t.setText(r);}
			   else
			    {t.setText("除数不能为零！");}
		    if(i==5)
			    if(num1==0&&num2==0)
			        {t.setText("0的0次方无意义！");}
			    else
			       {result=Math.pow(num1, num2);
		            String r=String.format("%15.7f",result);;
		            t.setText(r);}
		    if(i==6)
		    	if(num1>0&&num1!=1&&num2>0)
		    		{result=Math.log10(num2)/Math.log10(num1);//换底公式计算对数
		            String r=String.format("%15.7f",result);;
		            t.setText(r);} 
		    	else
		    		{t.setText("对数算式无意义！");}
		  i=0;  
		    }
		
		if(e.getActionCommand().equals("说明"))
	    {new caidanxiang();}  //通过caidanxiang类新建窗口
		

		if(e.getActionCommand().equals("退出"))
	    {System.exit(0);}//退出窗体
    
	} 
 		
		public static void main(String args[])
		{
		 new jisuanqi();//通过jisuanqi类显示窗体
	    }
}

class monitor extends WindowAdapter
{ public void windowClosing(WindowEvent e)
     {System.exit(0);}
}//关闭窗体

class caidanxiang{            
	JFrame f1=new JFrame("园林计算器");
	JTextArea a1=new JTextArea(2,16);//文本域为给出说明信息
	caidanxiang()//构造函数
	{
		f1.setLocation(900,300);
		f1.setSize(300,500);
		f1.setBackground(Color.gray);
		f1.add(a1);
		f1.setResizable(false);
		f1.setVisible(true);
		a1.setText("\n\n  欢迎使用园林计算器，初次制\n作，程序粗糙，请多多见谅!\n\n\n时间：2017.12.20\n\n制作人：信计1502左园林");
		a1.setEditable(false);
		a1.setFont(new Font("宋体",Font.BOLD,20));
		a1.setBackground(new Color(238,232,170));
	}
	
}//菜单项中的说明所写的类
