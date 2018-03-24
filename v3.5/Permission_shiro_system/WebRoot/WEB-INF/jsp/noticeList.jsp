<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    <title>公告管理页面</title>

  </head>
  <body>
    <div class="easyui-layout" data-options="fit:true">
    
    <div data-options="region:'center',border:false">
    	<!-- 表格工具开始 -->
        <div id="wu-toolbar">
            <div class="wu-toolbar-button">
                <a href="#" class="easyui-linkbutton" iconCls="icon-add" onclick="openAdd()" plain="true">添加公告</a>
                <a href="#" class="easyui-linkbutton" iconCls="icon-edit" onclick="openEdit()" plain="true">修改公告</a>
                <a href="#" class="easyui-linkbutton" iconCls="icon-remove" onclick="remove()" plain="true">删除公告</a>
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
                <label>部门：</label> 
                <select   id="selectNoticeDeptName" name="deptName" editable=false  class="easyui-combobox" panelHeight="auto" style="width:100px">
                    <option value="">选择部门</option>
                </select>
                 <label>公告类型：</label> 
                <select  id="selectNoticeType" name="noticeType" class="easyui-combobox" editable=false panelHeight="auto" style="width:100px">
                    <option value="">选择类型</option>
                </select>
                 <label>公告权限：</label> 
                <select id="selectpersi" name="noticeArea" class="easyui-combobox" editable=false panelHeight="auto" style="width:100px">
                    <option value="">选择权限</option>
                </select>
                <label>关键词：</label><input name="noticeTitle"  placeholder="请输入关键字" class="wu-text" style="width:100px; height: 20px">
                <a id="quaryNotice" href="#" class="easyui-linkbutton" iconCls="icon-search">开始检索</a>
                 <a id="cancelNotice" href="#" class="easyui-linkbutton" iconCls="icon-cancel">清除查询</a>
            </div>
            </form>
        </div>
        <!-- 表格工具结束 -->
        <table id="wu-datagrid" toolbar="#wu-toolbar"></table>
    </div>
</div>
<!-- 新增公告弹出窗口开始 -->
<div id="wu-dialog" class="easyui-dialog" data-options="closed:true,iconCls:'icon-add'" style="width:400px;  padding:10px;">
	<form id="wu-form" enctype="multipart/form-data" method="post">
        <input type="hidden" name="noticeId" value=""/>
         <input type="hidden" name="bullId" value=""/>
        <div style="padding:20px 40px">
            <div class="my_li">
                <div class="my_li_float">公告类型：</div>
                <div class="my_li_float"> 
                 <select height="30" style="font-size:16px"   id="upnoticeType" name="noticeType"   editable=false class="easyui-combobox easyui-validatebox"  panelHeight="auto" style="width:200px">
                    <option value="">选择类型</option>
                </select>
              </div>
            </div>
            <div class="my_li">
                <div class="my_li_float">查看权限：</div>
                <div class="my_li_float">
                 <select id="upnoticepersi" name="noticeAreas"   multiple= divue,  editable=false class="easyui-combobox" panelHeight="auto" style="width:200px">
                    <option value="">那些人可以查看</option>
                </select>
				</div>
            </div>
            <div class="my_li">
                <div class="my_li_float">公告附件：</div>
                <div class="my_li_float"><input style="width:210px"name="file" type="file" /></div>
            </div>
            <div class="my_li">
                <div  valign="top" class="my_li_float">公告内容：</div>
                <div class="my_li_float"><textarea   name="noticeTitle" rows="6" class="wu-textarea easyui-validatebox" style="width:210px"></textarea></div>
            </div>
        </div>
    </form>
</div>
<!-- 弹出窗口结束 -->
<script type="text/javascript">
$(function(){

//加载菜单中的部门选项
	 $('#selectNoticeDeptName').combobox({
	 	onShowPanel:function(){
	 	$('#selectNoticeDeptName').combobox({
	 	url:'selectDeptName.action',    
	    valueField:'deptName',    
	    textField:'deptName'   
	 });
	 	}
	 });
	//加载公告类型选项
	 $('#selectNoticeType').combobox({
	 	onShowPanel:function(){
	 	$('#selectNoticeType').combobox({
	 	url:'selecttype.action',    
	    valueField:'ntname',    
	    textField:'ntname'   
	 });
	 	}
	 });
	 //加载权限
	 $('#selectpersi').combobox({
	 	onShowPanel:function(){
	 	$('#selectpersi').combobox({
	 	url:'selectpersi.action',    
	    valueField:'deptName',    
	    textField:'deptName'   
	 });
	 	}
	 });
	 //加载新增公告弹出窗口的公告类型
	  $('#upnoticeType').combobox({
	 	onShowPanel:function(){
	 	$('#upnoticeType').combobox({
	 	url:'selecttype.action',    
	    valueField:'ntname',    
	    textField:'ntname'   
	 });
	 	}
	 });
	 
	 //加载新增弹框的权限
	  $('#upnoticepersi').combobox({
	 	onShowPanel:function(){
	 	$('#upnoticepersi').combobox({
	 	url:'selectpersi.action',    
	    valueField:'deptName',    
	    textField:'deptName'   
	 });
	 	}
	 });

})
	
	 //根据条件筛选数据
	$('#quaryNotice').click(function(){
		$('#wu-datagrid').datagrid('load',serializeForm($('#selectNoticeByCondition')));
	});
	//清空查询条件
	$('#cancelNotice').click(function(){
	 $('#selectNoticeDeptName').combobox('clear');
	 $('#selectNoticeType').combobox('clear');
	 $('#selectpersi').combobox('clear');
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
	* Name 添加记录
	*/
	function add(){
		if($('#wu-form').form('validate')){
			$('#wu-form').form('submit', {
			url:'addNotice.action',
			success:function(data){
				if(data){
					$.messager.show({
							title:'提示信息',
							msg:'添加成功！'
						});
					$('#wu-dialog').dialog('close');
					//刷新数据表格页面
					$('#wu-datagrid').datagrid('reload');
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
	
	/**
	* Name 修改记录
	*/
	function edit(){
		$('#wu-form').form('submit', {
			url:'editNotice.action',
			success:function(data){
				if(data){
					$.messager.show({
							title:'提示信息',
							msg:'修改成功！'
						});
					$('#wu-dialog').dialog('close');
					$('#wu-datagrid').datagrid('reload');
				}
				else
				{
					$.messager.alert('信息提示','提交失败！','info');
				}
			}
		});
	}
	
	/**
	* Name 删除记录
	*/
	function remove(){
		var item = $('#wu-datagrid').datagrid('getSelections');
		if(item.length <= 0){
			$.messager.show({
				title:'提示信息！',
				msg:'至少选择一行进行删除'
			});
		}else{
				$.messager.confirm('提示信息','确认删除吗？', function(r){
					if(r){
						//删除用户
							var ids = '';
							for(var i= 0; i<item.length;i++){
								ids += item[i].noticeId+',';
							}
							
							ids = ids.substring(0, ids.length-1);

							$.post('deleteNotice.action',{idlist:ids},function(result){
								//删除成功
								//刷新数据表格
								$('#wu-datagrid').datagrid('reload');
								$('#wu-datagrid').datagrid('unselectAll');
								$.messager.show({
									title:'提示信息',
									msg:'删除成功！'
								});
							});
					}
				
				});
				
			}
	
	}
	
	/**
	* Name 打开添加窗口
	*/
	function openAdd(){
		$('#wu-form').form('clear');
		$('#wu-dialog').dialog({
			closed: false,
			modal:true,
            title: "发布系统公告",
            buttons: [{
                text: '确定',
                iconCls: 'icon-ok',
                handler: add
            }, {
                text: '取消',
                iconCls: 'icon-cancel',
                handler: function () {
                    $('#wu-dialog').dialog('close');                    
                }
            }]
        });
	}
	
	/**
	* Name 打开修改窗口
	*/
	function openEdit(){
		$('#wu-form').form('clear');
		var item = $('#wu-datagrid').datagrid('getSelections');
		if(item.length != 1){
			$.messager.show({
				title:'提示信息！',
				msg:'只能选择一行记录进行修改'
			});
		}else {
			//修改记录
			$('#wu-dialog').dialog({
			closed: false,
			modal:true,
			iconCls: 'icon-edit',
            title: " 修改公告信息",
            buttons: [{
                text: '确定',
                iconCls: 'icon-ok',
                handler: edit
            }, {
                text: '取消',
                iconCls: 'icon-cancel',
                handler: function () {
                    $('#wu-dialog').dialog('close');                    
                }
            }]
        });
			$('#wu-dialog').dialog('open');
				$('#wu-form').form('load',{
					noticeType:item[0].noticeType,
					noticeId:item[0].noticeId,
					bullId:item[0].bullId,
					noticeArea:item[0].noticeArea,
					noticeTitle:item[0].noticeTitle
				});
			}
		}
		
	/**
	* Name 载入数据
	*/
	$('#wu-datagrid').datagrid({
		idField:'noticeId',     //数据表格必须配置，相当于主键
		striped:true,    //隔行变色
		url:'loadNotice.action',
		loadMsg:'数据正在加载，请等待',
		rownumbers:true,
		remoteSort:false,
		multiSort:true,
		singleSelect:false,
		pageSize:20,
    	pageList :[5,10,20,50],
		pagination:true,
		multiSort:true,
		fitColumns:true,
		fit:true,
		columns:[[
			{ field:'ck',checkbox:true},
			{ field:'noticeId',title:'公告id',width:100,hidden:true},
			{ field:'bullId',title:'附件id',width:100,hidden:true},
			{ field:'deptName',title:'发布人部门',width:100,sortable:true},
			{ field:'staName',title:'发布人',width:80,sortable:true},
			{ field:'noticeTitle',title:'公告内容',width:200,sortable:true},
			{ field:'noticeTime',title:'发布时间',sortable:true,formatter: formatDatebox,width:100},
			{ field:'noticeType',title:'公告类型',width:100,sortable:true},
			{ field:'noticeArea',title:'查看权限',width:100,sortable:true},
			{ field:'bullType',title:'附件类型',width:50,align:'center',
					formatter: function(value,row,index){
					
				if (value =='application/pdf'){
					return "<img src= images/pdf.png>";
				} else if(value =='application/msword'){
					return "<img src= images/word.png>";
				} else if(value =='application/octet-stream'){
					return "<img src= images/zip.png>";
				}
				else if(value =='application/vnd.openxmlformats-officedocument.spreadsheetml.sheet'){
					return "<img src= images/excel.png>";
				}
			}
				
			},
			{ field:'bullServerName',title:'附件下载',width:50,align:'center',
					formatter: function(value,row,index){
				if (value !='无附件'){
					return "<a href=/pic/file/"+row.bullServerName+">"+"<img src= images/download.gif>"+"</a>";
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
