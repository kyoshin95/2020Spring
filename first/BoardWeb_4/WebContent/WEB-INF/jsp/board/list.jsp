<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ page import="com.koreait.pjt.db.BoardDAO" %>
<%@ page import="com.koreait.pjt.vo.BoardVO" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트</title>
<style>
	* { margin: 0px; padding: 0px;}
	body{ background: #2B3032; font-family: "나눔고딕";}
	#container{ width:1000px; height: 100%; margin: 0 auto;}
	#long { width: 600px;}
	#middle { width: 300px;}
	#betweenul{ display: flex; justify-content:space-between;}
	#rightul {display: flex; justify-content:space-around;}
	#bottom_p {display: flex; justify-content:space-between; width: 100%; padding: 0px; font-family: "나눔고딕";}
	.bottom_c {padding: 10px; font-family: "나눔고딕";}
	#rightul li {margin-left: 20px;}
	nav { text-align:right;}
	li {list-style:none; float: left;}
	div { text-align: center; padding-top : 30px;}
	h5 {text-align: right; color: #ffffff;}
	h2 { color : #dfdfdf; margin-top: 40px; margin-bottom: 40px;}
	a {text-decoration: none; color: #ffffff;}
	table { border-collapse : collapse;font-size: 12px;  width: 100%; margin: 0 auto; border: none;  background: #232729;}
	table th { background: #9e9e9e;  height: 50px; border: none; font-weight: bold; background: #33393B; color: #ffffff;}
	table td { height: 45px; width: 150px; border: none; color: #ffffff;}
	.pnt:hover { cursor: pointer; background: #263135; color: black;}
	.chk {font-weight: bold}
	transition: all 0.5s;
    transition-timing-function:ease;
    }
    a {
		text-decoration: none;
		color:black;
	}

	.pagingFont:not(:first-child) {
		margin-left: 13px;
	}
	.pro_img {
		width: 30px; height: 30px; border-radius: 30px;
	}
	.short {
		width: 80px;
	}
	.highlight {
		color: #FAED7D;
		font-weight: bold;
	}
	#likeListContainer {			
		display: none;		
		padding: 10px;		
		border: 1px solid #bdc3c7;
		position: absolute;
		left: 0px;
		top: 30px;
		width: 130px;
		height: 200px;
		overflow-y: auto;
		background-color: white !important;
	}		
	
	
 		
	.profile {
		background-color: white !important;
		display: inline-block;	
		width: 25px;
		height: 25px;
	    border-radius: 50%;
	    overflow: hidden;
	}		
	
	.likeItemContainer {
		display: flex;
		width: 100%;
	}
	
	.likeItemContainer .nm {
		background-color: white !important;
		margin-left: 7px;
		font-size: 0.7em;
		display: flex;
		align-items: center;
	}
</style>
</head>
<body>
	<div id="container">
		<nav>
			<ul id="betweenul">
				<li>
					<h5><a href="/profile">${loginUser.nm}</a>님 환영합니다</h5>
				</li>
				<li>
					<ul id="rightul">
						<li>
							<h5><a href="/board/regmod">게시글작성</a></h5>
						</li>
						<li>
							<h5><a href="/changePw">비민번호 변경</a></h5>
						</li>
						<li>
							<h5><a href="/user/logout">로그아웃</a></h5>
						</li>
					</ul>
				</li>
			</ul>
		</nav>
		<div>
			<h2>게시판</h2>
		</div>
		<table>
			<tr>
				<th>번호</th>
				<th id="long">제목</th>
				<th>작성자</th>
				<th>조회수</th>
				<th id="middle">작성일</th>
				<th class="short">좋아요</th>
			</tr>
			<c:choose>
				<c:when test="${empty data}">
					<tr>
						<td colspan="5" align="center">현재 등록된 글이 없습니다.</td>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach items="${data}" var="item">
						<tr class="pnt" >
							<td onclick="moveToDetail(${item.i_board})">${item.i_board}</td>
							<td onclick="moveToDetail(${item.i_board})">${item.title}
								<c:choose>
									<c:when test="${item.cnt_count == 0}" >
									</c:when>
									<c:otherwise>
										<span> (${item.cnt_count})</span>
									</c:otherwise>
								</c:choose>
							</td>
							<td>
								<c:choose>
									<c:when test="${item.profile_img != null}" >
										<img class="pro_img" src="/img/user/${item.i_user }/${item.profile_img}" >
									</c:when>
									<c:otherwise>
										<img class="pro_img" src="/img/default_profile.jpg">
									</c:otherwise>
								</c:choose>
								${item.nm }
							</td>
							<td>${item.hits}</td>
							<td>${item.r_dt}</td>
							<td onclick="getLikeList(${item.i_board}, ${item.like_count},this)">${item.like_count }</td>
						</tr>
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</table>
		<div id="bottom_p">
			<div class="bottom_c">
				<form id="selFrm" action="/board/list" method="get">
					<input type="hidden" name="page" value="${page}">
					<input type="hidden" name="searchText" value="${param.searchText}">
					레코드 수
					<select name="record_cnt" onchange="changeRecordCnt()">
						<c:forEach begin="10" end="30" step="10" var="item">
							<c:choose>
								<c:when test="${param.record_cnt == item}">
									<option value="${item}" selected>${item}개</option>
								</c:when>
								<c:otherwise>
									<option value="${item}">${item}개</option>	
								</c:otherwise>							
							</c:choose>
						</c:forEach>
					</select>
				</form>
			</div>
			<div  class="bottom_c">
				<form action="/board/list">
					<select name="searchType">
						<option value="a" ${searchType == 'a' ? 'selected' : ''}>제목</option>
						<option value="b" ${searchType == 'b' ? 'selected' : ''}>내용</option>
						<option value="c" ${searchType == 'c' ? 'selected' : ''}>제목+내용</option>
					</select>
					<input type="search" name="searchText" value="${param.searchText}">
					<input type="submit" value="검색">
				</form>
			</div>
		</div>
		<div>
			
		</div>
		<div class="fontCenter">
			<c:forEach begin="1" end="${pagingCnt}" var="item">
				<c:choose>
					<c:when test="${page == item}">
						<span class="pagingFont pageSelected">${item}</span>
					</c:when>
					<c:otherwise>
						<span class="pagingFont">
							<a href="/board/list?page=${item}&record_cnt=${param.record_cnt}&searchText=${param.searchText}&searchType=${searchType}">${item}</a>
						</span>
					</c:otherwise>
				</c:choose>
			</c:forEach>
		</div>
	</div>
	<div id="likeListContainer">
	</div>
	<script src="https://cdn.jsdelivr.net/npm/axios/dist/axios.min.js"></script>
	<script>
		let beforeI_board = 0
		
		function makeLikeUser(one)
		{
			const img = one.profile_img == null ? '<img class="pImg" src = "/img/default_profile.jpg"' : `<img class="pImg" src="/img/user/\${one.i_user}/\${one.profile_img}">`
			const ele = `<div class="likeItemContainer">
				<div class="profileContainer">
					<div class="profile">
						\${img}
					</div>
				</div>
				<div class="nm">
					\${one.nm}
				</div>
			</div>`
			return ele
		}
		
		function getLikeList(i_board, cnt, span) 
		{
			console.log("i_board : " + i_board)
			if(cnt == 0) { return }
			
			if(beforeI_board == i_board) 
			{
				likeListContainer.style.display = 'none'
				return
			} 
			else 
			{
				beforeI_board = i_board
				likeListContainer.style.display = 'unset'
			}			
			
			
			const locationX = window.scrollX + span.getBoundingClientRect().left
			const locationY = window.scrollY + span.getBoundingClientRect().top + 30
			
			likeListContainer.style.left = `\${locationX}px`
			likeListContainer.style.top = `\${locationY}px`
			
			likeListContainer.style.opacity = 1
			likeListContainer.innerHTML = ""
			
			axios.get('/boardLike', {
				params: {
					i_board // 변수 X , 키값, 변수명이랑 같을때 이렇게 사용, 원래는 i_board: i_board(키: 변수)형태;
				}
			}).then(function(res) {
				if(res.data.length > 0){
					for(var i = 0; i < res.data.length; i++)
					{
						const result = makeLikeUser(res.data[i])
						likeListContainer.innerHTML += result
					}
				}
			})
		}
		
	
		function moveToDetail(i_board) 
		{
			location.href = '/board/detail?page=${page}&record_cnt=${param.record_cnt}&searchType=${searchType}&searchText=${param.searchText}&i_board=' + i_board
		}
		
		function changeRecordCnt() 
		{
			selFrm.submit()
		}
	
	</script>
</body>
</html>