import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validacoes {
    


    public boolean validarAgencia (String agencia){
        Pattern pattern = Pattern.compile("[0-9]{3}[-][0-9]");
        Matcher matcher = pattern.matcher(agencia);

        return matcher.find();
    }
    public boolean validarNumero (int numero){
        String str = String.valueOf(numero);
        char[] numeros = str.toCharArray();

        for (int elemento : numeros) {
           if(!Character.isDigit(elemento) || numeros.length != 4){
            return false;
           }
        }
        return true;
    }
}
