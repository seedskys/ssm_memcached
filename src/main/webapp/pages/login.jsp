<%@ page language="java" contentType="text/html; charset=utf-8"  
    pageEncoding="utf-8"  
%>  
<%    
    String path = request.getContextPath();   
    String basePath =  request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";   
%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery/jquery-1.8.0.min.js"></script>  
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">  
<title>Insert title here</title>  
</head>  
<body>  
    <div><font color="red" size="10px">${user.gender}</font></div>  
    <form action="${pageContext.request.contextPath }/loginController/login" method="post" name="loginForm" id="loginForm">  
    <table style="text-align: right;">  
          <tr>  
              <td>用户名:</td>  
              <td><input class="username" type="text" id="username" name="username"  value=''/></td>  
          </tr>  
          <tr>  
              <td>密码:</td>  
              <td><input class="password" type="password" id="password" name="password" value=""/></td>  
          </tr>  
        </table>  
        <div><input type="button" value="提 交" onclick="login();" /></div>  
    </form>   
<span style="white-space:pre">    </span><script type="text/javascript">  
      
    function login(){  
        var username = $("#username").val();  
        var password = $("#password").val();  
        $("#loginForm").submit();  
    }  

    document.onkeydown=function(event){   
        e = event ? event :(window.event ? window.event : null);   
        if(e.keyCode==13){   
            login();  
          }   
       }   
</script>  
</body>  
</html>  