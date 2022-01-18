
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
                    url:"myServlet03.do",//访问后台的servlet地址
                    // data:"key1=value1&key2=value2",
                    // data:{  //为后台传递参数
                    //     "key1":"value1",
                    //     "key2":"value2"
                    // },
                    type:"get",  //请求方式，get/post
                    dataType:"json",  //从后台接受数据的方式，text，接受普通问题，json，接收json格式的文本
                    success:function (data){   //回调函数（该函数的执行时机事后台执行完毕后，该函数才会执行）

                        $("#id1").html(data.s1.id);
                        $("#name1").html(data.s1.name);
                        $("#age1").html(data.s1.age);

                        $("#id2").html(data.s2.id);
                        $("#name2").html(data.s2.name);
                        $("#age2").html(data.s2.age);


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
    学员1：<br/>
    编号：<span id="id1"></span><br/>
    姓名：<span id="name1"></span><br/>
    年龄：<span id="age1"></span><br/>
    <br/>
    <br/>

    学员2：<br/>
    编号：<span id="id2"></span><br/>
    姓名：<span id="name2"></span><br/>
    年龄：<span id="age2"></span><br/>
    <br/>
    <br/>
</body>
</html>
