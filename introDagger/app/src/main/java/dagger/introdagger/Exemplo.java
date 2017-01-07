package dagger.introdagger;

import java.util.List;

/**
 * Created by Kanda on 06/01/2017.
 */

public class Exemplo {
    private Usuario usuario;

    public Exemplo(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Pedido> listarPedidosUsuario() {
        return usuario.listarPedidos();
    }
}
