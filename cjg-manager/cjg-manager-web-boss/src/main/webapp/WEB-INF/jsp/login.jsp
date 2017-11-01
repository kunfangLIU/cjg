<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>系统登录 - 藏金阁支付后台</title>
    <link type="text/css" rel="stylesheet" href="css/style.css" />
    <script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript">

        $(function(){
            //验证用用户和密码非空
            $("#userForm").submit(function(e){

                var un = $("#un").val();
                var pw = $("#pw").val();

                var flag1 = false;
                var flag2 = false;

                if(un==null||un==""){
                    //提示用户名不能为空
                    $("#sp1").html("用户名不能为空");
                }else{
                    $("#sp1").html("");
                    flag1 = true;
                }

                if(pw==null || pw==""){
                    //提示密码不能为空
                    $("#sp2").html("密码不能为空");
                }else{
                    $("#sp2").html("");
                    flag2 = true;

                }
                e.preventDefault();//阻止表单提交
                //进行ajax提交'
                if(flag1&&flag2){
                    var jsonObj = {"userName":un,"password":pw};
                    $.ajax({
                        url:"${pageContext.request.contextPath}/login",
                        type:"post",
                        data:jsonObj,
                        dataType:"text",
                        success:function(rec){
                            //1允许登录,2,用业户名或密码错误,3,用户名或密码为空
                            //允许登录
                            //alert(rec);
                            if(rec==1){
                                debugger;
                                location.href="${pageContext.request.contextPath}/index";
                            }else if(rec==2){
                                $("#sp1").html("用户或密码错误");
                            }else if(rec==3){
                                $("#sp1").html("用户或密码不能为空");
                                //var span = document.gete();
                            }else{
                                alert("访问失败请稍后再试");
                            }
                        },
                        error:function(){
                            alert("error");
                        }

                    });
                }
            });
        });


    </script>
</head>
<body class="blue-style">
<div id="login">
    <div class="icon"></div>
    <div class="login-box">
        <form method="post" action="login" id="userForm">
            <dl>
                <dt>用户名：</dt>
                <dd><input type="text" name="userName" class="input-text" id="un"/><span id="sp1"></span></dd>
                <dt>密　码：</dt>
                <dd><input type="password" name="password" class="input-text" id="pw"/><span id="sp2"></span></dd>
            </dl>
            <div class="buttons">
                <input type="submit" name="submit" value="登录系统" class="input-button" />
                <input type="reset" name="reset" value="重　　填" class="input-button" />
            </div>
        </form>
    </div>
</div>
</body>
</html>
