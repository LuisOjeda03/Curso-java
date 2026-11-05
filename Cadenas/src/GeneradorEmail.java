public class GeneradorEmail {
    public static void main(String[] args) {
        var nombreCompleto = "Ubaldo Acosta Soto";
        var empresa = "Global Mentoring";
        var dominio = "com.mx";

        // Nombre
        var nombreNormalizado = nombreCompleto.strip().toLowerCase().replace(" ",".");

        // Empresa
        var empresaNormalizada = empresa.strip().toLowerCase().replace(" ","");

        // Dominio
        var dominioNormalizado = dominio.strip().toLowerCase();

        // Resultado
        var email = nombreNormalizado + "@" +
                    empresaNormalizada + "." +
                    dominioNormalizado;
        System.out.println("email = " + email);
    }
}
