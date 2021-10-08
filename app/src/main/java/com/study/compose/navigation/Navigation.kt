import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.study.compose.navigation.Page
import com.study.compose.page.layout.LayoutPage
import com.study.compose.page.main.MainPage

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Page.MainPage.route) {
        composable(route = Page.MainPage.route) {
            MainPage(navController = navController)
        }
        composable(route = Page.LayoutPage.route) {
            LayoutPage()
        }
    }

}