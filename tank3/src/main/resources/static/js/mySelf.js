//点击按钮打开/关闭 对话框
function msgbox(n) {
    document.getElementById('inputbox').style.display = n ? 'block' : 'none';
}

//字数提示
window.onload = function () {

    var otxt1 = document.getElementById("txt1");
    var ocount1 = document.getElementById("count1");
    otxt1.oninput = function () {
        ocount1.innerHTML = otxt1.value.length;
    }

}