<%--
  User: Administrator
  Date: 2017/10/29
  Time: 19:45
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<div class="main">
    <div class="optitle clearfix">
        <div class="title">结算详情&gt;&gt;</div>

    </div>
    <form id="form1" name="form1" method="post" action="addUser.do" onsubmit="return checkit();">
        <input type="hidden" name="flag" value="doAdd">
        <div class="content">
            <table class="box">

                <tr>
                    <td class="field">创建日期：</td>
                    <td><input type="text" name="settRecordId.createTime" class="text" id="textfield2"  value="${settRecordId.createTime}" disabled="disabled"/>
                </tr>

                <tr>
                    <td class="field">结算金额：</td>
                    <td><input type="text" name="settRecordId.settAmount" class="text" id="textfield2" value="${settRecordId.settAmount}" disabled="disabled"/>
                </tr>

                <tr>
                    <td class="field">银行名称：</td>
                    <td><input type="text" name="settRecordId.bankName" class="text" id="textfield2" value="${settRecordId.bankName}" disabled="disabled"/>
                </tr>
                <tr>
                    <td class="field">打款金额：</td>
                    <td><input type="text" name="settRecordId.remitAmount" class="text" id="textfield2" value="${settRecordId.remitAmount}" disabled="disabled"/>

                </tr>
                <tr>
                    <td class="field">用户编号：</td>
                    <td><textarea name="settRecordId.userNo" id="textarea" class="text"  disabled="disabled">${settRecordId.userNo}</textarea></td>
                </tr>
            </table>
        </div>
        <div class="buttons">
            <input type="button" name="button" id="button" onclick="javascript:window.history.back()" value="返回" class="input-button"/>
        </div>

    </form>
</div>
</body>
</html>
