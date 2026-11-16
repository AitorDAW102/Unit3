import com.sun.source.tree.WhileLoopTree;

import java.util.StringTokenizer;

public class nota {
    public static void main(String[] args) {
        String txt = "Juan-5.5-Amelia-8.6-Alejandro-2.0";

        StringTokenizer st = new StringTokenizer(txt,"-");
        while (st.hasMoreTokens()){
            System.out.println("EL alumno "+st.nextToken()+" tiene una nota de "+st.nextToken());
        }
    }
}
