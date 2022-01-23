<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Javascript</title>
    <script>
        var a = parseInt(prompt("Enter 1st value"));
        var b = parseInt(prompt("Enter 2nd value"));
        var c = prompt("Enter oprator");
        switch(c)
        {
            case '+':
                var d = a+b;
                alert(d);
                break;
                case '-':
                var d = a-b;
                alert(d);
                break;
                case '*':
                var d = a*b;
                alert(d);
                break;
                case '/':
                var d = a/b;
                alert(d);
                break;
                default:
                    alert("This is your wrong diccition");
                    break;
        }
    </script>
</head>
<body>
    
</body>
</html>
