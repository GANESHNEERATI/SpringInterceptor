package com.telusko.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class OldLoginInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("------------oldloginINterceptor.prehandle");
		System.out.println("request url="+request.getRequestURL());
		System.out.println("Sorry!this url no longer user you will be redirect to /admin/login");
		response.sendRedirect(request.getContextPath()+"admin/login");
		return false;
		//return super.preHandle(request, response, handler);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("oldlogininterceptor.posthandle");
		//super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("oldloginceptor.afterhandler");
		//super.afterCompletion(request, response, handler, ex);
	}
	
	

}
