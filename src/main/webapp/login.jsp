<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<body>
    <div data-role="page" id="login" data-title="TeamSpace | Login">

        <div data-role="header" data-theme="c">
            <h1>User Login</h1>
        </div>

        <div data-role="content">

            <c:if test="${not empty error}">
                <div class="errorblock">
                    Your login attempt was not successful, try again.<br/> Caused :
                        ${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}
                </div>
            </c:if>
            <form action="<c:url value='j_spring_security_check' />" data-ajax="false" method="POST">

                <div data-role="fieldcontain">
                    <label for="username">Username:</label>
                    <input type="text" name="j_username" id="username"/>
                </div>

                <div data-role="fieldcontain">
                    <label for="password">Password:</label>
                    <input type="password" name="j_password" id="password"/>
                </div>

                <input type="submit" name="login" value="Login" data-theme="b" />
                
            </form>
            
            <p>New to Teamspace?<p>
            <a href="/account/new" data-role="button" data-theme="b" data-icon="plus" >Get Started</a>
            
        </div>

        <%@ include file="footer.htm" %>

    </div>
</body>
</html>
