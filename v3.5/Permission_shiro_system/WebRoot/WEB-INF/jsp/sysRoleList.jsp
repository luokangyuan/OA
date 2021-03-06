<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    <title>待办事项</title>
  </head>
  <body>
    <div class="easyui-layout" data-options="fit:true">
    
    <div data-options="region:'center',border:false">
    	<!-- 表格工具开始 -->
        <div id="sysroletoolbar">
         <div class="wu-toolbar-button">
                <a href="#" class="easyui-linkbutton" iconCls="icon-add" onclick="openAddTodo()" plain="true">添加角色</a>
                <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="cancel()" plain="true">取消操作</a>
                <a href="#" class="easyui-linkbutton" iconCls="icon-reload" onclick="reload()" plain="true">刷新页面</a>
                <a href="#" class="easyui-linkbutton" iconCls="icon-print" onclick="openAdd()" plain="true">打印</a>
                <a href="#" class="easyui-linkbutton" iconCls="icon-help" onclick="openEdit()" plain="true">帮助</a>
                <a href="#" class="easyui-linkbutton" iconCls="icon-undo" onclick="remove()" plain="true">撤销</a>
                <a href="#" class="easyui-linkbutton" iconCls="icon-redo" onclick="cancel()" plain="true">重做</a>
                <a href="#" class="easyui-linkbutton" iconCls="icon-sum" onclick="reload()" plain="true">总计</a>
                <a href="#" class="easyui-linkbutton" iconCls="icon-back" onclick="reload()" plain="true">返回</a>
                <a href="#" class="easyui-linkbutton" iconCls="icon-tip" onclick="reload()" plain="true">提示</a>
                <a href="#" class="easyui-linkbutton" iconCls="icon-save" onclick="reload()" plain="true">保存</a>
                <a href="#" class="easyui-linkbutton" iconCls="icon-cut" onclick="reload()" plain="true">剪切</a>
            </div>
           
        </div>
        <!-- 表格工具结束 -->
        <table id="sysroledatagrid" toolbar="#sysroletoolbar"></table>
    </div>
</div>
<!-- 新增弹出窗口开始 -->
<div id="tododialog" class="easyui-dialog" data-options="closed:true,iconCls:'icon-add'" style="width:400px;  padding:10px;">
	<form id="todoform" enctype="multipart/form-data" method="post">
        <input type="hidden" name="noticeId" value=""/>
         <input type="hidden" name="bullId" value=""/>
        <div style="padding:20px 0px;margin-left:70px">
        	<div class="my_li">
                <div class="my_li_float">角色名称：</div>
                <div class="my_li_float">
                 <input type="text" name="todoTitle"/>
				</div>
            </div>
            <div class="my_li">
                <div class="my_li_float">角色权限：</div>
                <div class="my_li_float">
                 <input id="permission"/>
				</div>
            </div>
            
        </div>
    </form>
</div>
<script type="text/javascript">
	$(function(){
		$("#permission").combotree({    
	    url: 'loadPerTree.action',    
	    checkbox: true ,
	    multiple:true  
	});  
});
	/**
	* Name 打开添加窗口
	*/
	function openAddTodo(){
		$('#todoform').form('clear');
		$('#tododialog').dialog({
			closed: false,
			modal:true,
            title: "添加角色",
            buttons: [{
                text: '确定',
                iconCls: 'icon-ok',
                handler: addtodo
            }, {
                text: '取消',
                iconCls: 'icon-cancel',
                handler: function () {
                    $('#tododialog').dialog('close');                    
                }
            }]
        });
	}
	/**
	* Name 添加记录
	*/
	function addtodo(){
		if($('#todoform').form('validate')){
			$('#todoform').form('submit', {
			url:'insertTodoWorkByMe.action',
			success:function(data){
				if(data){
					$.messager.show({
							title:'提示信息',
							msg:'添加成功！'
						});
					$('#tododialog').dialog('close');
					//刷新数据表格页面
					$('#sysroledatagrid').datagrid('reload');
				}
				else
				{
					$.messager.alert('信息提示','提交失败！','info');
				}
			}
		});
		
		}else{
			$.messager.show({
			title:'提示信息',
			msg:'提交失败！'
		});
		}
	
		
	}
	
	 //根据条件筛选数据
	$('#querytodo').click(function(){
		$('#sysroledatagrid').datagrid('load',serializeForm($('#selectNoticeByCondition')));
	});
	//清空查询条件
	$('#canceltodo').click(function(){
	 $('#todoType').combobox('clear');
	 $('#todoimpor').combobox('clear');
	 $('#stime').datebox('clear');
	  $('#etime').datebox('clear');
	});
	/**
	*序列化表单
	*/
	function serializeForm(from){
		var obj = [];
		$.each(from.serializeArray(),function(index){
			if(obj[this['name']]){
				obj[this['name']] = obj[this['name']] + ','+this['value'];
			} else {
				obj[this['name']] = this['value'];
			}
		});
		return obj;
	}
	/**
	* Name 载入数据
	*/
	$('#sysroledatagrid').datagrid({
		idField:'roleid',     //数据表格必须配置，相当于主键
		striped:true,    //隔行变色
		url:'loadRoleList.action',
		loadMsg:'数据正在加载，请等待',
		rownumbers:true,
		remoteSort:false,
		multiSort:false,
		singleSelect:false,
		pageSize:20,
    	pageList :[5,10,20,50],
		pagination:true,
		multiSort:true,
		fitColumns:true,
		fit:true,
		columns:[[
			{ field:'ck',checkbox:true},
			{ field:'rolename',title:'系统角色',width:300,sortable:true},
		
			{ field:'createTime',title:'创建时间',sortable:true,formatter: formatDatebox,width:100},
			{ field:'rolevaliable',title:'是否有效',width:50,sortable:true,align:'center',
					formatter: function(value,row,index){
				if (value =='1'){
					return '<span style=color:green;>有效</span>';
				} else if(value =='2'){
						return '<span style=color:red;>无效</span>';
				} 
			}},
			
				
			
		]]
	});
	//格式化时间
	    Date.prototype.format = function (format) {  
        var o = {  
            "M+": this.getMonth() + 1, // month  
            "d+": this.getDate(), // day  
            "h+": this.getHours(), // hour  
            "m+": this.getMinutes(), // minute  
            "s+": this.getSeconds(), // second  
            "q+": Math.floor((this.getMonth() + 3) / 3), // quarter  
            "S": this.getMilliseconds()  
            // millisecond  
        }  
        if (/(y+)/.test(format))  
            format = format.replace(RegExp.$1, (this.getFullYear() + "")  
                .substr(4 - RegExp.$1.length));  
        for (var k in o)  
            if (new RegExp("(" + k + ")").test(format))  
                format = format.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k] : ("00" + o[k]).substr(("" + o[k]).length));  
        return format;  
    }  
    function formatDatebox(value) {  
        if (value == null || value == '') {  
            return '';  
        }  
        var dt;  
        if (value instanceof Date) {  
            dt = value;  
        } else {  
            dt = new Date(value);  
        }  
        return dt.format("yyyy-MM-dd hh:mm:ss"); //扩展的Date的format方法(上述插件实现)  
    }  
</script>
  </body>
</html>
