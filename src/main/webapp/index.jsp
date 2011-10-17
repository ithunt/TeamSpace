<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ include file="header.htm" %>
<body>
    <div data-role="page" id="home" data-title="TeamSpace | Home">
	
        <div data-role="header" data-theme="c">
            <div data-role="navbar" class="custom-glyph" >
                <ul>
                    <li><a href="#" class="ui-btn-active" id="navhome" data-theme="c" data-icon="custom" >Home</a></li>
                    <li><a href="people.htm" id="navpeople" data-theme="c" data-iconpos="bottom" data-icon="custom">People</a></li>
                    <li><a href="events.htm" id="navevents" data-theme="c" data-iconpos="bottom" data-icon="custom">Events</a></li>
                    <li><a href="tasks.htm" id="navtasks" data-theme="c" data-iconpos="bottom" data-icon="custom">Tasks</a></li>
                </ul>
            </div>
        </div>
        
        <div data-role="header" class="header-text" data-theme="e" >
            <h1>Welcome, <b>Anthony!</b></h1>
            <a href="about.htm" data-icon="delete" data-theme="c" class=" ui-btn-right">Logout</a> <!-- custom-but-spacing -->
        </div>

        <div data-role="content">
            <p><i>Currently in space</i>:<br />&nbsp;&nbsp;<b>Info Sys Project</b></p>
            <div><button data-icon="plus" type="submit" data-theme="b">Invite User</button></div>
            <div><button data-icon="delete" type="submit" data-theme="c">Delete Space</button></div>
            <br /><hr />
            
            <p><i>More actions</i>: </p>
            <div><button data-icon="plus" type="submit" data-theme="c">Create New Space</button></div>
            <fieldset class="ui-grid-a">
                <div class="ui-block-a"><button data-icon="refresh" type="submit" data-theme="c">Switch To..</button></div>
                <div class="ui-block-b"><button data-icon="gear" type="submit" data-theme="c">Settings</button></div>
            </fieldset>
        </div>

        <%@ include file="footer.htm" %>

    </div>
</body>
</html>
