<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
</head>

<body>
	<h1>Struts 2 ModelDriven example</h1>

	<h2>Customer Details</h2>
	Name :
	<s:property value="customer.name" />
	<br> Age :
	<s:property value="customer.age" />
	<br>

</body>
</html>