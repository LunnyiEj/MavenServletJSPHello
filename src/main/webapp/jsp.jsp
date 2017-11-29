<%@ page contentType="text/html; charset=UTF-8" %>
<html>
    <head>
        <title>
            JSP Hello
        </title>
    </head>
    <body>
        <h2>Hello from JSP and SERVLET together</h2>
            <%
               String name = request.getParameter("name");
               if (name == null || name.length() == 0) {
                   %>
                   <p><a href="/MavenServletJSPHello/JSPServlet?name=tea"> try name=tea</a></p>
                   <%            } else {
                   %>
                   <p>Would you like a cup of <%= name %>?
                   <%
               }
            %>
    </body>
</html>