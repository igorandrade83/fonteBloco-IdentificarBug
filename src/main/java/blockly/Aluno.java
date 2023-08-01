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
 * @param aluno<app.entity.Aluno>
 *
 * @author Igor Andrade
 * @since 01/08/2023, 17:14:52
 *
 */
public static Var Atualizar(@ParamMetaData(description = "aluno", id = "75bb08e7") Var aluno) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    System.out.println(
    Var.valueOf(
    Var.valueOf("Aluno: ").getObjectAsString() +
    aluno.getObjectAsString()).getObjectAsString());
    if (
    cronapi.logic.Operations.isNullOrEmpty(aluno).getObjectAsBoolean()) {
        System.out.println(
        Var.valueOf("Aluno é vazio ou nulo.").getObjectAsString());
    }
    cronapi.database.Operations.update(Var.valueOf("app.entity.Aluno"),aluno);
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @param aluno<app.entity.Aluno>
 *
 * @author Igor Andrade
 * @since 01/08/2023, 17:14:52
 *
 */
public static Var Inserir(@ParamMetaData(description = "aluno", id = "a3dc6f4e") Var aluno) throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    System.out.println(
    Var.valueOf(
    Var.valueOf("Inserir: ").getObjectAsString() +
    aluno.getObjectAsString()).getObjectAsString());
    if (
    cronapi.logic.Operations.isNullOrEmpty(aluno).getObjectAsBoolean()) {
        System.out.println(
        Var.valueOf("x é vazio ou nulo.").getObjectAsString());
    }
    item =
    cronapi.database.Operations.insert(Var.valueOf("app.entity.Aluno"),Var.valueOf("id",
    cronapi.object.Operations.getObjectField(aluno, Var.valueOf("id"))),Var.valueOf("matricula",
    cronapi.object.Operations.getObjectField(aluno, Var.valueOf("matricula"))),Var.valueOf("name",
    cronapi.object.Operations.getObjectField(aluno, Var.valueOf("name"))));
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @author Igor Andrade
 * @since 01/08/2023, 17:14:52
 *
 */
public static Var Obter() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
cronapi.database.Operations.query(Var.valueOf("app.entity.Aluno"),Var.valueOf("select \n	a \nfrom \n	Aluno a"));
   }
 }.call();
}

/**
 *
 * @param idAluno
 *
 * @author Igor Andrade
 * @since 01/08/2023, 17:14:52
 *
 */
public static Var Remover(@ParamMetaData(description = "idAluno", id = "75bb08e7") Var idAluno) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    System.out.println(
    Var.valueOf(
    Var.valueOf("idAluno: ").getObjectAsString() +
    idAluno.getObjectAsString()).getObjectAsString());
    if (
    cronapi.logic.Operations.isNullOrEmpty(idAluno).getObjectAsBoolean()) {
        System.out.println(
        Var.valueOf("Id Aluno é vazio ou nulo.").getObjectAsString());
    }
    cronapi.database.Operations.execute(Var.valueOf("app.entity.Aluno"), Var.valueOf("delete from \n	\n	Aluno  \nwhere \n	id = :id"),Var.valueOf("id",
    cronapi.json.Operations.getJsonOrMapField(idAluno,
    Var.valueOf("id"))));
    return Var.VAR_NULL;
   }
 }.call();
}

}

