package javaApplet;

public class CirleDemo {
	 public  static void main(String args[])
	  {
	    /**
	      *定义圆的半径 r=12
	      */
	    int r=12;
	    /**
	      *画出圆的左上部分
	      *z是圆的x坐标
	      *y步进为2 控制台一行的高
	      */
	    for(int y=0;y<r;y+=2)
	    {
	     int z=(int)(r-Math.sqrt(2*r*y-y*y));
	     
	     for(int i=0;i<z;i++)
	     {
	      //画空格
	     System.out.print(" "); 
	     }
	      //画星号
	     System.out.print("*");
	     /**
	      *画出圆的右上部分
	      */    
	     for(int i=z;i<2*r-z;i++)
	     {
	     System.out.print(" "); 
	     }
	     System.out.println("*");
	    }
	     /**
	      *画出圆的左下部分
	      */ 
	    for(int y=r;y>=0;y-=2)
	    {
	     int z=(int)(r-Math.sqrt(2*r*y-y*y));
	     
	     for(int i=0;i<z;i++)
	     {
	     System.out.print(" "); 
	     }
	     System.out.print("*");
	     /**
	      *画出圆的右下部分
	      */     
	     for(int i=z;i<2*r-z;i++)
	     {
	     System.out.print(" "); 
	     }
	     System.out.println("*");
	    }
	  } 
	}

