package com.koreait.matzip.user;

import com.koreait.matzip.SecurityUtils;
import com.koreait.matzip.db.UserDAO;
import com.koreait.matzip.vo.UserVO;

public class UserService // 로직담당
{
	private UserDAO dao;
	
	public UserService()
	{
		dao = new UserDAO();
	}
	
	public int join(UserVO param)
	{
		String pw = param.getUser_pw();
		String salt = SecurityUtils.generateSalt(); // 솔트값 만들기
		String encryptPw = SecurityUtils.getEncrypt(pw, salt); // 솔트값을 이용하여 암호화
		
		param.setUser_pw(encryptPw); // 암호화된 패스워드
		param.setSalt(salt); // 만들어진 솔트값
		
		return dao.Join(param);
	}
	
	public int login(UserVO param) // 1 : 로그인 성공, 2 : 아이디 없음, 3 : 비밀번호 없음
	{
		int result = 0;
		
		UserVO dbResult = dao.selUser(param);

		String user_id = param.getUser_id();
		String user_pw = param.getUser_pw();

		if(dbResult.getI_user() == 0)
		{
			result = 2;
		}
		else
		{
			String salt = dbResult.getSalt();
			String encryptPw = SecurityUtils.getEncrypt(param.getUser_pw(), salt);
			
			if(encryptPw.contentEquals(dbResult.getUser_pw()))
			{
				result = 1;
			}
			else
			{
				result = 3;
			}
		}
		
		return result;
	}
}
