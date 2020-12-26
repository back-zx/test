<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<br>
<%--
    前台路径：
    以“/”开头的路径的参照路径是：当前web服务器的根
    不以“/”开头的路径的参照路径是：当前请求路径的资源路径

    后台路径：
    以“/”开头的路径的参照路径是：当前web项目的根
    不以“/”开头的路径的参照路径是：当前请求路径的资源路径

    特例：后台若用到sendRedirect()方法参照路径是：当前web服务器的根
--%>
<a href="${pageContext.request.contextPath}/some/first">请求1</a><br>
<a href="${pageContext.request.contextPath}/some/second">请求2</a><br>
<a href="${pageContext.request.contextPath}/some/third">请求3</a><br>
<a href="${pageContext.request.contextPath}/some/fourth">请求4</a><br>
<a href="${pageContext.request.contextPath}/some/fifth">请求5</a>
</body>
</html>
