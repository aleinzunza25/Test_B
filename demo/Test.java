package demo;

public class Test {

    public static void main(String[] args) {
        BubbleSort BubbleSort= new BubbleSort();
        InsertionSort InsertionSort= new InsertionSort();
        SellSort SellSort= new SellSort();
        Ordenacion Ord=new Ordenacion() {

            @Override
            public int[] ordenar(int[] elements) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void imprimirArreglo() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        int arreglo[] = { 20,18,19,15,17,16,11,13,14,12,10,1,5,4,3,2,6,8,7,9};
		// Declarar un arreglo de tipo int con 20 numeros desordenados;
	
		// Declarar un objeto de tipo Ordenacion
		
       
		// Hacer la llamada al metodo de impresion
       
        Ord.imprimirArreglo();
		
	}

	public static void imprimirArreglo(Ordenacion o, int[] array) {
		int[] a = o.ordenar(array);
		int n = a.length;

		for (int i = 0; i < n; i++) {	
			if(i != (n-1))
				System.out.print(a[i] + " - ");
			else
				System.out.print(a[i]);
		}

		System.out.print("\n");
	}
}
