package mr_auspicious.shivam_kr_shiv.com.preferences2;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    SharedPreferences pref;
    EditText et;
    EditText et1;
    EditText et2;
    EditText et3;
    Button b1;
    Button b2;
    String name;
    String age;
    String phone;
    String city;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

         pref = getPreferences(MODE_PRIVATE);




        et = (EditText) findViewById(R.id.et1);
        et1 = (EditText) findViewById(R.id.et2);
        et2 = (EditText) findViewById(R.id.et3);
        et3 = (EditText) findViewById(R.id.et4);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);


        name = pref.getString("et1","");
        et.setText(name);

        age = pref.getString("et2","");
        et1.setText(age);

        phone = pref.getString("et3","");
        et2.setText(phone);

        city = pref.getString("et4","");
        et3.setText(city);



        b1.setOnClickListener(new View.OnClickListener() { //Saving the data with the button clicked
            @Override
            public void onClick(View view) {

                SharedPreferences pref = getPreferences(MODE_PRIVATE);
                SharedPreferences.Editor editor = pref.edit();

                String name = et.getText().toString();
                editor.putString("et1",name);

                String age = et1.getText().toString();
                editor.putString("et2",age);

                String phone = et2.getText().toString();
                editor.putString("et3",phone);

                String city = et3.getText().toString();
                editor.putString("et4",city);

                editor.apply();


            }
        });

        b2.setOnClickListener(new View.OnClickListener() { //Displaying the toast with the
            @Override
            public void onClick(View view) {


                Toast.makeText(getApplicationContext(),"Name : "+et.getText().toString()+"\nAge : "+et1.getText().toString()+"\nPhone : "+et2.getText().toString()+"\nCity : "+et3.getText().toString(),Toast.LENGTH_LONG).show();

            }
        });




    }
}