<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ include file="header.jsp" %>
<body>
    <div data-role="page" id="login" data-title="TeamSpace | Login">
    
        <div data-role="header" data-theme="c" >
            <a href="index.htm" data-theme="a" data-rel="back" data-icon="arrow-l" data-iconpos="notext">Back</a>
            <h1>User Login</h1>
        </div>

        <div data-role="content">
            <form action="" method="post">

                <div data-role="fieldcontain">
                    <label for="username">Username:</label>
                    <input type="text" name="username" id="username" />
                </div>

                <div data-role="fieldcontain">
                    <label for="password">Password:</label>
                    <input type="password" name="password" id="password" />
                </div>

                <input type="submit" name="login" value="Login" data-theme="b" />
                
            </form>
        </div>

        <%@ include file="footer.htm" %>

    </div>
</body>
</html>
