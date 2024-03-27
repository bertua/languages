<?php 
class Pessoa {
    private $nome;
    private $idade;

    function __construct($nome) {
        $this->nome = $nome;
    }

    public function setNome($nome) {
        $this->nome = $nome;
    }

    public function getNome() {
        return $this->nome;
    }

    public function setIdade($idade) {
        $this->idade = $idade;
    }

    public function getIdade() {
        return $this->idade;
    }

    public function falar(){
        $nomedaPessoa = $this->nome;
        return "Oi, eu sou o " . $nomedaPessoa . "!";
    }
}

?>