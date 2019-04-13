package pawar.umesh.registretion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button register;
    EditText et1,et2,et3,et4,et5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        register = (Button)findViewById ( R.id.regester );
        et1 = (EditText)findViewById ( R.id.edtname);
        et2 = (EditText)findViewById ( R.id.edtMobile);
        et3 = (EditText)findViewById ( R.id.edtEmail);
        et5 = (EditText)findViewById ( R.id.edtPassword);
        et5 = (EditText)findViewById ( R.id.edtrepass);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.onEditorAction(EditorInfo.IME_ACTION_DONE);
            }
        });
    }
}
