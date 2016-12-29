package listener;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ListenerDemo
 *
 */
@WebListener
public class ListenerDemo implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ListenerDemo() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("监听器销毁中");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("监听器初始化中:"+new Date());
    /*	File file = new File("d:\\demo\\Lis\\lis.txt");
		File parentpath = file.getParentFile();
		if (!parentpath.exists()) {
			System.out.println("创建父目录:"+parentpath.mkdirs());
		}
		if (!file.exists()) {
			try {
				System.out.println("创建exam.txt文件："+file.createNewFile());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		*/
		
    }
	
}
