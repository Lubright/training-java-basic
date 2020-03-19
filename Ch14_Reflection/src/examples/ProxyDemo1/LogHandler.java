package examples.ProxyDemo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.logging.Logger;

public class LogHandler implements InvocationHandler {
	private Logger logger = 
            Logger.getLogger(this.getClass().getName()); 
	private Object delegate;
	

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

}
