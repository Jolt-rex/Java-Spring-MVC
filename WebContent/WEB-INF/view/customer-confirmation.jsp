<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Customer Confirmation</title>
	</head>
	<body>
		The customer is confirmed: ${customer.firstName} ${customer.lastName}
		<br><br>
		Free passes: ${customer.freePasses}
		<br><br>
		Post code: ${customer.postCode}
		<br><br>
		Course code: ${customer.courseCode}
	</body>
</html>