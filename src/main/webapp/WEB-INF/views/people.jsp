<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Anthony C. Barone</title>
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
    <div data-role="page" id="home" data-title="TeamSpace | People">
    
        <div data-role="header" data-position="fixed" data-theme="c">
            <div data-role="navbar" class="custom-glyph" >
                <ul>
                    <li><a href="index.htm" id="navhome" data-theme="c" data-icon="custom" data-direction="reverse">Home</a></li>
                    <li><a href="#" class="ui-btn-active" id="navpeople" data-theme="c" data-iconpos="bottom" data-icon="custom" >People</a></li>
                    <li><a href="events.htm" id="navevents" data-theme="c" data-iconpos="bottom" data-icon="custom">Events</a></li>
                    <li><a href="tasks.htm" id="navtasks" data-theme="c" data-iconpos="bottom" data-icon="custom">Tasks</a></li>
                </ul>
            </div>
        </div>
		
		<div data-role="header" class="no-text-header" data-theme="none">
			<a href="#" class="ui-btn-right" data-role="button" data-theme="e" data-icon="plus">Invite</a>
		</div>

        <div data-role="content">
            <ul data-role="listview" data-theme="c" data-filter="true" data-filter-placeholder="Search People..." data-filter-theme="none">
				<li data-role="list-divider">A</li>
				<li><a href="#">Adam Kinkaid</a></li>
				<li><a href="#">Alex Wickerham</a></li>
				<li><a href="#">Avery Johnson</a></li>
				<li data-role="list-divider">B</li>
				<li><a href="#">Bob Cabot</a></li>
				<li data-role="list-divider">C</li>
				<li><a href="#">Caleb Booth</a></li>
				<li><a href="#">Christopher Adams</a></li>
				<li><a href="#">Culver James</a></li>
				<li data-role="list-divider">D</li>
				<li><a href="#">David Walsh</a></li>
				<li><a href="#">Drake Alfred</a></li>
				<li data-role="list-divider">E</li>
				<li><a href="#">Elizabeth Bacon</a></li>
				<li><a href="#">Emery Parker</a></li>
				<li><a href="#">Enid Voldon</a></li>
				<li data-role="list-divider">F</li>
				<li><a href="#">Francis Wall</a></li>
				<li data-role="list-divider">G</li>
				<li><a href="#">Graham Smith</a></li>
				<li><a href="#">Greta Peete</a></li>
				<li data-role="list-divider">H</li>
				<li><a href="#">Harvey Walls</a></li>
				<li data-role="list-divider">M</li>
				<li><a href="#">Mike Farnsworth</a></li>
				<li><a href="#">Murray Vanderbuilt</a></li>
				<li data-role="list-divider">N</li>
				<li><a href="#">Nathan Williams</a></li>
				<li data-role="list-divider">P</li>
				<li><a href="#">Paul Baker</a></li>
				<li><a href="#">Pete Mason</a></li>
				<li data-role="list-divider">R</li>
				<li><a href="#">Rod Tarker</a></li>
				<li data-role="list-divider">S</li>
				<li><a href="#">Sawyer Wakefield</a></li>
			</ul>
        </div>

        <div data-role="footer" class="footer-docs" data-theme="c" >
            <p>&copy;2011 Anthony Barone</p>
        </div>

    </div>
</body>
</html>
