public class Poligono 
{
    public static void main(String[] args) 
    {
        triangulo(10, 12);
        rectangulo(5, 14);
        cuadrado(2, 2);
    }
    
    public static void triangulo(float altura,float base)
    {
        float area=0;
        area=(base*altura)/2;
        System.out.println("El area es: "+area);
    }

    public static void rectangulo(float altura,float base)
    {
        float area=0;
        area=base*altura;
        System.out.println("El area es: "+area);
    }

    public static void cuadrado(float altura,float base)
    {
        float area=0;
        area=base*altura;
        System.out.println("El area es: "+area);
    }
}
