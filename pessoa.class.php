<?php 
class Pessoa {
    private $nome;
    private $idade;
    private $email;
    private $celular;
    private $hora;
    private $site;
    private $senha;
    private $data;
    private $cor;
    private $filhos;
    private $peso;
    private $sexo;
    private $estado;
    private $mensagem;

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

    public function setEmail($email) {
        $this->email = $email;
    }

    public function getEmail() {
        return $this->email;
    }

    public function setCelular($celular) {
        $this->celular = $celular;
    }

    public function getCelular() {
        return $this->celular;
    }

    public function setHora($hora) {
        $this->hora = $hora;
    }

    public function getHora() {
        return $this->hora;
    }

    public function setSite($site) {
        $this->site = $site;
    }

    public function getSite() {
        return $this->site;
    }

    public function setSenha($senha) {
        $this->senha = $senha;
    }

    public function getSenha() {
        return $this->senha;
    }

    public function setData($data) {
        $this->data = $data;
    }

    public function getData() {
        return $this->data;
    }

    public function setCor($cor) {
        $this->cor = $cor;
    }

    public function getCor() {
        return $this->cor;
    }

    public function setFilhos($filhos) {
        $this->filhos = $filhos;
    }

    public function getFilhos() {
        return $this->filhos;
    }

    public function setPeso($peso) {
        $this->peso = $peso;
    }

    public function getPeso() {
        return $this->peso;
    }

    public function setSexo($sexo) {
        $this->sexo = $sexo;
    }

    public function getSexo() {
        return $this->sexo;
    }

    public function setEstado($estado) {
        $this->estado = $estado;
    }

    public function getEstado() {
        return $this->estado;
    }

    public function setMensagem($mensagem) {
        $this->mensagem = $mensagem;
    }

    public function getMensagem() {
        return $this->mensagem;
    }

    public function mostrarDados() {
        echo "Nome: " . $this->getNome() . "<br>" . 
        "Email: " . $this->getEmail() . "<br>" .
        "Celular: " . $this->getCelular() . "<br>" .
        "Hora: " . $this->getHora() . "<br>" .
        "Site: " . $this->getSite() . "<br>" .
        "Senha: " . $this->getSenha() . "<br>" .
        "Data Nascimento: " . $this->getData() . "<br>" .
        "Cor: " . $this->getCor() . "<br>" .
        "Filhos: " . $this->getFilhos() . "<br>" .
        "Peso: " . $this->getPeso() . "<br>" .
        "Sexo: " . $this->getSexo() . "<br>" .
        "Estado: " . $this->getEstado() . "<br>" .
        "Mensagem: " . $this->getMensagem() . "<br>";
    }
}

?>