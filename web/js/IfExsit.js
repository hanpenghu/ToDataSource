/**
 * Created by Administrator on 2017/5/27.
 */
var id001 = document.getElementById('001');
window.onload = function () {//浏览器加载完毕后
    id001.focus();

}
function OnInput(event) {//当复制粘贴东西到input中的时候
//         alert ("The new content: " + event.target.value);
    var shuRu = event.target.value;
    // 为了应对所有的现代浏览器，包括 IE5 和 IE6，请检查浏览器是否支持 XMLHttpRequest 对象。
// 如果支持，则创建 XMLHttpRequest 对象。如果不支持，则创建 ActiveXObject ：实例
    var xmlhttp;
//        alert(xmlhttp)
    xmlhttp=getXmlHttp()
    // alert(xmlhttp)//第三个参数的意思是:如果是false,就等待有结果的时候再往下走,没结果就不再继续走
    xmlhttp.open("POST", "/ToDataSource/tt/ex", true);
    xmlhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
    xmlhttp.send("str=" + shuRu + "");
    xmlhttp.onreadystatechange = function () {
//            alert("dsafas")
        if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {

//                alert(xmlhttp.responseText);
            //window.document.getElementById("txt001").value=xmlhttp.responseText
            document.getElementById('002').innerHTML = xmlhttp.responseText;
            document.getElementById('001').select();
        }
    }
    //id001.setAttribute("value","");
}

