package com.luizgustavz.library.model.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BelongingPrimamryKey {

    @ManyToOne
    @JoinColumn(name = "library_id")
    private Library lib;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private ListBooks list;

    public BelongingPrimamryKey(){}

    public BelongingPrimamryKey(
            Library aLib,
            ListBooks aList
    ) {
        this.lib = aLib;
        this.list = aList;
    }

    public Library getLib() {
        return lib;
    }

    public void setLib(Library lib) {
        this.lib = lib;
    }

    public ListBooks getList() {
        return list;
    }

    public void setList(ListBooks list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPrimamryKey that = (BelongingPrimamryKey) o;
        return Objects.equals(lib, that.lib) && Objects.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lib, list);
    }
}
