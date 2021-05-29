package com.orgsystem.orgreserva.entities.enums;

public enum TipoCadastro {

        SALA(1),
        CARRO(2);

        private int cod;
        private String descricao;

        private TipoCadastro(int cod){
            this.cod = cod;
        }

        public int getCod() {
            return cod;
        }

        public String getDescricao() {
            return descricao;
        }

    }


