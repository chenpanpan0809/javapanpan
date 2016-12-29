package listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class RequestDemo
 *
 */
@WebListener
public class RequestDemo implements ServletRequestListener, ServletRequestAttributeListener {
 
    /**
     * Default constructor. 
     */
    public RequestDemo() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("销毁"+arg0.getServletRequest().getRemoteAddr()
    			+arg0.getServletContext().getContextPath());
    }

	/**
     * @see ServletRequestAttributeListener#attributeRemoved(ServletRequestAttributeEvent)
     */
    public void attributeRemoved(ServletRequestAttributeEvent arg0)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("初始化"+arg0.getServletRequest().getRemoteAddr()
    			+arg0.getServletContext().getContextPath());
    }

	/**
     * @see ServletRequestAttributeListener#attributeAdded(ServletRequestAttributeEvent)
     */
    public void attributeAdded(ServletRequestAttributeEvent arg0)  { 
         // TODO Auto-generated method stub
    	
    	System.out.println("增加属性:属性名称："+arg0.getServletRequest().getAttribute(arg0.getName())+arg0.getName());
 
    }

	/**
     * @see ServletRequestAttributeListener#attributeReplaced(ServletRequestAttributeEvent)
     */
    public void attributeReplaced(ServletRequestAttributeEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("替换:属性名称："+arg0.getName()+"属性值："+arg0.getValue());
    }
	
}
