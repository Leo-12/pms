<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
    <title>main</title>
    <base target="_self">
    <link rel="stylesheet" type="text/css" href="skin/css/base.css" />
    <link rel="stylesheet" type="text/css" href="skin/css/main.css" />

    <script type="application/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript">

    </script>

</head>
<body leftmargin="8" topmargin='8'>

<table width="98%" align="center" border="0" cellpadding="3"
       cellspacing="1" bgcolor="#CBD8AC"
       style="margin-bottom: 8px; margin-top: 8px;">
    <tr>
        <td colspan="3" background="skin/images/frame/wbg.gif" bgcolor="#EEF4EA"
            class='title'>
            <span>员工论坛</span> |<span>生活广场</span> |<span>租房信息</span><a href='forum-add.jsp' style='padding-left: 1260px'><font size="5">发帖</font></a>
        </td>
    </tr>
    <% for(int i=0;i<12;i++){
        if (i % 3 == 0) {%>
    <tr bgcolor="#FFFFFF">
        <%}%>

        <td>
            <ul class="notice-list">
                <li class="ue-clear">
                    <span><img src="${pageContext.request.contextPath}/images/tx.png" height="50px" width="50px"/></span> 发布时间：2018-12-25
                    <a href="role.jsp"class="notice-title">招租信息</a>
                </li>
            </ul>
        </td>
        <%} %>

    </tr>
</table>

</body>
</html>