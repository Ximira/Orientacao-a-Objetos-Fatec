package classeestatica;

public class Calc {
    
    public static float PI = 3.14f;
    
    public static int soma(int[] soma) {
        int resultado = 0;
        
        for (int n : soma)
            resultado += n;
        
        return resultado;
    }
    
    public static int subtracao(int numeroA, int numeroB) {
        return numeroA - numeroB;
    }
    
    public static int multiplicacao(int[] multiplicacao) {
        int resultado = 1;
        
        for (int n : multiplicacao)
            resultado *= n;
        
        return resultado;
    }
}
