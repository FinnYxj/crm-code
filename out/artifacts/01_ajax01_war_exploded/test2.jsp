
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath()+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
    <script src = "js/jquery-3.4.1.js"></script>
    <script>
        $(function (){

            $("#djBtn").click(function (){
                // $("#msg").html(234112312323);
                $.ajax({
                    url:"myServlet02.do",//访问后台的servlet地址
                    // data:"key1=value1&key2=value2",
                    // data:{  //为后台传递参数
                    //     "key1":"value1",
                    //     "key2":"value2"
                    // },
                    type:"get",  //请求方式，get/post
                    dataType:"json",  //从后台接受数据的方式，text，接受普通问题，json，接收json格式的文本
                    success:function (data){   //回调函数（该函数的执行时机事后台执行完毕后，该函数才会执行）
                        //data，从后台响应回来的数据
                        // $("#msg").html(data);
                        alert(data);
                        //我们是以json.key的形式来获得value；
                        alert(data.str1+"  "+data.str2);
                    }
                })
            })
        })
    </script>
</head>
<body>
    <button id="djBtn">点击</button>
    <br/>
    <br/>
    <div id="msg" style="width: 200px;height: 200px;background-color: pink">


    </div>
    <br/>
    <br/>
    <div id="msg2" style="width: 200px;height: 200px;background-color: pink"></div>
</body>
</html>
