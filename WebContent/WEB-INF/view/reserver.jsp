<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp" />
 <div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">
			<h3 class="text-center mt-5">calendrier</h3>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						                        
                                                <th>date </th>
                                                <th>heure</th>
                                                <th>nombre place</th>
                                                <th>action</th>
					</tr>
				</thead>
				<tbody>    
                    <c:forEach var="calendrier" items="${Calendrier}">
						<tr>
						<form method="post" action="reservation">
	   				      <td><input type="hidden" name="dateCalendrier" value="${calendrier.dateCalendrier}">${calendrier.dateCalendrier}</td>
                            <td><input type="hidden" name="heureCalendrier" value="${calendrier.heureCalendrier}">${calendrier.heureCalendrier}</td>
                            <td><input type="hidden" name="nombrePlace" value="${calendrier.nombrePlace}">${calendrier.nombrePlace}</td>
							<td><button class="btn btn-md btn-warning" type="submit">reserver</button></td>
						</tr>
					</c:forEach>

				</tbody>

			</table>
		</div>
	</div>

 

<jsp:include page="footer.jsp" />