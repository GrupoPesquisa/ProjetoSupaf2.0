package entity;

public class AssuntosFinanceiros {
    private Long codigo;
    private int dinheiroSuficiente, dinheiroSuficienteGastos, dinheiroSuficienteAmigos;
    
    
    public AssuntosFinanceiros(Long codigo, int dinheiroSuficienteGastos, int dinheiroSuficiente, int dinheiroSuficienteAmigos){
        this.codigo = codigo;
        this.dinheiroSuficiente = dinheiroSuficiente;
        this.dinheiroSuficienteGastos = dinheiroSuficienteGastos;
        this.dinheiroSuficienteAmigos = dinheiroSuficienteAmigos;       
    }

    public AssuntosFinanceiros() {
    }

    public Long getCodigo() {
        return codigo;
    }
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    
    public int getDinheiroSuficiente(){
        return dinheiroSuficiente;
    } 
    public void setDinheiroSuficiente(int dinheiroSuficiente){
        this.dinheiroSuficiente = dinheiroSuficiente;
    }
    public int getDinheiroSuficienteGastos(){
        return dinheiroSuficienteGastos;
    } 
    public void setDinheiroSuficienteGastos(int dinheiroSuficienteGastos){
        this.dinheiroSuficienteGastos = dinheiroSuficienteGastos;
    }
    public int getDinheiroSuficienteAmigos(){
        return dinheiroSuficienteAmigos;
    } 
    public void setDinheiroSuficienteAmigos(int dinheiroSuficienteAmigos){
        this.dinheiroSuficienteAmigos = dinheiroSuficienteAmigos;
    }
};
