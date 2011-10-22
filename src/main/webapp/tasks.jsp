<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ include file="header.jsp" %>
<body>
    <div data-role="page" id="tasks" data-title="TeamSpace | Tasks">
	
        <div data-role="header" data-theme="c">
            <div data-role="navbar" class="custom-glyph" >
                <ul>
                    <li><a href="<%=request.getContextPath()%>" rel="external" id="navhome" data-theme="c" data-icon="custom" data-direction="reverse">Home</a></li>
                    <li><a href="people" rel="external" id="navpeople" data-theme="c" data-iconpos="bottom" data-icon="custom" data-direction="reverse">People</a></li>
                    <li><a href="events" rel="external" id="navevents" data-theme="c" data-iconpos="bottom" data-icon="custom" data-direction="reverse">Events</a></li>
                    <li><a href="#" class="ui-btn-active" id="navtasks" data-theme="c" data-iconpos="bottom" data-icon="custom">Tasks</a></li>
                </ul>
            </div>
        </div>
        
        <div data-role="header" class="no-text-header" data-theme="none"> 
			<a href="<%=request.getContextPath()%>tasks/new" class="ui-btn-right" data-transition="slideup" data-role="button" data-theme="e" data-icon="plus">Create Task</a>
		</div>

        <div data-role="content">
            
            <ul data-role="listview" data-theme="d" data-dividertheme="b" data-counttheme="e" data-split-icon="check" data-split-theme="c" >
                <li data-role="list-divider">Important</li>
                <li><a href="edittask.htm">
                    <span class="aside-spacing-task ui-li-aside">
                        <p>Due Today!</p>
                        <img class="priority-image" height="16" width="16" title="High Priority" alt="High Priority" src="<%=request.getContextPath()%>resources/img/exclam.png" />
                    </span>
                    <h3>Finish Diagrams</h3>
                    <p>Clean up some of the highlights for the ER diagram and add the new columns to the relational diagram.</p>
                        
                </a><a href="#">Mark Task 'Complete'</a>
                </li>
                <li><a href="about.htm">
                    <span class="aside-spacing-task ui-li-aside">
                        <p>10/18/11</p>
                        <img class="priority-image" height="16" width="16" title="High Priority" alt="High Priority" src="<%=request.getContextPath()%>resources/img/exclam.png" />
                    </span>
                    <h3>Plan Conference</h3>
                    <p class="invitor">[Assigned by: Tim Garvin]</p>
                    <p>In preparation for the upcoming conference in Boston, we need to start gathering a list of sponsors and speakers.</p>
                    
                </a><a href="#">Mark Task 'Complete'</a>
                </li>
                <li data-role="list-divider">Approaching <span class="ui-li-count">1 New!</span></li>
                <li data-theme="e"><a href="about.htm"><p class="aside-spacing-task ui-li-aside">10/15/11</p>
                    <h3>Avery Walker</h3>
                    <p><strong>Re: Dinner Tonight</strong></p>
                    <p>Sure, let's plan on meeting at Highland Kitchen at 8:00 tonight. Can't wait! </p>
                    
                </a><a href="#">Mark Task 'Complete'</a>
                </li>
                <li data-role="list-divider">Future Tasks</li>
                <li><a href="about.htm"><p class="aside-spacing-task ui-li-aside">10/19/11</p>
                    <h3>Amazon.com</h3>
                    <p><strong>4-for-3 Books for Kids</strong></p>
                    <p>As someone who has purchased children's books from our 4-for-3 Store, you may be interested in these featured books.</p>
                    
                </a><a href="#">Mark Task 'Complete'</a>
                </li>
                <li><a href="about.htm"><p class="aside-spacing-task ui-li-aside">10/22/11</p>
                    <h3>Mike Taylor</h3>
                    <p><strong>Re: This weekend in Maine</strong></p>
                    <p>Hey little buddy, sorry but I can't make it up to vacationland this weekend. Maybe next weekend?</p>
                    
                </a><a href="#">Mark Task 'Complete'</a>
                </li>
                <li><a href="about.htm"><p class="aside-spacing-task ui-li-aside">10/22/11</p>
                    <h3>Redfin</h3>
                    <p><strong>Redfin listing updates for today</strong></p>
                    <p>There are 3 updates for the home on your watchlist: 1 updated MLS listing and 2 homes under contract.</p>
                    
                </a><a href="#">Mark Task 'Complete'</a>
                </li>
			</ul>
			</div>
			<div data-role="content">
			<ul data-role="listview" data-theme="d" data-dividertheme="a" data-counttheme="b" data-split-icon="check" data-split-theme="a">
                <li data-role="list-divider">Completed</li>
                <li><a href="about.htm"><p class="aside-spacing-task ui-li-aside">10/25/11</p>
                    <h3>Angela Smith</h3>
                    <p><strong>Link Request</strong></p>
                    <p>My name is Angela Smith, SEO Consultant. I've greatly enjoyed looking through your site and I was wondering if you'd be interested in providing a link</p>
                    
                </a><a href="#">Mark Task 'Complete'</a>
                </li>
                <li><a href="about.htm"><p class="aside-spacing-task ui-li-aside">10/29/11</p>
                    <h3>Mike Taylor</h3>
                    <p><strong>This weekend in Maine</strong></p>
                    <p>Sounds good, let me check into our plans.</p>
                    
                </a><a href="#">Mark Task 'Complete'</a>
                </li>
            </ul>
        </div>

        <div data-role="footer" class="footer-docs" data-theme="c" >
            <p>&copy;2011 Anthony Barone</p>
        </div>

    </div>

</body>
</html>
