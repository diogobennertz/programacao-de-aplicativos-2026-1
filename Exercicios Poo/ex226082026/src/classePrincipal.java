public class classePrincipal {
    public static void main(String[] args) {
        //1)
        //Em uma classe denominada Usuario, deseja-se manter o nome, sexo, data de nascimento e
        //estado civil desse usuário.
        //O sexo deve ser definido como um caractere.
        //A data deve ser definida como String.
        //Crie 2 objetos de Usuario, atribua valores a esses objetos e mostre as informações na tela

        Usuario uDiogo = new Usuario();
        uDiogo.estadoCivil = "Solteiro";
        uDiogo.data = "02/04/2003";
        uDiogo.sexo = 'M';
        uDiogo.nome = "Diogo";
        System.out.println(uDiogo.data +" " + uDiogo.estadoCivil + " " + uDiogo.sexo + " " + uDiogo.nome);

        Usuario uEduardo = new Usuario();
        uEduardo.estadoCivil = "Solteiro";
        uEduardo.data = "02/04/2004";
        uEduardo.sexo = 'F';
        uEduardo.nome = "Eduardo";
        System.out.println(uEduardo.data +" " + uEduardo.estadoCivil + " " + uEduardo.sexo + " " + uEduardo.nome);
    }
}
