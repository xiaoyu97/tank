
//点击按钮打开/关闭 对话框
function msgbox(n) {
    document.getElementById('inputbox').style.display = n ? 'block' : 'none';
}

// 警告提示
function checkpwd (pwd) {
    var infpwd = $("pwd_i"),
        val = pwd.value;

    if (!val) {
        infpwd.innerHTML = "请输入有效的项目名称！"
        return false;
    }
    infpwd.innerHTML=" "
    return true;
}

function $(id){
    return document.getElementById(id);
}

//字数提示
window.onload = function () {
    var otxt = document.getElementById("txt");
    var ocount = document.getElementById("count");
    otxt.oninput = function () {
        ocount.innerHTML = otxt.value.length;
    }

    var otxt1 = document.getElementById("txt1");
    var ocount1 = document.getElementById("count1");
    otxt1.oninput = function () {
        ocount1.innerHTML = otxt1.value.length;
    }

}