<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>DEMO</title>
</head>
<body>
    <form action="/captcha/valid" method="post">
        <div>
            验证码：<img src="/captcha" width="130px" height="48px" />
            <input type="text" name="code"/>
        </div>
        <div>
            <input type="submit" value="提交"/>
        </div>
    </form>
</body>
</html>