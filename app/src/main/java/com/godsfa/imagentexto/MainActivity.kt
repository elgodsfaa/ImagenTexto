package com.godsfa.imagentexto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.godsfa.imagentexto.ui.theme.ImagenTextoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppImagenTexto()
        }
    }
}
@Composable
fun AppImagenTexto() {
    Box(modifier = Modifier.fillMaxSize().padding(20.dp)) {
        Image(
            painter = painterResource(id = R.drawable.gta6)
            ,contentDescription = "Imagen De Gta"
            ,modifier = Modifier.align(Alignment.Center).fillMaxSize()
        )

        Text(text = "El mejor juego del año"
            , modifier = Modifier.align(Alignment.Center)
            , color = Color.Green
            , fontSize = 20.sp
        )
    }
}
@Composable
@Preview
fun  ImagenTextoPreview(){
    AppImagenTexto()

}





