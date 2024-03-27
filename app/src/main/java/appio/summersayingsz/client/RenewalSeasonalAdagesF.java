// PACKAGE_BLOCK_00
package appio.summersayingsz.client;
// IMPORT_BLOCK_00
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;
// CLASS_BLOCK_00
public class RenewalSeasonalAdagesF extends AppCompatActivity {
// INSTANCE_BLOCK_01
private TextView summerSayingsCompletionT;
        private Button wiseWordsOfSummerSingletonO;
        private String[] seasonalWisdomImplG;
        private Random seasonalAdagesControllerG = new Random();
// SYNTAX_BLOCK_00
 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// LAYOUT_BLOCK_00
setContentView(R.layout.pigment_wise_words_of_summer_71);
// INITIALIZE_BLOCK_01
seasonalWisdomImplG = getResources().getStringArray(R.array.muted_seasonal_wisdom_45);
        summerSayingsCompletionT = findViewById(R.id.seasonalAdagesInterceptorP);
        wiseWordsOfSummerSingletonO = findViewById(R.id.summerSayingsImplS);
// LISTENER_BLOCK_01
  wiseWordsOfSummerSingletonO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomIndex = seasonalAdagesControllerG.nextInt(seasonalWisdomImplG.length);
                summerSayingsCompletionT.setText(seasonalWisdomImplG[randomIndex]);
            }
        });
// FUNone_BLOCK_03
List<String> wiseWordsOfSummerHelperG = new ArrayList<>(Arrays.asList(seasonalWisdomImplG));
        Collections.shuffle(wiseWordsOfSummerHelperG);
        summerSayingsCompletionT.setText(wiseWordsOfSummerHelperG.get(0));
// SYNTAX_BLOCK_00
 }
// SYNTAX_BLOCK_00
}