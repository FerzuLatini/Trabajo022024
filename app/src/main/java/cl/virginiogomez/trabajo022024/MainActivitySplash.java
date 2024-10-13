package cl.virginiogomez.trabajo022024;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivitySplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_splash);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Usamos un Handler para esperar 5 segundos
        new Handler().postDelayed(() -> {
            // Iniciar MainActivity después de 5 segundos
            Intent intent = new Intent(MainActivitySplash.this, MainActivity.class);
            startActivity(intent);
            finish(); // Llamar a finish() para que no se pueda volver a MainActivitySplash
        }, 5000); // 5000 milisegundos = 5 segundos
    }
}