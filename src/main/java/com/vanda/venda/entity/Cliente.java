package com.vanda.venda.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCliente", nullable = false)
    private Integer idCliente;

    @Column(name = "ds_nome", nullable = false, length = 50)
    private String dsNome;

    @Column(name = "ds_cpf", nullable = false, length = 11)
    private String dsCpf;

    @Column(name = "dt_cadastro")
    private LocalDate dtCadastro;

    @PrePersist
    public void prePersist(){
        setDtCadastro(LocalDate.now());
    }
}
