<%@page import="com.travel.storyer.model.accountModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test page</title>
</head>
<body>${mes.intId} ${mes.account} ${mes.password} ${mes.userName}
	${mes.photoUrl}
</body>
</html>