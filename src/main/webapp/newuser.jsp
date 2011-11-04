<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<body>
    <div data-role="page" id="register" data-title="TeamSpace | Register">
    
        <div data-role="header" data-theme="c" >
            <a href="index.htm" data-theme="a" data-rel="back" data-icon="arrow-l" data-iconpos="notext">Back</a>
            <h1>New Account</h1>
        </div>

        <div data-role="content">
            <form action="" method="post">

                <div data-role="fieldcontain">
                    <label for="username">Username:</label>
                    <input type="text" name="username" id="username" />
                </div>

                <div data-role="fieldcontain">
                    <label for="email">Email:</label>
                    <input type="text" name="email" id="email" />
                </div>

                <div data-role="fieldcontain">
                    <label for="password">Password:</label>
                    <input type="password" name="password" id="password" />
                </div>

                <div data-role="fieldcontain">
                    <label for="con_password">Confirm Password:</label>
                    <input type="password" name="con_password" id="con_password" />
                </div>

                <input type="submit" name="login" value="Login" data-theme="b" />
                
            </form>
        </div>

        <%@ include file="footer.htm" %>

    </div>
</body>
</html>
