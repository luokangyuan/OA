<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>角色权限</title>
  </head>
  <body>
 
  <form class="ui form">
 
  <h4 class="ui dividing header" style="margin-top: 5px">角色权限信息</h4>
  
 <c:forEach items="${pers}" var="role">
 	 <h5 class="ui header">${role.rolename}</h5>
 	 <div class="field">
 		<c:forEach var="persi" items="${role.persisions}">
 		
			<div class="ui read-only checkbox" id="per">
		    <input  disabled="disabled" checked="checked" type="checkbox">
		    <label>${persi.pername}</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		  </div>
 			
 		</c:forEach>
 	</div>
 </c:forEach>
  
  
</form>
<script type="text/javascript">
	$(function(){
	$('#per')
  .checkbox({
    uncheckable: true
  })
;
	
	});
</script>
  </body>
</html>
