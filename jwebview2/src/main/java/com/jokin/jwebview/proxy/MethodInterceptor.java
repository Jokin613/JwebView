package com.jokin.jwebview.proxy;

public interface MethodInterceptor {
	
	public Object intercept(Object object, Object[] args, MethodProxy methodProxy)
			throws Exception;

}
