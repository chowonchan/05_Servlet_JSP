<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>회원 관리 프로그램</title>
  <link rel="stylesheet" href="/resources/css/member.css">
</head>
<body>

  <h1>회원 관리 프로그램</h1>

  <h3>전체 맴버 : ${fn:length(memberList)}</h3>

  <h4>회원 추가</h4>
  <form action="/member/add" method="post" id="addForm">
    <div>
      이름 : <input type="text" name="name">
    </div>
    <div>
      전화번호 : <input type="number" name="phone">
    </div>

    <button>추가</button>
  </form>

  <hr>

  <table id="memberList" border="1">
    <thead>
      <tr>
        <th>번호</th>
        <th>이름</th>
        <th>전화 번호</th>
        <th>누적 금액</th>
        <th>등급</th>
      </tr>
    </thead>

    <tbody>
      <c:forEach items="${memberList}" var="member" varStatus="vs">
        <tr>
          <th>${vs.count}</th>
          <td>
            <a href="${vs.index}">${member.name}</a>
          </td>

          <td><a href="${vs.index}">${member.phone}</a></td>
          <td> <a href="/update/amount?index=${vs.index}">${member.amount}</a></td>
          <td><a href="${vs.index}">${member.grade}</a></td>
        
        </tr>
      </c:forEach>
    </tbody>
  </table>


   <c:if test="${not empty sessionScope.message}" >
    <script>
      alert( "${message}" );    
      // JSP 해석 우선순위
      //  1순위 : Java(EL/JSTL)  
      //  2순위 : Front(HTML,CSS,JS)
    </script>

    <%-- message를 한 번만 출력하고 제거 --%>
    <c:remove var="message" scope="session" />

  </c:if>

  <script src="/resources/js/member.js"></script>
</body>
</html>