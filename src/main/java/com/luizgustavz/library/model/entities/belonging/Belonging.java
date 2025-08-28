package com.luizgustavz.library.model.entities.belonging;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tb_belonging")
@Data
public class Belonging {

    @EmbeddedId
    @Column(name = "id")
    private BelongingPrimaryKey pk;
    private Integer index;

}
