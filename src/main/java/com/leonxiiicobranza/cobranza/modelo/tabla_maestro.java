package com.leonxiiicobranza.cobranza.modelo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

/*
@Entity
@Table(name = "tabla_maestro")*/
public class tabla_maestro {
	/*
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    //...

    @OneToOne(mappedBy = "maestro", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private tabla_detalle detalle;
   */
}
