package christopher.higherorlower;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //crate random number varialbe as global and assign it when declaring rnandom number generator
    int randomNumber;

    public void checkGuess(View view) {

        EditText guessedNumber = (EditText)findViewById(R.id.guessedNumber);

        //this line gets whats put in by user and saves it into String variable, the gettext method is
        //converted to String with .toString method
        String guessedNumberString = guessedNumber.getText().toString();

        //need to convert the string to an integer, use Integer.parseInt with string value in the parenthesis

        int guessedNumberInt = Integer.parseInt(guessedNumberString);

        System.out.println(guessedNumberInt);


        String message = "";

        if (guessedNumberInt > randomNumber){
            message = "Too high!";

        } else if (guessedNumberInt < randomNumber){

            message = "Too low!";
        } else {

            message = "Correct, well done!";
        }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //create the object of random called random generator then assign the numbers into int randomNumber
        Random randomGenerator = new Random();

         randomNumber = randomGenerator.nextInt(21);



    }
}
