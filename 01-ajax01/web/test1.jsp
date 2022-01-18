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

                /*
                * 关于同步和异步：
                * 设置:
                *   async:true 异步
                *       通过观察得到的结果，下面的alert弹框没有等到ajax执行完毕就执行了。全程是两个线程，一个主线程负责执行方法中的普通代码，一根线程执行ajax，
                *           两个线程彼此之间互相独立，互相是不受影响的。
                *
                *   async:false 同步
                *       通过观察得到的结果，下面的弹框必须等到上面的ajax执行完毕后才能执行弹框，整个过程只有一个线程。
                * */
                $.ajax({
                    url:"myServlet01.do",//访问后台的servlet地址
                    // data:"key1=value1&key2=value2",  //为后台传递的参数
                    // data:{  //为后台传递参数
                    //     "key1":"value1",
                    //     "key2":"value2"
                    // },
                    type:"get",  //请求方式，get/post
                    dataType:"text",  //从后台接受数据的方式，text，接受普通问题，json，接收json格式的文本
                    success:function (data){   //回调函数（该函数的执行时机事后台执行完毕后，该函数才会执行）
                        //data，从后台响应回来的数据
                        $("#msg").html(data);
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
    <div id="msg2" style="width: 200px;height: 200px;background-color: pink">阿拉八八八八</div>
</body>
</html>
