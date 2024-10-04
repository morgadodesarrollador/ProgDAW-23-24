package listas;

import java.util.ArrayList;

public class Notas2D {

    public Notas2D(){
        ArrayList<ArrayList<Integer>> notas = new ArrayList();
        for(int i=0; i<10; i++){
            notas.add (new ArrayList<Integer>());
            for (int j=0; j<5; j++){
                notas.get(i).add((int)Math.random()*10);
            }

        }
    }
}
