<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>删除页面</title>
<link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<style type="text/css">
	.form-bg{
    background: #00BBFF;
}
	.form-horizontal{
    background: #87CEFA;
    padding-bottom: 40px;
    border-radius: 15px;
    text-align: center;
}
	.form-horizontal .heading{
    display: block;
    font-size: 35px;
    font-weight: 700;
    padding: 35px 0;
    border-bottom: 1px solid #f0f0f0;
    margin-bottom: 30px;
}
	.form-horizontal .form-group{
    padding: 0 40px;
    margin: 0 0 25px 0;
    position: relative;
}
	.form-horizontal .form-control{
    background: #f0f0f0;
    border: none;
    border-radius: 20px;
    box-shadow: none;
    padding: 0 20px 0 45px;
    height: 40px;
    transition: all 0.3s ease 0s;
}
	.form-horizontal .form-control:focus{
    background: #e0e0e0;
    box-shadow: none;
    outline: 0 none;
}
	.form-horizontal .form-group i{
    position: absolute;
    top: 12px;
    left: 60px;
    font-size: 17px;
    color: #c8c8c8;
    transition : all 0.5s ease 0s;
}
	.form-horizontal .form-control:focus + i{
    color: #00b4ef;
}
	.form-horizontal .fa-question-circle{
    display: inline-block;
    position: absolute;
    top: 12px;
    right: 60px;
    font-size: 20px;
    color: #808080;
    transition: all 0.5s ease 0s;
}
	.form-horizontal .fa-question-circle:hover{
    color: #000;
}
	.form-horizontal .main-checkbox{
    float: left;
    width: 20px;
    height: 20px;
    background: #11a3fc;
    border-radius: 50%;
    position: relative;
    margin: 5px 0 0 5px;
    border: 1px solid #11a3fc;
}
	.form-horizontal .main-checkbox label{
    width: 20px;
    height: 20px;
    position: absolute;
    top: 0;
    left: 0;
    cursor: pointer;
}
	.form-horizontal .main-checkbox label:after{
    content: "";
    width: 10px;
    height: 5px;
    position: absolute;
    top: 5px;
    left: 4px;
    border: 3px solid #fff;
    border-top: none;
    border-right: none;
    background: transparent;
    opacity: 0;
    -webkit-transform: rotate(-45deg);
    transform: rotate(-45deg);
}
	.form-horizontal .main-checkbox input[type=checkbox]{
    visibility: hidden;
}
	.form-horizontal .main-checkbox input[type=checkbox]:checked + label:after{
    opacity: 1;
}
	.form-horizontal .text{
    float: left;
    margin-left: 7px;
    line-height: 20px;
    padding-top: 5px;
    text-transform: capitalize;
}
	.form-horizontal .btn{
    float: right;
    font-size: 14px;
    color: #fff;
    background: #00b4ef;
    border-radius: 30px;
    padding: 10px 25px;
    border: none;
    text-transform: capitalize;
    transition: all 0.5s ease 0s;
}
@media only screen and (max-width: 479px){
    .form-horizontal .form-group{
        padding: 0 25px;
    }
    .form-horizontal .form-group i{
        left: 45px;
    }
    .form-horizontal .btn{
        padding: 10px 20px;
    }
}
</style>
</head>
<body background="5.jpg">
<p>&nbsp;</p>
<p>&nbsp;</p>
<p>&nbsp;</p>
<div class="demo">
<div class="container">
    <div class="row">
        <div class="col-md-offset-3 col-md-6">
        <i class="fa fa-address-card"></i>
            <form class="form-horizontal" action="DeleteStudentServlet" method="get">
                <span class="heading">学生信息删除</span>
                <div class="form-group help">
                    <input type="text" class="form-control" name="id" placeholder="请输入所删除的序号">
                    <b><i class="fa fa-id-card"></i></b>
                </div>
                <div class="form-group">
                    <button type="submit" class="btn btn-default">确定</button>
                </div>
            </form>
        </div>
    </div>
</div>
</div>		
</body>
</html>