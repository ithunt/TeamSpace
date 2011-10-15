<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ include file="header.htm" %>
<body>
    <div data-role="page" id="home" data-title="TeamSpace | Events">
    
        <div data-role="header" data-theme="c">
            <div data-role="navbar" class="custom-glyph" >
                <ul>
                    <li><a href="index.htm" id="navhome" data-theme="c" data-icon="custom" data-direction="reverse">Home</a></li>
                    <li><a href="people.htm" id="navpeople" data-theme="c" data-iconpos="bottom" data-icon="custom" data-direction="reverse">People</a></li>
                    <li><a href="#" class="ui-btn-active" id="navevents" data-theme="c" data-iconpos="bottom" data-icon="custom" >Events</a></li>
                    <li><a href="tasks.htm" id="navtasks" data-theme="c" data-iconpos="bottom" data-icon="custom">Tasks</a></li>
                </ul>
            </div>
        </div>
        
        <div data-role="header" class="no-text-header" data-theme="none">
            <a href="newevent.htm" class="ui-btn-right" data-transition="slideup" data-role="button" data-theme="e" data-icon="plus">Create Event</a>
        </div>

        <div data-role="content">
            <ul data-role="listview" data-theme="d" data-dividertheme="b" data-counttheme="e">
                <li data-role="list-divider">Friday, October 8, 2010
                    <span class="ui-li-count">1 New!</span>
                </li>
                
                <li data-theme="e"><a href="editevent.htm"><p class="aside-spacing ui-li-aside"><strong>6:24</strong>PM</p>
                    <h3>Stephen Weber</h3>
                    <p><strong>You've been invited to a meeting at Filament Group in Boston, MA</strong></p>
                    <p>Hey Stephen, if you're available at 10am tomorrow, we've got a meeting with the jQuery team.</p>
                </a></li>
                
                <li><a href="about.htm"><p class="aside-spacing ui-li-aside"><strong>9:18</strong>AM</p>
                    <h3>jQuery Team</h3>
                    <p><strong>Boston Conference Planning</strong></p>
                    <p>In preparation for the upcoming conference in Boston, we need to start gathering a list of sponsors and speakers.</p>
                </a></li>
                
                <li data-role="list-divider">Thursday, October 7, 2010</li>
                <li><a href="about.htm"><p class="aside-spacing ui-li-aside"><strong>4:48</strong>PM</p>
                    <h3>Avery Walker</h3>
                    <p><strong>Re: Dinner Tonight</strong></p>
                    <p>Sure, let's plan on meeting at Highland Kitchen at 8:00 tonight. Can't wait! </p>
                </a></li>
                
                <li data-role="list-divider">Wednesday, October 6, 2010</li>
                <li><a href="about.htm"><p class="aside-spacing ui-li-aside"><strong>12:47</strong>PM</p>
                    <h3>Amazon.com</h3>
                    <p><strong>4-for-3 Books for Kids</strong></p>
                    <p>As someone who has purchased children's books from our 4-for-3 Store, you may be interested in these featured books.</p>
                </a></li>
                
                <li><a href="about.htm"><p class="aside-spacing ui-li-aside"><strong>6:24</strong>AM</p>
                    <h3>Mike Taylor</h3>
                    <p><strong>Re: This weekend in Maine</strong></p>
                    <p>Hey little buddy, sorry but I can't make it up to vacationland this weekend. Maybe next weekend?</p>
                </a></li>
                
                <li><a href="about.htm"><p class="aside-spacing ui-li-aside"><strong>5:52</strong>AM</p>
                    <h3>Redfin</h3>
                    <p><strong>Redfin listing updates for today</strong></p>
                    <p>There are 3 updates for the home on your watchlist: 1 updated MLS listing and 2 homes under contract.</p>
                </a></li>
                
                <li data-role="list-divider">Tuesday, October 5, 2010</li>
                <li><a href="about.htm"><p class="aside-spacing ui-li-aside"><strong>6:24</strong>AM</p>
                    <h3>Angela Smith</h3>
                    <p><strong>Link Request</strong></p>
                    <p>My name is Angela Smith, SEO Consultant. I've greatly enjoyed looking through your site and I was wondering if you'd be interested in providing a link</p>
                </a></li>
                
                <li><a href="about.htm"><p class="aside-spacing ui-li-aside"><strong>6:24</strong>AM</p>
                    <h3>Mike Taylor</h3>
                    <p><strong>This weekend in Maine</strong></p>
                    <p>Sounds good, let me check into our plans.</p>
                </a></li>
                
            </ul>
        </div>

        <div data-role="footer" class="footer-docs" data-theme="c" >
            <p>&copy;2011 Anthony Barone</p>
        </div>

    </div>
</body>
</html>
