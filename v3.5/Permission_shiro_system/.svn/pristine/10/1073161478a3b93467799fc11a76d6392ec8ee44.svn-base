<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  

    <title>部门管理页面</title>
  </head>
  <body>
    <div class="easyui-layout" data-options="fit:true">
    
    <div data-options="region:'center',border:false">
    	<!-- 表格工具开始 -->
        <div class="noticetypetoolbar">
            <div class="wu-toolbar-button">
                <a href="#" class="easyui-linkbutton" iconCls="icon-add" onclick="openAdd()" plain="true">添加类型</a>
                <a href="#" class="easyui-linkbutton" iconCls="icon-edit" onclick="openEdit()" plain="true">修改类型</a>
                <a href="#" class="easyui-linkbutton" iconCls="icon-remove" onclick="removeNoticeType()" plain="true">删除类型</a>
                <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="cancel()" plain="true">取消</a>
                <a href="#" class="easyui-linkbutton" iconCls="icon-reload" onclick="reload()" plain="true">刷新</a>
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
            <form id="selectNoticeTypeByCondition" method="post">
            <div class="wu-toolbar-search">
                <label>创建时间：</label><input id="stime"  name="startTime" class="easyui-datebox" style="width:100px">
                <label>--</label><input id="etime"  name="endTime" class="easyui-datebox" style="width:100px">
                 <label>创建人：</label><input id="ntauthor" name="ntauthor"  placeholder="创建人查询" class="wu-text" style="width:100px;height: 20px">
                <label>关键字：</label><input id="ntname" name="ntname"  placeholder="关键字查询" class="wu-text" style="width:100px;height: 20px">
                <a  id="quaryNoticeType" href="#" class="easyui-linkbutton" iconCls="icon-search">开始检索</a>
                <a id="cancelNoticeType" href="#" class="easyui-linkbutton" iconCls="icon-cancel">清除查询</a>
            </div>
            </form>
        </div>
        
        <!-- 表格工具结束 -->
        <table class="noticetypetlist"  toolbar=".noticetypetoolbar"></table>
    </div>
</div>
<!-- 新增窗口开始 -->
<div id="addntipe" class="easyui-dialog" data-options="closed:true,iconCls:'icon-save'" style="width:320px;  padding:10px;">
	<form id="ntipeform" method="post">
	<input type="hidden" name="ntid" value="">
        <table>
            <tr>
                <td width="200" align="right">类型名称:</td>
                <td> 
                 <input name="ntname" type="text"   class="easyui-validatebox" style="width: 200px"  placeholder="请输入部门名称" />
              </td>
            </tr>
        </table>
    </form>
</div>

<script type="text/javascript">
	/**
	*查询类型
	*/
	 //根据条件筛选数据
	$('#quaryNoticeType').click(function(){
		$('.noticetypetlist').datagrid('load',serializeForm($('#selectNoticeTypeByCondition')));
		
	});
	//清空查询条件
	$('#cancelNoticeType').click(function(){
	/*  $('#ntauthor').combobox('clear');
	 $('#ntname').combobox('clear'); */
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
	* Name 打开添加窗口
	*/
	function openAdd(){
	
		$('#ntipeform').form('clear');
		$('#addntipe').dialog({
			closed: false,
			modal:true,
            title:"添加类型",
            buttons: [{
                text: '确定',
                iconCls: 'icon-ok',
                handler: addntype
            }, {
                text: '取消',
                iconCls: 'icon-cancel',
                handler: function () {
                    $('#addntipe').dialog('close');                    
                }
            }]
        });
	}
	/**
	* Name 添加记录
	*/
	function addntype(){
		if($('#ntipeform').form('validate')){
			$('#ntipeform').form('submit', {
			url:'addNoticeType.action',
			success:function(data){
				if(data){
					$.messager.show({
							title:'提示信息',
							msg:'添加成功！'
						});
					$('#addntipe').dialog('close');
					//刷新数据表格页面
					$('.noticetypetlist').datagrid('reload');
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
	* Name 打开修改窗口
	*/
	function openEdit(){
		$('#ntipeform').form('clear');
		var item = $('.noticetypetlist').datagrid('getSelections');
		if(item.length != 1){
			$.messager.show({
				title:'提示信息！',
				msg:'只能选择一行记录进行修改'
			});
		}else {
			//修改记录
			$('#addntipe').dialog({
			closed: false,
			modal:true,
			iconCls: 'icon-edit',
            title: " 修改公告类型",
            buttons: [{
                text: '确定',
                iconCls: 'icon-ok',
                handler: editntype
            }, {
                text: '取消',
                iconCls: 'icon-cancel',
                handler: function () {
                    $('#addntipe').dialog('close');                    
                }
            }]
        });
			$('#addntipe').dialog('open');
				$('#ntipeform').form('load',{
					ntname:item[0].ntname, 
					ntid:item[0].ntid
				});
			}
		}
		
		/**
	* Name 修改记录
	*/
	function editntype(){
		$('#ntipeform').form('submit', {
			url:'editNoticeType.action',
			success:function(data){
				if(data){
					$.messager.show({
							title:'提示信息',
							msg:'修改成功！'
						});
					$('#addntipe').dialog('close');
					$('.noticetypetlist').datagrid('reload');
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
	function removeNoticeType(){
		var item = $('.noticetypetlist').datagrid('getSelections');
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
								ids += item[i].ntid+',';
							}
							
							ids = ids.substring(0, ids.length-1);

							$.post('deleteNoticeType.action',{idlist:ids},function(result){
								//删除成功
								//刷新数据表格
								$('.noticetypetlist').datagrid('reload');
								$('.noticetypetlist').datagrid('unselectAll');
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
	* Name 载入数据
	*/
	$('.noticetypetlist').datagrid({
		idField:'ntid',     //数据表格必须配置，相当于主键
		striped:true,    //隔行变色
		url:'noticetypeList.action',
		loadMsg:'数据正在加载，请等待',
		rownumbers:true,
		multiSort:true,
		singleSelect:false,
		pageSize:20,
    	pageList :[5,10,20,50],
    	pagination:true,
		multiSort:true,
		
		fitColumns:true,
		fit:true,
		columns:[[
			{ checkbox:true},
			{ field:'ntid',title:'类型id',hidden:true},
			{ field:'ntname',title:'公告类型',width:80,sortable:true},
			{ field:'ntcreate',title:'创建时间',width:80,sortable:true,formatter: formatDatebox},
			{ field:'ntauthor',title:'创建人',width:80,sortable:true}
			
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
