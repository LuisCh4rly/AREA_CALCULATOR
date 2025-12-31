public class Triangulo {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
//constructores
    public Triangulo (){

    }

    public Triangulo (double base, double altura, double lado1, double lado2){
        this.altura=altura;
        this.base=base;
        this.lado1=lado1;
        this.lado2=lado2;
    }
//getters y setters
    public double getBase(){
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    //metodos
    public double AreaT (double altura, double base){
        return (altura*base)/2;
    }

    public double PerimetroT(double base, double lado1, double lado2){
        return base+lado1+lado2;
    }


}
