<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ include file="header.htm" %>
<body>
    <div data-role="page" id="home" data-title="TeamSpace | People">
    
        <div data-role="header" data-theme="c">
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
			<a href="invite.htm" class="ui-btn-right" data-role="button" data-theme="e" data-icon="plus">Invite</a>
		</div>

        <div data-role="content">
            <ul data-role="listview" data-theme="c" data-filter="true" data-filter-placeholder="Search People..." data-filter-theme="none">
				<li data-role="list-divider">A</li>
				<li><a href="viewcontact.htm">Adam Kinkaid</a></li>
				<li><a href="viewcontact.htm">Alex Wickerham</a></li>
				<li><a href="viewcontact.htm">Avery Johnson</a></li>
				<li data-role="list-divider">B</li>
				<li><a href="viewcontact.htm">Bob Cabot</a></li>
				<li data-role="list-divider">C</li>
				<li><a href="viewcontact.htm">Caleb Booth</a></li>
				<li><a href="viewcontact.htm">Christopher Adams</a></li>
				<li><a href="viewcontact.htm">Culver James</a></li>
				<li data-role="list-divider">D</li>
				<li><a href="viewcontact.htm">David Walsh</a></li>
				<li><a href="viewcontact.htm">Drake Alfred</a></li>
				<li data-role="list-divider">E</li>
				<li><a href="viewcontact.htm">Elizabeth Bacon</a></li>
				<li><a href="viewcontact.htm">Emery Parker</a></li>
				<li><a href="viewcontact.htm">Enid Voldon</a></li>
				<li data-role="list-divider">F</li>
				<li><a href="viewcontact.htm">Francis Wall</a></li>
				<li data-role="list-divider">G</li>
				<li><a href="viewcontact.htm">Graham Smith</a></li>
				<li><a href="viewcontact.htm">Greta Peete</a></li>
				<li data-role="list-divider">H</li>
				<li><a href="viewcontact.htm">Harvey Walls</a></li>
				<li data-role="list-divider">M</li>
				<li><a href="viewcontact.htm">Mike Farnsworth</a></li>
				<li><a href="viewcontact.htm">Murray Vanderbuilt</a></li>
				<li data-role="list-divider">N</li>
				<li><a href="viewcontact.htm">Nathan Williams</a></li>
				<li data-role="list-divider">P</li>
				<li><a href="viewcontact.htm">Paul Baker</a></li>
				<li><a href="viewcontact.htm">Pete Mason</a></li>
				<li data-role="list-divider">R</li>
				<li><a href="viewcontact.htm">Rod Tarker</a></li>
				<li data-role="list-divider">S</li>
				<li><a href="viewcontact.htm">Sawyer Wakefield</a></li>
			</ul>
        </div>

        <%@ include file="footer.htm" %>

    </div>
</body>
</html>
