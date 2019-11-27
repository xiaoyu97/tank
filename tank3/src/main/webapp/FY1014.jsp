<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>项目经历</title>
    <link href="/css/projectExperience.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="/js/projectExperience.js"></script>
    <script type="text/javascript" src="/js/jquery-3.4.1.min.js"></script>


</head>
<body>
<h3>项目经历</h3>
<input type="button" onClick="msgbox(1)" value="点击弹出输入框">
<%--弹框--%>
<div id='inputbox' class="box">
<%-- X 图片   --%>
    <img class='x' href='' ; onclick="msgbox(0); return false;" src="./images/aaa.png" width="50" height="60" alt=""/>
<%--  弹框主体  --%>
    <div class="main">
<%--   表单提交  --%>
        <form >
            <h3>项目经验</h3>

            <label class="itemTitle">项目名称</label><input id="pwd" class="project" type="text" name="name"
                                                        placeholder="请填写项目名称" onblur="checkpwd(pwd)"
                                                        required="required"><br>
            <div id="pwd_i"></div>
            <label class="itemTitle">项目链接</label><input id="link" class="project1" type="text" name="link"
                                                        placeholder="请填写项目链接 （选填）"><br>
            <label class="itemTitle">项目周期</label>
            <input id="begin_time" class="time" type="date" name="begin" placeholder="开始时间" required="required">
            <input id="end_time" class="time" type="date" name="end" placeholder="结束时间" required="required"><br>
            <label class="itemTitle">项目描述</label> <textarea id="txt" class="desc" name="desc" required="required" maxlength="1500"></textarea><span
                class='two'><span
                id="count"></span>/1500 文字</span><br>
            <label class="itemTitle">你的成就</label> <textarea id="txt1" class="desc" name="achievement" required="required" maxlength="1500"></textarea>
            <span class='two'><span id="count1"></span>/1500 文字</span><br>

            <input class="button" onclick="save()" type="submit" value="保存" style="color: #FFFFFF">
        </form>
    </div>
</div>
</body>
</html>
