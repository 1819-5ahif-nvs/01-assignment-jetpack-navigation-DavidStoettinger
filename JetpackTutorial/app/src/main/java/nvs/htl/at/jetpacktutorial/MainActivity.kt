package nvs.htl.at.jetpacktutorial

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.widget.DrawerLayout
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.main_activity.*
import nvs.htl.at.jetpacktutorial.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    lateinit var drawer: DrawerLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)


        NavigationUI.setupActionBarWithNavController(this,(my_fragment as NavHostFragment).navController,container)
    }

    override fun onSupportNavigateUp(): Boolean{
        return NavigationUI.navigateUp(drawer, Navigation.findNavController(this,R.id.my_fragment))
    }

}
