import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jobfinder_app.R
import com.example.jobfinder_app.ui.theme.Black

@Preview(showBackground = true)
@Composable
fun LikeScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
            .padding(horizontal = 20.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Image(
            painter = painterResource(id = R.drawable.under_construction),
            contentDescription = null,
            modifier = Modifier.size(500.dp),
            contentScale = ContentScale.Crop,


            )
        Text(
            text = "LikePage" +
                    " Under Construction",
            fontSize = MaterialTheme.typography.h4.fontSize,
            textAlign = TextAlign.Center,
            color = Black,
            fontWeight = FontWeight.Bold
        )
    }
}