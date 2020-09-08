package com.koreait.matzip;

import javax.servlet.http.HttpServletRequest;

import com.koreait.matzip.user.UserController;

public class HandlerMapper 
{
	private UserController user;
	
	public HandlerMapper()
	{
		user = new UserController();
	}
	
	public String nav(HttpServletRequest request)
	{
		String[] uriArr = request.getRequestURI().split("/");
		
		if(uriArr.length < 3)
		{
			return "405";
		}
		
		if("ajax".equals(uriArr[1]))
		{
			return "ajax";
		}
		
		switch(uriArr[1]) // 컨트롤러가
		{
			case ViewRef.URI_USER: // user일때
				
			switch(uriArr[2]) // 메소드가
			{
				case "login" : return user.login(request); // login이면 user.login(request)를 리턴
				case "join" : return user.join(request);
				case "joinProc" : return user.joinProc(request);
				case "loginProc" : return user.loginProc(request);
				case "ajaxIdCheck" : return user.ajaxIdCheck(request);
			}
		}
		return "404";
	}
}
