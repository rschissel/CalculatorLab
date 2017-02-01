<%-- 
    Document   : index
    Created on : Jan 31, 2017, 8:23:30 PM
    Author     : Ryan Schissel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Area Calculator</title>
    </head>
    <body>
        <div id="header">
            <h1>Area Calculator</h1>
        </div>
        <div>
            <form name="form1" method="post" action="result">
                <p>Select a shape: </p>
                <input class="rec" type="radio" name="selection" value="rectangle">Rectangle<br>
                <input class="tri" type="radio" name="selection" value="triangle">Triangle<br>
                <input class="cir" type="radio" name="selection" value="circle">Circle<br>
                <input class="tra" type="radio" name="selection" value="trapezoid">Trapezoid<br>
                <br>
                <input id="b1" type="text" name="base1" placeholder="Base 1"> <br>
                <input id="b2" type="text" name="base2" placeholder="Base 2"> <br>
                <input id="h" type="text" name="height" placeholder="Height"> <br>
                <input id="d" type="text" name="divisor" placeholder="Divisor"> <br>
                <input id="r" type="text" name="radius" placeholder="Radius"><br>
                <br>
                <input type="submit" value="submit">
            </form>
        </div>
    </body>
</html>
