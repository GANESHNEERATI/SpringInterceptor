package com.telusko.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LogInterceptor extends HandlerInterceptorAdapter 
{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
	long	StartTime=System.currentTimeMillis();
		// TODO Auto-generated method stub
		System.out.println("--------------LogInterceptor.prehandler");
		System.out.println("Request url="+request.getRequestURL());
		System.out.println("start time="+System.currentTimeMillis());
	request.setAttribute("StartTime", StartTime);
 return true;
		
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("------------------Loginterceptor.posthandle");
		System.out.println("request url="+request.getRequestURL());
		//super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("---------------------Loginceptor.afterCompletion");
		long StartTime=(Long)request.getAttribute("StartTime");
		long endTime=System.currentTimeMillis();
		System.out.println("request url="+request.getRequestURL());
		System.out.println("endtime="+endTime);
		System.out.println("time taken="+(StartTime-endTime));
		
		//super.afterCompletion(request, response, handler, ex);
	}
	
	

}
