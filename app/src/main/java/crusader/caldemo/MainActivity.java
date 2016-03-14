package crusader.caldemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txt,txt2;
    String t = "";
    int no1,no2,res;           // variables for operation
    Boolean op = false;          // to check if ne operator is clicked
    int ope = 0;                 // 0=no operation; 1=+; 2=-; 3=*; 4=/;
    public Button bt0 = null;
    public Button bt1 = null;
    public Button bt2 = null;
    public Button bt3 = null;
    public Button bt4 = null;
    public Button bt5 = null;
    public Button bt6 = null;
    public Button bt7 = null;
    public Button bt8 = null;
    public Button bt9 = null;
    public Button btc = null;
    public Button bteq = null;
    public Button btp = null;
    public Button bts = null;
    public Button btm = null;
    public Button btd = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initB();
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }

    private void initB() {
        txt = (TextView) findViewById(R.id.textView);
        txt2 = (TextView) findViewById(R.id.textView2);
        bt0 = (Button) findViewById(R.id.button2);
        bt1 = (Button) findViewById(R.id.button5);
        bt2 = (Button) findViewById(R.id.button6);
        bt3 = (Button) findViewById(R.id.button7);
        bt4 = (Button) findViewById(R.id.button9);
        bt5 = (Button) findViewById(R.id.button10);
        bt6 = (Button) findViewById(R.id.button11);
        bt7 = (Button) findViewById(R.id.button13);
        bt8 = (Button) findViewById(R.id.button14);
        bt9 = (Button) findViewById(R.id.button15);
        btc = (Button) findViewById(R.id.button);
        bteq = (Button) findViewById(R.id.button3);
        btp = (Button) findViewById(R.id.button4);
        bts = (Button) findViewById(R.id.button8);
        btm = (Button) findViewById(R.id.button12);
        btd = (Button) findViewById(R.id.button16);

        bt0.setOnClickListener(this);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
        bt9.setOnClickListener(this);
        btc.setOnClickListener(this);
        bteq.setOnClickListener(this);
        btp.setOnClickListener(this);
        bts.setOnClickListener(this);
        btm.setOnClickListener(this);
        btd.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v == bt0) {
            t = txt.getText().toString();
            txt.setText(t + "0");
            if (op == false) {
                no1 = Integer.parseInt(txt.getText().toString());
            } else {
                no2 = Integer.parseInt(txt.getText().toString());
            }
        }
        if (v == bt1) {
            t = txt.getText().toString();
            txt.setText(t + "1");
            if (op == false) {
                no1 = Integer.parseInt(txt.getText().toString());
            } else {
                no2 = Integer.parseInt(txt.getText().toString());
            }
        }
        if (v == bt2) {
            t = txt.getText().toString();
            txt.setText(t + "2");
            if (op == false) {
                no1 = Integer.parseInt(txt.getText().toString());
            } else {
                no2 = Integer.parseInt(txt.getText().toString());
            }
        }
        if (v == bt3) {
            t = txt.getText().toString();
            txt.setText(t + "3");
            if (op == false) {
                no1 = Integer.parseInt(txt.getText().toString());
            } else {
                no2 = Integer.parseInt(txt.getText().toString());
            }
        }
        if (v == bt4) {
            t = txt.getText().toString();
            txt.setText(t + "4");
            if (op == false) {
                no1 = Integer.parseInt(txt.getText().toString());
            } else {
                no2 = Integer.parseInt(txt.getText().toString());
            }
        }
        if (v == bt5) {
            t = txt.getText().toString();
            txt.setText(t + "5");
            if (op == false) {
                no1 = Integer.parseInt(txt.getText().toString());
            } else {
                no2 = Integer.parseInt(txt.getText().toString());
            }
        }
        if (v == bt6) {
            t = txt.getText().toString();
            txt.setText(t + "6");
            if (op == false) {
                no1 = Integer.parseInt(txt.getText().toString());
            } else {
                no2 = Integer.parseInt(txt.getText().toString());
            }
        }
        if (v == bt7) {
            t = txt.getText().toString();
            txt.setText(t + "7");
            if (op == false) {
                no1 = Integer.parseInt(txt.getText().toString());
            } else {
                no2 = Integer.parseInt(txt.getText().toString());
            }
        }
        if (v == bt8) {
            t = txt.getText().toString();
            txt.setText(t + "8");
            if (op == false) {
                no1 = Integer.parseInt(txt.getText().toString());
            } else {
                no2 = Integer.parseInt(txt.getText().toString());
            }
        }
        if (v == bt9) {
            t = txt.getText().toString();
            txt.setText(t + "9");
            if (op == false) {
                no1 = Integer.parseInt(txt.getText().toString());
            } else {
                no2 = Integer.parseInt(txt.getText().toString());
            }
        }
        if (v == btc) {
            reset();
        }
        if (v == bteq) {
            op = true;
            if (ope == 1)
                res = no1 + no2;
            else if (ope == 2)
                res = no1 - no2;
            else if (ope == 3)
                res = no1 * no2;
            else if (ope == 4)
                try {
                    res = no1 / no2;
                }
                catch (Exception e)
                {
                    Toast.makeText(this,e.getMessage()+" error",Toast.LENGTH_LONG).show();
                }
            else
                Toast.makeText(this,"No Operation To Perform",Toast.LENGTH_LONG).show();
            txt.setText(""+res);
            txt2.setText("");
            op=false;
            resultForwardToNo1();
        }
        if (v == btp) {
            op = true;
            ope = 1;
            t = txt.getText().toString();
            txt.setText(t + "+");
            t = txt.getText().toString();
            forwardToTextTwo();
        }
        if (v == bts) {
            op = true;
            ope = 2;
            t = txt.getText().toString();
            txt.setText(t + "-");
            t = txt.getText().toString();
            forwardToTextTwo();
        }
        if (v == btm) {
            op = true;
            ope = 3;
            t = txt.getText().toString();
            txt.setText(t + "x");
            t = txt.getText().toString();
            forwardToTextTwo();
        }
        if (v == btd) {
            op = true;
            ope = 4;
            t = txt.getText().toString();
            txt.setText(t + "/");
            t = txt.getText().toString();
            forwardToTextTwo();
        }

    }

    private void resultForwardToNo1() {
        no1 = Integer.parseInt(txt.getText().toString());

    }

    private void forwardToTextTwo() {
        txt2.setText(t);
        txt.setText("");
    }

    public void reset()
    {
        no1=0;
        no2=0;
        res=0;
        op=false;
        ope=0;
        txt.setText("");
        txt2.setText("");
    }
}
