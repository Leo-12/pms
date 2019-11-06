<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java"  pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>编辑项目信息</title>
<link rel="stylesheet" type="text/css" href="skin/css/base.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/My97DatePicker/WdatePicker.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-1.7.2.js"></script>
	<script type="text/javascript">

		$(function(){
		    $.ajax({
				type:"get",
				url:"${pageContext.request.contextPath}/cust/shcujson",
				success:function (msg) {
				    $(msg).each(function(index,item){
                        var option = "<option value='"+item.id+"'>"+item.comname+"</option>";
                        $("#comname").append(option);
					})
                }
			});

            //项目经理
            $.ajax({
                type:"GET",
                url:"${pageContext.request.contextPath}/emp/leader",
                success:function(msg){
                    $(msg).each(function (index,item) {
                        var option = "<option value='"+item.eid+"'>"+item.ename+"</option>";
                        $("#managerList").append(option);
                    });
                }
            });

		});

        function parseLeader(cid) {
            $.ajax({
                type:"GET",
                url:"${pageContext.request.contextPath}/cust/info/" + cid,
                success:function (msg) {
                    $("#comperLeader").val(msg.companyperson);
                }
            })
        }

		function commit(){
			$("#form2").submit();
		}
	</script>
</head>
<body leftmargin="8" topmargin="8" background='skin/images/allbg.gif'>

<!--  快速转换位置按钮  -->
<table width="98%" border="0" cellpadding="0" cellspacing="1" bgcolor="#D1DDAA" align="center">
<tr>
 <td height="26" background="skin/images/newlinebg3.gif">
  <table width="58%" border="0" cellspacing="0" cellpadding="0">
  <tr>
  <td >
    当前位置:项目管理>>编辑项目基本信息
 </td>
 </tr>
</table>
</td>
</tr>
</table>

<form name="form2" id="form2" action="${pageContext.request.contextPath}/pro/update" method="post">
	<input type="hidden" name="_method" value="put">
	<input type="hidden" name="pid" value="${project.pid}">

<table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
<tr bgcolor="#E7E7E7">
	<td height="24" colspan="12" background="skin/images/tbg.gif">&nbsp;编辑项目信息&nbsp;</td>
</tr>
<tr >
	<td align="right" bgcolor="#FAFAF1" height="22">项目名称：</td>
	<td align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
		<input name="pname" value="${project.pname}"/>
	</td>
	<td align="right" bgcolor="#FAFAF1" height="22">客户公司名称：</td>
	<td align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
		<select id="comname" name="comname" onchange="parseLeader(this.value)">
			<option value="${project.comname}">${project.customer.comname}</option>
		</select>
	</td>
</tr>
<tr >
	<td align="right" bgcolor="#FAFAF1" height="22">客户方负责人：</td>
	<td align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
		<input id="comperLeader" name="comper" value="${project.comper}" readonly/>
	</td>
	<td align="right" bgcolor="#FAFAF1" height="22">项目经理：</td>
	<td align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
		<select id="managerList" name="empFk">
			<option value="${project.empFk}">${project.employee.ename}</option>
		</select>
	</td>
</tr>
<tr >
	<td align="right" bgcolor="#FAFAF1" height="22">开发人数：</td>
	<td align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
		<input name="empcount" value="${project.empcount}">人
	</td>
	<td align="right" bgcolor="#FAFAF1" height="22">开始时间：</td>
	<td align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
		<input id="starttime" name="starttime" value="<fmt:formatDate value="${project.starttime}" pattern="yyyy-MM-dd"/>"/>
		<img onclick="WdatePicker({el:'starttime',skin:'YcloudRed'})" src="${pageContext.request.contextPath}/static/js/My97DatePicker/skin/datePicker.gif" width="16" height="22" align="absmiddle">
	</td>
</tr>
<tr >
	<td align="right" bgcolor="#FAFAF1" height="22">立项时间：</td>
	<td align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
		<input id="buildtime" name="buildtime" value="<fmt:formatDate value="${project.buildtime}" pattern="yyyy-MM-dd"/>"/>
		<img onclick="WdatePicker({el:'buildtime',skin:'YcloudRed'})" src="${pageContext.request.contextPath}/static/js/My97DatePicker/skin/datePicker.gif" width="16" height="22" align="absmiddle">
	</td>
	<td align="right" bgcolor="#FAFAF1" height="22">预估成本：</td>
	<td align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
		<input name="cost" value="${project.cost}"/>万
	</td>
</tr>
<tr >
	<td align="right" bgcolor="#FAFAF1" height="22">级别：</td>
	<td align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
		<select name="level">
			<option value="紧急" <c:if test="${project.level == '紧急'}">selected</c:if> >紧急</option>
			<option value="一般" <c:if test="${project.level == '一般'}">selected</c:if> >一般</option>
			<option value="暂缓" <c:if test="${project.level == '暂缓'}">selected</c:if> >暂缓</option>
		</select>
	</td>
	<td align="right" bgcolor="#FAFAF1" height="22">计划完成时间：</td>
	<td align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" height="22">
		<input id="endtime" name="endtime" value="<fmt:formatDate value="${project.endtime}" pattern="yyyy-MM-dd"/>"/>
		<img onclick="WdatePicker({el:'endtime',skin:'YcloudRed'})" src="${pageContext.request.contextPath}/static/js/My97DatePicker/skin/datePicker.gif" width="16" height="22" align="absmiddle">
	</td>
</tr>

<tr >
	<td align="right" bgcolor="#FAFAF1" >备注：</td>
	<td colspan=3 align='left' bgcolor="#FFFFFF" onMouseMove="javascript:this.bgColor='#FCFDEE';" onMouseOut="javascript:this.bgColor='#FFFFFF';" >
		<textarea name="remark" rows=15 cols=130>${project.remark}</textarea>
	</td>
</tr>


<tr bgcolor="#FAFAF1">
<td height="28" colspan=4 align=center>
	&nbsp;
	<a href="javascript:commit()" class="coolbg">保存</a>
	<a href="javascript:history.go(-1)" class="coolbg">返回</a>
</td>
</tr>
</table>

</form>
  

</body>
</html>