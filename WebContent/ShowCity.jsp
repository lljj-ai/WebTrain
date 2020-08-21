<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>显示界面</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<style type="text/css">
	span{
		color:white;
	}
		table {
		font-family: verdana,arial,sans-serif;
		font-size:18px;
		color:#87CEFA;
		width: auto;
		height:auto;
		border-height:4px;
		border-width: 4px;
		border-color: #191970;
		border-collapse: collapse;
	}
	 th {
		border-width: 2px;
		padding: 8px;
		border-style: solid;
		border-color: #191970;
		background-color: #0000CD;
	}
	 td {
		border-width: 2px;
		padding: 8px;
		border-style: solid;
		border-color: #191970;
		background-color: #00BFFF;
	}
</style>
</head>
<body background="5.jpg">
		<table align="center"  class="table ">
		 <tr >
		 	<td colspan="5" align="center"><span><b>城市信息显示</b></span></td>
		 </tr>
		 <!-- rowspan:合并列 -->
		  <tr>
		    <th><span>id</span></th>
		    <th><span>name</span></th>
		    <th><span>countryCode</span></th>
		    <th><span>district</span></th>
		    <th><span>population</span></th> 
		  </tr>
		  <c:forEach items="${city}" var="city">
		  <tr>
		  	<td><span>${city.id}</span></td>
		  	<td><span>${city.name}</span></td>
		  	<td><span>${city.countryCode}</span></td>
		  	<td><span>${city.district}</span></td>
		  	<td><span>${city.population}</span></td>
		  </tr>
		  </c:forEach>
		  </table>
</body>
</html>