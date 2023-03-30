package lab1;
import java.lang.Math;
public class NumeroNatural {
    private int numero;
    public void setNumero(int numero) {
        if(numero>=0){
            this.numero = numero;
        }
    }
    public int getNumero() {
        return this.numero;
    }
    public void incrementar(){
        numero++;
    }
    public void decrementar(){
        if(numero>0){
            numero--;
        }
    }
    public boolean esPar(){
        if(numero%2==0){
            return true;
        }else{
            return false;
        }
    }
    public boolean esPrimo(){
        int x=0;
        for(int i=1; i<=numero ;i++){
            if(numero%i==0){
                x++;
            }
        }
        if(x==2){
            return true;
        }else{
            return false;
        }
    }
    public boolean esPerfecto(){
        int x=0;
        for(int i=1; i<numero; i++){
            if(numero%i==0){
                x=x+i;
            }
        }
        if(x==numero){
            return true;
        }else{
            return false;
        }
    }
    public int pow(int potencia){
        int x=1;
        for(int i=1; i<=potencia; i++)
            x=x*numero;
            return x;
    }
    public double half(){
        double div;
         div=(numero*1.0)/2;
         return div;
    }
    public int distancia(NumeroNatural n){
        int resultado;
        resultado= n.numero - numero;

        if (resultado<0){
            return resultado*(-1);
        }
        else{
            return resultado;
        }
    }
    public void syncToMinor(NumeroNatural n){
        if(this.numero<n.getNumero()){
            n.setNumero(this.numero);
        }else{
            this.numero=n.getNumero();
        }
    }
}
