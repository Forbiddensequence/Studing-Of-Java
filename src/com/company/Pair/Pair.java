package com.company.Pair;

public class Pair<G,T> {
    private G firstEntity;
    private T secondEntity;
    public Pair(G entityFirst,T entitySecond){
        setFirstEntity(entityFirst);
        setSecondEntity(entitySecond);
    }

    public G getFirstEntity() {
        return firstEntity;
    }

    private void setFirstEntity(G firstEntity) {
        this.firstEntity = firstEntity;
    }

    public T getSecondEntity() {
        return secondEntity;
    }

    private void setSecondEntity(T secondEntity) {
        this.secondEntity = secondEntity;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "firstEntity type =" + getFirstEntity().getClass()+
                ", firstEntity=" + getFirstEntity() +
                ", secondEntity type ="+ getSecondEntity().getClass()+
                ", secondEntity=" + getSecondEntity() +
                '}';
    }


}
