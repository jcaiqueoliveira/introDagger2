package dagger.introdagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Exemplo exemplo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Application.getComponent().inject(this);
        exemplo.listarPedidosUsuario();
    }
}
