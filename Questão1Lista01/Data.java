package Questão1Lista01;

public class Data {
    
    private int mes, dia, ano;

    public int getAno() {
        return ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    // método para modificação simultânea de dia, mês e ano de data
    public void set(int dia, int mes, int ano){
        this.ano = ano;
        this.dia = dia;
        this.mes = mes;
    }
    
    // construtor para indicação de data a partir de dia, mês e ano
    public Data(int dia, int mes, int ano){
        this.ano = ano;
        this.dia = dia;
        this.mes = mes;
    }
    
    // retorno de string representativa da data encapsulada no formado DD/MM/AAAA
    public String mostrarData(){
        return (dia < 10 ? "0" : "") + dia + "/" +
                    (mes < 10 ? "0" : "") + mes + "/" + ano;
    }

}
