<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Compras</title>
</head>
<body>
    <?php
        include "compras.class.php";
        $produto = $_POST['produto'];
        $categoria = $_POST['categoria'];
        $preco = $_POST['preco'];
        $quantidade = $_POST['quantidade'];
        $data = $_POST['data'];

        $c = new Compras();

        $c->setProduto($produto);
        $c->setCategoria($categoria);
        $c->setPreco($preco);
        $c->setQuantidade($quantidade);
        $c->setData($data);
        $c->mostrarDados();
    ?>
</body>
</html>