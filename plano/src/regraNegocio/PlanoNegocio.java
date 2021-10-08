package regraNegocio;

import entidade.Plano;

public class PlanoNegocio {

    public static String gerarSenha() {
        String[] listaNumeroLetra = {"a", "b", "c", "d", "e", "f", "g", "h", "i",
            "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
            "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
            "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y",
            "Z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        String senha = "";
        for (int i = 0; i < 8; i++) {
            senha += listaNumeroLetra[(int) (Math.random()
                    * listaNumeroLetra.length)];
        }
        return senha;
    }

    public static String gerarPlano() {
        String[] tipoPLano = {"basico", "total"};
        String plano = tipoPLano[(int) (Math.random()
                * tipoPLano.length)];
        return plano;
    }

    public static void verificarTipoPlano(Plano plano) {
        if ("basico".equals(plano.getTipoPlano())) {
            plano.setTotalConsumido(70);
            plano.setMensalidade(70);
            plano.setHistorico("mesalidade " + 70 + "\n");

        } else if ("total".equals(plano.getTipoPlano())) {
            plano.setTotalConsumido(500);
            plano.setMensalidade(500);
            plano.setHistorico("mesalidade " + 500 + "\n");

        }

    }

    public static void criarUsuario(Plano plano, String nome, String usuario) {
        plano.setTitular(nome);
        plano.setUsuario(usuario);
        plano.setSenha(gerarSenha());
        plano.setTipoPlano(gerarPlano());
        verificarTipoPlano(plano);
    }

    public static boolean validaString(String texto) {
        return texto.trim().length() < 3;
    }

    public static boolean validaSenha(String texto) {
        return texto.trim().length() != 8;
    }
}
