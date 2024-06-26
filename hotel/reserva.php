<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="inserirReserva.php" method="POST">
        <label for="CPF">CPF: </label>
        <input type="text" name="CPF">
        <br>
        <label for="checkIn">Check in: </label>
        <input type="date" name="checkIn">
        <br>
        <label for="checkOut">Check out: </label>
        <input type="date" name="checkOut">
        <br>
        <label for="quarto">Tamanho do quarto: </label>
        <select name="quarto">
            <option value="solteiro">Solteiro</option>
            <option value="duplo" selected>Duplo</option>
            <option value="casal">Casal</option>
            <option value="triplo">Triplo</option>
        </select>
        <br>
        <label for="numero">Numero: </label>
        <select name="numero">
            <option value="101">101</option>
            <option value="102">102</option>
            <option value="103">103</option>
            <option value="104">104</option>
            <option value="105">105</option>

            <option value="201">201</option>
            <option value="202">202</option>
            <option value="203">203</option>
            <option value="204">204</option>
            <option value="205">205</option>

            <option value="301">301</option>
            <option value="302">302</option>
            <option value="303">303</option>
            <option value="304">304</option>
            <option value="305">305</option>

            <option value="401">401</option>
            <option value="402">402</option>
            <option value="403">403</option>
            <option value="404">404</option>
            <option value="405">405</option>
        </select>
        <br>
        <label for="valor">Valor: </label>
        <input type="number" name="valor">
        <br>
        <input type="submit" value="enviar">
    </form>
</body>
</html>