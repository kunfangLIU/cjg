<%--
  User: Administrator
  Date: 2017/11/1
  Time: 20:48
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<h1 align="center">支付方式列表详情</h1>
<hr>


<div align="center" >
    <form action="">
        <table border="1px">
            <tr>

                <td width="150" height="20">结算发起方式</td>
                <td width="150" height="20">账户编号</td>
                <td width="150" height="20">用户编号</td>
                <td width="150" height="20">用户名</td>
                <td width="150" height="20">用户类型</td>
                <td width="150" height="20">结算日期</td>
                <td width="150" height="20">银行编码</td>
                <td width="150" height="20">银行名称</td>
                <td width="150" height="20">开户名</td>
                <td width="150" height="20">开户编号</td>
                <td width="150" height="20">开户类型</td>
                <td width="150" height="20">开户所在国家</td>


            </tr>
            <c:forEach items="${list}" var="list">

                <tr>
                    <td width="150" height="20">${list.settMode}</td>
                    <td width="90" height="20">${list.accountNo}</td>
                    <td width="90" height="20">${list.userNo}</td>
                    <td width="90" height="20">${list.userName}</td>
                    <td width="90" height="20">${list.userType}</td>
                    <td width="90" height="20" ><fmt:formatDate value="${list.settDate}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
                    <td width="90" height="20">${list.bankCode}</td>
                    <td width="150" height="20">${list.bankName}</td>
                    <td width="90" height="20">${list.bankAccountName}</td>
                    <td width="90" height="20">${list.bankAccountNo}</td>
                    <td width="90" height="20">${list.bankAccountType}</td>
                    <td width="90" height="20">${list.country}</td>

                </tr>

            </c:forEach>

        </table>
    </form>
</div>
</body>
</html>