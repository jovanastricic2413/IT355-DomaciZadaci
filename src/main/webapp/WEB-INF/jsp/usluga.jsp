<%@ page language="java" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<html>
    <head>
        <title>Prikaz usluge</title>
    </head>
    <body>
        <h2>Podaci o usluzi</h2>
        <table>
            <tr>
                <td>Tip usluge:</td>
                <td>${tip_usluga}</td>
            </tr>
            <tr>
                <td>Naziv usluge: </td>
                <td>${naziv_usluga}</td>
            </tr>
            <tr>
                <td>Cena usluge: </td>
                <td>${cena_usluga}</td>
            </tr>
        </table>
    </body>
</html>
<%@ include file="footer.jsp" %>