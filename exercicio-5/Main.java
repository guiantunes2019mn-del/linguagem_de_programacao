public class Main {
    public static void main(String[] arg){
        // String[] alunos = {"Miranata", "Savalo", "Aeronauta"};
            
        // for(String estudante : alunos){
        //     System.out.println(estudante);
        // }
        
        String[] produtos = {"produto 1", "produto 2", "produto 3", "produto 4", "produto 5"};

        for(String mercadorias : produtos){
            System.out.println(mercadorias);
        }

        String[] produtinhos = {"produto 1", "produto 2", "produto 3", "produto 4", "produto 5"};

        for(int i = 0; i < produtinhos.length; i++){
            System.out.println(produtinhos[i]);
        }
}

int[]  numeros = {10, -20, 0, 67, -1};

        for (int positivo : numeros) {
       if(positivo > 0){
            System.out.println(positivo + " positivo");
       }
       if(positivo < 0){
        System.out.println(positivo + " negativo");
   }
   if(positivo == 0){
    System.out.println(positivo + " igual a zero");
}
    }
}
}