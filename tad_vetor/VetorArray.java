package tad_vetor;

import exception.IsEmptyException;
import exception.OutOfBoundException;

public class VetorArray implements Vetor {
    private Integer n; // tamanho do array
    private Object[] v; // array
    private Integer s; // quantidade de elementos do array/vetor

    public VetorArray(){
        this.n = 8;
        this.v = new Object[8];
        this.s = 0;
    }

    @Override
    public Object elementAtRank(Integer r) throws IsEmptyException, OutOfBoundException {
        if(this.s == 0){
            IsEmptyException e = new IsEmptyException("O Vetor está vazio.");
            throw e;
        } else if(r < 0 || r >= this.n){
            OutOfBoundException e = new OutOfBoundException("rank inválido.");
            throw e;
        }
        return this.v[r];
    }

    @Override
    public Object replaceAtRank(Integer r, Object o) throws OutOfBoundException {
        if ( r < 0 || r >= this.n ){
            OutOfBoundException e = new OutOfBoundException("Rank inválido.");
            throw e;
        }
        if(this.v[r] == null)
            this.s++;
        Object antigo = this.v[r];
        this.v[r] = o;
        return antigo;
    }

    @Override
    public void insertAtRank(Integer r, Object o) throws OutOfBoundException {
        if(r < 0 || r >= this.n){
            OutOfBoundException e = new OutOfBoundException("rank inválido.");
            throw e;
        }
        if(this.v[r] == null)
            this.s++;

        if(this.s == this.n){
            this.n *= 2;
            Object[] newArray = new Object[this.n];
            for (int i = 0; i < this.s; i++)
                newArray[i] = this.v[i];

            this.v = newArray;
        }

        for(int i = this.s; i >= r; i--)
            this.v[i] = this.v[i-1];

        this.v[r] = o;
        
    }

    @Override
    public Object removeAtRank(Integer r) throws IsEmptyException, OutOfBoundException {
        if(this.s == 0){
            IsEmptyException e = new IsEmptyException("O Vetor está vazio.");
            throw e;
        } else if(r < 0 || r >= this.n){
            OutOfBoundException e = new OutOfBoundException("rank inválido.");
            throw e;
        }
        Object elemento = this.v[r];
        for(int i = r; i < this.s - 1; i++)
            this.v[i] = this.v[i+1];

        return elemento;
    }

    @Override
    public Integer size() {
        return this.s;
    }

    @Override
    public Boolean isEmpty() {
        return this.s == 0;
    }
    
}
