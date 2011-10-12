<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Home</title>
    <meta name="viewport" content="width=device-width, minimum-scale=1, maximum-scale=1">
    <meta name="viewport" content="user-scalable=false"/>
    <meta name="format-detection" content="telephone=yes"/>
    <link rel="icon" href="favicon.ico" />
    <link type="text/css" href="http://code.jquery.com/mobile/latest/jquery.mobile.min.css?rc1" rel="stylesheet" />
    <link type="text/css" href="http://dev.jtsage.com/cdn/datebox/latest/jquery.mobile.datebox.min.css?rc1" rel="stylesheet" /> 
    <link rel="stylesheet" href="main.css?rc1" />
    <link rel="stylesheet" media="only screen and (max-device-width: 320px)" href="phone.css">
    <script src="http://code.jquery.com/jquery.min.js"></script>
    <script src="http://code.jquery.com/mobile/latest/jquery.mobile.min.js"></script>
	<script type="text/javascript" src="http://dev.jtsage.com/jquery.mousewheel.min.js"></script>
	<script type="text/javascript" src="http://dev.jtsage.com/cdn/datebox/latest/jquery.mobile.datebox.min.js"></script>
</head>
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

        <div data-role="footer" class="footer-docs" data-theme="c" >
            <p>&copy;2011 Anthony Barone</p>
        </div>

    </div>
</body>
</html>
