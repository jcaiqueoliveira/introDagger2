package dagger.introdagger;

import dagger.introdagger.dagger.ComponenteExemplo;
import dagger.introdagger.dagger.DaggerComponenteExemplo;

/**
 * Created by Kanda on 07/01/2017.
 */

public class Application extends android.app.Application {
    public static ComponenteExemplo component;

    @Override
    public void onCreate() {
        super.onCreate();
        initDagger();
    }

    private void initDagger() {
        component = DaggerComponenteExemplo
                .builder()
                .build();
    }

    public static ComponenteExemplo getComponent() {
        return component;
    }
}

