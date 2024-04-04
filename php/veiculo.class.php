<?php
    class Veiculo{
        private $marca;
        private $modelo;
        private $motorizacao;
        private $kilometragemI;
        private $kilometragemF;
        private $consumido;
        private $combustivel;

        public function setMarca($marca) {
            $this->marca = $marca;
        }
    
        public function getMarca() {
            return $this->marca;
        }

        public function setModelo($modelo) {
            $this->modelo = $modelo;
        }
    
        public function getModelo() {
            return $this->modelo;
        }

        public function setMotorizacao($motorizacao) {
            $this->motorizacao = $motorizacao;
        }
    
        public function getMotorizacao() {
            return $this->motorizacao;
        }

        public function setKilometragemI($kilometragemI) {
            $this->kilometragemI = $kilometragemI;
        }
    
        public function getKilometragemI() {
            return $this->kilometragemI;
        }

        public function setKilometragemF($kilometragemF) {
            $this->kilometragemF = $kilometragemF;
        }
    
        public function getKilometragemF() {
            return $this->kilometragemF;
        }

        public function setConsumido($consumido) {
            $this->consumido = $consumido;
        }
    
        public function getConsumido() {
            return $this->consumido;
        }

        public function setCombustivel($combustivel) {
            $this->combustivel = $combustivel;
        }
    
        public function getCombustivel() {
            return $this->combustivel;
        }

        public function media(){
            return ($this->kilometragemF - $this->kilometragemI)/$this->consumido;
        }

        public function mostrarDados() {
            echo "Marca: " . $this->getMarca() . "<br>" . 
            "Modelo: " . $this->getModelo() . "<br>" .
            "Motorização: " . $this->getMotorizacao() . "<br>" .
            "Kilometragem inicial: " . $this->getKilometragemI() . "<br>" .
            "Kilometragem final: " . $this->getKilometragemF() . "<br>" .
            "Consumido: " . $this->getConsumido() . "<br>" .
            "Combustivel: " . $this->getCombustivel() . "<br>" .
            "Media de consumo: " . $this->media();
        }
    }

?>