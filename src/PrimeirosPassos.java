public class PrimeirosPassos {
    public static void main(String[] args) {

        String notafiscal = "NF 440";
        String montante ="200"; 

        String resultado = resultado (notafiscal, montante);
        System.out.println(resultado);
    }

    public static String resultado (String notafiscal, String montante ){
        return notafiscal.concat(" = ").concat(montante);

    }
}

    

        