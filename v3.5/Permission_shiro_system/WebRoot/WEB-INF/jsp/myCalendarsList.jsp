<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    <title>我的日程</title>
  </head>
  <body>
    <div class="easyui-layout" data-options="fit:true">
    
    <div data-options="region:'center',border:false">
    	<!-- 表格工具开始 -->
        <div id="calentoolbar">
         <div class="wu-toolbar-button">
                <a href="#" class="easyui-linkbutton" iconCls="icon-add" onclick="openAddCalen()" plain="true">添加日程</a>
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
            <form id="selectNoticeByCondition" method="post">
            <div class="wu-toolbar-search">
                <label>发布时间：</label><input id="stime" name="startTime" class="easyui-datebox" style="width:100px">
                <label>--</label><input id="etime" name="endTime" class="easyui-datebox" style="width:100px">
                <label>事项状态：</label> 
                <select id="todoType"   name="todoType" editable=false  class="easyui-combobox" panelHeight="auto" style="width:100px">
                    <option value="1">待办</option>
                    <option value="2">已办</option>
                </select>
                 <label>重要性：</label> 
                <select id="todoimpor" name="todoimpor" class="easyui-combobox" editable=false panelHeight="auto" style="width:100px">
                    <option value="1">一级重要</option>
                    <option value="2">二级次要</option>
                    <option value="3">三级缓缓</option>
                </select>
                <label>关键词：</label><input name="todoTitle"  placeholder="请输入关键字" class="wu-text" style="width:100px; height: 20px">
                <a id="querytodo" href="#" class="easyui-linkbutton" iconCls="icon-search">开始检索</a>
                 <a id="canceltodo" href="#" class="easyui-linkbutton" iconCls="icon-cancel">清除查询</a>
            </div>
            </form>
        </div>
        <!-- 表格工具结束 -->
        <table id="calendardatagrid" toolbar="#calentoolbar"></table>
    </div>
</div>
<!-- 新增弹出窗口开始 -->
<div id="tododialog" class="easyui-dialog" data-options="closed:true,iconCls:'icon-add'" style="width:430px;  padding:10px;">
	<form id="todoform" enctype="multipart/form-data" method="post">
        <input type="hidden" name="noticeId" value=""/>
         <input type="hidden" name="bullId" value=""/>
        <table>
        	<tr>
                <td align="right">日程标题:</td>
                <td>
                 <input type="text" name="calendaName"/>
				</td>
            </tr>
            
            <tr>
                <td align="right">日程内容:</td>
                <td>
                 <input type="text" name="calendaContent"/>
				</td>
            </tr>
            <tr>
                <td align="right">开始时间:</td>
                <td>
                 <input type="text" name="calendaStartTime" class="easyui-datetimebox"/>
				</td>
            </tr>
              <tr>
                <td align="right">结束时间:</td>
                <td>
                 <input type="text" name="calendaEndTime" class="easyui-datetimebox"/>
				</td>
            </tr>
            <tr>
                <td width="200" align="right">重要级别:</td>
                <td> 
                 <select  id="upnoticeType" name="calendaOne"   editable=false class="easyui-combobox easyui-validatebox"  panelHeight="auto" style="width:200px">
                    <option value="1">一级重要</option>
                    <option value="2">二级次要</option>
                    <option value="3">三级缓缓</option>
                </select>
              </td>
            </tr>
            <tr>
                <td align="right">日程附件:</td>
                <td><input  name="file" type="file" /></td>
            </tr>
             <tr>
                <td valign="top" align="right">日程备注:</td>
                <td><textarea   name="calendaRemark" rows="6" class="wu-textarea easyui-validatebox" style="width:260px"></textarea></td>
            </tr>
        </table>
    </form>
</div>
<script type="text/javascript">
	/**
	* Name 打开添加窗口
	*/
	function openAddCalen(){
		$('#todoform').form('clear');
		$('#tododialog').dialog({
			closed: false,
			modal:true,
            title: "添加事项",
            buttons: [{
                text: '确定',
                iconCls: 'icon-ok',
                handler: addcalen
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
	function addcalen(){
		if($('#todoform').form('validate')){
			$('#todoform').form('submit', {
			url:'insertCalendarsByMe.action',
			success:function(data){
				if(data){
					$.messager.show({
							title:'提示信息',
							msg:'添加成功！'
						});
					$('#tododialog').dialog('close');
					//刷新数据表格页面
					$('#calendardatagrid').datagrid('reload');
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
		$('#calendardatagrid').datagrid('load',serializeForm($('#selectNoticeByCondition')));
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
	$('#calendardatagrid').datagrid({
		idField:'calendarId',     //数据表格必须配置，相当于主键
		striped:true,    //隔行变色
		url:'loadCalendarsList.action',
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
			{ field:'calendaName',title:'日程标题',width:100,sortable:true},
			{ field:'calendaContent',title:'日程内容',width:120,sortable:true},
			{ field:'calendaRemark',title:'日程描述',width:150,sortable:true},
			{ field:'calendaStartTime',title:'开始时间',sortable:true,formatter: formatDatebox,width:70,align:'center'},
			{ field:'calendaEndTime',title:'结束时间',sortable:true,formatter: formatDatebox,width:70,align:'center'},
			{ field:'calendaOne',title:'优先级别',width:50,sortable:true,align:'center',
					formatter: function(value,row,index){
				if (value =='1'){
					return '<span style=color:red;>非常紧急</span>';
				} else if(value =='2'){
						return '<span style=color:green;>优先解决</span>';
				} else if(value =='3'){
						return '<span style=color:blue;>有空解决</span>';
				} 
			}},
			{ field:'calendaType',title:'日程状态',width:50,align:'center',
					formatter: function(value,row,index){
				if (value =='1'){
					return '<span style=color:red;>待办</span>';
				} else if(value =='2'){
						return '<span style=color:green;>已办</span>';
				} 
			}
			},
			{ field:'bullServerName',title:'附件下载',width:50,align:'center',
					formatter: function(value,row,index){
				if (value !='无附件'){
					return "<a href=/pic/file/"+row.calendServerName+">"+"<img src= images/download.gif>"+"</a>";
				} else{
					return '';
				}
			}
				
			}
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
        return dt.format("yyyy-MM-dd"); //扩展的Date的format方法(上述插件实现)  
    }  
</script>
  </body>
</html>
