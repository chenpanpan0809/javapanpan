package javaApplet;

public class CirleDemo {
	 public  static void main(String args[])
	  {
	    /**
	      *����Բ�İ뾶 r=12
	      */
	    int r=12;
	    /**
	      *����Բ�����ϲ���
	      *z��Բ��x����
	      *y����Ϊ2 ����̨һ�еĸ�
	      */
	    for(int y=0;y<r;y+=2)
	    {
	     int z=(int)(r-Math.sqrt(2*r*y-y*y));
	     
	     for(int i=0;i<z;i++)
	     {
	      //���ո�
	     System.out.print(" "); 
	     }
	      //���Ǻ�
	     System.out.print("*");
	     /**
	      *����Բ�����ϲ���
	      */    
	     for(int i=z;i<2*r-z;i++)
	     {
	     System.out.print(" "); 
	     }
	     System.out.println("*");
	    }
	     /**
	      *����Բ�����²���
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
	      *����Բ�����²���
	      */     
	     for(int i=z;i<2*r-z;i++)
	     {
	     System.out.print(" "); 
	     }
	     System.out.println("*");
	    }
	  } 
	}

