<%@ page session="false" %>
<%@ include file="header.htm" %>
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

        <%@ include file="footer.htm" %>

    </div>
</body>
</html>
