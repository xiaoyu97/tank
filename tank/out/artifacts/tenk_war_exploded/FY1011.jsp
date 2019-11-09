
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>自我介绍</title>
    <link href="./css/mySelf.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="./js/mySelf.js"></script>

</head>
<body>
<h3>自我介绍</h3>
<input type="button" onClick="msgbox(1)" value="点击弹出输入框">
<%--弹框--%>
<div id='inputbox' class="box">
    <%-- X 图片   --%>
    <img class='x' href='' ; onclick="msgbox(0); return false;" src="./images/aaa.png" width="50" height="60" alt=""/>
        <%--   表单提交  --%>
        <form action="mySelfServlet" method="post">
            <h3 id="txt">自我介绍</h3>
            <textarea id="txt1" name="myself" required="required" maxlength="1500"></textarea>
            <span class='two'><span id="count1"></span>/150 文字</span><br>

            <input class="button" type="submit" value="保存" style="color: #FFFFFF">
        </form>
    </div>
</body>
</html>
