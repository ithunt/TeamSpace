<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ include file="header.jsp" %>
<body>
    <div data-role="page" id="invite" data-title="TeamSpace | Invite User" >
    
        <div data-role="header" data-theme="d" data-position="inline">
            <a href="/people" data-rel="back" data-iconpos="notext" data-icon="arrow-l" data-theme="a">Back</a>
            <h1>Invite User</h1>
        </div>

        <div data-role="content" data-theme="c">
            <form action="test" method="post">
                <fieldset>
                    <div data-role="fieldcontain">
                        <label for="search">Search Users:</label>
                        <input type="search" name="emailsearch" id="emailsearch" placeholder="Find by email address..." />
                    </div>
                </fieldset>
            </form>
            
            <h2>Search Results</h2>
            <p>0 users found.</p>
        </div>
        
    </div>
</body>
</html>
