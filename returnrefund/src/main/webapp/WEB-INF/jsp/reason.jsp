<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<!-- <meta name="viewport" content="width=device-width, initial-scale=1"> -->
<link rel="stylesheet"
	href="../css/bootstrap.min.css">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Capstore</title>
</head>
<body>
	<form class="form-control " action="/success">
		<div class="container">
			<h2>Reason for Refund</h2>
			<p>Select from the below options</p>

			<label class="radio-inline"> <input type="radio"
				name="optradio" checked>The Product is not in good condition
			</label><br><br> <label class="radio-inline"> <input type="radio"
				name="optradio">It is Not the same as shown in image
			</label><br><br> <label class="radio-inline"> <input type="radio"
				name="optradio">The Quality is not good
			</label><br><br> <label class="radio-inline"> <input type="radio"
				name="optradio">I do not require this product anymore
			</label><br><br> 
			<label class="radio-inline"> <input type="radio"
				name="optradio">Other
			</label>
			<br><br> 
	<!-- 		Reason : <input type="textarea"  rows="4" cols="50" name="reasn"/> -->
	 <textarea name="reasn" rows="3" cols="30"></textarea>
			<br><br>
			<input  class="btn btn-success " type="submit" value="submit" />

		</div>
	</form>

</body>
</html>





