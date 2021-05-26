package languages;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import management.ExpensesManagement;
import model.Expense;
import model.Language;
import model.User;

public class SpanishLanguage {

	public static void init(HashMap<String, Language> languagesInit) {
        
        
        // I declare spanish object type Language class and assign the result
        // of operation NEW that creates a new object with parameters
        // name is "Spanish" and tag is "spa"
        Language spanish = new Language("Spanish", "spa");
        
        // now we are setting the object with the translations
        spanish.getMessage().put("create", "crear");
        spanish.getMessage().put("login", "acceso");
        spanish.getMessage().put("language", "lengua");
        spanish.getMessage().put("quit", "salir");
    
        spanish.getMessage().put("tellName", "Dime su nombre: ");
        spanish.getMessage().put("tellSurname", "Dime su apellido: ");
        spanish.getMessage().put("tellAge", "Dime su edad:");
        
        spanish.getMessage().put("english", "ingles");
        spanish.getMessage().put("spanish", "castellano");
        spanish.getMessage().put("catalan", "catalan");
        spanish.getMessage().put("russian", "russo");
        
        spanish.getMessage().put("badinputMain", "\nPorfavor, tienes que escribir \"crear\", \"acceso\" o \"salir\".");
        spanish.getMessage().put("tryAnother", "Prueba en otro momento ...\n");
        spanish.getMessage().put("expensesWelcome", "\nBenvenido Acceso en Gastos");
        spanish.getMessage().put("tellUserName", "Dime su Nombre de Usario: ");
        spanish.getMessage().put("tellPassword", "Dime su Contraseña: ");
        
        spanish.getMessage().put("accesoOK", "¡Acceso permitido! Bienvenidos!");
        spanish.getMessage().put("invalidoPassword", "Contraseña invalida!");
        spanish.getMessage().put("invalidoNombreUsuario", "Nombre de usuario inválido!");
        spanish.getMessage().put("invalidaContraseñaAndNombreUsuario", "Usuario / contraseña invalida!");
        spanish.getMessage().put("intentos "," Total de intentos: ");
        spanish.getMessage().put("Bloquear "," Usuario bloqueado!");
        
        spanish.getMessage().put("agregar", "agregar");
        spanish.getMessage().put("eliminar", "eliminar");
        spanish.getMessage().put("actualizar", "actualizar");
        spanish.getMessage().put("lista", "lista");
        spanish.getMessage().put("Gastos de entrada incorrecta", "\n Por favor, debe escribir"
        		+ " \"agregar \", \" eliminar \", \" actualizar \", \" lista \" o \" salir\".");
        
        spanish.getMessage().put("nombre de gasto "," \n Introduzca el nombre del gasto: ");
        spanish.getMessage().put("valor del gasto "," Ingrese el valor de los gastos: ");
        spanish.getMessage().put("eliminando "," eliminando ....");
        spanish.getMessage().put("Eliminado "," eliminado!");
        spanish.getMessage().put("No encontrada "," no encontrada....\n");
        spanish.getMessage().put("eliminar "," eliminar");
        spanish.getMessage().put("actualizar "," actualizar");
        spanish.getMessage().put("lista", "lista");
        spanish.getMessage().put("lista", "\nLista de gastos: ");
        spanish.getMessage().put("hoyFecha "," La fecha de hoy es : ");
        
        spanish.getMessage().put("showExpenseName "," Valor de gasto: ");
        spanish.getMessage().put("preguntaActualizaValor ",". ¿Quieres actualizar el valor de los gastos? (S / N) ");
        spanish.getMessage().put("mostrarFechadegastos "," Fecha de gastos: ");
        spanish.getMessage().put("pregunta Fecha de actualización ",". ¿Quieres actualizar la fecha de gastos? (S / N) ");
        spanish.getMessage().put("Fechadegastos "," Introduzca la fecha de gastos (dd / MM / aaaa): ");
        spanish.getMessage().put("Formatonoválido "," ¡No actualizado! ¡Formato inválido!");
        
        
        
        // use languageInit type HashMap to choose the language
        // call the method put of langugeInit
        languagesInit.put("spanish", spanish);
    }
}