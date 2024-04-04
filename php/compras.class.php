<?php
    class Compras{
        private $produto;
        private $categoria;
        private $preco;
        private $quantidade;
        private $data;

        public function setProduto($produto) {
            $this->produto = $produto;
        }
    
        public function getProduto() {
            return $this->produto;
        }

        public function setCategoria($categoria) {
            $this->categoria = $categoria;
        }
    
        public function getCategoria() {
            return $this->categoria;
        }

        public function setPreco($preco) {
            $this->preco = $preco;
        }
    
        public function getPreco() {
            return $this->preco;
        }

        public function setQuantidade($quantidade) {
            $this->quantidade = $quantidade;
        }
    
        public function getQuantidade() {
            return $this->quantidade;
        }

        public function setData($data) {
            $this->data = $data;
        }
    
        public function getData() {
            return $this->data;
        }

        public function total(){
            return $this->quantidade * $this->preco;
        }

        public function mostrarDados() {
            echo "Produto: " . $this->produto . "<br>" . 
            "Categoria: " . $this->categoria . "<br>" .
            "Preço: " . $this->preco . "<br>" .
            "Quantidade: " . $this->quantidade . "<br>" .
            "Data: " . $this->data . "<br>" .
            "Preço total: " . $this->total() . "<br>";
        }

    }
?>