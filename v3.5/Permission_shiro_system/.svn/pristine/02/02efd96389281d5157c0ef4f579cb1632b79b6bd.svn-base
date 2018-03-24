<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    <title>公告管理页面</title>
  </head>
  <body>
    <div class="easyui-layout" data-options="fit:true">
    
    <div data-options="region:'center',border:false">
    	<!-- 表格工具开始 -->
        <div id="sntoolbar">
            <form id="selectNoticeByCondition" method="post">
            <div class="wu-toolbar-search">
                <label>发布时间：</label><input id="stime" name="startTime" class="easyui-datebox" style="width:100px">
                <label>--</label><input id="etime" name="endTime" class="easyui-datebox" style="width:100px">
                 <label>公告类型：</label> 
                <select  id="selectType" name="noticeType" class="easyui-combobox" editable=false panelHeight="auto" style="width:100px">
                    <option value="">选择类型</option>
                </select>
               
                <label>关键词：</label><input name="noticeTitle"  placeholder="请输入关键字" class="wu-text" style="width:100px; height: 20px">
                <a id="quaryNotice" href="#" class="easyui-linkbutton" iconCls="icon-search">开始检索</a>
                 <a id="cancelNotice" href="#" class="easyui-linkbutton" iconCls="icon-cancel">清除查询</a>
            </div>
            </form>
        </div>
        <!-- 表格工具结束 -->
        <table id="sndatagrid" toolbar="#sntoolbar"></table>
    </div>
</div>
<!-- 新增公告弹出窗口开始 -->
<div id="wu-dialog" class="easyui-dialog" data-options="closed:true,iconCls:'icon-add'" style="width:400px;  padding:10px;">
	<form id="wu-form" enctype="multipart/form-data" method="post">
        <input type="hidden" name="noticeId" value=""/>
         <input type="hidden" name="bullId" value=""/>
        <table>
            <tr>
                <td width="200" align="right">公告类型:</td>
                <td> 
                 <select   id="upnoticeType" name="noticeType"   editable=false class="easyui-combobox easyui-validatebox"  panelHeight="auto" style="width:200px">
                    <option value="">选择类型</option>
                </select>
              </td>
            </tr>
            <tr>
                <td align="right">查看权限:</td>
                <td>
                 <select id="upnoticepersi" name="noticeAreas"   multiple= true,  editable=false class="easyui-combobox" panelHeight="auto" style="width:200px">
                    <option value="">那些人可以查看</option>
                </select>
				</td>
            </tr>
            <tr>
                <td align="right">公告附件:</td>
                <td><input  name="file" type="file" /></td>
            </tr>
            <tr>
                <td valign="top" align="right">公告内容:</td>
                <td><textarea   name="noticeTitle" rows="6" class="wu-textarea easyui-validatebox" style="width:260px"></textarea></td>
            </tr>
        </table>
    </form>
</div>
<!-- 弹出窗口结束 -->
<script type="text/javascript">

	 //根据条件筛选数据
	$('#quaryNotice').click(function(){
		$('#sndatagrid').datagrid('load',serializeForm($('#selectNoticeByCondition')));
	});
	//清空查询条件
	$('#cancelNotice').click(function(){
	 $('#selectShowNoticeDeptName').combobox('clear');
	 $('#selectType').combobox('clear');
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
	* Name 载入数据
	*/
	$('#sndatagrid').datagrid({
		idField:'noticeId',     //数据表格必须配置，相当于主键
		striped:true,    //隔行变色
		url:'loadNoticeToShow.action',
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
			{ field:'noticeTitle',title:'公告内容',width:200,sortable:true},
			{ field:'noticeType',title:'公告类型',width:100,sortable:true},
			{ field:'staName',title:'发布人',width:80,sortable:true},
			{ field:'noticeTime',title:'发布时间',sortable:true,formatter: formatDatebox,width:100},
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
