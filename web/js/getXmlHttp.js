/**
 * Created by Administrator on 2017/5/27.
 */


function getXmlHttp() {
    var xmlhttp1;
    if (window.XMLHttpRequest) {
        xmlhttp1 = new XMLHttpRequest();
    }// IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
    else {
        xmlhttp1 = new ActiveXObject("Microsoft.XMLHTTP");
    }// IE6, IE5 浏览器执行代码
    return xmlhttp1;

}