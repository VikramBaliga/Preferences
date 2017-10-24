package projects.android.my.preferences;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtName,txtAge,txtPhone,txtCity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName =(TextView) findViewById(R.id.txtName);
        txtAge =(TextView) findViewById(R.id.txtAge);
        txtPhone =(TextView) findViewById(R.id.txtPhone);
        txtCity =(TextView) findViewById(R.id.txtCity);

    }


    public void saveData(View view)
    {
        getPreferences(MODE_PRIVATE).edit().putString("name",txtName.getText().toString()).commit();
        getPreferences(MODE_PRIVATE).edit().putString("age",txtAge.getText().toString()).commit();
        getPreferences(MODE_PRIVATE).edit().putString("phone",txtPhone.getText().toString()).commit();
        getPreferences(MODE_PRIVATE).edit().putString("city",txtCity.getText().toString()).commit();
    }

    public void showData(View view)
    {
        Toast.makeText(this, "Name:"+getPreferences(MODE_PRIVATE).getString("name","Name")+"\n"+
                "Age:"+getPreferences(MODE_PRIVATE).getString("age","Age")+"\n"+
                "City:"+getPreferences(MODE_PRIVATE).getString("phone","City")+"\n "+
                "Phone:"+getPreferences(MODE_PRIVATE).getString("city","Phone"), Toast.LENGTH_SHORT).show();
    }
}
