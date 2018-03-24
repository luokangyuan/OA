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
        <div class="wu-toolbar">
            <div class="wu-toolbar-button">
                <a href="#" class="easyui-linkbutton" iconCls="icon-add" onclick="openAdd()" plain="true">添加部门</a>
                <a href="#" class="easyui-linkbutton" iconCls="icon-edit" onclick="openEditdept()" plain="true">修改部门</a>
                <a href="#" class="easyui-linkbutton" iconCls="icon-remove" onclick="removeDept()" plain="true">删除部门</a>
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
            <div class="wu-toolbar-search">
                <label>创建时间：</label><input class="easyui-datebox" style="width:100px">
                <label>--</label><input class="easyui-datebox" style="width:100px">
                <label>部门名称：</label> 
                <select class="easyui-combobox" panelHeight="auto" style="width:100px">
                    <option value="0">选择部门名称</option>
                    <option value="1">数据分析部</option>
                    <option value="2">办公室</option>
                    <option value="3">市场分析部</option>
                     <option value="4">软件开发部</option>
                </select>
                 <label>上级部门：</label> 
                <select class="easyui-combobox" panelHeight="auto" style="width:100px">
                    <option value="0">选择部门名称</option>
                    <option value="1">公司会议</option>
                    <option value="2">部门会议</option>
                    <option value="3">公司计划</option>
                     <option value="4">奖惩规定</option>
                </select>
                <label>部门描述：</label><input  placeholder="请输入部门描述" class="wu-text" style="width:100px;height: 20px">
                <a href="#" class="easyui-linkbutton" iconCls="icon-search">开始检索</a>
                <a id="cancelNotice" href="#" class="easyui-linkbutton" iconCls="icon-cancel">清除查询</a>
            </div>
        </div>
        <!-- 表格工具结束 -->
        <table class="deptlist"  toolbar=".wu-toolbar"></table>
    </div>
</div>
<!-- 新增窗口开始 -->
<div id="adddeptdialog" class="easyui-dialog" data-options="closed:true,iconCls:'icon-save'" style="width:380px;  padding:10px;">
	<form id="deptform" method="post">
        <table>
            <tr>
                <td width="200" align="right">部门名称:</td>
                <td> 
                 <input name="deptName" type="text"   style="width: 200px"  placeholder="请输入部门名称" />
              </td>
            </tr>
            <tr>
                <td align="right">上级部门:</td>
                <td>
                 <select class="supperName" name="deptSupperName"   class="easyui-combobox" panelHeight="auto" style="width:200px">
                    <option value="" >上级部门名称</option>
                </select>
				</td>
            </tr>
            <tr>
                <td valign="top" align="right">部门描述:</td>
                <td><textarea name="deptRemark"   rows="6" class="wu-textarea" style="width:260px"></textarea></td>
            </tr>
        </table>
    </form>
</div>
<!-- 修改窗口结束 -->
<div id="updeptdialog" class="easyui-dialog" data-options="closed:true,iconCls:'icon-save'" style="width:400px;  padding:10px;">
	<form id="updeptform" method="post">
		<!-- 部门id -->
		<input type="hidden" name="deptId" id="selectdepid" value=""/>
		<!--  员工id -->
		<input type="hidden" name="staId" value="">
        <table>
            <tr>
                <td width="200" align="right">部门名称:</td>
                <td> 
                 <input name="deptName" type="text"   class="easyui-validatebox" style="width: 200px"  placeholder="请输入部门名称" />
              </td>
            </tr>
             <tr>
                <td align="right">部门负责人:</td>
                <td>
                 <select id="deptcharge" name="staName"   class="easyui-combobox" panelHeight="auto" style="width:200px">
                </select>
				</td>
            </tr>
           
            <tr>
                <td valign="top" align="right">部门描述:</td>
                <td><textarea name="deptRemark"   rows="6" class="wu-textarea easyui-validatebox" style="width:260px"></textarea></td>
            </tr>
        </table>
    </form>
</div>
<script type="text/javascript">
	//加载新增窗口的上级部门名称
	  $('#deptcharge').combobox({
	 	onShowPanel:function(){
	 	var depid = $("#selectdepid").val();
	 	$('#deptcharge').combobox({
	 	
	 	url:'loadDeptChart.action?deptid='+depid, 
	    valueField:'staname',    
	    textField:'staname'   
	 });
	 	}
	 });
	 //加载修改窗口中的部门员工
	  $('.supperName').combobox({
	 	onShowPanel:function(){
	 	$('.supperName').combobox({
	 	url:'loadSupperDept.action',    
	    valueField:'deptName',    
	    textField:'deptName'   
	 });
	 	}
	 });
	/**
	* Name 添加记录
	*/
	function addDept(){
	if($('#deptform').form('validate')){
		$('#deptform').form('submit', {
			url:'insertDept.action',
			success:function(data){
				if(data){
					$.messager.show({
						title:'提示信息',
						msg:'添加成功！'
					});
					$('#adddeptdialog').dialog('close');
					//刷新数据表格页面
					$('.deptlist').datagrid('reload');
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
	function editdept(){
		$('#updeptform').form('submit', {
			url:'editDept.action',
			success:function(data){
				if(data){
					$.messager.show({
					
						title:'提示信息',
						msg:'修改成功！'
					});
					$('#updeptdialog').dialog('close');
					$('.deptlist').datagrid('reload');
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
	function removeDept(){
		$('#updeptform').form('clear');
		var item = $('.deptlist').datagrid('getSelections');
		var count=0;
		for(var j= 0; j<item.length;j++){
				count +=item[j].deptCount;
				} 
				
			if(count>0){
				$.messager.show({
					title:'提示信息！',
					msg:'你选择的部门有员工不能删除'
				});
			}else{
			var item = $('.deptlist').datagrid('getSelections');
				if(item.length <= 0){
					$.messager.show({
						title:'提示信息！',
						msg:'至少选择一行进行删除'
					});
				}else{
					$.messager.confirm('提示信息','确认删除吗？', function(r){
						if(r){
								//删除用户
									var dids = '';
									for(var i= 0; i<item.length;i++){
										dids += item[i].deptId+',';
									}
									
									dids = dids.substring(0, dids.length-1);
									
									$.post('deletedept.action',{deptidlist:dids},function(result){
										
										//删除成功
										//刷新数据表格
										$('.deptlist').datagrid('reload');
										$('.deptlist').datagrid('unselectAll');
										$.messager.show({
											title:'提示信息',
											msg:'删除成功！'
										});
									});
							}
					});
				}
		}
				
	
	}
	
	/**
	* Name 打开添加窗口
	*/
	function openAdd(){
		$('#deptform').form('clear');
		$('#adddeptdialog').dialog({
			closed: false,
			modal:true,
            title: "添加部门",
            buttons: [{
                text: '确定',
                iconCls: 'icon-ok',
                handler: addDept
            }, {
                text: '取消',
                iconCls: 'icon-cancel',
                handler: function () {
                    $('#adddeptdialog').dialog('close');                    
                }
            }]
        });
	}
	
	/**
	* Name 打开修改窗口
	*/
	function openEditdept(){
		$('#updeptform').form('clear');
		var item = $('.deptlist').datagrid('getSelections');
		if(item.length != 1){
			$.messager.show({
				title:'提示信息！',
				msg:'只能选择一行记录进行修改'
			});
		}else{
			$('#updeptdialog').dialog({
			closed: false,
			modal:true,
			iconCls: 'icon-edit',
            title: " 修改部门信息",
            buttons: [{
                text: '确定',
                iconCls: 'icon-ok',
                handler: editdept
            }, {
                text: '取消',
                iconCls: 'icon-cancel',
                handler: function () {
                    $('#updeptdialog').dialog('close');                    
                }
            }]
			
			});
			$('#updeptdialog').dialog('open');
				$('#updeptform').form('load',{
					deptId:item[0].deptId,
					staId:item[0].staId,
					deptName:item[0].deptName,
					deptRemark:item[0].deptRemark,
					staName:item[0].staName
				});
		}
	
	}	
	/**
	* Name 载入数据
	*/
	$('.deptlist').datagrid({
		idField:'deptId',     //数据表格必须配置，相当于主键
		striped:true,    //隔行变色
		url:'loadDept.action',
		loadMsg:'数据正在加载，请等待',
		rownumbers:true,
		multiSort:true,
		singleSelect:false,
		pageSize:20,
    	pageList :[5,10,20,50],
		multiSort:true,
		fitColumns:true,
		fit:true,
		columns:[[
			{ checkbox:true},
			{ field:'deptId',title:'部门主键',width:50,hidden:true},
			{ field:'staId',title:'员工主键',width:50,hidden:true},
			{ field:'deptNumber',title:'部门编号',width:50,hidden:true,sortable:true},
			{ field:'deptName',title:'部门名称',width:80,sortable:true},
			{ field:'deptRemark',title:'部门描述',width:200},
			{ field:'deptCount',title:'部门人数',width:50},
			{ field:'staName',title:'部门负责人',width:100},
			{ field:'staTel',title:'联系电话',width:100},
			{ field:'deptCreate',title:'创建时间',sortable:true,formatter: formatDatebox,width:100},
			{ field:'deptSupperName',title:'上级部门',width:100}
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
