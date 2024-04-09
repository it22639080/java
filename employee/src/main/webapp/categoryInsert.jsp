<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <style>
        body {
            font-family: Arial, sans-serif;
        }
        .container {
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            background-color: #f9f9f9;
            border-radius: 5px;
        }
        h2 {
            text-align: center;
        }
        .form-group {
            margin-bottom: 15px;
        }
        label {
            display: block;
            font-weight: bold;
        }
        input[type="text"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        button {
            display: block;
            width: 100%;
            padding: 10px;
            background-color: #007BFF;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
	<form action="insert" method="post">
	    <div class="container">
        <h2>Add Category</h2>
        <form>
            <div class="form-group">
                <label for="categoryName">Category Name</label>
                <input type="text" id="categoryName" name="categoryName" placeholder="Enter Category Name">
               <label for="categoryType">Category Type</label>
                 <input type="text" id="categoryName" name="categoryType" placeholder="Enter Category Type">
                
            </div>
            <button type="submit">Add Category</button>
        </form>
    </div>
	
	</form>
</body>
</html>