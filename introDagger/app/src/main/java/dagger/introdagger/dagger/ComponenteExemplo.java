package dagger.introdagger.dagger;

import dagger.Component;
import dagger.introdagger.MainActivity;

/**
 * Created by Kanda on 07/01/2017.
 */
@Component(modules = {ClassModule.class})
public interface ComponenteExemplo {
    public void inject(MainActivity activity);
}
