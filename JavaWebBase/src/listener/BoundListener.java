package listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * Application Lifecycle Listener implementation class BoundListener
 *
 */
/*@WebListener*/ //绑定时不要配置注解的情况
public class BoundListener implements HttpSessionBindingListener {
 private String name;
    /**
     * Default constructor. 
     */
    public BoundListener() {
        // TODO Auto-generated constructor stub
    	
    }

	@Override
	public String toString() {
		return "BoundListener [name=" + name + "]";
	}

	public BoundListener(String name) {
		super();
		this.name = name;
	}

	/**
     * @see HttpSessionBindingListener#valueBound(HttpSessionBindingEvent)
     */
    public void valueBound(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("绑定属性:属性名"+arg0.getName()+"属性值:"+arg0.getValue());
    }

	/**
     * @see HttpSessionBindingListener#valueUnbound(HttpSessionBindingEvent)
     */
    public void valueUnbound(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    }
	
}
