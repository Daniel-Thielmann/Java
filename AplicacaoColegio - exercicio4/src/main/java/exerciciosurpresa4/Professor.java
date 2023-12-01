package exerciciosurpresa4;

import java.time.LocalDate;

public class Professor extends Pessoa {
    private String area;

    public Professor(String nome, LocalDate dataNascimento, String area) {
        super(nome, dataNascimento );
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
