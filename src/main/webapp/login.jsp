<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ include file="header.jsp" %>
<body>
    <div data-role="page" id="login" data-title="TeamSpace | Login">

        <div data-role="header" data-theme="c">
            <a href="index.htm" data-theme="a" data-rel="back" data-icon="arrow-l" data-iconpos="notext">Back</a>

            <h1>User Login</h1>
        </div>

        <div data-role="content">

            <c:if test="${not empty error}">
                <div class="errorblock">
                    Your login attempt was not successful, try again.<br/> Caused :
                        ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
                </div>
            </c:if>
            <form action="<c:url value='j_spring_security_check' />" method="POST">

                <div data-role="fieldcontain">
                    <label for="username">Username:</label>
                    <input type="text" name="j_username" id="username"/>
                </div>

                <div data-role="fieldcontain">
                    <label for="password">Password:</label>
                    <input type="password" name="j_password" id="password"/>
                </div>

                <input type="submit" name="login" value="submit" data-theme="b" />
                
            </form>
        </div>

        <%@ include file="footer.htm" %>

    </div>
</body>
</html>
