package com.koreait.pjt.board;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.koreait.pjt.SecurityUtil;
import com.koreait.pjt.db.BoardDAO;
import com.koreait.pjt.vo.BoardDomain;

@WebServlet("/boardLike")
public class BoardLikeListSer extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int i_board = SecurityUtil.getIntParameter(request, "i_board");
		System.out.println("i_board : " + i_board);

		List<BoardDomain> likeList = BoardDAO.selBoardLikeList(i_board);

		Gson gson = new Gson();

		String json = gson.toJson(likeList);

		System.out.println("json : " + json);
		
		response.setCharacterEncoding("UTF-8");
		
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		out.print(json);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

}
