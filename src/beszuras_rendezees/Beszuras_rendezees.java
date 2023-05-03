package beszuras_rendezees;

public class Beszuras_rendezees {

    public static void main(String[] args) {

        int lista[] = {69, 19, 6, 420};
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]+" ");
        }
        System.out.println("");
        
        int j;
        for (int i = 1; i < lista.length ;i++) {
            int x = lista[i];
            j = i-1;
            while (j >= 0 && lista[j] > x) {
                lista[j+1] = lista[j];
                j--;
            }
            lista[j+1] = x;
        }
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]+" ");
        }
            
        
        

    }

}
