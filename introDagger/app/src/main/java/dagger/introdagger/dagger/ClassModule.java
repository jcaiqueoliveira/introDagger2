package dagger.introdagger.dagger;

import dagger.Module;
import dagger.Provides;
import dagger.introdagger.Exemplo;
import dagger.introdagger.Usuario;

/**
 * Created by Kanda on 06/01/2017.
 */
@Module
public class ClassModule {

    @Provides
    public Usuario proverUsuario() {
        return new Usuario();
    }

    @Provides
    public Exemplo proverExemplo(Usuario usuario) {
        return new Exemplo(usuario);
    }
}
