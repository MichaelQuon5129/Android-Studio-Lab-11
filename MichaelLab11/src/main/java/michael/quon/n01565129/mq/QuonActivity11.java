// Michael Quon N01565129
package michael.quon.n01565129.mq;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import android.os.Bundle;

public class QuonActivity11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager2 viewPager = findViewById(R.id.view_pager);
        TabLayout tabLayout = findViewById(R.id.tab_layout);

        // Create and set up adapter for ViewPager
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), getLifecycle());
        viewPager.setAdapter(adapter);

        // Connect TabLayout with ViewPager
        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            // Set tab text or icon here
            switch (position) {
                case 0:
                    tab.setIcon(R.drawable.michael_icon);
                    tab.setText(getString(R.string.michael));
                    break;
                case 1:
                    tab.setIcon(R.drawable.quon_icon);
                    tab.setText(getString(R.string.quon));
                    break;
                case 2:
                    tab.setIcon(R.drawable.n01565129_icon);
                    tab.setText(getString(R.string.n01565129));
                    break;
                default:
                    tab.setText(getString(R.string.tab) + (position + 1));
            }
        }).attach();
    }
}