package classeestatica;

public class ClasseEstatica {

    public static void main(String[] args) {
        int vetor[] = {10, 20, 30, 3, 2, 1};
        
        System.out.println(Calc.soma(vetor));
        System.out.println(Calc.subtracao(50, 40));
        System.out.println(Calc.multiplicacao(vetor));
        
        Calc.PI = 3.141592f;
        
        System.out.println(Calc.PI);
    }
}
