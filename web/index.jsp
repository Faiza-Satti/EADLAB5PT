
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
  <title>Title</title>
</head>
<style>
  .boxing{
    margin-left: 70px;
    margin-right: 70px;
    margin-top: 50px;
  }
  .upperHead{
    align-content: center;
    font-family: "Arial Rounded MT Bold";
    font-weight: bolder;
    height: 100px;
    background-color: burlywood;
    align-content: center;
    align-items: center;
  }
</style>
<body>
<div class="container upperHead">
  <h1 class="justify-center">SignUp Here</h1>
</div>

<div class="boxing">
  <form action="heelo" method="post">
    <label>Enter Your First Name</label>
    <input type="text" name="fName" class="form-control">

    <br>
    <label>Enter Your Last Name</label>
    <input type="text" name="lName" class="form-control">

    <br>
    <input type="radio" name="gender" value="Male"> Male
    <input type="radio" name="gender" value="Female"> Female
    <br>
    city
    <input type="text" name="city" >
    <br>
    <label> Select your country</label>
    <select name="country" class="form-select">
      <option>Pakistan</option>
      <option>India</option>
      <option>Australia</option>
      <option>United States</option>
    </select>
    <br>
    <label for="checks">Accept Agreement</label>
    <input type="checkbox" id="checks" value="Accept Agreement" name="Checking">
    <br>
    <br>
    <button value="submit">Submit here</button>
    <button value="cancel">Cancel here</button>
  </form>
</div>
</body>
</html>