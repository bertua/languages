<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro</title>
</head>
<body>
    <h1>Cadastro</h1>
    <?php
    $nome = $_POST['nome'];
    $email = $_POST['email'];
    $celular = $_POST['celular'];
    $hora = $_POST['hora'];
    $site = $_POST['site'];
    $senha = $_POST['senha'];
    $data = $_POST['data'];
    $cor = $_POST['cor'];
    $filhos = $_POST['filhos'];
    $peso = $_POST['peso'];
    $sexo = $_POST['sexo'];
    $estado = $_POST['estado'];
    $mensagem = $_POST['mensagem'];
    ?>


    <label for="nome">Nome:</label> <?php echo $nome; ?> <br>

    <label for="email">E-mail:</label> <?php echo $email; ?> <br>

    <label for="celular">Celular com DDD:</label> <?php echo $celular; ?> <br>

    <label for="hora">Hora desejada:</label> <?php echo $hora; ?> <br>

    <label for="site">Seu site:</label> <?php echo $site; ?> <br>

    <label for="senha">Senha:</label>

    <label for="data">Data Nasc:</label> <?php echo $data; ?> <br>

    <label for="cor">Cor favorita:</label> <?php echo $cor; ?> <br>

    <label for="filhos">Qtd Filhos:</label> <?php echo $filhos; ?> <br>

    <label for="peso">Peso:</label> <?php echo $peso; ?> <br>

    <label for="sexo">Sexo:</label> <?php echo $sexo; ?> <br>

    <label for="estado">Estado:</label> <?php echo $estado; ?> <br>

    <label for="mensagem">Mensagem:</label> <?php echo $mensagem; ?> <br>
</body>
</html>
