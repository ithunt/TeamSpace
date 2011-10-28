<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ include file="header.jsp" %>
<body>
    <div data-role="page" id="events" data-title="TeamSpace | Events">
	
        <div data-role="header" data-theme="c">
            <div data-role="navbar" class="custom-glyph" >
                <ul>
                    <li><a href="/" rel="external" id="navhome" data-theme="c" data-icon="custom" data-direction="reverse">Home</a></li>
                    <li><a href="/people" rel="external" id="navpeople" data-theme="c" data-iconpos="bottom" data-icon="custom" data-direction="reverse">People</a></li>
                    <li><a href="#" class="ui-btn-active" id="navevents" data-theme="c" data-iconpos="bottom" data-icon="custom" >Events</a></li>
                    <li><a href="/tasks" data-ajax="false" id="navtasks" data-theme="c" data-iconpos="bottom" data-icon="custom">Tasks</a></li>
                </ul>
            </div>
        </div>
        
        <div data-role="header" class="no-text-header" data-theme="none">
			<a href="/events/new" class="ui-btn-right" data-transition="slideup" data-role="button" data-theme="e" data-icon="plus">Create Event</a>
		</div>

        <div data-role="content">
            <ul data-role="listview" data-theme="d" data-dividertheme="b" data-counttheme="e">
                
                <!-- Database contents (dynamic) -->
                
                <!-- TODO: Data-theme:e for new/unseen -->
                
            	<c:forEach items="${allevents}" var="event">
					<li><a href="/events/${event.id}">
					<p class="aside-spacing ui-li-aside">
					   <b><fmt:formatDate value="${event.targetDate}" pattern="MM/dd/yy"/></b>
                    </p>
                    <h3>${event.name}</h3>
                    
                    <!-- TODO: Creator name -->
                    
                    <p><b>from Anthony Barone (Static)</b></p>
                    <p>${event.description}</p>
               		</a></li>
				</c:forEach>
            
                <!-- Dummy data (static) -->
                
                <li data-role="list-divider">Today
                    <span class="ui-li-count">1 New!</span>
                </li>
                
                <li data-theme="e" ><a href="editevent.htm"><p class="aside-spacing ui-li-aside"><b>6:24</b>PM</p>
                    <h3>Team Meeting</h3>
                    <p><b>from Anthony Barone</b></p>
                    <p>Let's discuss some future plans regarding blah blah and addressing blah.</p>
                </a></li>
                
                <li><a href="about.htm"><p class="aside-spacing ui-li-aside"><b>9:18</b>AM</p>
                    <h3>BBQ + Frisbee</h3>
                    <p><b>from Ian Hunt</b></p>
                    <p>Come relax after the meeting and eat some hamburgers or hotdogs, frisbee game will be in session.</p>
                </a></li>
                
                <li data-role="list-divider">Tomorrow</li>
                <li><a href="about.htm"><p class="aside-spacing ui-li-aside"><b>4:48</b>PM</p>
                    <h3>Dinner at Joe's</h3>
                    <p><b>from Avery Walker</b></p>
                    <p>Let's plan on meeting at Joe's at 8:00p tonight. Can't wait! </p>
                </a></li>
                
                <li data-role="list-divider">Wednesday, October 19, 2011</li>
                <li><a href="about.htm"><p class="aside-spacing ui-li-aside"><b>12:47</b>PM</p>
                    <h3>Team Meeting</h3>
                    <p><b>from Amazon Jones</b></p>
                    <p>Let's discuss some financial plans and how we should tackle x.</p>
                </a></li>
                
                <li><a href="about.htm"><p class="aside-spacing ui-li-aside"><b>6:24</b>AM</p>
                    <h3>Re: This weekend in Maine</h3>
                    <p><b>from Mike Taylor</b></p>
                    <p>Hey little buddy, sorry but I can't make it up to vacationland this weekend. Maybe next weekend?</p>
                </a></li>
                
                <li><a href="about.htm"><p class="aside-spacing ui-li-aside"><b>5:52</b>AM</p>
                    <h3>Redfin listing updates for today</h3>
                    <p><b>from Bob Smith</b></p>
                    <p>There are 3 updates for the home on your watchlist: 1 updated MLS listing and 2 homes under contract.</p>
                </a></li>
                
                <li data-role="list-divider">Tuesday, October 25, 2011</li>
                <li><a href="about.htm"><p class="aside-spacing ui-li-aside"><b>6:24</b>AM</p>
                    <h3>Lunch</h3>
                    <p><b>from by Angela Smith</b></p>
                    <p>Anyone interested in grabbing lunch at Crossroads is welcome.</p>
                </a></li>
                
                <li><a href="about.htm"><p class="aside-spacing ui-li-aside"><b>6:24</b>AM</p>
                    <h3>Maine Trip</h3>
                    <p><b>from by Mike Taylor</b></p>
                    <p>Take a trip up to Maine and go sight-seeing, for details talk to Donna.</p>
                </a></li>
                
            </ul>
        </div>

        <div data-role="footer" class="footer-docs" data-theme="c" >
            <p>&copy;2011 Anthony Barone</p>
        </div>

    </div>
</body>
</html>
