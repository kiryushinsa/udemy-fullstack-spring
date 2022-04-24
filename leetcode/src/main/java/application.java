public class application {
    public static void main(String[] args){


        Tasks task = new Tasks();
        task.rle("AAAAZFFF");
    }









    public static String solve(String equation){

        String[] esm= new String[2];
        int i=0;
        for (String retval : equation.split("=", 2)) {
            esm[i]= retval;
            i++;
        }

        int j=20;
        System.out.println(esm[0].replaceAll("([^d+]x)", "*"));
        System.out.println(esm[1]);

        return "d";
    }
}
