<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ include file="header.htm" %>
<body>
    <div data-role="page" id="newevent" data-title="TeamSpace | View Contact" >
    
        <div data-role="header" data-theme="d" data-position="inline">
            <a href="people.htm" data-rel="back" data-iconpos="notext" data-icon="arrow-l" data-theme="a">Back</a>
            <h1>Adam Kinkaid</h1>
        </div>

        <div data-role="content" data-theme="c">
            <div id="portait-box" style="height:32px;width:32px;margin: 0px auto;">
                <img height="32" width="32" src="http://icons.iconarchive.com/icons/deleket/soft-scraps/64/User-Coat-Blue-icon.png" alt="Portrait" />
            </div>
            
            <table id="info-table" cellpadding="15" summary="Contact Information">
                <tbody>
                    <tr class="bottomborder">
                        <td>Role:</td>
                        <td><b>Lead Developer</b></td>
                    </tr>
                    <tr class="bottomborder">
                        <td>Email:</td>
                        <td><b><a href="mailto:acb1485@rit.edu" id="email" name="email">acb1485@rit.edu</a></b></td>
                    </tr>
                    <tr class="bottomborder">
                        <td>Cell:</td>
                        <td><b>412-855-8218</b></td>
                    </tr>
                    <tr class="bottomborder">
                        <td>Bio:</td>
                        <td><b>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.</b></td>
                    </tr>
                </tbody> 
            </table>
        </div>
        
    </div>
</body>
</html>
