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
			<h3 class="text-center mt-5">listeReservation</h3>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						                        <th>id </th>
						                        <th>nom </th>
                                                <th>date </th>
                                                <th>heure</th>
                                                <th>nombre place</th>
                                                <th>action</th>
					</tr>
				</thead>
				<tbody>    
                    <c:forEach var="reservation" items="${listReservation}">
						<tr>
					        <td>${reservation.student_table.id}</td>
					        <td>${reservation.student_table.firstName}</td>
	   				      <td>${reservation.dateCalendrier}</td>
                            <td>${reservation.heureCalendrier}</td>
                            <td>${reservation.nombrePlace}</td>
							<td><a class="btn btn-md btn-warning" href="validerReservation/${reservation.idresevation}">valider</a></td>
						</tr>
					</c:forEach>

				</tbody>

			</table>
		</div>
	</div>

 

<jsp:include page="footer.jsp" />