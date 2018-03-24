<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/tag.jsp"%>
<html>
<head>
<title>OA系统办公与管理系统</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">

<link rel="stylesheet" type="text/css" href="easyui/1.3.4/themes/default/easyui.css" />


<link rel="stylesheet" type="text/css" href="css/wu.css" />
<link rel="stylesheet" type="text/css" href="easyui/mytheme/themes/insdep/easyui.css" />
<link rel="stylesheet" type="text/css" href="easyui/mytheme/themes/insdep/easyui_animation.css" />
<link rel="stylesheet" type="text/css" href="css/icon.css" />
<link rel="stylesheet" type="text/css" href="easyui/mytheme/themes/insdep/icon.css" />
<!-- bootstrap -->
<link  rel="stylesheet" type="text/css" href="Semantic-UI-CSS-master/semantic.min.css"/>


</head>
<body class="easyui-layout">
	<!-- begin of header -->
	<div class="wu-header" data-options="region:'north',border:false,split:true">
    	<div class="wu-header-left">
        	<h1>OA系统办公与管理系统</h1>
        </div>
        <div class="wu-header-right">
        	<p><strong class="easyui-tooltip" title="2条未读消息">${activeUser.username}</strong>，欢迎您！</p>
            <p><a href="#">系统首页</a>|<a href="#">使用帮助</a>|<a href="#">修改密码</a>|<a id="loginOut" href="javascript:logout()">退出系统</a></p>
        </div>
    </div>
    <!-- end of header -->
    <!-- begin of sidebar -->
	<div class="wu-sidebar" data-options="region:'west',split:true,border:true,title:'导航菜单'"> 
    	<div class="easyui-accordion" data-options="border:false,fit:true"> 
        	
            
            <c:if test="${activeUser.menus!=null }">
            <c:forEach items="${activeUser.menus }" var="menu">
            <input class="treeid" type="hidden" value="${menu.perid}"/>
            <div title="${menu.pername }" data-options="iconCls:'${menu.icon}'" style="padding:5px;">  	
    			<ul id="semenu" class="easyui-tree wu-side-tree">
    			 	  <c:forEach items="${menu.semenu}" var="se">
                	<li iconCls="${se.icon}"><a href="javascript:void(0)" data-icon="${se.icon}" data-link="${se.perurl}" iframe="0"> ${se.pername }</a></li>
               	</c:forEach>
                </ul>
            </div>
            </c:forEach>
			</c:if>
            
           
        </div>
    </div>	
    <div class="wu-main" data-options="region:'center'">
        <div id="wu-tabs" class="easyui-tabs" data-options="border:false,fit:true">  
            <div title="首页" data-options="href:'welcome.jsp',closable:false,iconCls:'icon-tip',cls:'pd3'"></div>
        </div>
    </div>
	<div class="wu-footer" data-options="region:'south',border:true,split:true">
    	&copy; 版本号：v1.1
    </div>
    <script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="easyui/1.3.4/jquery.easyui.min.js"></script>
<script type="text/javascript" src="easyui/1.3.4/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="fckeditor/fckeditor.js"></script>
 <!-- <script  type="text/javascript" src="Semantic-UI-CSS-master/semantic.min.js"></script> -->
    <!-- end of footer -->  
    <script type="text/javascript">
    	//退出系统方法
	function logout() {
		$.messager.confirm('确认对话框', '您想要退出该系统吗？',
				function(r){
				if(r){
					location.href = '${baseurl}logout.action';
				}
					
				});
	}
	

		$(function(){
			$('.wu-side-tree a').bind("click",function(){
				var title = $(this).text();
				var url = $(this).attr('data-link');
				var iconCls = $(this).attr('data-icon');
				var iframe = $(this).attr('iframe')==1?true:false;
				addTab(title,url,iconCls,iframe);
			});	
		})
		
		
		/**
		* Name 载入树形菜单 
		*/
		$('#wu-side-tree').tree({
			url:'temp/menu.php',
			cache:false,
			onClick:function(node){
				var url = node.attributes['url'];
				if(url==null || url == ""){
					return false;
				}
				else{
					addTab(node.text, url, '', node.attributes['iframe']);
				}
			}
		});
		
		/**
		* Name 选项卡初始化
		*/
		$('#wu-tabs').tabs({
			tools:[{
				iconCls:'icon-reload',
				border:false,
				handler:function(){
					$('#wu-datagrid').datagrid('reload');
				}
			}]
		});
			
		/**
		* Name 添加菜单选项
		* Param title 名称
		* Param href 链接
		* Param iconCls 图标样式
		* Param iframe 链接跳转方式（true为iframe，false为href）
		*/	
		function addTab(title, href, iconCls, iframe){
			var tabPanel = $('#wu-tabs');
			if(!tabPanel.tabs('exists',title)){
				var content = '<iframe scrolling="auto" frameborder="0"  src="'+ href +'" style="width:100%;height:100%;"></iframe>';
				if(iframe){
					tabPanel.tabs('add',{
						title:title,
						content:content,
						iconCls:iconCls,
						fit:true,
						cls:'pd3',
						closable:true
					});
				}
				else{
					tabPanel.tabs('add',{
						title:title,
						href:href,
						iconCls:iconCls,
						fit:true,
						cls:'pd3',
						closable:true
					});
				}
			}
			else
			{
				tabPanel.tabs('select',title);
			}
		}
		/**
		* Name 移除菜单选项
		*/
		function removeTab(){
			var tabPanel = $('#wu-tabs');
			var tab = tabPanel.tabs('getSelected');
			if (tab){
				var index = tabPanel.tabs('getTabIndex', tab);
				tabPanel.tabs('close', index);
			}
		}
		
	
	
	</script>
</body>

</html>