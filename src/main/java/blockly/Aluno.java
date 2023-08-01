package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Aluno {

public static final int TIMEOUT = 300;

/**
 *
 * @author Igor Andrade
 * @since 01/08/2023, 16:46:52
 *
 */
public static Var Obter() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
cronapi.database.Operations.query(Var.VAR_NULL,Var.VAR_NULL);
   }
 }.call();
}

}

