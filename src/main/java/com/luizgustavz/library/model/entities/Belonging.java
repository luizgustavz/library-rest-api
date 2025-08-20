package com.luizgustavz.library.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    @Column(name = "id")
    private BelongingPrimamryKey pk;
    private Integer index;

    public Belonging(){

    }

    public Belonging(
            Library aLibrary,
            ListBooks aList,
            Integer aIndex
    ){
        pk.setLib(aLibrary);
        pk.setList(aList);
        this.index = aIndex;
    }

    public BelongingPrimamryKey getPk() {
        return pk;
    }

    public void setPk(BelongingPrimamryKey pk) {
        this.pk = pk;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(pk, belonging.pk);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(pk);
    }
}
