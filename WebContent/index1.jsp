<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="javax.xml.soap.MimeHeaders" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/8/5
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" errorPage="error.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <meta charset="utf-8">
    <title>初始页面</title>
      <script src="./jquery-3.4.1.min.js"></script>
<%--      <style>
          .blue{
              color:blue;
          }
          .important{
                font-size: 25px;
                text-align: center;
          }
      </style>--%>
      <script type="text/javascript">
            /*    $("document").ready(function () {
                  $("#1").click(function () {
                      $("#div1").hide();
                  });
                  $("#2").click(function () {
                      $("#div1").show();
                  });
                  $("#3").click(function () {
                      $("#div1").toggle();
                  });
                });*/
/*            $("document").ready(function () {
                $(".button1").click(function () {
                    $(".p1").hide();
                });
                $(".button2").click(function () {
                    $(".p2").hide();
                });
                $(".button3").click(function () {
                    $(".p3").hide();
                });
            });*/
/*$("document").ready(function () {
    $(".button1").hover(function () {
        $("p").hide();
    });
    $(".button2").click(function () {
        $(".p1").show();
    });
})*/
/*            $("document").ready(function () {
                $("#1").click(function () {
                    $("#div1").addClass("blue");
                    $("#div1").addClass("important");
                });
                $("#2").click(function () {
                    $("#div1").removeClass("blue");
                    $("#div1").removeClass("important");
                });
                $("#3").click(function () {
                    $("#div1").toggleClass("blue");
                    $("#div1").toggleClass("important");
                });
            });*/
/*                $("document").ready(function () {
                    $("#1").click(function () {
                        alert($("#div1").text());
                    });
                    $("#2").click(function () {
                        alert($("#div1").html());
                    });
                    $("#3").click(function () {
                        $("#div1").text("我是刘杰")
                    })
                    $("#4").click(function () {
                        $("#div1").html("代码值")
                    });
                    $("#5").click(function () {
                        $("#id1").val("liujie");
                        $("#id2").val("123456lj");
                    });
                    $("#6").click(function () {
                        alert($("#id1").val());
                        alert($("#id2").val());
                    });
                });*/
/*                $("document").ready(function () {
                    $("#1").click(function () {
                        $("div").fadeIn("slow");
                    });
                    $("#2").click(function () {
                        $("div").fadeOut("slow");
                    })
                    $("#3").click(function () {
                        $("div").fadeToggle("slow");
                    });
                });*/
/*                    $("document").ready(function () {
                        $("#1").click(function () {
                            $("#div1").animate({
                                left:"200px",//左边距
                                width:"250px",
                                height:"250px",
                                opacity:"0.5"//透明度
                            });
                            $("#div1").animate({
                                left:"200px",//左边距
                                width:"300px",
                                height:"200px",
                                opacity:"0.5"//透明度
                            });
                            $("#div1").animate({
                                left:"200px",//左边距
                                width:"250px",
                                height:"200px",
                                opacity:"0.5"//透明度
                            });
                            $("#div1").animate({
                                left:"200px",//左边距
                                width:"200px",
                                height:"330px",
                                opacity:"0.5"//透明度
                            });
                        });
                    });*/
                        /*$("document").ready(function () {*/
/*                            $("#1").click(function () {
                                $("#span1").parent().css({
                                    background:"blue",
                                    border: "2px solid blue"
                                });
                            });
                            $("#2").click(function () {
                                $("#span2").parents().css({
                                    background:"blue",
                                    border: "2px solid red"
                                });
                            });
                            $("#3").click(function () {
                                $("#span3").parentsUntil().css({
                                    background:"blue",
                                    border: "2px solid green"
                                });
                            });*/
/*                            $("#1").click(function () {
                                $("#li1").siblings().css({
                                    color:"blue",
                                    border:"2px solid blue"
                                });

                            });
                            $("#2").click(function () {
                                $("#li2").next().css({
                                    color:"red",
                                    border:"2px solid blue"
                                });

                            });
                            $("#3").click(function () {
                                $("#li1").nextUntil("#li3").css({
                                    color:"green",
                                    border:"2px solid blue"
                                });

                            });*/
/*                            $("#1").click(function () {
                                $("#li3").prev().css({
                                    color:"blue",
                                    border:"2px solid blue"
                                });
                            });
                            $("#2").click(function () {
                                $("#li3").prevAll().css({
                                    color:"red",
                                    border:"2px solid blue"
                                });
                            });
                            $("#3").click(function () {
                                $("#li3").prevUntil("#li0").css({
                                    color:"green",
                                    border:"2px solid blue"
                                });
                            });*/
/*                            $("#1").click(function () {
                                $("#ul1").children().css({
                                    color:"green",
                                    border:"2px solid blue"
                                });
                            });
                            $("#2").click(function () {
                                $("#ul1").find("#li1").css({
                                    color:"blue",
                                    border:"2px solid blue"
                                });

                            });
                        });*/
           $("document").ready(function () {
                $("#1").click(function () {
/*                    $.get(
                        "http://localhost:8080/20200805_JSP/Success.jsp",
                        {
                            city:document.getElementById("city").value,
                            street:document.getElementById("street").value
                        },
                        function (data,status) {
                            alert(status);
                            $("#div1").html(data);
                        }
                    );*/
/*                    $.ajax({
                      url:"http://localhost:8080/20200805_JSP/Success.jsp",
                      type:"get",
                      data:{
                          city:document.getElementById("city").value,
                          street:document.getElementById("street").value
                      },
                      success:function(data,status,xhr){
                        alert(status);
                        $("#div1").html(data);

                      }
                        }
                    );*/
                    $.ajax({
                        url:"http://localhost:8080/System_Servlet/Success.jsp",
                        type:"post",
                        data:{
                            username:document.getElementById("username").value,
                            password:document.getElementById("password").value,
                            sex:document.getElementById("sex").value,
                            age:document.getElementById("age").value
                        },
                        success:function (data,status) {
                            alert(status);
                            $("#div1").html(data);
                        }
                    });

                });

           });
      </script>
  </head>
  <%request.setCharacterEncoding("utf-8");%>
  <body>
<%--    用户名：<%=request.getParameter("username")%>
    密码：<%=request.getParameter("password")%>
    username:${param.username}
    password:${param.password}--%>
    <%--爱好：${param.music}/${param.sport}/${param.game}
    <br>--%>
    <%--水果：${paramValues.fruit[0]}/${paramValues.fruit[1]}/${paramValues.fruit[2]}--%>
    <%--水果：${param.fruit}--%>
<%--<% List<String> list=new ArrayList<>();
    list.add("Hello");
    list.add("World!");
    pageContext.setAttribute("list",list);
%>
${list.get(0)}&nbsp;&nbsp;${list.get(1)}
<%
    Map<Long,String> map=new HashMap<>();
    map.put(1L,"I");
    map.put(2L,"Love");
    map.put(3L,"jinjin");
    pageContext.setAttribute("map",map);
%>
${map.get(1)}&nbsp;&nbsp;${map.get(2)}&nbsp;&nbsp;${map.get(3)}--%>
<%--    <%
        pageContext.setAttribute("num1",100);
        pageContext.setAttribute("num2",200);
        pageContext.setAttribute("num3",true);
        pageContext.setAttribute("num4",false);
    %>
    ${num1+num2}&nbsp;&nbsp;${num2-num1}&nbsp;&nbsp;${num1==num2}&nbsp;&nbsp;${num1<num2}
    ${num3&&num4}&nbsp;&nbsp;${num3||num4}
    ${num1<num2?"小于":"大于"}--%>
<%--    <%! int count=0;%>
    <%response.setHeader("refresh","2");%>
    一共刷新了<%=count++%>次--%>
<%--    <%
        int code=1000;
        String username="张三";
        double price=99.50;
        List<String> list=new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
    %>
    <%
        out.println(code);
        out.println(username);
        out.println(price);
        out.println(list);
    %>--%>
<%--  <%@include file="Login.jsp" %>--%>
 <%--   <jsp:include page="Login.jsp">
        <jsp:param name="city" value="北京"/>
    </jsp:include>--%>
<%--<jsp:forward page="Success.jsp">
    <jsp:param name="username" value="liujie"/>
    <jsp:param name="password" value="123456lj"/>
</jsp:forward>--%>
<%--  <form action="Success.jsp" method="post">
      用户名：<input type="text" name="username">
      密码：<input type="password" name="password">
      <input type="submit" value="登录">
  </form>--%>
<%--    <c:set value="${80+8}" var="sessionVar" scope="page"></c:set>
    <c:out value="${sessionVar}"></c:out>
    <c:remove var="sessionVar"></c:remove>
    <c:out value="${sessionVar}"></c:out>--%>
<%--    <%
        User user=new User("liujie","123456lj");
        pageContext.setAttribute("username",user.getUsername());
        pageContext.setAttribute("password",user.getPassword());
    %>
    <c:set var="User" value="${username}" scope="request" ></c:set>
    <c:set var="Pass" value="${password}" scope="request" ></c:set>
    <jsp:forward page="Login.jsp"></jsp:forward>--%>
<%--    <c:set var="testVar" value="${80+8}"></c:set>
    <c:if test="${testVar!=null}">
        <c:out value="${testVar}"></c:out>
        <c:set value="${testVar+2}" var="testVar2"></c:set>
    </c:if>
    <c:choose>
        <c:when test="${testVar2>88}">
            <c:out value="testVar2 大于88"></c:out>
        </c:when>
        <c:otherwise>
            <c:out value="testVar2 小于于88"></c:out>
        </c:otherwise>
    </c:choose>--%>
<%--    <%
        String members[]={"aaa","bbb","ccc"};
        pageContext.setAttribute("members",members);
        List<String> list=new ArrayList<>();
        list.add("liujie");
        list.add("wmh");
        pageContext.setAttribute("list",list);
    %>
    <c:forEach items="${members}" var="member">
        ${member}
    </c:forEach>
    <br>
    <c:forEach items="${list}">
        ${list}
    </c:forEach>--%>
<%--    <%
        String url="www.cctv.com";
        pageContext.setAttribute("url",url);
    %>
    <c:forTokens items="${url}" delims="." var="element">
        <c:out value="${element}"></c:out>
    </c:forTokens>--%>
<%--    <c:url value="/Login.jsp" var="newUrl">
        <c:param name="author" value="liujie"></c:param>
        <c:param name="time" value="2020.08.06"></c:param>
    </c:url>
    <a href="${newUrl}">点击跳转</a>--%>
    <%--<c:redirect url="/Login.jsp" context="/20200805_JSP">
        <c:param name="author" value="liujie"></c:param>
    </c:redirect>--%>
<%--    <div id="div1" class="class1">
        第一块
    </div>
    <div id="div2" class="class2">
        第二块
    </div>
    <button id="1">隐藏div</button>
    <button id="2">显示</button>
    <button id="3">切换</button>--%>
<%--<div>
    <p class="p1">this is p1</p>
    <p class="p2">this is p2</p>
    <p class="p3">
        this is p3
        <span id="span1"></span>
        <span id="span2"></span>
        <span id="span3"></span>
    </p>
</div>
<button class="button1">测试选择器1</button>
<button class="button2">测试选择器2</button>
<button class="button3">测试选择器3</button>--%>
<%--<div id="div1">
    <lable>欢迎访问网站1</lable>
</div>
<div id="div2">
    欢迎访问网站2
</div>--%>
<%--  <button id="1">获取文本值</button>
  <button id="2">获取代码值</button>
  <button id="3">设置文本值</button>
  <button id="4">设置代码值</button>
  <button id="5">设置输入框值</button>
  <button id="6">获取输入框值</button>
  <form >
      用户名：<input id="id1" type="text" name="username">
      密码：<input id="id2" type="password" name="password">
  </form>--%>
<%--    <div id="div1" style="height: 100px;width: 100px; display: none; background: red;"></div>
    <div id="div2" style="height: 100px;width: 100px; display: none; background: green;"></div>
    <div id="div3" style="height: 100px;width: 100px; display: none; background: blue;"></div>
    <button id="1">淡入</button>
    <button id="2">淡出</button>
    <button id="3">切换</button>--%>
<%--    <div id="div1" style=" position:relative; width: 200px;height: 200px;background: blue;">

    </div>
  <button id="1">测试动画</button>--%>
<%--<div id="div1">
    div1节点
    <ul id="ul1">
        ul1节点
        <li id="li0">
            li0节点
            <span id="span0">span0节点</span>
        </li>
        <li id="li1">
            li1节点
           <span id="span1"> span1节点</span>
        </li>
        <li id="li2">
            li2节点
            <span id="span2">span2节点</span>
        </li>
        <li id="li3">
            li3节点
            <span id="span3">span3节点</span>
        </li>
    </ul>
</div>
  <button id="1">所有子节点</button>
    <button id="2">某一个子节点</button>
    <button id="3">间隔的</button>--%>
<%--  城市:<input type="text" name="city" id="city">
  街道：<input type="text" name="street" id="street">
  <div id="div1">
    服务器的返回数据
  </div>
  <button id="1">测试get</button>--%>
  <form >
      用户名：<input type="text" name="username" id="username">
      密码：<input type="password" name="password" id="password">
      性别：<select id="sex">
            <option value="男">男</option>
            <option value="女">女</option>
  </select>
      年龄：<input type="text" name="age" id="age">
      <button id="1" >确定</button>
      <div id="div1">
          服务器的返回数据
      </div>
  </form>
  </body>
</html>
