<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    <title>My JSP 'myInfoPage.jsp' starting page</title>
   
  </head>
  
  <body>
		<div class="ui items">
		  <div class="item">
		    
		    <div class="content">
		     <a class="ui tiny image">
		      <img src="images/${staff.staheadimage}">
		    </a><br>
		      <a class="header">基本信息</a>
		     
		      <div class="ui raised segment description" style="margin-left: 20px">
		      	
				  <a class="ui ribbon label">工作信息</a>
				 	<p>部门：软件开发部</p>
		        	<p>职务：Java软件工程师</p>
		        	<p>注册时间：<fmt:formatDate value="${staff.staentrytime}" pattern="yyyy-MM-dd"/></p>
		        	<p>工作状态：${staff.statype}</p>
		        	<p>工作能力：${staff.staworker}</p>
				  <a class="ui teal ribbon label">私密信息</a>
				<p>姓名：${staff.staname}</p>
		        
		        <p>电话号码：${staff.statel}</p>
		        <p>电子邮箱：${staff.staemail}</p>
		        <p>政治面貌：${staff.stapol}</p>
		        <p>电话号码：${staff.statel}</p>
		        
		        <p>性别：${staff.stasex}</p>
	            
	            <p>家庭地址：${staff.staaddress}</p>
	            <p>自我描述：${staff.staremark}</p>
	            <p>生日：<fmt:formatDate value="${staff.stabirthday}" pattern="yyyy-MM-dd"/></p>
	            <p>身份证号:${staff.staidcard}</p>
	           
	            <p>爱好：${staff.stahabit}</p>
	            <p>专业：${staff.stamajor}</p>
	            <p>婚姻情况：${staff.stamarry}</p>
	            <p>年龄：${staff.staage}</p>
	            <p>学校：${staff.staeducation}</p>
	          
	            
	            <p>银行账户：${staff.stabanknumber}</p>
	            <p>QQ号码：${staff.staqqnumber}</p>
				  <a class="ui red ribbon label">能力信息</a>
				   <p>电脑水平：${staff.stacomputer}</p>
	            	<p>英语水平：${staff.staenglish}</p>
					 <p>教育：${staff.staenduce}</p>   
				
				</div>
		      <%-- <div class="description">
		        <p>姓名：${staff.staname}</p>
		        <p>部门：软件开发部</p>
		        <p>职务：Java软件工程师</p>
		        <p>电话号码：${staff.statel}</p>
		        <p>电子邮箱：${staff.staemail}</p>
		        <p>政治面貌：${staff.stapol}</p>
		        <p>电话号码：${staff.statel}</p>
		        <p>注册时间：<fmt:formatDate value="${staff.staentrytime}" pattern="yyyy-MM-dd"/></p>
		        <p>性别：${staff.stasex}</p>
	            <p>工作状态：${staff.statype}</p>
	            <p>家庭地址：${staff.staaddress}</p>
	            <p>自我描述：${staff.staremark}</p>
	            <p>生日：<fmt:formatDate value="${staff.stabirthday}" pattern="yyyy-MM-dd"/></p>
	            <p>身份证号:${staff.staidcard}</p>
	            <p>教育：${staff.staenduce}</p>
	            <p>爱好：${staff.stahabit}</p>
	            <p>专业：${staff.stamajor}</p>
	            <p>婚姻情况：${staff.stamarry}</p>
	            <p>年龄：${staff.staage}</p>
	            <p>学校：${staff.staeducation}</p>
	            <p>电脑水平：${staff.stacomputer}</p>
	            <p>英语水平：${staff.staenglish}</p>
	            <p>工作能力：${staff.staworker}</p>
	            <p>银行账户：${staff.stabanknumber}</p>
	            <p>QQ号码：${staff.staqqnumber}</p>
		               
		      </div> --%>
		    </div>
		  </div>
		  
		   
		</div>
  </body>
</html>
