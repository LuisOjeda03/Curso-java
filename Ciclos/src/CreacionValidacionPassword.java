import java.util.Scanner;

public class CreacionValidacionPassword {
    public static void main(String[] args) {

        boolean passwordPermitido = false;
        String passwordIntroducido;
        var sc = new Scanner(System.in);

        while(!passwordPermitido){
            System.out.printf("""
                    ### Creación y validación de Password ###
                    Requisitos:
                        - Tener al menos 6 caracteres.
                        
                    Introduce el password:\s""");
            passwordIntroducido = sc.nextLine();

            if(passwordIntroducido.length() >= 6) passwordPermitido = true;
            System.out.println("");
        }
        System.out.println("Password válido");
    }
}
