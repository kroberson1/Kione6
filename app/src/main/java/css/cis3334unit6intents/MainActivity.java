package css.cis3334unit6intents;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {

    Button buttonWeb1, buttonCalendar1, buttonMap1, buttonWeb2, buttonCalendar2, buttonMap2, buttonWeb3, buttonCalendar3, buttonMap3;
    TextView textViewStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //textViewStatus = findViewById(R.id.textViewStatus);

        setupButtonWeb1();
        setupButtonCalendar1();
        setupButtonMap1();
        setupButtonWeb2();
        setupButtonCalendar2();
        setupButtonMap2();
        setupButtonWeb3();
        setupButtonCalendar3();
        setupButtonMap3();
    }

    private void setupButtonMap1() {
            buttonMap1 = findViewById(R.id.buttonMap1);
            buttonMap1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("CIS 3334", "This should display a map");
                    //textViewStatus.setText("This should display event 1 in the map");
                    String url = "https://www.google.com/maps/place/Mitchell+Auditorium+at+The+College+of+St.+Scholastica/@46.816591,-92.1062274,17z/data=!4m5!3m4!1s0x52afad47c414a2b3:0xe0a4f95f0148e609!8m2!3d46.8165602!4d-92.1064688";
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                    startActivity(intent);

                    // Add implicit intent code to open a map to https://www.google.com/maps/place/Mitchell+Auditorium+at+The+College+of+St.+Scholastica/@46.816591,-92.1062274,17z/data=!4m5!3m4!1s0x52afad47c414a2b3:0xe0a4f95f0148e609!8m2!3d46.8165602!4d-92.1064688
                }
            });
        }


    private void setupButtonCalendar1() {
        buttonCalendar1 = findViewById(R.id.buttonCalendar1);
        buttonCalendar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //textViewStatus.setText("Code should set a calendar event for performance 1");
                Intent calIntent = new Intent(Intent.ACTION_INSERT);
                calIntent.setType("vnd.android.cursor.item/event");
                calIntent.putExtra(CalendarContract.Events.TITLE, "Still I Rise - Bella Voce");
                calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "Virtual");
                GregorianCalendar begDate = new GregorianCalendar(2022, 4, 8, 19, 30);
                GregorianCalendar endDate = new GregorianCalendar(2022, 4, 8, 21, 00);
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                        begDate.getTimeInMillis());
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                        endDate.getTimeInMillis());
                startActivity(calIntent);
            }
        });
    }

    private void setupButtonWeb1() {
        buttonWeb1 = findViewById(R.id.buttonWeb1);
        buttonWeb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.css.edu/about/spotlight-arts-and-lectures/calendar.html?trumbaEmbed=eventid%3d150337461%26seotitle%3dCrafting-a-Childrens-Book-Focused-on-the-Common-Good-with-Sarah-Brokke-Erickson-and-Gary-Boelhower%26view%3devent%26-childview%3d";

                // Create an Intent to open the link in a web browser
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                // Start the intent to open the link
                startActivity(intent);
            }
        });
    }

        private void setupButtonMap2() {
            buttonMap2 = findViewById(R.id.buttonMap2);
            buttonMap2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("CIS 3334", "This should display a map");
                    //textViewStatus.setText("This should display event 1 in the map");
                    String url = "https://www.google.com/maps/place/Mitchell+Auditorium+at+The+College+of+St.+Scholastica/@46.816591,-92.1062274,17z/data=!4m5!3m4!1s0x52afad47c414a2b3:0xe0a4f95f0148e609!8m2!3d46.8165602!4d-92.1064688";
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                    startActivity(intent);

                }
            });
        }
    private void setupButtonCalendar2() {
        buttonCalendar2 = findViewById(R.id.buttonCalendar2);
        buttonCalendar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //textViewStatus.setText("Code should set a calendar event for performance 1");
                Intent calIntent = new Intent(Intent.ACTION_INSERT);
                calIntent.setType("vnd.android.cursor.item/event");
                calIntent.putExtra(CalendarContract.Events.TITLE, "Feel the Groove: Piazzolla and Tango Nuevo");
                calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "In Person");
                GregorianCalendar begDate = new GregorianCalendar(2023, 10, 21, 19, 30);
                GregorianCalendar endDate = new GregorianCalendar(2023, 10, 21, 21, 00);
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                        begDate.getTimeInMillis());
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                        endDate.getTimeInMillis());
                startActivity(calIntent);
            }
        });
    }

    private void setupButtonWeb2() {
        buttonWeb2 = findViewById(R.id.buttonWeb2);
        buttonWeb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.css.edu/about/events/spotlight/?trumbaEmbed=view%3Devent%26eventid%3D167741819";

                // Create an Intent to open the link in a web browser
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                // Start the intent to open the link
                startActivity(intent);
            }
        });
    }
        private void setupButtonMap3() {
            buttonMap3 = findViewById(R.id.buttonMap3);
            buttonMap3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("CIS 3334", "This should display a map");
                    //textViewStatus.setText("This should display event 1 in the map");
                    String url = "https://www.google.com/maps/place/Mitchell+Auditorium+at+The+College+of+St.+Scholastica/@46.816591,-92.1062274,17z/data=!4m5!3m4!1s0x52afad47c414a2b3:0xe0a4f95f0148e609!8m2!3d46.8165602!4d-92.1064688";
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                    startActivity(intent);

                }
            });
        }
    private void setupButtonCalendar3() {
        buttonCalendar3 = findViewById(R.id.buttonCalendar3);
        buttonCalendar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //textViewStatus.setText("Code should set a calendar event for performance 1");
                Intent calIntent = new Intent(Intent.ACTION_INSERT);
                calIntent.setType("vnd.android.cursor.item/event");
                calIntent.putExtra(CalendarContract.Events.TITLE, "Water: Sustaining Life in the 21st Century");
                calIntent.putExtra(CalendarContract.Events.EVENT_LOCATION, "In Person");
                GregorianCalendar begDate = new GregorianCalendar(2023, 10, 26, 19, 30);
                GregorianCalendar endDate = new GregorianCalendar(2023, 10, 26, 21, 00);
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,
                        begDate.getTimeInMillis());
                calIntent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME,
                        endDate.getTimeInMillis());
                startActivity(calIntent);
            }
        });
    }
    private void setupButtonWeb3() {
        buttonWeb3 = findViewById(R.id.buttonWeb3);
        buttonWeb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.css.edu/about/events/spotlight/?trumbaEmbed=view%3Devent%26eventid%3D167741485";

                // Create an Intent to open the link in a web browser
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

                // Start the intent to open the link
                startActivity(intent);
            }
        });
    }



}