<!DOCTYPE html>
<html>    
    <head>
        <title>Sign Up</title>
        <script>
            //var fname=document.form.unam.value;
        </script>
    </head>
    <style>
        body{
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }
        * {box-sizing: border-box}
        input[type=text], input[type=password] {
            width: 100%;
            font-size: 15px;
            padding: 15px;
            margin: 5px 0 22px 0;
            display: inline-block;
            border: none;
            background: #f1f1f1;
        }
        label{
            font-size: 15px;
        }
        input[type=text]:focus, input[type=password]:focus {
            background-color: #ddd;
            outline: none;
        }
        hr {
            border: 1px solid #f1f1f1;
            margin-bottom: 25px;
        }
        button {
            font-size: 18px;
            font-weight: bold;
            background-color:darkturquoise;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 100%;
            opacity: 0.9;
        }
        button:hover {
            opacity:1;
        }
        .cancel {
            padding: 14px 20px;
            background-color: #ff3d2f;
        }
        .formContainer {
            padding: 16px;
        }
        .formContainer p{
            font-size: 14px;
        }
        .container{
            width: 40%;
            height: 300px;
        }
    </style>

    <body>
        <div class="container">
        <form action="ControllerSignUp" method="post" name="form">
            <div class="formContainer">
                <hr>
                <input type="text" placeholder=" Name" name="name" required>
                <input type="text" placeholder="User Email" name="email" required>
                <input type="text" placeholder="Phone Number" name="phone" required>
                <input type="password" placeholder=" Password" name="password" required>
                <span><%=(request.getAttribute("errmsg")==null)?"": request.getAttribute("errmsg")%></span>
                <div>
                    <button type="submit" class="signup">Sign Up</button>
                </div>
            </div>
        </form>
        </div>
    </body>
</html>