<?php
include "conexao.class.php";
class Hotel{
    private $nome;
    private $CPF;
    private $tamanho;
    private $numero;
    private $checkIn;
    private $checkOut;
    private $valor;
    private $disponivel;
    private $id_cliente;
    private $id_reserva;
    private $id_quarto;

    public function getNome() {
        return $this->nome;
    }
    public function setNome($nome) {
        $this->nome = $nome;
    }
    public function getCPF() {
        return $this->CPF;
    }
    public function setCPF($CPF) {
        $this->CPF = $CPF;
    }
    public function getTamanho() {
        return $this->tamanho;
    }
    public function setTamanho($tamanho) {
        $this->tamanho = $tamanho;
    }
    public function getNumero() {
        return $this->numero;
    }
    public function setNumero($numero) {
        $this->numero = $numero;
    }
    public function getCheckIn() {
        return $this->checkIn;
    }
    public function setCheckIn($checkIn) {
        $this->checkIn = $checkIn;
    }
    public function getCheckOut() {
        return $this->checkOut;
    }
    public function setCheckOut($checkOut) {
        $this->checkOut = $checkOut;
    }
    public function getValor() {
        return $this->valor;
    }
    public function setValor($valor) {
        $this->valor = $valor;
    }
    public function getDisponivel() {
        return $this->disponivel;
    }
    public function setDisponivel($disponivel) {
        $this->disponivel = $disponivel;
    }
    public function getId_cliente() {
        return $this->id_cliente;
    }
    public function setId_cliente($id_cliente) {
        $this->id_cliente = $id_cliente;
    }
    public function getId_reserva() {
        return $this->id_reserva;
    }
    public function setId_reserva($id_reserva) {
        $this->id_reserva = $id_reserva;
    }
    public function getId_quarto() {
        return $this->id_quarto;
    }
    public function setId_quarto($id_quarto) {
        $this->id_quarto = $id_quarto;
    }

    public function listarCliente(){
        $database = new Conexao();
        $db = $database->getConnection();
        $sql = "SELECT * FROM cliente";
        try{
            $stmt= $db->query($sql);
            $result = $stmt->fetchAll(PDO::FETCH_ASSOC);
            return $result;
        }catch(PDOException $e){
            echo 'Erro ao listar clientes: ' . $e->getMessage();
            $result = [];
            return $result;
        }
    }

    public function inserirCliente(){
        $database = new Conexao();
        $db = $database->getConnection();

        $sql = 'INSERT INTO cliente (nome, cpf) values (:nome, :cpf)';
        try{
            $stmt = $db->prepare($sql);
            $stmt->bindParam(':nome',$this->nome);
            $stmt->bindParam(':cpf',$this->CPF);
            $stmt->execute();
            return true;
        } catch(PDOException $e){
            echo 'Erro ao inserir cliente: '. $e->getMessage();
            return false;
        }
    }


    public function listarReserva(){
        $database = new Conexao();
        $db = $database->getConnection();
        $sql = "SELECT * FROM reserva";
        try{
            $stmt= $db->query($sql);
            $result = $stmt->fetchAll(PDO::FETCH_ASSOC);
            return $result;
        }catch(PDOException $e){
            echo 'Erro ao listar reservas: ' . $e->getMessage();
            $result = [];
            return $result;
        }
    }

    public function inserirReserva(){
        $database = new Conexao();
        $db = $database->getConnection();

        $sql = 'INSERT INTO reserva (id_cliente, checkIn, checkOut, valor, id_quarto) values (:id_cliente, :checkIn, :checkOut, :valor, :id_quarto)';
        try{
            $stmt = $db->prepare($sql);
            $stmt->bindParam(':id_cliente',$this->id_cliente);
            $stmt->bindParam(':checkIn',$this->checkIn);
            $stmt->bindParam(':checkOut',$this->checkOut);
            $stmt->bindParam(':valor',$this->valor);
            $stmt->bindParam(':id_quarto',$this->id_quarto);
            $stmt->execute();
            return true;
        } catch(PDOException $e){
            echo 'Erro ao inserir reserva: '. $e->getMessage();
            return false;
        }
    }

    public function selectId_cliente($CPF){
        $database = new Conexao();
        $db = $database->getConnection();
        $sql = "SELECT id_cliente FROM cliente WHERE cpf=:cpf";
        try{
            $stmt = $db->prepare($sql);
            $stmt->bindParam(':cpf',$CPF);
            $stmt->execute();
            $result = $stmt->fetch(PDO::FETCH_ASSOC);
            return $result['id_cliente'];
        }catch(PDOException $e){
            echo 'Erro ao listar reservas: ' . $e->getMessage();
            $result = [];
            return $result;
        }
    }

    public function selectId_quarto($numero){
        $database = new Conexao();
        $db = $database->getConnection();
        $sql = "SELECT id_quarto FROM quarto WHERE numero=:numero";
        try{
            $stmt = $db->prepare($sql);
            $stmt->bindParam(':numero',$numero);
            $stmt->execute();
            $result = $stmt->fetch(PDO::FETCH_ASSOC);
            return $result['id_quarto'];
        }catch(PDOException $e){
            echo 'Erro ao listar quarto: ' . $e->getMessage();
            $result = [];
            return $result;
        }
    }

    public function reservarQuartoId($id_quarto){
        $database = new Conexao();
        $db = $database->getConnection();
        $sql = "UPDATE quarto SET disponivel='n' WHERE  id_quarto=:id_quarto";
        try{
            $stmt = $db->prepare($sql);
            $stmt->bindParam(':id_quarto',$id_quarto);
            $stmt->execute();
            return true;
        }catch(PDOException $e){
            echo 'Erro ao listar quarto: ' . $e->getMessage();
            $result = [];
            return $result;
        }
    }








}
