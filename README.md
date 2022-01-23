<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Javascipt</title>
    <script>
        function abc(){
        var a = parseInt(document.getElementById("1stvalue").value);
        var b = parseInt(document.getElementById("2ndvalue").value);
        var c = document.getElementById("question").value;
        if(c=="add")
        {
            var result = a+b;
            document.getElementById("answer").value = result;
        }
        else if(c=="subtract")
        {
            var result = a-b;
            document.getElementById("answer").value = result;
        }
        else if(c=="multiply")
        {
            var result = a*b;
            document.getElementById("answer").value = result;
        }
        else if(c=="divide")
        {
            var result = a/b;
            document.getElementById("answer").value = result;
        }
        else
        {
            var d ="This is your wrong value";
            document.getElementById("answer").value = d;
        }
        }
    </script>
</head>
<body>
    <table>
        <tr>
            <td><label>Please Enter first value:</label></td>
            <td><input type="number" id="1stvalue"></td>
        </tr>
        <tr>
            <td><label>Please Enter Second value:</label></td>
            <td><input type="number" id="2ndvalue"></td>
        </tr>
        <tr>
            <td><label>Please Enter your oprator:</label></td>
            <td><input type="text" id="question"></td>
        </tr>
        <tr>
            <td><label>Tihs is your answer:</label></td>
            <td><input type="text" id="answer" disabled></td>
        </tr>
        <tr>
            <td><button type="button" onclick="abc()">=</button></td>
        </tr>
    </table>
</body>
</html>
