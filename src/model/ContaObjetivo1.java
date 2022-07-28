package model;

public class ContaObjetivo1 {
    private int id;
    private double saldo;

    public ContaObjetivo1(){
        super();
    }

    public ContaObjetivo1(int id, double saldo) {
        super();
        this.id = id;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "\nContaObjetivo1{" +
                "id=" + id +
                ", saldo=" + saldo +
                '}';
    }
}
